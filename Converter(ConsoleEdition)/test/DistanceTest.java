/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import converter.consoleedition.Distance;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author James
 */
public class DistanceTest
{
    
    public DistanceTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @Test
    public void testMetersToMeters()
    {
        Distance metresTest = new Distance();
        //double intendedResult;
        metresTest.conversionValue = 34;
        //intendedResult = metresTest.conFromMetersToMeters();
        Assert.assertEquals("34 metres should be 34 meters",34.0,metresTest.conFromMetersToMeters(),0.1);
    }
    
    @Test
    public void testMetersToCM()
    {
        Distance metersTest = new Distance();
        metersTest.conversionValue = 97;
        Assert.assertEquals("97 metres should be 970 centimetres",9700,metersTest.conFromMetersToCM(),1);
    }
    
    @Test
    public void testMetersToFeet()
    {
        Distance MToFTest = new Distance();
        MToFTest.conversionValue = 90;
        Assert.assertEquals("90 metres should be 295 feet",295,MToFTest.conFromMetersToFeet(),1);
    }
    
    @Test
    public void testMetersToInches()
    {
        Distance MToITest = new Distance();
        MToITest.conversionValue = 243;
        Assert.assertEquals("243 meters should be 9,567 inches",9567,MToITest.conFromMetersToInches(),1);
    }
    
    @Test
    public void testCMToM()
    {
        Distance CMToMTest = new Distance();
        CMToMTest.conversionValue = 100;
        Assert.assertEquals("100 centimeters should be 1 meter",1,CMToMTest.conFromCMToMeters(),1);
    }
    
    @Test
    public void testCMToCM()
    {
        Distance CMToCMTest = new Distance();
        CMToCMTest.conversionValue = 698;
        Assert.assertEquals("698 centimeters should be 698 centimeters",698,CMToCMTest.conFromCMToCM(),1);
    }
    
    @Test
    public void testCMToFeet()
    {
        Distance CMToFTest = new Distance();
        CMToFTest.conversionValue = 23;
        Assert.assertEquals("23 Centimeters should be 0.75 feet", 0.75, CMToFTest.conFromCMToFeet(), 0.01);
    }
    
    @Test
    public void testCMToInches()
    {
        Distance CMToITest = new Distance();
        CMToITest.conversionValue = 432;
        Assert.assertEquals("432 centimeters sould be 170 inches", 170, CMToITest.conFromCMToInches(), 1);
    }
    
    @Test
    public void testFeetToM()
    {
        Distance FToMTest = new Distance();
        FToMTest.conversionValue = 678;
        Assert.assertEquals("678 feet should be 207 meters", 207, FToMTest.conFromFeetToMeters(),1);
    }
    
    @Test
    public void testFeetToCM()
    {
        Distance FToCMTest = new Distance();
        FToCMTest.conversionValue = 59;
        Assert.assertEquals("59 feet should be 1798 centimeters", 1798, FToCMTest.conFromFeetToCM(), 1);
    }
    
    @Test
    public void testFeetToFeet()
    {
        Distance FToFTest = new Distance();
        FToFTest.conversionValue = 210;
        Assert.assertEquals("210 feet should be 210 feet", 210, FToFTest.conFromFeetToFeet(), 1);
    }
    
    @Test
    public void testFeetToInches()
    {
        Distance FToITest = new Distance();
        FToITest.conversionValue = 76;
        Assert.assertEquals("76 feet should be 912 inches", 912, FToITest.conFromFeetToInches(), 1);
    }
    
    @Test
    public void testInchesToMeters()
    {
        Distance IToMTest = new Distance();
        IToMTest.conversionValue = 120;
        Assert.assertEquals("120 inches should be 3 meters", 3, IToMTest.conFromInchesToMeters(), 1);
    }
    
    @Test
    public void testInchesToCM()
    {
        Distance IToCMTest = new Distance();
        IToCMTest.conversionValue = 129;
        Assert.assertEquals("129 inches should be 328 centimeters", 328, IToCMTest.conFromInchesToCM(), 1);
    }
    
    @Test
    public void testInchesToFeet()
    {
        Distance IToFTest = new Distance();
        IToFTest.conversionValue = 328;
        Assert.assertEquals("328 inches should be 27 feet", 27, IToFTest.conFromInchesToFeet(), 1);
    }
    
    @Test
    public void testInchesToInches()
    {
        Distance IToITest = new Distance();
        IToITest.conversionValue = 38;
        Assert.assertEquals("38 inches should be 38 inches", 38, IToITest.conFromInchesToInches(), 1);
    }
    
    @After
    public void tearDown()
    {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
