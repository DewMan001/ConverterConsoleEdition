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
   public int convertFromType;
   public int convertToType;
   public double conversionValue;

  //setters and getters for thevariables    
  public void setConvertFromType(int value)
  {
      convertFromType = value;
  }
  
  public int getConvertFromType()
  {
      return convertFromType;
  }
  
  public void setConvertToType(int value)
  {
      convertToType = value;
  }
  
  public int getConvertToType()
  {
      return convertToType;
  }
  
  public void setConversionValue(double value)
  {
      conversionValue = value;
  }
  
  public double getConversionValue()
  {
      return conversionValue;
  }
  //the calculation methods,l the main heart and sould of our program
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
  
  public double conFromMetersToFeet()
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
      
      finalConversion = conversionValue * 30.48;
      
      return finalConversion;
  }
  
  public double conFromFeetToFeet()
  {
      double finalConversion;
      
      finalConversion = conversionValue * 1;
      
      return finalConversion;
  }
  
  public double conFromFeetToInches()
  {
      double finalConversion;
      
      finalConversion = conversionValue * 12;
      
      return finalConversion;
  }
  
  public double conFromInchesToMeters()
  {
      double finalConversion;
      
      finalConversion = conversionValue * 0.0254;
      
      return finalConversion;
  }
  
  public double conFromInchesToCM()
  {
      double finalConversion;
      
      finalConversion = conversionValue * 2.54;
      
      return finalConversion;
  }
  
  public double conFromInchesToFeet()
  {
      double finalConversion;
      
      finalConversion = conversionValue / 12;
      
      return finalConversion;
  }
  
  public double conFromInchesToInches()
  {
      double finalConversion;
      
      finalConversion = conversionValue * 1;
      
      return finalConversion;
  }
}
