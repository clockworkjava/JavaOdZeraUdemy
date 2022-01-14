package pl.clockwokjava.exercises;

import java.util.Scanner;

public class CircleField {

    public static void main(String[] args) {

        System.out.print("Podaj promień koła: ");

        Scanner sc = new Scanner(System.in);

        double radious = sc.nextDouble();

        // r^2 * PI

        double area = radious*radious*Math.PI;

        System.out.println("Pole koła o promieniu " + radious + " = " + area);
    }
}
