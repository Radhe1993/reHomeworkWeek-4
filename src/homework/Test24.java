package homework;
/**
 * Test class to create objects and call the methods
 * Output:
 * SBI Rate of Interest: 8
 * ICICI Rate of Interest: 7
 * AXIS Rate of Interest: 9
 */
public class Test24
{
    public static void main(String[] args) {
        SBI24 s = new SBI24();
        ICICI24 i = new ICICI24();
        AXIS24 a = new AXIS24();
        System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: " + i.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: " + a.getRateOfInterest());
    }
}
