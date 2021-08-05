package se283.a1.t1;

/**
 * SE283 Assignment 1 Task 1 Reflector - Instructions
 *  
 * This class should be implemented to contain the reflection functionality described in the
 * assignment hand-out. 
 * This class must be called by T1Main for executing the desired reflection for a given class e.g. class Counter. * 
 * All changes required for Task 1 must be performed on a new branch named "T1Branch". 
 * You can create this new branch from our IDE.
 * 
 * @author Author Name: Alex Liang Author UPI: zlia715
 * @version Date: 6/8/2021
 */
import java.io.ObjectStreamException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Reflector {
		private Class cls;
		private Scanner scan = new Scanner(System.in);
		private Method[] classMethods;
		private Field[] classFields;
		private Object classObj;

		public Reflector() {
			while (true) {
				try {
					System.out.print("Class : ");
					String name = scan.next();
					this.cls = Class.forName("se283.a1.t1." + name);					//initilising the class
					this.classObj = cls.getDeclaredConstructor().newInstance();			//creating new object
					this.classMethods = cls.getDeclaredMethods();				//Store all the fields and methods
					this.classFields = cls.getDeclaredFields();
					break;
				} catch (ClassNotFoundException | NoSuchMethodException e) {
					System.err.println("Class not found!");
				} catch (InvocationTargetException | InstantiationException | IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		}

		public void getFieldsMethods() throws IllegalAccessException {
			System.out.println("--------------------------------------------------------------------");
			System.out.println("Methods:");
			for (Method method : classMethods) {								//print out all the methods
				if (method.getParameterCount() == 0) {
					System.out.println("Method Name:\t" + method.getName());
				}
			}

			System.out.println("");
			System.out.println("Fields: ");										//print out all the Fields
			for (Field field : classFields) {
				System.out.println(field.getName() + "    \tValue: " + field.get(classObj));
			}
			System.out.println("");
		}

		public void callMethod(String askmethod) throws InvocationTargetException, IllegalAccessException {
			for (Method method : classMethods){								//call the method if the ask method is the same as one of the method names
				if (method.getName().equalsIgnoreCase(askmethod)){
					method.invoke(classObj);
				}
			}
		}
}
