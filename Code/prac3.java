
import java.util.Scanner;

public class prac3 {

    public static void main(String[] args) {

        float distanceM;
        float km, mile, thrs, tsec, mps, kph, Mph;
        float hours, min, sec;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the distance(in meters) :");
        distanceM = sc.nextFloat();

        System.out.println("Enter the time taken in covering the distance\nHours :");
        hours = sc.nextFloat();

        System.out.println("Minutes : ");
        min = sc.nextFloat();

        System.out.println("Second : ");
        sec = sc.nextFloat();

        thrs = hours + (min / 60) + (sec / 3600);
        tsec = sec + (min * 60) + (hours * 3600);

        km = distanceM / 1000;
        mile = distanceM / 1609;

        mps = distanceM / tsec;
        kph = km / thrs;
        Mph = mile / thrs;

        System.out.println("The speed is given by : ");
        System.out.println(mps + "meter per second");
        System.out.println(kph + "kilometer per hour");
        System.out.println(Mph + "mile per hour");
        sc.close();
    }

}
