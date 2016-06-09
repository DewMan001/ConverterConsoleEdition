/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter.consoleedition;

/**
 *
 * @author James
 */
public class Temperature
{
 public int convertFromType;
   public int convertToType;
   public double conversionValue;

  //setters and getters for our various variables    
  public int setConvertFromType(int value)
  {
      convertFromType = value;
      return convertFromType;
  }
  
  public int setConvertToType(int value)
  {
      convertToType = value;
      return convertToType;
  }
  
  public double setConversionValue(double value)
  {
      conversionValue = value;
      return conversionValue;
  }
  
  //methods which calculate the final result
  public double conFromCelsiusToCelsius()
  {
      double finalConversion;
      
      finalConversion = conversionValue * 1;
      
      return finalConversion;
  }
  
  public double conFromCelsiusToFarenheit()
  {
      double finalConversion;
      finalConversion = 0.00;
      try
      {
      
      finalConversion = (conversionValue * 1.8) + 32;
      }
      catch(NumberFormatException ex)
      {
          System.err.println("NO! YOU'RE WRONG!");
      }
      return finalConversion;
  }
  
  public double conFromFarenheitToCelsius()
  {
      double finalConversion;
      
      finalConversion = ((conversionValue - 32) * 5) / 9;
      
      return finalConversion;
  }
  
  public double conFromFarenheitToFarenheit()
  {
      double finalConversion;
      
      finalConversion = (conversionValue *1);
      
      return finalConversion;
  }
}
