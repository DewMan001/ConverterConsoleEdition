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
            outputDistanceFrom = "What would you like to convert from?" + "\n";
            outputDistanceFrom += "1. Meters" + "\n";
            outputDistanceFrom += "2.Centimeters" + "\n";
            outputDistanceFrom += "3. Feet" + "\n";
            outputDistanceFrom += "4. Inches" + "\n";
            
            System.out.println(outputDistanceFrom);
            
            conDistance.setConvertFromType(Integer.parseInt(readInput.next()));
            
            String outputDistanceTo;
            outputDistanceTo = "What would you like to convert to?" + "\n";
            outputDistanceTo += "1. Metres" + "\n";
            outputDistanceTo += "2. Centimetres" + "\n";
            outputDistanceTo += "3. Feet" + "\n";
            outputDistanceTo += "4. Inches" + "\n";
            
            System.out.println(outputDistanceTo);
            
            
        }
    }
    
}
