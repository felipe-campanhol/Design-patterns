package studies.oop.solid.isp;

public class GoodPractice {

	public static void main(String[] args) {

		Star exploration = new Star();
		
		System.out.println(exploration.satalliteScan());
		
		Planet exploration_rover = new Planet();
		
		System.out.println(exploration_rover.sendRover());
		
	}

	private static interface ExploreUniverse {
		
		String satalliteScan();
		
	}
	
	private static interface Rover {
		
		boolean sendRover();
		
	}
	
	//Class exclusive to planet information
	public static class Planet implements ExploreUniverse, Rover {

		//Methods belonging to planet information
		public double planetDimension(){ return 10; }
		public String planetName(){ return "Uranus"; }
		public double orbitPosition(){ return 60; }
		
		public String satalliteScan() {
			return "Scanning the planet: "+planetName();
		}
		
		public boolean sendRover() {
			return true;
		}
		
	}

	//Class exclusive to star information
	public static class Star implements ExploreUniverse {

		//Methods belonging to star information
		public double starDimension(){ return 30; }
		public String starName(){ return "Aldebaran"; }
		
		public String satalliteScan() {
			return "Scanning the star: "+starName();
		}
		
	}

	//Class exclusive to moon information
	public static class Moon implements ExploreUniverse, Rover {

		//Methods belonging to moon information
		public double moonDimension(){ return 50; }
		public String moonName(){ return "Phobos"; }
	
		public String satalliteScan() {
			return "Scanning the moon: "+moonName();
		}
		
		public boolean sendRover() {
			return false;
		}
		
	}
	
}
