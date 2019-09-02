package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		/*
		 * Input: Grocery items and which items customer bought
		 * Output: Customer name and total purchase
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int loop, loop_2, multiplier;
		String first_name, last_name;
		char first_init;
		double item_cost, calculated_cost, final_cost = 0.0;

		loop = scan.nextInt();

		for (int i = 0; i < loop; i++) { //for each customer
			first_name = scan.next();
			first_init = first_name.charAt(0); //find initial
			last_name = scan.next();
			loop_2 = scan.nextInt();

			for (int j = 0; j < loop_2; j++) { //for each fruit
				multiplier = scan.nextInt();
				scan.next();
				item_cost = scan.nextDouble();
				calculated_cost = multiplier * item_cost; //if multiple fruits bought
				final_cost += calculated_cost; //keep tally
			}
			System.out.printf(first_init + "." + " " + last_name + ": " + "%.2f\n", final_cost);
			final_cost = 0.0;
		}
		scan.close();
		
	}
}
