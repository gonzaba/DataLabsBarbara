import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListProgram {

	
	static ArrayList<Integer> list = new ArrayList<>();
	
	public static void main(String[] args) {
		
		int maxRequest = 0;
		int requestDone = 0;
		int requestType =0;
		int number =0;
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please give the number of request possible:");
		maxRequest = input.nextInt();
		
		while(maxRequest!=requestDone) {
			System.out.println("Choose your request type: ");
			System.out.println("1. Put X at the end of the ArrayList.");
			System.out.println("2. Remove all Y from the ArrayList.");
			System.out.println("3. Print the size of the ArrayList \n");
			
			requestType = input.nextInt();
			if(requestType==1) {
				System.out.print("Please give number to move to the end:");
				number = input.nextInt();
				list.add(number);
				requestDone++;
				printAll();
				
			}
			else if(requestType==2) {
				System.out.print("Please give number to delete:");
				number = input.nextInt();
				
				for(int i=0; i<list.size();i++) {
					if(list.get(i).equals(number)) {
						list.remove(i);
					}
				}
				requestDone++;
				printAll();
			}
			else if(requestType==3) {
				requestDone++;
				System.out.println(list.size());
			}
			else {
				System.out.print("Request type incorrect please choose again.");
			}
		}
		System.out.print("Max level of request has been reached. End of program.");
	}//end of main
	
	
	public static void printAll() {
		System.out.print("[");
		for(int i=0; i<list.size();i++) {
			if(i==0) {
				System.out.print(list.get(i));
				}
			else {
				System.out.print(", "+list.get(i));
			}
			
		}
		System.out.print("]");
	}
	
	
	
}
