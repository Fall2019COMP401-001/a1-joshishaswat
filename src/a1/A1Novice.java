package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int loop, loop_2, multiplier;
		String first_name, last_name;
		char first_init;
		double item_cost, calculated_cost, final_cost = 0.0;

		loop = scan.nextInt();

		for (int i = 0; i < loop; i++) {
			first_name = scan.next();
			first_init = first_name.charAt(0);
			last_name = scan.next();
			loop_2 = scan.nextInt();

			for (int j = 0; j < loop_2; j++) {
				multiplier = scan.nextInt();
				scan.next();
				item_cost = scan.nextDouble();
				calculated_cost = multiplier * item_cost;
				final_cost += calculated_cost;
			}
			System.out.printf(first_init + "." + " " + last_name + ": " + "%.2f\n", final_cost);
			final_cost = 0.0;
		}
		scan.close();
		
	}
}
