package se283.a1.t1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Ref;
import java.util.Scanner;

/**
 * SE283 Assignment 1 Task 1 Main - Instructions 
 * 
 * This class should be implemented to accept the user input 
 * through args[] and delegate the reflection functionality to class Reflector. 
 * 
 * You may implement additional classes if you wish, but this class should be the main program entry
 * point.
 * 
 * You must STAGE, COMMIT and PUSH your changes every time you are 
 * "done" (see the "definition of done" in Agile/Scrum/XP) with writing/changing this class, i.e. 
 * after successfully completing Task 1, Task 2 and Task 3, respectively
 * You may COMMIT and PUSH prematurely too i.e. before each task is completed, but 
 * you "must" COMMIT and PUSH to the remote repo after finishing each of the A1 tasks.
 * 
 * @author Author Name: Alex Liang Author UPI: [zlia715]
 * @version Date: [6/8/2021]
 */

public class T1Main {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args){

		// TODO Assignment 1, Question 1-2.

		System.out.print("Class : ");
		String name = scan.next();
		Reflector reflector;

		try {
			reflector = new Reflector(name);						//srrounding the functionalities in a try statement and catch exeptions
			reflector.getFieldsMethods();

			System.out.print("Methods to call (q to quit): ");
			String input = scan.next();								//scan user method input

			while (!input.equalsIgnoreCase("q")){		//while the user does not input q, loop the method calls.
				reflector.callMethod(input);
				reflector.getFieldsMethods();
				System.out.print("Methods to call (q to quit): ");
				input = scan.next();
			}

		} catch (ClassNotFoundException | NoSuchMethodException | InstantiationException e) {
			System.err.println("Invalid Class");							//catching invalid class exeption
		} catch (IllegalAccessException | InvocationTargetException e) {
			System.err.println("Invalid Method");							//catching invalid method exeption
		}
	}
}
