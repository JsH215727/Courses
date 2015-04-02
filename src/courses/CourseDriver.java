package courses;

public class CourseDriver {

	public static void main (String[]args){
		
		Curriculum csc = new Java201();
		System.out.println("\n"+csc.toString());
		
		Curriculum eco = new Eco();
		System.out.println("\n"+eco.toString());
		
		Curriculum math = new Calculus();
		System.out.println("\n"+ math.toString());	
	}
}
