package studies.oop.solid.srp;

public class BadPractice {

	public static void main(String[] args) {
		System.out.println("The Dimension of "+starName()+" is: "+starDimension());
		System.out.println("The name of the moon is: "+moonName());
	}

	//Methods belonging to planet information
	public double planetDimension(){ return 10; }
	public String planetName(){ return "Uranus"; }
	public double orbitPosition(){ return 60; }

	//Methods belonging to star information
	public static double starDimension(){ return 30; }
	public static String starName(){ return "Aldebaran"; }

	//Methods belonging to moon information
	public double moonDimension(){ return 50; }
	public static String moonName(){ return "Phobos"; }
	
}
