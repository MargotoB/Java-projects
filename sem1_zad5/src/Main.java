import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Display Task");
            System.out.println("4. Quit");
            System.out.print("Choose an option (1-4): ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter a task to add: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    break;

                case 2:
                    System.out.println("Enter a task to remove: ");
                    int taskNum = scanner.nextInt();
                    if (taskNum > 0 && taskNum <= tasks.size()) {
                        tasks.remove(taskNum - 1);
                    } else {
                        System.out.println("You entered a wrong number!");
                    }
                    break;

                case 3:
                    if (tasks.isEmpty()) {
                        System.out.println("No data!");
                    } else {
                        System.out.println("The tasks list: ");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exit the program");
                    break;

                default:
                    System.out.println("Invalid option!");
            }
        } while (choice != 4) ;
    }
}
