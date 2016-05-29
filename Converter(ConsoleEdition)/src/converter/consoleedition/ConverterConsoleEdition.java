/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter.consoleedition;
import java.util.Scanner;
/**
 *
 * @author James
 */
public class ConverterConsoleEdition
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //setting up the scanner
        Scanner readInput = new Scanner(System.in);
        //setting up the intro in an output string
        String outputIntro;

        outputIntro = "Hello! Welcome to the converter!" + "\n\n";
        outputIntro += "What would you like to convert today?" + "\n";
        outputIntro += "1. Distance" + "\n";
        outputIntro += "2. Temperature" + "\n";

        System.out.println(outputIntro);
        
        int userInput = Integer.parseInt(readInput.next());
        
        if (userInput == 1)
        {
            Distance conDistance = new Distance();
            
            String outputDistanceFrom;
            outputDistanceFrom = "What would you like to convert from?" + "\n\n";
            outputDistanceFrom += "1. Meters";
            outputDistanceFrom += "2.Centimeters";
            outputDistanceFrom += "3. Feet";
            outputDistanceFrom += "4. Inches";
            
            conDistance.setConversionValue(readInput.next);
        }
    }
    
}
