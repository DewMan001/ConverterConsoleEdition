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
 private int convertFromType;
   private int convertToType;
   private double conversionValue;

      
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
  
  public double conFromCelsiusToCelsius()
  {
      double finalConversion;
      
      finalConversion = conversionValue * 1;
      
      return finalConversion;
  }
  
  public double conFromCelsiusToFarenheit()
  {
      double finalConversion;
      
      finalConversion = (conversionValue * 1.8) + 32;
      
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
