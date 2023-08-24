/*
 * This is a program where user can calculate Uncertainty Of Momentum
 * or Uncertainty Of Position according to Heisenberg's Uncertainty 
 * Principle Formula.
 */

import java.util.Scanner;

class InvalidUncertaintyOfMomentumException extends Exception{//first custom exception
	private double delta_P;
	InvalidUncertaintyOfMomentumException(double delta_P){
		this.delta_P=delta_P;
	}
	
	public double getDelta_P() {
		return delta_P;
	}

	public void setDelta_P(double delta_P) {
		this.delta_P = delta_P;
	}

	@Override
	public String toString(){
		return "InvalidUncertaintyOfMomentumException: "+delta_P;
	}
}

class InvalidUncertaintyOfPositionException extends Exception{//second custom exception
	private double delta_X;
	InvalidUncertaintyOfPositionException(double delta_X){
		this.delta_X=delta_X;
	}
	
	public double getDelta_X() {
		return delta_X;
	}

	public void setDelta_X(double delta_X) {
		this.delta_X = delta_X;
	}

	@Override
	public String toString(){
		return "InvalidUncertaintyOfPositionException: "+delta_X;
	}
}
public class Assignment2_2222756042 {
	/*
	 * Here is the Heisenberg's Uncertainty Principle, 
	 * delta_X*delta_P=(h/(4*Math.PI));
	 * 
	 * delta_X=uncertainty in position
	 * delta_P=uncertainty of momentum
	 * h=PLANCK CONSTANT
	 */
	static final double h=6.62607015e-34; //h=PLANCK CONSTANT //Here, E means=10^
	static final String KG="kg",METER="m",PER_SECOND="/s";
	
	public static double UncertaintyInPosition(double delta_P) throws InvalidUncertaintyOfMomentumException{
		if (delta_P<=0) {
			throw new InvalidUncertaintyOfMomentumException(delta_P);
		}
		else {
			double delta_x = h / (4 * Math.PI * delta_P);
			System.out.println(delta_x+" "+KG+""+METER+" "+PER_SECOND);
		}
		return delta_P;
	}
	public static double UncertaintyInMomentam(double delta_x) throws InvalidUncertaintyOfPositionException{
		if(delta_x<=0) {
			throw new InvalidUncertaintyOfPositionException(delta_x);
		}
		else {
			double delta_P = h / (4 * Math.PI * delta_x);
			System.out.println(delta_P+" "+KG+""+METER+" "+PER_SECOND);
		}
		return delta_x;
	}
	public static void main(String[] args) {
		double delta_P,delta_x;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What do you want to calculate?\n1.Uncertainty Of Position(delta_X)");
		System.out.println("2.Uncertainty Of Momentum(delta_P)");
		System.out.println("\nEnter input- ");
		String choice=sc.nextLine();
		
		if (choice.equals("1") || choice.equalsIgnoreCase("Uncertainty Of Position")) {
			/*
			 * User can enter number or write the full term(this will ignore weather it is
			 * in capital or smaller latter) according to their need.
			 */
			System.out.print("Enter uncertainty of momentum(delta_P) in "+KG+""+METER+""+PER_SECOND+" :");
			delta_P=sc.nextDouble();
			
			try {
				System.out.print("Uncertainty in position (delta_x) is: ");
				delta_x=UncertaintyInPosition(delta_P);
			}catch(InvalidUncertaintyOfMomentumException e){
				System.out.println("Here is an Exception: "+e);
			}
		}
		else if(choice.equals("2") || choice.equalsIgnoreCase("Uncertainty Of Momentum")) {
			/*
			 * User can enter number or write the full term(this will ignore weather it is
			 * in capital or smaller latter) according to their need.
			 */
			System.out.print("Enter uncertainty of position(delta_X) in "+KG+""+METER+""+PER_SECOND+" :");
			delta_x=sc.nextDouble();
			
			try {
				System.out.print("Uncertainty in momentum (delta_P) is: ");
				delta_P=UncertaintyInMomentam(delta_x);
			}catch(InvalidUncertaintyOfPositionException e){
				System.out.println("Here is an Exception: "+e);
			}
		}
		else {
			System.out.println("Invalid input !!!");
		}
		sc.close();
	}
}
/*
 * N.B. The output will show *E(power) form
 * Such as, If I enter Uncertainty of position 2.637E-24 as input,
 * the output will be 1.999567344797414E-11 kgm /s
 * 
 * Here, E means=10^
 */

