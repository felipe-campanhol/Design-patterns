package studies.swp.kiss;

import java.util.HashMap;

public class GoodPractice {

	//Hashmap constant
    private static final HashMap<String, Integer> PLANETS = new HashMap<String, Integer>();

    static {
    	PLANETS.put("Mercury", 331312);
    	PLANETS.put("Venus", 634788);
    	PLANETS.put("Earth", 5384690);
    	PLANETS.put("Mars", 531267);
    	PLANETS.put("Jupiter", 79404);
    	PLANETS.put("Saturn", 167699);
    	PLANETS.put("Uranus", 7553445);
    	PLANETS.put("Neptune", 6210874);
    }
   
	public static void main(String[] args) {

		System.out.println("Detecting the planets of the via lacta...");
		
		try {
			
			mappingGalaxy(PLANETS);
			
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}
	
	//Write each planet
	public static void mappingGalaxy(HashMap<String, Integer> galaxy) {
		
		int index = 1;
		
		for(String planet : galaxy.keySet()){
			System.out.println("The "+ordinal(index++)+" planet is "+planet);
			
			System.out.println("Calculating the size of "+planet+"... "+galaxy.get(planet));
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
	
}
