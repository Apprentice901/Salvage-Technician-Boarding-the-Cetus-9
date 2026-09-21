// Phase 2
// Bay Diagnostic Sweep

import java.util.Random;


public class CargoPod { // Class Object
    public static void main(String[] args) {
        CargoPod cargoPod = new CargoPod();
        System.out.println(cargoPod);
        }
    }


// Before entering the bay, the technician needs a full read-out of all storage pods:
// Add a method displayManifest() to your StorageBay class.
public class StorageBay { // Class Object
    public StorageBay() { // Constructor initializes the Storage Bay
        // thats uses a for loop to populate each index
        for (int i = 0; i < pods.length; i++)
            System.out.println(i);
        { 
            for (int CargoPod = 1; star <= row; CargoPod++)
                System.out.print("*");
        CargoPod{id=0, contents='Hazard: Radiation Leak'};
        CargoPod{id=1, contents='Empty'};
        CargoPod{id=2, contents='Power Cell'};
        CargoPod{id=3, contents='Empty'};
        CargoPod{id=4, contents='Hazard: Radiation Leak'};
        System.out.println();
        }

    }
    public static void main(String[] args) {
        // Create Five CargoPod objects with different 
        StorageBay = new storageBay();
        System.out.println(StorageBay);
        }
    // Method to display the manifest
    public void displayManifest() {
        System.out.println("=== Storage Bay Manifest ===");
        if (items.isEmpty()) {
            System.out.println("The storage bay is empty.");
        } else {
            for (int i = 0; i < items.size(); i++) {
                System.out.printf("%d. %s%n", i + 1, items.get(i));
            }
        }
        System.out.println(displayManifest());
    }
}


public class spaceSuit { // Class Object
    public spaceSuit() { // Constructor initializes the suit with full oxygen
        this.oxygenUnits = MAX_OXYGEN;
    }
    private int oxygenUnits; // Current oxygen level
    private static final int MAX_OXYGEN = 5; // Starting oxygen units 
        {

    // Method to consume oxygen
    public void useOxygen(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid oxygen usage amount.");
            return;
        }
        if (oxygenUnits <= 0) {
            System.out.println("No oxygen left! You cannot breathe.");
            return;
        }
        oxygenUnits -= amount;
        if (oxygenUnits < 0) {
            oxygenUnits = 0; // Prevent negative oxygen
        }
        System.out.println("Oxygen used: " + amount + ". Remaining: " + oxygenUnits);
    }

    // Method to refill oxygen
    public void refillOxygen() {
        oxygenUnits = MAX_OXYGEN;
        System.out.println("Oxygen refilled to maximum: " + oxygenUnits);
    }

    // Getter for current oxygen
    public int getOxygenUnits() {
        return oxygenUnits;
    }

    // Check if oxygen is depleted
    public boolean isOutOfOxygen() {
        return oxygenUnits <= 0;
    }

    // Main method for demonstration
    public static void main(String[] args) {
        spaceSuit spaceSuit = new spaceSuit();
        System.out.println(spaceSuit);
        System.out.println("Initial oxygen: " + spaceSuit.getOxygenUnits());

        spaceSuit.useOxygen(2);
        spaceSuit.useOxygen(3);
        spaceSuit.useOxygen(1); // Attempt to use oxygen when empty

        spaceSuit.refillOxygen();
        spaceSuit.useOxygen(5);
        System.out.println("Out of oxygen? " + spaceSuit.isOutOfOxygen());
        }
    }
}

// Phase 2 Errors { Counted 14 Errors }