package LW_01;

import LW_01.circle;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Enter the radius of the inner circle: ");
        double ri=input.nextDouble();
        System.out.println("Enter the radius of the outer circle: ");
        double ro=input.nextDouble();

        if(ri>=ro){
            System.out.println("Outer radius must be greater than inner radius!");
        }else{
            circle innerCircle=new circle(ri);
            circle outerCircle=new circle(ro);

            double outerCircleArea=outerCircle.computeArea();
            double innerCircleArea=innerCircle.computeArea();
            double shadedArea=outerCircleArea-innerCircleArea;

            System.out.println("Shaded area is: "+shadedArea);
        }

    }
}