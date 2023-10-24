package lineProject;

import java.awt.geom.Point2D;
import junit.framework.TestCase;

public class LineTest extends TestCase
{
    private static final double TOLERANCE = 1E-14;
    
    public void testWithFirstConstructor()
    {
        Line line = new Line(new Point2D.Double(0, 6), 5);
        
        
        assertTrue( ! line.isVertical() );
        
        
        try
        {
            line.getXIntercept();
            assertTrue(false); // supposed to throw exception
        }
        catch(IllegalStateException e)
        {
            assertTrue(true);
        }
        
        
        double expectedSlope = 5;
        double actualSlope = line.getSlope();
        
        assertTrue(closeEnough(expectedSlope, actualSlope));
        
        
        double expectedYIntercept = 6;
        double actualYIntercept = line.getYIntercept();
        
        assertTrue(closeEnough(expectedYIntercept, actualYIntercept));
        
        
        String expectedToString = "y = 5x + 6";
        String actualToString = line.toString();
        
        assertTrue(equationsCloseEnough(expectedToString, actualToString));
    }
    
    public void testWithSecondConstructor()
    {
        Line line = new Line(new Point2D.Double(-10, -44), new Point2D.Double(10, 56));
        
        
        assertTrue( ! line.isVertical() );
        
        
        try
        {
            line.getXIntercept();
            assertTrue(false); // supposed to throw exception
        }
        catch(IllegalStateException e)
        {
            assertTrue(true);
        }
        
        double expectedSlope = 5;
        double actualSlope = line.getSlope();
        
        assertTrue(closeEnough(expectedSlope, actualSlope));
        
        
        double expectedYIntercept = 6;
        double actualYIntercept = line.getYIntercept();
        
        assertTrue(closeEnough(expectedYIntercept, actualYIntercept));
        
        
        String expectedToString = "y = 5x + 6";
        String actualToString = line.toString();
        
        assertTrue(equationsCloseEnough(expectedToString, actualToString));
    }
    
    public void testWithThirdConstructor()
    {
        Line line = new Line("y = 5x + 6");
        
        
        assertTrue( ! line.isVertical() );
        
        
        try
        {
            line.getXIntercept();
            assertTrue(false); // supposed to throw exception
        }
        catch(IllegalStateException e)
        {
            assertTrue(true);
        }
        
        
        double expectedSlope = 5;
        double actualSlope = line.getSlope();
        
        assertTrue(closeEnough(expectedSlope, actualSlope));
        
        
        double expectedYIntercept = 6;
        double actualYIntercept = line.getYIntercept();
        
        assertTrue(closeEnough(expectedYIntercept, actualYIntercept));
        
        
        String expectedToString = "y = 5x + 6";
        String actualToString = line.toString();
        
        assertTrue(equationsCloseEnough(expectedToString, actualToString));
    }
    
    public void testConstrutorsAndEquals1()
    {
        Line line1 = new Line(new Point2D.Double(0, 6), 5);
        Line line2 = new Line(new Point2D.Double(-10, -44), new Point2D.Double(10, 56));
        Line line3 = new Line("y = 5x + 6");
        Line line4 = new Line("y = 10x + -8");
        Line line5 = new Line("y = 5x + 14");
        Line line6 = new Line("y = 10x + 4");
        
        assertTrue(line1.equals(line1));
        assertTrue(line1.equals(line2));
        assertTrue(line1.equals(line3));
        assertTrue( ! line1.equals(line4) );
        assertTrue( ! line1.equals(line5) );
        assertTrue( ! line1.equals(line6) );
        
        assertTrue(line2.equals(line1));
        assertTrue(line2.equals(line2));
        assertTrue(line2.equals(line3));
        assertTrue( ! line2.equals(line4) );
        assertTrue( ! line2.equals(line5) );
        assertTrue( ! line2.equals(line6) );
        
        assertTrue(line3.equals(line1));
        assertTrue(line3.equals(line2));
        assertTrue(line3.equals(line3));
        assertTrue( ! line3.equals(line4) );
        assertTrue( ! line3.equals(line5) );
        assertTrue( ! line3.equals(line6) );
        
        assertTrue( ! line4.equals(line1) );
        assertTrue( ! line4.equals(line2) );
        assertTrue( ! line4.equals(line3) );
        assertTrue(line4.equals(line4));
        assertTrue( ! line4.equals(line5) );
        assertTrue( ! line4.equals(line6) );
        
        assertTrue( ! line5.equals(line1) );
        assertTrue( ! line5.equals(line2) );
        assertTrue( ! line5.equals(line3) );
        assertTrue( ! line5.equals(line4) );
        assertTrue(line5.equals(line5));
        assertTrue( ! line5.equals(line6) );
        
        assertTrue( ! line6.equals(line1) );
        assertTrue( ! line6.equals(line2) );
        assertTrue( ! line6.equals(line3) );
        assertTrue( ! line6.equals(line4) );
        assertTrue( ! line6.equals(line5) );
        assertTrue(line6.equals(line6));
    }
    
