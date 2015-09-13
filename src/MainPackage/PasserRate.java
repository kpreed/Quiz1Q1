package MainPackage;

import java.util.Scanner;

public class PasserRate 
{
	/* This class asks the user for statistics for a certain player and then calculates and prints their
	 * player rating
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("How many touchdowns does the player have?");
		String answer = input.nextLine();
		double touchdowns = Double.parseDouble(answer);
		
		System.out.println("How many total yards does the player have?");
		answer = input.nextLine();
		double yards = Double.parseDouble(answer);
		
		System.out.println("How many interceptions has the player thrown?");
		answer = input.nextLine();
		double interceptions = Double.parseDouble(answer);
		
		System.out.println("How many completions has the player thrown?");
		answer = input.nextLine();
		double completions = Double.parseDouble(answer);
		
		System.out.println("How many passes has the player attempted?");
		answer = input.nextLine();
		double attempts = Double.parseDouble(answer);
		
		double a = (completions/attempts-0.3)*5;
		double b = (yards/attempts-3)*0.25;
		double c = (touchdowns/attempts)*20;
		double d = 2.375 - (interceptions/attempts*25);
		
		double rating = ((a+b+c+d)/6)*100;
		
		System.out.printf("The players rating is: %.1f", rating);
	}
}
