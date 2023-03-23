import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class RBModel {

	public static void main(String[] args) {
		System.out.println("Welcome to my prospect model!");
		int run = 1;
		
		List<Player> play = new ArrayList<Player>();
		
		while(run == 1) {
			Scanner finder = new Scanner(System.in);
			System.out.println("\nPlease enter a number from the menu ");
			System.out.println("1. Enter a new RB Prospect");
			System.out.println("2. View the best prospect entered so far");
			System.out.println("3. View all prospects entered in order of best to worst");
			System.out.println("4. Quit");
			int choice = finder.nextInt();
			
			if(choice == 1) {
				System.out.println("Enter the name of the player: ");
				finder.nextLine();
				String name = finder.nextLine();
				System.out.println("Enter the height (in inches) of the player: ");
				int height = finder.nextInt();
				System.out.println("Enter the weight of the player: ");
				int weight = finder.nextInt();
				System.out.println("Enter the 40 time of the player: ");
				double fourty = finder.nextDouble();
				System.out.println("Enter the actual or projected pick number of the player: ");
				int draftCap = finder.nextInt();
				System.out.println("Enter the yards of the player: ");
				int yards = finder.nextInt();
				System.out.println("Enter the TDs of the player: ");
				int TDs = finder.nextInt();
				
				Player newPlay = new Player(name, height, weight, fourty, draftCap, yards, TDs);
				
				play.add(newPlay);
			}
			
			else if(choice == 2) {
				double high = play.get(0).getGrade();
				int highest = 0;
				for(int i = 1; i<play.size(); i++) {
					if(play.get(i).getGrade()>high) {
						high = play.get(i).getGrade();
						highest = i;
					}
				}
				System.out.println("The best prospect is: ");
				System.out.println(play.get(highest));
			}
			
			else if(choice == 3) {
				List<Integer> done = new ArrayList<Integer>();
				double high = play.get(0).getGrade();
				int highest = 0;
				for(int j = 0; j<play.size(); j++) {
					highest = 0;
					high = 0;
					for(int i = 1; i<play.size(); i++) {
						if(play.get(i).getGrade()>high && !(done.contains(i))) {
							high = play.get(i).getGrade();
							highest = i;
						}
					}
					done.add(highest);
					System.out.print(j+1 + ". ");
					System.out.println(play.get(highest));
					System.out.println("\n");
				}
				
				
			}
			else {
				run = 2;
			}
		}

	}

}
