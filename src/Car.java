
public class Car {
  
	//class variable
	String vMake, vModel, vMiles, vFuels;
	int vCost;

	
	public void refuelCar(int gallonsToAdd) {
		this.vFuels= String.valueOf(Integer.parseInt(this.vFuels) + gallonsToAdd);
		System.out.println("New fuel level is"+this.vFuels);
				
	}
	public void driveCar(int milesToDrive) {
		this.vMiles=String.valueOf(Integer.parseInt(this.vFuels) + milesToDrive);
		System.out.println("New miles are" + this.vMiles);
		
	}
	
	
	public static void main(String[] args) {
	
        Car myC1=new Car();
        myC1.vMake="A";
        myC1.vFuels="10";
        myC1.vMiles="13000";
        myC1.refuelCar(20);
        myC1.driveCar(500);
		
		
	}

}
