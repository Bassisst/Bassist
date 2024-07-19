package oneple;

import java.util.Scanner;

public class Someple {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println( "Input fuel price" );
			double fuelPrice = sc.nextDouble();
			
			System.out.println( "Input your consumption on 100 miles" );
			double consumption = sc.nextDouble();
			
			System.out.println( "Input distance to your destination" );
			double distance = sc.nextDouble();
			
			double result = distance/100 * consumption * fuelPrice;
			
			System.out.println( "You will spend on a fuel: " + result + "$" );

		}

	}


