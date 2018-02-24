import java.util.ArrayList;
import java.util.Scanner;

public class Array {

	private static ArrayList<Integer> elements = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			while (true) {
				System.out.println("Enter an array command:");
				int task = scan.nextInt();
				int data = 0;
				if (task < 3)
				data = scan.nextInt();
				
					switch(task) {
					case 1:
						elements.add(data);
						showArrayList();
						break;
					case 2:
						removeAll(data);
						showArrayList();
						break;
					case 3:
						System.out.println(elements.size());
						break;
					case 0:
						scan.close();
						System.exit(0);
						break;
					}
			}
		}
	}
	
	private static void removeAll(int data) {
		for (int i=0; i<elements.size(); i++) {
			if (elements.get(i)==data)
				elements.remove(i);
			if (elements.get(i)==data)
				elements.remove(i);
		}
	}
	private static void showArrayList() {
		System.out.print("[");
		for (int i=0; i<elements.size(); i++) {
			System.out.print(elements.get(i)+ " ");
		}
		System.out.println("]");
	}
}
