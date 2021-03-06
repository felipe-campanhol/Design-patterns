package studies.oop.solid.dip;

public class BadPractice {
	
	public static void main(String[] args) {

		Planet exploration = new Planet();
		
		System.out.println(exploration.attachedMoons());
		
	}

	private static interface ExploreUniverse {
		
		String satalliteScan();
		
	}

	//Class exclusive to planet information
	public static class Planet implements ExploreUniverse {

		private ExploreUniverse attached;
		
		//Methods belonging to planet information
		public double planetDimension(){ return 10; }
		public String planetName(){ return "Uranus"; }
		public double orbitPosition(){ return 60; }
		
		public String attachedMoons() {
			attached = new Moon();
			return attached.satalliteScan();
		}
		
		public String satalliteScan() {
			return "Scanning the star: "+planetName();
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
	public static class Moon implements ExploreUniverse {

		//Methods belonging to moon information
		public double moonDimension(){ return 50; }
		public String moonName(){ return "Phobos"; }
	
		public String satalliteScan() {
			return "Scanning the moon: "+moonName();
		}
		
	}
	
}
