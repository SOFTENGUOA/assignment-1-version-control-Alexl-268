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
 * @author Author Name: [YOUR NAME] Author UPI: [YOUR UPI]
 * @version Date: [CURRENT DATE] 
 */
import java.io.ObjectStreamException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Reflector {
		private Class cls;
		private Scanner scan = new Scanner(System.in);
		private Method[] classMethods;
		private Field[] classFields;

		public Reflector() {
			while (true) {
				try {
					String name = scan.next();
					this.cls = Class.forName("se283.a1.t1." + name);
					break;
				} catch (ClassNotFoundException e) {
					System.err.println("Class not found!");
				}
			}
		}

		public Method[] getFieldsMethods() {
			this.classMethods = cls.getDeclaredMethods();
			this.classFields = cls.getDeclaredFields();
			System.out.println("Fields: ");
			for (Field field : classFields) {
				System.out.println(field.getName() + "    \tType: " + field.getType());
			}

			System.out.println("\nMethods:");
			for (Method method : classMethods) {
				if (method.getParameterCount() == 0) {
					System.out.println("Method Name:\t" + method.getName());
				}
			}
			return classMethods;
		}

		public void callMethod(String askmethod){
			for (Method method : classMethods){
				if (method.getName()  == askmethod){
					Object asdlkfj = cls.newInstance();
				}
			}
		}
//		Constructor constructor = null;
//		Object constructor2 = null;
//		constructor = cls.getConstructor((Class<?>) constructor2);
//
//
//		while (true) {
//			try{
//				String name = scan.next();
//				cls = Class.forName("se283.a1.t1."+name);
//				break;
//			} catch (ClassNotFoundException e) {
//				System.err.println("Class not found!");
//			}
//		}
}
