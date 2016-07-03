/*
    This class is intended to mimic the functions found in the murach.ui 
    Console Class
    
    The Input class will use rhe scanner to aquire number and assign 
    them to vars

*/
package Console;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    String lineIn;
    boolean valid = false;
    int scannedInt = 0;
    //create a ner scanner object
    public static Scanner scan = new Scanner(System.in);
    
    public static boolean isParsableInt(String input){
        boolean parsable = true;
        try{
            Integer.parseInt(input);
        }catch(NumberFormatException e){
            parsable = false;
        }
        return parsable;
    }
    public static boolean isParsableDouble(String input){
        boolean parsable = true;
        try{
            Double.parseDouble(input);
        }catch(NumberFormatException e){
            parsable = false;
        }
        return parsable;
    }
    
    
    public static String getString(){
        String lineIn;
        lineIn = scan.next();
        return lineIn;
    }
    
    public static int getInt(String message, int min, int max){
        boolean valid = false;
        int scannedInt = 0;
        
        while(!valid){    
            System.out.println(message);
            String lineIn = getString();
            
            if(isParsableInt(lineIn)){
                
                scannedInt = Integer.parseInt(lineIn);
                if(scannedInt < min || scannedInt > max){
                       System.out.println("You have entered a number outside of"
                       + " our range.  Please enter a number within"
                       + "(" + min + "} & " + "(" + max + "}");
                }
                if(scannedInt > min && scannedInt <= max)
                {
                    valid = true;
                    
                }
            
            }
            else{
                System.out.println("Error.  You've entered an invalid data type."
                        + "Please try again.");
            }
        }     
        return scannedInt;
    }
    
    public static double getDouble(String message, double min, double max){
        boolean valid = false;
        double scannedDouble = 0;
        
        while(!valid){
        
            System.out.println(message);
            String input = getString();

            if(isParsableDouble(input)){    
                scannedDouble = Double.parseDouble(input);
                if(scannedDouble < min || scannedDouble > max){
                   System.out.println("You have entered a number outside of "
                           + "our range.  Please enter a number within"
                           + "(" + min + "} & " + "(" + max + "}");
                   valid = false;
                    }
                if(scannedDouble > min && scannedDouble <= max){
                   valid = true;

                }
            }
            else{
                    System.out.println("Error.  You've entered an invalid data type."
                            + "Please try again.");
                }
            
        }
        return scannedDouble;
    }
}
