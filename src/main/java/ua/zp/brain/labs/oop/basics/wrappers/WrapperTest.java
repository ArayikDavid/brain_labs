package ua.zp.brain.labs.oop.basics.wrappers;
import static java.lang.System.*;
public class WrapperTest {
    Integer i1 = 20;
    Integer i2 = Integer.valueOf(20);
    Integer i3 = new Integer(20);
    Integer i4 = Integer.parseInt("20");

    Long l1 = 20L;
    Long l2 = Long.valueOf(20L);
    Long l3 = new Long(20L);
    Long l4 = Long.parseLong("20L");

    Float f1 = 20.01f;
    Float f2 = Float.valueOf(20.01f);
    Float f3 = new Float(20.01f);
    Float f4 = Float.parseFloat("20.01f");

    Double d1 = 20.00;
    Double d2 = Double.valueOf(20.00);
    Double d3 = new Double(20.00);
    Double d4 = Double.parseDouble("20.00");

    Boolean bool1 = true;
    Boolean bool2 = Boolean.valueOf(true);
    Boolean bool3 = new Boolean(true);
    Boolean bool4 = Boolean.parseBoolean("true");

    public static void main(String[] args) {


        Double b5 = 0.0;
        Double b6 = 5.0;
        Double b10 = b6/b5;


        out.println(Double.isNaN(b10));
        out.println(Double.isInfinite(b10));




        Long l = 1200L;
        Long l0 = 1200L;

        System.out.println(l == l0);







    }


}