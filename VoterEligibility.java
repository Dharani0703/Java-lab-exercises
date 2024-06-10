package constructs;

import java.util.Scanner;
import java.util.Calendar;

public class VoterEligibility {
    
    private int birthYear;
    private int currentYear;
    private int age;

    // Constructor to initialize the birth year and calculate age
    public VoterEligibility(int birthYear) {
        this.birthYear = birthYear;
        this.currentYear = Calendar.getInstance().get(Calendar.YEAR);
        this.age = currentYear - birthYear;
    }

    // Method to check if the user is eligible to vote
    public void checkEligibility() {
        if (age >= 18) {
            System.out.println("You are " + age + " years old. You are eligible to vote.");
        } else {
            System.out.println("You are " + age + " years old. You are not eligible to vote.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        // Creating an instance of VoterEligibility
        VoterEligibility voter = new VoterEligibility(birthYear);

        // Checking voter eligibility
        voter.checkEligibility();

        scanner.close();
    }
}
