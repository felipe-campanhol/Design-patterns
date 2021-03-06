package studies.oop.solid.lsp;


public class BadPractice {
	
	public static void main(String[] args) {

		ExploreGalaxy exploration = new Star();
		
		System.out.println(exploration.explore());
		
	}

	private static interface ExploreGalaxy {
		
		String explore();
		
	}
	
	//Class exclusive to planet information
	public static class Planet implements ExploreGalaxy {

		//Methods belonging to planet information
		public double planetDimension(){ return 10; }
		public String planetName(){ return "Uranus"; }
		public double orbitPosition(){ return 60; }
		
		public String explore() {
			return "Exploring the planet: "+planetName();
		}
		
	}

	//Class exclusive to star information
	public static class Star implements ExploreGalaxy {

		//Methods belonging to star information
		public double starDimension(){ return 30; }
		public String starName(){ return "Sun"; }
		
		//Function with error because the child class cannot implement this method, LSP aims to maintain the consistency 
		//and avoid these kind of mistakes 
		public String explore() {
			throw new AssertionError("Cannot explore the star: "+starName());
		}
		
	}

	//Class exclusive to moon information
	public static class Moon implements ExploreGalaxy {

		//Methods belonging to moon information
		public double moonDimension(){ return 50; }
		public String moonName(){ return "Phobos"; }
	
		public String explore() {
			return "Exploring the moon: "+moonName();
		}
		
	}
	
}
