import java.util.*;
public class physicsAssignment {
    public static void main(String args[]) {
     double uk = 0.3;
     double degree = 35;
     double fa = 150;
     double m = 30;
     double t = 5;
     double radian = Math.toRadians(degree);
     double sinValue = Math.sin(radian);
     double cosValue = Math.cos(radian);
     double fx =cosValue * fa;
     double fy =  sinValue * fa;
     double fn = (9.8*m)+fy;
     double fk = fn*uk;
     double fNET = fx - fk;
     double a = fNET/m;
     double d = 0.5*(Math.pow(t, 2))*a;
     
     System.out.println("uk = " + uk);
     System.out.println("degree = " +degree);
     System.out.println("fa = " + fa);
     System.out.println("m = " + m);
     System.out.println("t = " + t);
     System.out.println("fx = " + fx);
     System.out.println("fy = " + fy);
     System.out.println("fn = " + fn);
     System.out.println("fk = " + fk);
     System.out.println("fNET = " + fNET);
     System.out.println("a = " + a);
     System.out.println("d = " + d);
    }
}
