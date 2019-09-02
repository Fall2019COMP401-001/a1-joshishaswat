package a1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class A1Jedi {

	public static void main(String[] args) {
		/*
		 * Input: Grocery items and which items customer bought
		 * Output: Number of fruit customer bought
		 */
		
		Scanner scan = new Scanner(System.in);
		Map<String, Integer> shopping_data = new HashMap<>(); //count number of fruits bought
		Map<String, Integer> fruit_count = new HashMap<>(); //count how many customers bought fruit
				
		int loop;
		String fruit;
		
		loop = scan.nextInt();
		String[] fruit_list = new String[loop];
		Set<String> dupl_check = new HashSet<>(); //remove duplicate fruits
		
		//initialize dictionary of fruits and counter of 0
		for (int i = 0; i < loop; i++) { 
			fruit = scan.next();
			scan.nextDouble();
			shopping_data.put(fruit, 0);
			fruit_count.put(fruit, 0);
			fruit_list[i] = fruit;
		}
		
		int loop_2 = scan.nextInt();
		
		int loop_3 = 0, num_fruit = 0;
		
		for (int i = 0; i < loop_2; i++) {
			scan.next();
			scan.next();
			loop_3 = scan.nextInt();
			//count number of fruits bought
			for (int j = 0; j < loop_3; j++) {
				num_fruit = scan.nextInt();
				fruit = scan.next();
				dupl_check.add(fruit); //add items into set
				int temp_fruit = shopping_data.get(fruit);
				num_fruit += temp_fruit;
				shopping_data.put(fruit, num_fruit);
				temp_fruit = 0;
				num_fruit = 0;
			}
			//count how many customers bought fruit within set
			for (String item:dupl_check) { 
				int temp_fruit_2 = fruit_count.get(item);
				temp_fruit_2 += 1;
				fruit_count.put(item, temp_fruit_2);
				temp_fruit_2 = 0;
			}
			dupl_check = new HashSet<>(); //reset the set
			
		}
		
		//print out the result
		int cust_count;
		for (int i = 0; i < loop; i++) {
			fruit = fruit_list[i];
			if (fruit_count.get(fruit) == 0) {
				System.out.println("No customers bought " + fruit);
			} 
			else {
				System.out.println(String.format("%d", fruit_count.get(fruit)) + " customers bought " + 
				String.format("%d", shopping_data.get(fruit)) + " " + fruit);
			}
		}
		
	}
}
