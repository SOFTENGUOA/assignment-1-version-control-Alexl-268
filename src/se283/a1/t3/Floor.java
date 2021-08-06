package se283.a1.t3;

/**
 * [Floor class holds the floor size and area] Describe the class
 *
 * @author Author Name: [Alex Liang] Author UPI: [zlia715]
 * @version Date: [6/8/2021]
 *
 * 1) added a new method area which calculated the area of the floor in the floor class
 * 2) Made a MachineForJob parent class that includes all the funcitonalities of cleaning machines and polishing machines
 *
 * Note: You may create new classes, methods or fields in this package
 */

public class Floor {

	public int area(){
		//calculated the area in the method
		return length()*width();
	}

	public int length() {
		// length of the floor
		return 21;
	}

	public int width() {
		// width of the floor
		return 45;
	}

	public int getCondition() {
		// Current condition of the floor rated on the scale of 1 (worst) to 10 (best)
		return 5;
	}

}
