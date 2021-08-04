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
	public static void main (String[] args) {
		Class cls;
		Scanner scan = new Scanner(System.in);

		while (true) {
			try{
				String name = scan.next();
				cls = Class.forName("se283.a1.t1."+name);
				break;
			} catch (ClassNotFoundException e) {
				System.err.println("Class not found!");
			}
		}

		Method[] classMethods = cls.getMethods();
		Field[] classFields = cls.getDeclaredFields();
		System.out.println("Fields: ");
		for (Field field : classFields){
			System.out.println(field.getName() + "    \tType: " + field.getType());
		}
		System.out.println("\n\n\n");


		for (Method method : classMethods){
			System.out.println("Method Name:\t" + method.getName());
			if(method.getName().startsWith("get")){
				System.out.println("Getter");
			}else if(method.getName().startsWith("set")){
				System.out.println("Setter");
			}
			System.out.println("Return Type:\t" + method.getReturnType());
			Class[] params = method.getParameterTypes();
			System.out.print("Parameters:\t\t");
			for (Class param : params){
				System.out.print(param.getName() + ", ");
			}
			System.out.println("\n");
		}
	}

}
