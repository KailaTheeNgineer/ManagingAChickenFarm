

// Importing all elements of util class
import java.util.*;
public class ManagingAChickenFarm100 {

     // Scanner variable so it is accessible to all static methods
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Assignment tag
        System.out.println("\n\nDeveloper: Kaila McAlpine | Class: COP-2800/Java Programming | Date: 11/22/2026\n");

        // Create a boolean variable to exit the program
        boolean isRunning = true;

        // Create ArrayLists to store chicken information
        ArrayList<Integer> chickenTypes = new ArrayList<>();
        ArrayList<Integer> chickenHealths = new ArrayList<>();
        ArrayList<Float> eggProductions = new ArrayList<>();
        ArrayList<String> evaluations = new ArrayList<>();

        while (isRunning) {
            // Calling the welcome menu method
            welcomeMenu();
            // Collecting user input
            int choice = scanner.nextInt();

            // Switch statement to handle user input
            switch (choice) {
                case 1:

                    // Calls the methods to get chicken type
                    int chickenType = getChickenType();
                    // Calls the methods to get chicken health
                    int chickenHealth = getChickenHealth();
                    // Calculate annual egg production
                    float eggProduction = calculateEggProduction(chickenType, chickenHealth);
                    // Evaluate chicken productivity
                    String evaluation = evaluateChicken(eggProduction);
                    
                    // Store the chicken info into array lists
                    chickenTypes.add(chickenType);
                    chickenHealths.add(chickenHealth);
                    eggProductions.add(eggProduction);
                    evaluations.add(evaluation);

                    // Display the chicken info
                    System.out.println("\n\033[96m==============================================");
                    System.out.println("           CHICKEN INFORMATION");
                    System.out.println("==============================================");
                    System.out.printf("Expected annual egg production: %.2f eggs%n", eggProduction);
                    System.out.println("Chicken evaluation: " + evaluation);
                    System.out.println("==============================================\033[0m");

                    break;
                case 2:
                    // Exits the program
                    System.out.println("\033[92mGoodbye!\033[0m");
                    System.exit(0);
                    break;
            default:
                // Error message for invalid input
                System.out.println("\033[31mInvalid option! Please try again.\033[0m");
                break;

    }
        
            }
    
    }
    // Method (1) for the welcome menu
    public static void welcomeMenu() {
        System.out.println("\n\n\n\033[97m==============================================");
        System.out.println("Welcome to the Chicken Farm Management System!");
        System.out.println("==============================================");
        System.out.println("1. Manage Chickens");
        System.out.println("2. Exit");
        System.out.print("------------------------------------------------\n");
        System.out.println("Please select an option: \033[0m");
}

    // Method (2) for getting chicken type
    public static int getChickenType() {
        // Initialize chickenType variable and validInput flag
        int chickenType = 0;
        boolean validInput = false;

        // Loop until valid input is received
        while (!validInput) {
            System.out.println("\033[97mWhat type of chicken would you like to manage?");
            System.out.println("------------------------------------------------");
            System.out.println("1. Rhode Island Red");
            System.out.println("2. Americana");
            System.out.println("3. Longhorn\n");
            System.out.println("------------------------------------------------");
            System.out.print("Please select an option: \033[0m");

            // Check if the next input is an integer
            if (scanner.hasNextInt()) {
                chickenType = scanner.nextInt();
                } else {
                    System.out.println("\033[31mERROR: Please enter a valid number.\033[0m");
                    scanner.next(); // Clear the invalid input
                    continue; // Prompt the user again
                    }

            // Error handling for invalid input
            if (chickenType == 1) {
                System.out.println("\033[92mYou have selected Rhode Island Red.\033[0m");
                validInput = true;
                } else if (chickenType == 2) {
                    System.out.println("\033[92mYou have selected Americana.\033[0m");
                    validInput = true;
                } else if (chickenType == 3) {
                    System.out.println("\033[92mYou have selected Longhorn.\033[0m");
                    validInput = true;
                } else {
                    System.out.println("\033[31mInvalid option! Please try again.\033[0m");
        }
    }

        return chickenType;


}

    // Method (3) for getting the chicken's health
    public static int getChickenHealth() {

        // Initialize chickenHealth variable and validInput flag
        int chickenHealth = -1;
        boolean validInput = false;

        // loop until valid input is received
        while (!validInput) {
            System.out.println("\033[97mHow healthy is your chicken?\033[0m");
            System.out.println("------------------------------------------------");
            System.out.println("0. Healthy");
            System.out.println("1. Under weight");
            System.out.println("2. Over weight");
            System.out.println("3. Droopy comb\n");
            System.out.println("------------------------------------------------");
            System.out.print("Please select an option: \033[0m");

            // Check if the next input is an integer
            if (scanner.hasNextInt()) {
                chickenHealth = scanner.nextInt();
                validInput = true;
            } else {
                System.out.println("\033[31mERROR: Please enter a valid number.\033[0m");
                scanner.next(); // Clear the invalid input
                continue; // Prompt the user again
            }

            // Error handling for invalid input
            if (chickenHealth == 0) {
                System.out.println("\033[92mYour chicken is healthy.\033[0m");
            } else if (chickenHealth == 1) {
                System.out.println("\033[92mYour chicken is under weight.\033[0m");
            } else if (chickenHealth == 2) {
                System.out.println("\033[92mYour chicken is over weight.\033[0m");
            } else if (chickenHealth == 3) {
                System.out.println("\033[92mYour chicken has a droopy comb.\033[0m");
            } else {
                System.out.println("\033[31mInvalid option! Please try again.\033[0m");
        }
    }

        return chickenHealth;
}

// Method (4) for calculating egg production based on chicken type and health
public static float calculateEggProduction(int chickenType, int chickenHealth) {

    // Initialize variables for production count and health value
    int productionCount = 0;
    float healthValue = 0.0f;
    float eggProduction = 0.0f;

    // Determine production count based on chicken type
    switch (chickenType) {
        case 1: // Rhode Island Red
            productionCount = 7;
            break;

        case 2: // Americana
            productionCount = 5;
            break;

        case 3: // Longhorn
            productionCount = 6;
            break;
    }

    // Determine health value based on chicken health
    switch (chickenHealth) {
        case 0: // Healthy
            healthValue = 1.0f;
            break;

        case 1: // Under weight
            healthValue = 0.7f;
            break;

        case 2: // Over weight
            healthValue = 0.9f;
            break;

        case 3: // Droopy comb
            healthValue = 0.5f;
            break;
    }

    // Calculate expected annual egg production
    eggProduction = productionCount * healthValue * 52;

    // Return calculated egg production
    return eggProduction;
}

// Method (5) for evaluating chicken productivity based on annual egg production
public static String evaluateChicken(float eggProduction) {

    // Evaluate chicken productivity based on annual egg production
    if (eggProduction > 300) {
        return "\033[92mGreat value\033[0m";
    } else if (eggProduction > 200 && eggProduction < 300) {
        return "\033[92mGood value\033[0m";
    } else if (eggProduction < 200) {
        return "\033[92mConsider fried chicken\033[0m";
    } else {
        return "\033[92mNo evaluation available\033[0m";
    }
}
}
