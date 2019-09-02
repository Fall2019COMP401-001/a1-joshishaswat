package a1;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Map<String, Double> shopping_data = new HashMap<>();
				
		int loop;
		String fruit;
		double price;
		
		loop = scan.nextInt();
		
		for (int i = 0; i < loop; i++) {
			fruit = scan.next();
			price = scan.nextDouble();
			shopping_data.put(fruit, price);
		}	
			
		loop = scan.nextInt();
		
		int loop_2 = 0, multiplier;
		String name = "", max_name = "", min_name = "";
		double mult_price, added_one = 0.0, total_cost = 0.0, max_price = 0.0, min_price = 0.0;
		
		for (int i = 0; i < loop; i++) {
			name = scan.next() + " " + scan.next();
			loop_2 = scan.nextInt();
			for (int j = 0; j < loop_2; j++) {
				multiplier = scan.nextInt();
				price = shopping_data.get(scan.next());
				mult_price = price * multiplier;
				added_one += mult_price;
			}
			if (i == 0) {
				max_price = added_one;
				min_price = added_one;
				max_name = name;
				min_name = name;
			} 
			if (added_one > max_price) {
				max_price = added_one;
				max_name = name;
			} else if (added_one < min_price) {
				min_price = added_one;
				min_name = name;
			}
			total_cost += added_one;
			added_one = 0.0;
		}
		System.out.printf("Biggest: " + max_name + " (%.2f)\n", max_price);
		System.out.printf("Smallest: " + min_name + " (%.2f)\n", min_price);

		total_cost = total_cost / loop;
		System.out.printf("Average: %.2f\n", total_cost);		
		scan.close();
	}
}
