package se283.a1.t3;

/**
 * [PolishingJob Calculates the polishing expenses needed for each job] Describe the class
 *
 * @author Author Name: [Alex Liang] Author UPI: [zlia715]
 * @version Date: [6/8/2021]
 *
 * 1) added a new method area which calculated the area of the floor in the floor class
 * 2) Made a MachineForJob parent class that includes all the funcitonalities of cleaning machines and polishing machines
 *
 * Note: You may create new classes, methods or fields in this package
 */

public class PolishingJob{
	double polishingRent(Floor floor, MachinesForJob polisher) {
		double floorArea = floor.area();
		double electricityPerUnitArea = floor.getCondition() * polisher.getCapability();
		double energyConsumption = electricityPerUnitArea * floorArea;

		return energyConsumption * polisher.getElectricity();
	}
}