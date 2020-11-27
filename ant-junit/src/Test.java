import junit.framework.TestCase;
import org.junit.Assert;

public class Test extends TestCase {
    LeapYear year1900,year2000,year2008;
    protected void setUp(){
        year1900 = new LeapYear(1900);
        year2000 = new LeapYear(2000);
        year2008 = new LeapYear(2008);
    }
    public void testYearDays(){
        Assert.assertEquals(365, year1900.yearDays());
        Assert.assertEquals(366, year2000.yearDays());
        Assert.assertEquals(366, year2008.yearDays());
    }
    public void testIsLeapYear(){
        Assert.assertTrue(!year1900.isLeapYear());
        Assert.assertTrue(year2000.isLeapYear());
        Assert.assertTrue(year2008.isLeapYear());
    }
    public static void main(String args[]){
        junit.textui.TestRunner.run(Test.class);
    }
}
