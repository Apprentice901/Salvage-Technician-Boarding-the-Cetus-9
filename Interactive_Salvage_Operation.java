// Phase 3
// Interactive Salvage Operation

// Now wire the technician’s suit controls to the storage bay using user input and a control loop:
// In StorageBay, write a method named salvagePod(int index) that inspects a specified pod:
public class StorageBay {
    private String[] pods;       // Each pod's content: "Power Cell", "Hazard", "Empty"
    private boolean[] salvaged;  // Tracks whether a pod has been salvaged

    public StorageBay(String[] podContents) {
        this.pods = podContents;
        this.salvaged = new boolean[podContents.length];
    }

    public void salvagePod(int index) {
        // Check bounds
        if (index < 0 || index >= pods.length) {
            System.out.println("Error: Pod index " + index + " is out of range.");
            return;
        }

        // Check if already salvaged
        if (salvaged[index]) {
            System.out.println("Pod " + index + " has already been salvaged.");
            return;
        }

        // Mark as salvaged
        salvaged[index] = true;

        // Inspect pod content
        String content = pods[index];
        switch (content) {
            case "Power Cell":
                System.out.println("Pod " + index + ": Technician recovered a Power Cell!");
                break;
            case "Hazard":
                System.out.println("Pod " + index + ": Technician triggered a hazard! Proceed with caution.");
                break;
            case "Empty":
            default:
                System.out.println("Pod " + index + ": Container was empty.");
                break;
        }
    }
}


// Check whether the requested index is within valid bounds of the array. If invalid, print an error message.

// If valid, mark the pod as salvaged and return or print the outcome (e.g., whether the technician 
// found the power cell, triggered a hazard, or found an empty container).

// Ensure your SpaceSuit class has methods to consume oxygen (reducing the level by 1), 
// check remaining oxygen, and report whether oxygen is depleted.
public class SpaceSuit {
    private int oxygenLevel;

    // Constructor
    public SpaceSuit(int initialOxygen) {
        this.oxygenLevel = initialOxygen;
    }

    // Method to consume 1 unit of oxygen
    public void consumeOxygen() {
        if (oxygenLevel > 0) {
            oxygenLevel--;
        }
    }

    // Method to check remaining oxygen
    public int getOxygenLevel() {
        return oxygenLevel;
    }

    // Method to check if oxygen is depleted
    public boolean isOxygenDepleted() {
        return oxygenLevel == 0;
    }

    // Optional: display oxygen status
    public void reportOxygenStatus() {
        System.out.println("Oxygen level: " + oxygenLevel + "%");
        if (isOxygenDepleted()) {
            System.out.println("Oxygen is depleted — suit cannot sustain life.");
        }
    }
}

// In main, set up an interactive mission loop:
// Create a Scanner instance to read input from System.in.

// Write a while loop that continues as long as the SpaceSuit indicates oxygen remains.

// Inside the loop, prompt the user to enter a pod index to salvage (e.g., “Enter pod index to breach (0-4):”).

// Read the user’s integer input with Scanner and pass it to storageBay.salvagePod(...).

// call a method on your SpaceSuit to consume oxygen and display the remaining supply.

// If the user recovers the “Power Cell”, print a success message and immediately terminate the loop using a break statement.

// If the loop finishes because the suit ran out of oxygen, print a failure message indicating life support has failed.

import java.util.InputMismatchException;
import java.util.Scanner;

// Mock SpaceSuit class for demonstration
class SpaceSuit {
    private int oxygen; // oxygen units remaining

    public SpaceSuit(int oxygen) {
        this.oxygen = oxygen;
    }

    public boolean hasOxygen() {
        return oxygen > 0;
    }

    public void consumeOxygen() {
        if (oxygen > 0) {
            oxygen--;
        }
    }

    public int getOxygen() {
        return oxygen;
    }
}

// Mock StorageBay class for demonstration
class StorageBay {
    private String[] pods = {"Scrap Metal", "Food Rations", "Power Cell", "Tools", "Med Kit"};

    public String salvagePod(int index) {
        if (index < 0 || index >= pods.length) {
            return null; // invalid index
        }
        return pods[index];
    }
}

public class MissionControl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SpaceSuit suit = new SpaceSuit(5); // 5 oxygen units
        StorageBay storageBay = new StorageBay();

        System.out.println("=== Salvage Mission Started ===");

        while (suit.hasOxygen()) {
            System.out.print("Enter pod index to breach (0-4): ");

            int podIndex;
            try {
                podIndex = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer between 0 and 4.");
                scanner.nextLine(); // clear invalid input
                continue;
            }

            String item = storageBay.salvagePod(podIndex);
            if (item == null) {
                System.out.println("Invalid pod index. Try again.");
                continue;
            }

            System.out.println("You recovered: " + item);

            // Consume oxygen after each attempt
            suit.consumeOxygen();
            System.out.println("Oxygen remaining: " + suit.getOxygen());

            // Check for success condition
            if ("Power Cell".equalsIgnoreCase(item)) {
                System.out.println("Mission Success! Power Cell recovered.");
                break;
            }
        }

        // If loop ended due to oxygen depletion
        if (!suit.hasOxygen()) {
            System.out.println("Mission Failed! Life support has failed.");
        }

        scanner.close();
    }
}

//Phase 3 Errors { Counted 50+ Errors}: