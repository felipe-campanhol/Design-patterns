package studies.swp.dry;

public class Dry {

	public static void main(String[] args) {

		System.out.println("Mapping the galaxy...");
		
		//Set 8 planets in the galaxy
		Planet[] galaxy = new Planet[8];
		
		galaxy[0] = new Planet("Mercury",10);
		galaxy[1] = new Planet("Venus",440);
		galaxy[2] = new Planet("Earth",530);
		galaxy[3] = new Planet("Mars",7730);
		galaxy[4] = new Planet("Jupiter",23140);
		galaxy[5] = new Planet("Saturn",44130);
		galaxy[6] = new Planet("Uranus",97740);
		galaxy[7] = new Planet("Neptune",3124530);
		
		mappingGalaxy(galaxy);		
		
		try {
			
			System.out.println("Calculating route from "+galaxy[3].getName()+" to "+galaxy[1].getName());
		
			System.out.println("The distance is: "+galaxy[0].calculateDistanceBetween(galaxy[3],galaxy[1]));
			

			System.out.println("Calculating route from "+galaxy[7].getName()+" to "+galaxy[5].getName());
			
			System.out.println("The distance is: "+galaxy[0].calculateDistanceBetween(galaxy[7],galaxy[5]));
			
			
			System.out.println("Calculating route from "+galaxy[2].getName()+" to "+galaxy[2].getName());
			
			System.out.println("The distance is: "+galaxy[0].calculateDistanceBetween(galaxy[2],galaxy[2]));
			
			
			System.out.println("Calculating route from "+galaxy[0].getName()+" to "+galaxy[4].getName());
			
			System.out.println("The distance is: "+galaxy[0].calculateDistanceBetween(galaxy[0],galaxy[4]));
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}
	
	//Write each planet
	public static void mappingGalaxy(Planet galaxy[]) {
		
		int index = 1;
		
        for(Planet planet : galaxy){
            System.out.println("The "+ordinal(index++)+" planet is "+planet.getName());
        }
		
	}
	
	//Get ordinal number
	public static String ordinal(int i) {
	    String[] suffixes = new String[] { "th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th" };
	    switch (i % 100) {
	    case 11:
	    case 12:
	    case 13:
	        return i + "th";
	    default:
	        return i + suffixes[i % 10];

	    }
	}
	
	public static class Planet {
		
		String name;
		int distance_from_sun;
		
		//Constructor to set the planet name
		public Planet(String name, int distance_from_sun) {
			this.name = name;
			this.distance_from_sun = distance_from_sun;
		}

		//Calculate the distance from planets
		public int calculateDistanceBetween(Planet planet1, Planet planet2) throws Exception {
			
			int distance;
			
			//Check if the planet are the same
			if(planet1.name == planet2.name) {
				throw new Exception("Cannot calculate the distance because the planet is the same");
			}
				
			//Check and determinate which planet is more distance from the sun
			if(planet1.distance_from_sun > planet2.distance_from_sun) {
				distance = planet1.distance_from_sun-planet2.distance_from_sun;
			}else {
				distance = planet2.distance_from_sun-planet1.distance_from_sun;
			}
				
			return distance;
			
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getDistance_from_sun() {
			return distance_from_sun;
		}

		public void setDistance_from_sun(int distance_from_sun) {
			this.distance_from_sun = distance_from_sun;
		}
		
	}
	
}
