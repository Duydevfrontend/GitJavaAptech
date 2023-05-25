package BT4Aptech;
import BT4Aptech.Vehicle;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Vehicle xe1 = new Vehicle("Duy", "Cup", 1000000, 50);
        Vehicle xe2 = new Vehicle("Hy", "dream", 200000 ,125);
        Vehicle xe3 = new Vehicle("Minh", "Airblade", 300000, 150);

        System.out.println(xe1);
        System.out.println(xe2);
        System.out.println(xe3);
    }


}
