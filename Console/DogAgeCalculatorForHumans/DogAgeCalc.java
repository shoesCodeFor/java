import java.util.Scanner;





public class Tutorial2 {
	
	static Scanner input = new Scanner(System.in);
	static double [] [] ageArr={{1,15,15,15},{2,24,24,24},
                                {3,28,28,28},{4,32,32,32},
		                        {5,36,36,36},{6,40,42,45},
                                {7,44,47,50},{8,48,1,55},
                                {9,52,56,61},{10,56,60,66},
                                {11,60,65,72},{12,64,69,77},
                                {13,68,74,82},{14,72,78,88},
                                {15,76,83,93},{16,80,87,120}};
	
	
	public static void main(String[] args){
		
		
		double age = 0;
		
		System.out.print("Enter your name: ");
		
		if(input.hasNext()){
		 String name = input.nextLine();
		 System.out.println("Hello " + name);
		 System.out.print("How old are you in years(Whole Numbers Please)?");
		 if(input.hasNext()){
			 age = input.nextDouble();
			 
			 
			 
			 System.out.print("Your are ");
			 
			 System.out.println(dogCalc((int)age));
			 System.out.print(" in dog years");
		 }
		}
		else{
			System.out.println("You didn't enter your name :(  Goodbye ");
			
		}
		
		
		
	}
	public static int dogCalc(int human){
		int dogAgeVal = 0;
		if(human >= ageArr [human/7][2] && human < ageArr [(human/7)+1][2])
		{
			dogAgeVal = (int) ageArr [human/7][0]; 
		}
		else if(human < 15){
			dogAgeVal = 1;
			
		}
		
		else{
			dogAgeVal = (int) ageArr [(human/7)+1][0];
		}
		
		return dogAgeVal;
	}

}
