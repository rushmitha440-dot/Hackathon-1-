import java.util.Scanner;

class Main {
    static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1(a) Data Types
        int familyMembers = 4;
        double waterConsumed = 450.5;
        int houseNumber = 101;
        char waterStatus = 'A';

        System.out.println("HOUSEHOLD WATER-USEAGE AND BILING");
        System.out.println("Family Members: " + familyMembers);
        System.out.println("Water Consumed: " + waterConsumed);
        System.out.println("House Number: " + houseNumber);
        System.out.println("Water Usage Status: " + waterStatus);

        // 1(b) If-Else Condition
        int bill;
        if (waterConsumed <= 500) {
            bill = 100;
        } else {
            bill = 200;
        }
        System.out.println("water Bill : Rs." + bill);

        // 1(c) Methods
        System.out.print("Enter morning water usage: ");
        int morningUsage = sc.nextInt();

        System.out.print("Enter evening water usage: ");
        int eveningUsage = sc.nextInt();

        int total = calculateTotal(morningUsage, eveningUsage);
        System.out.println("Total Water Consumption: " + total + " litres");

        sc.close();
    }
}

