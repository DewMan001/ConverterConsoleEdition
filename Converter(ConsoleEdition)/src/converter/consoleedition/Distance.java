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
public class Distance
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
  
  public double setConversionValue(int value)
  {
      conversionValue = value;
      return conversionValue;
  }
  
  public double conFromMetersToMeters()
  {
     double finalConversion;
     
     finalConversion = conversionValue * 1;
     
     return finalConversion;
  }
  
  public double conFromMetersToCM()
  {
      double finalConversion;
      
      finalConversion = conversionValue * 100;
      
      return finalConversion;
  }
  
  public double conFeromMetersToFeet()
  {
      double finalConversion;
      
      finalConversion = conversionValue / 0.3048;
      
      return finalConversion;
  }
  
  public double conFromMetersToInches()
  {
      double finalConversion;
      
      finalConversion = conversionValue / 0.0254;
      
      return finalConversion;
  }
  
  public double conFromCMToMeters()
  {
      double finalConversion;
      
      finalConversion = conversionValue / 100;
      
      return finalConversion;
  }
  
  public double conFromCMToCM()
  {
       double finalConversion;
      
      finalConversion = conversionValue * 1;
      
      return finalConversion;
  }
  
  public double conFromCMToFeet()
  {
      double finalConversion;
      
      finalConversion = conversionValue / 30.48;
      
      return finalConversion;
  }
  
  public double conFromCMToInches()
  {
      double finalConversion;
      
      finalConversion = conversionValue / 2.54;
      
      return finalConversion;
  }
  
  public double conFromFeetToMeters()
  {
      double finalConversion;
      
      finalConversion = conversionValue * 0.3048;
      
      return finalConversion;
  }
  
  public double conFromFeetToCM()
  {
      double finalConversion;
      
      finalConversion = conversionValue / //INSERT VALUE HERE;
      
      return finalConversion;
  }
}
