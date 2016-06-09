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
        String[] outputArray = new String[21];
        outputArray[1] = "How many meters would you like to convert into meters?";
        outputArray[2] = "How many meters would you like to convert into centimeters?";
        outputArray[3] = "How many meters would you like to convert into feet?";
        outputArray[4] = "How many meters would you like to convert into inches?";
        outputArray[5] = "How many centimeters would you like to convert into meters?";
        outputArray[6] = "How many centimeters would you like to convert into centimeters?";
        outputArray[7] = "How many centimeters would you like to convert into feet?";
        outputArray[8] = "How many centimeters would you like to convert into inches?";
        outputArray[9] = "How many feet would you like to convert into meters?";
        outputArray[10] = "How many feet would you like to convert into centimeters?";
        outputArray[11] = "How many feet would you like to convert into feet";
        outputArray[12] = "How many feet would you like to convert into inches?";
        outputArray[13] = "How many inches would you like to convert into meters?";
        outputArray[14] = "How many inches would you like to convert into centimeters?";
        outputArray[15] = "How many inches would you like to convert into feet?";
        outputArray[16] = "How many inches would you like to convert into inches";
        outputArray[17] = "How many degrees celsius would you like to convert into celsius?";
        outputArray[18] = "How many degrees celsius would you like to convert into farenheit?";
        outputArray[19] = "How many degrees farenheit would you like to convert into celsius?";
        outputArray[20] = "How many degrees farenheit would you like to convert into farenheit?";
        //setting up the scanner
        Scanner readInput = new Scanner(System.in);
        //setting up the intro in an output string
        String outputIntro;

        outputIntro = "Hello! Welcome to the converter!" + "\n";
        outputIntro += "To make a selection, type in the number next to the item you desire." + "\n\n";
        
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
            outputDistanceFrom += "2. Centimeters" + "\n";
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
            
            conDistance.setConvertToType(Integer.parseInt(readInput.next()));
            
            //the if and else-ifs for converting from meters to any other option
            if (conDistance.convertFromType == 1 && conDistance.convertToType == 1)
            {
                System.out.println(outputArray[1]);
                try
                {
                  conDistance.setConversionValue(Double.parseDouble(readInput.next()));  
                }
                  catch(NumberFormatException noNumber)
                {
                  System.err.println("Sorry, please use a number, not a letter.");
                  System.err.println("Also, here's a more technical error message: ");
                  System.err.println(noNumber.getMessage());
                }
                
                System.out.println(conDistance.conFromMetersToMeters() + " meters");
            }
            
            else if (conDistance.convertFromType == 1 && conDistance.convertToType == 2)
            {
                System.out.println(outputArray[2]);
                try
                {
                  conDistance.setConversionValue(Double.parseDouble(readInput.next()));  
                }
                  catch(NumberFormatException noNumber)
                {
                  System.err.println("Sorry, please use a number, not a letter.");
                  System.err.println("Also, here's a more technical error message: ");
                  System.err.println(noNumber.getMessage());
                }
                
                System.out.println(conDistance.conFromMetersToCM() + " centimeters");
            }
            
            else if (conDistance.convertFromType == 1 && conDistance.convertToType == 3)
            {
                System.out.println(outputArray[3]);
                try
                {
                  conDistance.setConversionValue(Double.parseDouble(readInput.next()));  
                }
                  catch(NumberFormatException noNumber)
                {
                  System.err.println("Sorry, please use a number, not a letter.");
                  System.err.println("Also, here's a more technical error message: ");
                  System.err.println(noNumber.getMessage());
                }
                
                System.out.println(conDistance.conFromMetersToFeet() + " feet");
            }
            
            else if (conDistance.convertFromType == 1 && conDistance.convertToType == 4)
            {
                System.out.println(outputArray[4]);
                try
                {
                  conDistance.setConversionValue(Double.parseDouble(readInput.next()));  
                }
                  catch(NumberFormatException noNumber)
                {
                  System.err.println("Sorry, please use a number, not a letter.");
                  System.err.println("Also, here's a more technical error message: ");
                  System.err.println(noNumber.getMessage());
                }
                
                System.out.println(conDistance.conFromMetersToInches() + " inches");
            }
            
            else if (conDistance.convertFromType == 2 && conDistance.convertToType == 1)
            {
                System.out.println(outputArray[5]);
                try
                {
                  conDistance.setConversionValue(Double.parseDouble(readInput.next()));  
                }
                  catch(NumberFormatException noNumber)
                {
                  System.err.println("Sorry, please use a number, not a letter.");
                  System.err.println("Also, here's a more technical error message: ");
                  System.err.println(noNumber.getMessage());
                }
                
                System.out.println(conDistance.conFromCMToMeters() + " meters");
            }
            
            //the else ifs for converting from centimeters to any other option
            else if (conDistance.convertFromType == 2 && conDistance.convertToType == 2)
            {
                System.out.println(outputArray[6]);
                try
                {
                  conDistance.setConversionValue(Double.parseDouble(readInput.next()));  
                }
                  catch(NumberFormatException noNumber)
                {
                  System.err.println("Sorry, please use a number, not a letter.");
                  System.err.println("Also, here's a more technical error message: ");
                  System.err.println(noNumber.getMessage());
                }
                
                System.out.println(conDistance.conFromCMToCM() + " centimeters");
            }
            
            else if (conDistance.convertFromType == 2 && conDistance.convertToType == 3)
            {
                System.out.println(outputArray[7]);
                try
                {
                  conDistance.setConversionValue(Double.parseDouble(readInput.next()));  
                }
                  catch(NumberFormatException noNumber)
                {
                  System.err.println("Sorry, please use a number, not a letter.");
                  System.err.println("Also, here's a more technical error message: ");
                  System.err.println(noNumber.getMessage());
                }
                
                System.out.println(conDistance.conFromCMToFeet() + " feet");
            }
            
            else if (conDistance.convertFromType == 2 && conDistance.convertToType == 4)
            {
                System.out.println(outputArray[8]);
                try
                {
                  conDistance.setConversionValue(Double.parseDouble(readInput.next()));  
                }
                  catch(NumberFormatException noNumber)
                {
                  System.err.println("Sorry, please use a number, not a letter.");
                  System.err.println("Also, here's a more technical error message: ");
                  System.err.println(noNumber.getMessage());
                }
                
                System.out.println(conDistance.conFromCMToInches() + " inches");
            }
            
            //and now the else ifs for feet into anything else
            else if (conDistance.convertFromType == 3 && conDistance.convertToType == 1)
            {
                System.out.println(outputArray[9]);
                try
                {
                  conDistance.setConversionValue(Double.parseDouble(readInput.next()));  
                }
                  catch(NumberFormatException noNumber)
                {
                  System.err.println("Sorry, please use a number, not a letter.");
                  System.err.println("Also, here's a more technical error message: ");
                  System.err.println(noNumber.getMessage());
                }
                
                System.out.println(conDistance.conFromFeetToMeters() + " meters");
            }
            
            else if (conDistance.convertFromType == 3 && conDistance.convertToType == 2)
            {
                System.out.println(outputArray[10]);
                try
                {
                  conDistance.setConversionValue(Double.parseDouble(readInput.next()));  
                }
                  catch(NumberFormatException noNumber)
                {
                  System.err.println("Sorry, please use a number, not a letter.");
                  System.err.println("Also, here's a more technical error message: ");
                  System.err.println(noNumber.getMessage());
                }
                
                System.out.println(conDistance.conFromFeetToCM() + " meters");
                
            }
            
            else if (conDistance.convertFromType == 3 && conDistance.convertToType == 3)
            {
                System.out.println(outputArray[11]);
                try
                {
                  conDistance.setConversionValue(Double.parseDouble(readInput.next()));  
                }
                  catch(NumberFormatException noNumber)
                {
                  System.err.println("Sorry, please use a number, not a letter.");
                  System.err.println("Also, here's a more technical error message: ");
                  System.err.println(noNumber.getMessage());
                }
                
                System.out.println(conDistance.conFromFeetToFeet() + " meters");
            }
            
            else if (conDistance.convertFromType == 3 && conDistance.convertToType == 4)
            {
                System.out.println(outputArray[12]);
                try
                {
                  conDistance.setConversionValue(Double.parseDouble(readInput.next()));  
                }
                  catch(NumberFormatException noNumber)
                {
                  System.err.println("Sorry, please use a number, not a letter.");
                  System.err.println("Also, here's a more technical error message: ");
                  System.err.println(noNumber.getMessage());
                }
                
                System.out.println(conDistance.conFromFeetToInches() + " meters");
            }
            
            else if (conDistance.convertFromType == 4 && conDistance.convertToType == 1)
            {
                System.out.println(outputArray[13]);
                try
                {
                  conDistance.setConversionValue(Double.parseDouble(readInput.next()));  
                }
                  catch(NumberFormatException noNumber)
                {
                  System.err.println("Sorry, please use a number, not a letter.");
                  System.err.println("Also, here's a more technical error message: ");
                  System.err.println(noNumber.getMessage());
                }
                
                System.out.println(conDistance.conFromInchesToMeters() + " meters");
            }
            
            else if (conDistance.convertFromType == 4 && conDistance.convertToType == 2)
            {
                System.out.println(outputArray[14]);
                try
                {
                  conDistance.setConversionValue(Double.parseDouble(readInput.next()));  
                }
                  catch(NumberFormatException noNumber)
                {
                  System.err.println("Sorry, please use a number, not a letter.");
                  System.err.println("Also, here's a more technical error message: ");
                  System.err.println(noNumber.getMessage());
                }
                
                System.out.println(conDistance.conFromInchesToCM() + " centimeters");
            }
            
            else if (conDistance.convertFromType == 4 && conDistance.convertToType == 3)
            {
                System.out.println(outputArray[15]);
                try
                {
                  conDistance.setConversionValue(Double.parseDouble(readInput.next()));  
                }
                  catch(NumberFormatException noNumber)
                {
                  System.err.println("Sorry, please use a number, not a letter.");
                  System.err.println("Also, here's a more technical error message: ");
                  System.err.println(noNumber.getMessage());
                }
                
                System.out.println(conDistance.conFromInchesToFeet() + " feet");
            }
            
            else if (conDistance.convertFromType == 4 && conDistance.convertToType == 4)
            {
                System.out.println(outputArray[16]);
                try
                {
                  conDistance.setConversionValue(Double.parseDouble(readInput.next()));  
                }
                  catch(NumberFormatException noNumber)
                {
                  System.err.println("Sorry, please use a number, not a letter.");
                  System.err.println("Also, here's a more technical error message: ");
                  System.err.println(noNumber.getMessage());
                }
                
                System.out.println(conDistance.conFromInchesToInches() + " inches");
            }
        }
        
        else if (userInput == 2)
        {
            Temperature conTemperature = new Temperature();
            
            String outputDistanceFrom;
            
            outputDistanceFrom = "What would you like to convert from?" + "\n";
            outputDistanceFrom += "1. Celsius" + "\n";
            outputDistanceFrom += "2. Farenheit" + "\n";
            
            System.out.println(outputDistanceFrom);
            
            conTemperature.setConvertFromType(Integer.parseInt(readInput.next()));
            
            String outputDistanceTo;
            
            outputDistanceTo = "What would you like to convert to?" + "\n";
            outputDistanceTo += "1. Celsius" + "\n";
            outputDistanceTo += "2. Farenheit" + "\n";
            
            System.out.println(outputDistanceTo);

            conTemperature.setConvertToType(Integer.parseInt(readInput.next()));
            
              if (conTemperature.convertFromType == 1 && conTemperature.convertToType == 1)
                {
                  System.out.println(outputArray[17]);
                  try
                {
                  conTemperature.setConversionValue(Double.parseDouble(readInput.next()));  
                }
                  catch(NumberFormatException noNumber)
                {
                  System.err.println("Sorry, please use a number, not a letter.");
                  System.err.println("Also, here's a more technical error message: ");
                  System.err.println(noNumber.getMessage());
                }

                  System.out.println(conTemperature.conFromCelsiusToCelsius() + "°C");
                }

                else if (conTemperature.convertFromType == 1 && conTemperature.convertToType == 2)
                {
                  System.out.println(outputArray[18]);
                  try
                {
                  conTemperature.setConversionValue(Double.parseDouble(readInput.next()));  
                }
                  catch(NumberFormatException noNumber)
                {
                  System.err.println("Sorry, please use a number, not a letter.");
                  System.err.println("Also, here's a more technical error message: ");
                  System.err.println(noNumber.getMessage());
                }

                  System.out.println(conTemperature.conFromCelsiusToFarenheit() + "°F");
                }

                else if (conTemperature.convertFromType == 2 && conTemperature.convertToType == 1)
                {
                  System.out.println(outputArray[19]);
                try
                {
                  conTemperature.setConversionValue(Double.parseDouble(readInput.next()));  
                }
                  catch(NumberFormatException noNumber)
                {
                  System.err.println("Sorry, please use a number, not a letter.");
                  System.err.println("Also, here's a more technical error message: ");
                  System.err.println(noNumber.getMessage());
                }

                  System.out.println(conTemperature.conFromFarenheitToCelsius() + "°C");
                }

                else if (conTemperature.convertFromType == 2 && conTemperature.convertToType == 2)
                {
                  System.out.println(outputArray[20]);
                  
                  try
                    {
                      conTemperature.setConversionValue(Double.parseDouble(readInput.next()));  
                    }
                  catch(NumberFormatException noNumber)
                    {
                      System.err.println("Sorry, please use a number, not a letter.");
                      System.err.println("Also, here's a more technical error message: ");
                      System.err.println(noNumber.getMessage());
                    }
                  
                  System.out.println(conTemperature.conFromFarenheitToFarenheit() + "°F");
                }
              
        }
    }
    
}
