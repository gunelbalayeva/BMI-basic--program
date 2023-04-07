import java.util.Scanner;

public class BMIprogram {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

            System.out.println("Welcome to the Body Mass Index program!" +
                    "\n Input height in meters : ");
            double height = sc.nextDouble();

            System.out.println("Input weight in kilogram : ");
            double weight = sc.nextDouble();

            double BMI = weight / (height * height);
            System.out.println("The Body Mass index (BMI) is " + BMI + "kg/m2");

            if ( BMI < 18.5 ){
                System.out.println("Poor kilogram. ");
            } else if (BMI < 30) {
                System.out.println("Normal kilogram.");
            } else if (BMI > 30) {
                System.out.println(" Obesity. ");
            } else {
                System.out.println("Try again! ");
            }


        }
    }
