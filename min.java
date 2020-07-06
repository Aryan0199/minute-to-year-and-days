package myCaptain;
import java.util.Scanner;
public class testing {        // Since 1 year=525600 minutes and 1 day=1440 minutes.
    public static void minconverter(long x){
        System.out.println(x+" minutes is approximately "+x/525600+
                " years and "+ (x%525600)/1440+" days");
    }
    public static void main(String[] args){
        System.out.println("Input the number of minutes: ");
        Scanner scan=new Scanner(System.in);
        long x=scan.nextLong();
        minconverter(x);

    }
}
