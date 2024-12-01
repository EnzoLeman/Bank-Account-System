import java.util.Scanner;

public class BankSystem {
    public static void main(String[] args) {
        // Step 1: Account creation
        try (Scanner scanner = new Scanner(System.in)) {
            // Step 1: Account creation
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter initial deposit amount: ");
            double initialDeposit = scanner.nextDouble();
            
            // Create a new BankAccount object
            BankAccount account = new BankAccount(name, initialDeposit);
            
            // Step 2: Display the menu and loop until the user decides to exit
            int choice;
            do {
                System.out.println("\n--- Simple Bank System ---");
                System.out.println("1. View Account Details");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                
                switch (choice) {
                    case 1 -> // Option 1: View Account Details
                        account.displayDetails();
                        
                    case 2 -> {
                        // Option 2: Deposit Money
                        System.out.print("\nEnter deposit amount: ");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                    }
                        
                    case 3 -> {
                        // Option 3: Withdraw Money
                        System.out.print("\nEnter withdrawal amount: ");
                        double withdrawalAmount = scanner.nextDouble();
                        account.withdraw(withdrawalAmount);
                    }
                        
                    case 4 -> // Option 4: Exit
                        System.out.println("\nThank you for using the our Banking System!\n");
                        
                    default -> System.out.println("Invalid choice. Please try again.");
                }
            } while (choice != 4);  // Loop until the user selects Exit
        }
    }
}
