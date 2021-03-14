package studies.swp.dry;

public class Wet {

	public static void main(String[] args) {

		System.out.println("Mapping the galaxy");
		
		String planet_1o = "Mercury";
		String planet_2o = "Venus";
		String planet_3o = "Earth";
		String planet_4o = "Mars";
		String planet_5o = "Jupiter";
		String planet_6o = "Saturn";
		String planet_7o = "Uranus";
		String planet_8o = "Neptune";
		
		System.out.println("The first planet is: "+planet_1o);
		
		System.out.println("The second planet is: "+planet_2o);
		
		System.out.println("The third planet is: "+planet_3o);
		
		System.out.println("The fourth planet is: "+planet_4o);
		
		System.out.println("The fifth planet is: "+planet_5o);
		
		System.out.println("The sixth planet is: "+planet_6o);
		
		System.out.println("The seventh planet is: "+planet_7o);
		
		System.out.println("The eighth planet is: "+planet_8o);
		
		int planet_1o_distance_from_sun = 10;
		int planet_2o_distance_from_sun = 440;
		int planet_3o_distance_from_sun = 530;
		int planet_4o_distance_from_sun = 7730;
		int planet_5o_distance_from_sun = 23140;
		int planet_6o_distance_from_sun = 44130;
		int planet_7o_distance_from_sun = 97740;
		int planet_8o_distance_from_sun = 3124530;
		
		System.out.println("Calculating route from "+planet_4o+" to "+planet_1o);
		
		System.out.println("The distance is: "+(planet_4o_distance_from_sun-planet_1o_distance_from_sun));
		
		
		System.out.println("Calculating route from "+planet_3o+" to "+planet_7o);
		
		System.out.println("The distance is: "+(planet_7o_distance_from_sun-planet_3o_distance_from_sun));
		
	}
	
}
