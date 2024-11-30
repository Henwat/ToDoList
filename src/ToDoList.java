import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoList {
    private List<String> tasks;
    private Scanner scanner;

    public ToDoList(){
        tasks = new ArrayList<>();
        scanner = new Scanner(System.in);

    }

    public void run(){
        boolean running = true;
        while(running){
            System.out.println("\n --------- TO DO LIST  ---------\n");
            System.out.println("1. Add task");
            System.out.println("2. Delete task");
            System.out.println("3. View all tasks");
            System.out.println("4. Quit");
            System.out.println("\nEnter Choice:   ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    deleteTask();
                    break;
                case 3:
                    displayTask();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;

            }

        }
    }

    private void addTask(){
        System.out.print("\nEnter task: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Task added successfully");
    }

    private void deleteTask() {
        System.out.print("\nEnter task number to delete: ");
        int taskNum = scanner.nextInt();
        scanner.nextLine();
        if(taskNum > 0 && taskNum <= tasks.size()) {
            tasks.remove(taskNum - 1);
            System.out.println("Task deleted successfully");
        } else {
            System.out.println("Invalid task number");
        }

    }

    private void displayTask() {
        if(tasks.isEmpty()) {
            System.out.println("No tasks to display");
        } else {
            for(int i = 0; i<tasks.size(); i++) {
                System.out.println((i+1) + ". " + tasks.get(i));
            }
        }
    }
}
