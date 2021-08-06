package se283.a1.t3;

/**
 * [Cleanning Job Calculates the cleaning expenses needed for each job] Describe the class
 *
 * @author Author Name: [Alex Liang] Author UPI: [zlia715]
 * @version Date: [6/8/2021]
 *
 * 1) added a new method area which calculated the area of the floor in the floor class
 * 2) Made a MachineForJob parent class that includes all the funcitonalities of cleaning machines and polishing machines
 *
 * Note: You may create new classes, methods or fields in this package
 */

public class CleaningJob {
	// The method inputs the floor and cleaner objects and
    // calculates the energy consumption cost for cleaning the floor area
	double cleaningRent(Floor floor, MachinesForJob cleaner) {

		double floorArea = floor.area();
		double electricityPerUnitArea = floor.getCondition() * cleaner.getCapability();
		double energyConsumption = electricityPerUnitArea * floorArea;
		
		return energyConsumption * cleaner.getElectricity();
	}	
}
