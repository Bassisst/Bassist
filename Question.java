package sample;

import java.util.Scanner;

public class Question extends Main {
public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		System.out.println("Input a first side length: ");
		double firstside = sc.nextDouble();
		
		System.out.println("Input a second side length: ");
		double secondside = sc.nextDouble();
		
		System.out.println("Input a third side length: ");
		double thirdside = sc.nextDouble();
		
		double p = ( firstside + secondside + thirdside )/2;
		
		double result = Math.sqrt( p * ( p - firstside ) * ( p - secondside ) * ( p - thirdside ) );
		
		System.out.println("Area of a triangle is: " + result);
	}

}