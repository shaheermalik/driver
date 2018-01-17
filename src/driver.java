//Author Shaheer Malik
//purpose: TO Find the cost of driving
//exercise 2.23

import java.text.DecimalFormat;
import java.util.Scanner;
public class driver {
    private static DecimalFormat df2 = new DecimalFormat(".##");
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double num1;
        double num2;
        double num3;
        double cost;

        System.out.print("Enter the driving distance ");
        num1 = input.nextDouble();
        System.out.print("Enter miles per gallon ");
        num2 = input.nextDouble();
        System.out.print("Enter price per gallon ");
        num3 = input.nextDouble();
        cost = (num1 / num2) * num3;
        System.out.println("The cost of driving is " + df2.format(cost)); 
    }
}