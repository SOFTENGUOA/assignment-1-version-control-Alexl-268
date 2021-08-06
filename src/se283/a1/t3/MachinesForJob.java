package se283.a1.t3;

/**
 * [MachineForJob parent class that reduces repeated code in polishing and cleaning machines, in the future, the user could also add new machines more efficiently] Describe the class
 *
 * @author Author Name: [Alex Liang] Author UPI: [zlia715]
 * @version Date: [6/8/2021]
 *
 * 1) added a new method area which calculated the area of the floor in the floor class
 * 2) Made a MachineForJob parent class that includes all the funcitonalities of cleaning machines and polishing machines
 *
 * Note: You may create new classes, methods or fields in this package
 */

public class MachinesForJob {
    private double electricity;
    private int capability;

    public void setCapability(int capability) {
        this.capability = capability;
    }

    public void setElectricity(double electricity) {
        this.electricity = electricity;
    }

    public int getCapability() {
        return capability;
    }

    public double getElectricity() {
        return electricity;
    }
}
