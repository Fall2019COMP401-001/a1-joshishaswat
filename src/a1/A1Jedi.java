package a1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Map<String, Integer> shopping_data = new HashMap<>();
		Map<String, Integer> fruit_count = new HashMap<>();
				
		int loop;
		String fruit;
		
		loop = scan.nextInt();
		String[] fruit_list = new String[loop];
		
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
			for (int j = 0; j < loop_3; j++) {
				num_fruit = scan.nextInt();
				fruit = scan.next();
				int temp_fruit = shopping_data.get(fruit);
				num_fruit += temp_fruit;
				int temp_fruit_2 = fruit_count.get(fruit);
				temp_fruit_2 += 1;
				shopping_data.put(fruit, num_fruit);
				fruit_count.put(fruit, temp_fruit_2);
				temp_fruit = 0;
				num_fruit = 0;
			}
		}
				
		int cust_count;
		for (int i = 0; i < loop; i++) {
			fruit = fruit_list[i];
			if (fruit_count.get(fruit) == 0) {
				System.out.println("No customers bought " + fruit);
			} 
			else {
				System.out.println(String.format("%d", fruit_count.get(fruit)) + " customers bought " + String.format("%d", shopping_data.get(fruit)) + " " + fruit);
			}
		}
		
	}
}