    public void testConstructorsAndEquals2()
    {
        Line line1 = new Line(new Point2D.Double(0, 6), 5);
        Line line2 = new Line("x = 5");
        Line line3 = new Line("x = 6");
        Line line4 = new Line(new Point2D.Double(5, 8), new Point2D.Double(5, 10));
        
        assertTrue( ! line1.equals(line2) );
        assertTrue( ! line1.equals(line4) );
        
        assertTrue( ! line2.equals(line1) );
        assertTrue(line2.equals(line2));
        assertTrue( ! line2.equals(line3) );
        assertTrue(line2.equals(line4));
        
        assertTrue( ! line3.equals(line2) );
        assertTrue(line3.equals(line3) );
        assertTrue( ! line3.equals(line4) );
        
        assertTrue( ! line4.equals(line1) );
        assertTrue(line4.equals(line2));
        assertTrue( ! line4.equals(line3) );
        assertTrue(line4.equals(line4));
    }
    
    public void testWithSecondConstructorWithVerticalLine()
    {
        Line line = new Line(new Point2D.Double(6, 10), new Point2D.Double(6, 30));
        
        
        assertTrue(line.isVertical());
        
        
        try
        {
            line.getYIntercept();
            assertTrue(false); // supposed to throw exception
        }
        catch(IllegalStateException e)
        {
            assertTrue(true);
        }
        
        
        try
        {
            line.getSlope();
            assertTrue(false); // supposed to throw exception
        }
        catch(IllegalStateException e)
        {
            assertTrue(true);
        }
        
        
        double expectedXIntercept = 6;
        double actualXIntercept = line.getXIntercept();
        
        assertTrue(closeEnough(expectedXIntercept, actualXIntercept));
        
        
        String expectedToString = "x = 6";
        String actualToString = line.toString();
        
        assertTrue(equationsCloseEnough(expectedToString, actualToString)); 
    }
    
    public void testWithThirdConstructorWithVerticalLine()
    {
        Line line = new Line("x = 10");
        
        
        assertTrue(line.isVertical());
        
        
        try
        {
            line.getYIntercept();
            assertTrue(false); // supposed to throw exception
        }
        catch(IllegalStateException e)
        {
            assertTrue(true);
        }
        
        
        try
        {
            line.getSlope();
            assertTrue(false); // supposed to throw exception
        }
        catch(IllegalStateException e)
        {
            assertTrue(true);
        }
        
        
        double expectedXIntercept = 10;
        double actualXIntercept = line.getXIntercept();
        
        assertTrue(closeEnough(expectedXIntercept, actualXIntercept));
        
        
        String expectedToString = "x = 10";
        String actualToString = line.toString();
        
        assertTrue(equationsCloseEnough(expectedToString, actualToString)); 
    }
    
    private static boolean equationsCloseEnough(String expected, String actual)
    {
        String[] expectedTokens = expected.split(" ");
        String[] actualTokens = actual.split(" ");
        
        if(expectedTokens.length != actualTokens.length)
            return false;
        
        for(int i = 0; i < expectedTokens.length; i++)
        {
            String eToken = expectedTokens[i];
            String aToken = actualTokens[i];
            
            if( ! eToken.equals(aToken) )
            {
                if( ! numericAndCloseEnough(eToken, aToken) )
                {
                    if( ! (eToken.substring(eToken.length() - 1).equals("x") && aToken.substring(aToken.length() - 1).equals("x")) )
                        return false;
                    
                    if( ! numericAndCloseEnough(eToken.substring(0, eToken.length() - 1), aToken.substring(0, aToken.length() - 1)) )
                        return false;
                }
            }
        }
        
        return true;
    }
    
    private static boolean closeEnough(double one, double two)
    {
        return Math.abs(one - two) < TOLERANCE;
    }
    
    private static boolean numericAndCloseEnough(String one, String two)
    {
        try
        {
            if( ! closeEnough(Double.parseDouble(one), Double.parseDouble(two)) )
                return false;
        }
        catch(NumberFormatException e)
        {
            return false;
        }
        
        return true;
    }
}
