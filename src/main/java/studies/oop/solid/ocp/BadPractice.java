package studies.oop.solid.ocp;

public class BadPractice {
	
	public static void main(String[] args) {

		String explore_galaxy = "Moon";
		
		if(explore_galaxy == "Planet") {
			
			Planet planet = new Planet();
			
			System.out.println("The celestial body to be explored is: "+planet.planetName());
			
		}else if(explore_galaxy == "Moon") {
			
			Moon moon = new Moon();
			
			System.out.println("The celestial body to be explored is: "+moon.moonName());
			
		}else if(explore_galaxy == "Star") {
			
			Star star = new Star();
			
			System.out.println("The celestial body to be explored is: "+star.starName());
			
		}
		
		
		
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
