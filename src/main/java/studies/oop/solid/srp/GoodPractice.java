package studies.oop.solid.srp;

public class GoodPractice {

	public static void main(String[] args) {
		
		Star star = new Star();
		Moon moon = new Moon();
		
		System.out.println("The Dimension of "+star.starName()+" is: "+star.starDimension());
		System.out.println("The name of the moon is: "+moon.moonName());
	}
	
	//Class exclusive to planet information
	public static class Planet {

		//Methods belonging to planet information
		public double planetDimension(){ return 10; }
		public String planetName(){ return "Uranus"; }
		public double orbitPosition(){ return 60; }
		
	}

	//Class exclusive to star information
	public static class Star {

		//Methods belonging to star information
		public double starDimension(){ return 30; }
		public String starName(){ return "Aldebaran"; }
		
	}

	//Class exclusive to moon information
	public static class Moon {

		//Methods belonging to moon information
		public double moonDimension(){ return 50; }
		public String moonName(){ return "Phobos"; }
		
	}

}

