package vending;

import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalAmount = 0;
        boolean continueShopping = true;

        System.out.println("===== Welcome to Vending Machine =====");

        while (continueShopping) {

            System.out.println("\nMenu:");
            System.out.println("1. Tea     - Rs 10");
            System.out.println("2. Coffee  - Rs 20");
            System.out.println("3. Chips   - Rs 30");
            System.out.println("4. Biscuit - Rs 15");
            System.out.println("5. coldrink - Rs 20");
            System.out.println("6. Exit");

            System.out.print("Select product (1-6): ");
            int choice = sc.nextInt();

            int price = 0;
            String item = "";

            switch (choice) {
                case 1:
                    item = "Tea";
                    price = 10;
                    break;
                case 2:
                    item = "Coffee";
                    price = 20;
                    break;
                case 3:
                    item = "Chips";
                    price = 30;
                    break;
                case 4:
                    item = "Biscuit";
                    price = 15;
                    break;
                case 5:
                    item = "ColdDrink";
                    price = 20;
                    break;
                case 6:
                    continueShopping = false;
                    continue;
                default:
                    System.out.println("❌ Invalid selection");
                    continue;
            }

            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();

            int itemTotal = price * qty;
            totalAmount += itemTotal;

            System.out.println("✅ Added: " + item + " x " + qty + 
                               " = Rs " + itemTotal);
            System.out.println("🧾 Current Bill: Rs " + totalAmount);
        }

        System.out.println("\nTotal Amount to Pay: Rs " + totalAmount);
        System.out.print("Insert money (Rs): ");
        int money = sc.nextInt();

        if (money < totalAmount) {
            System.out.println("❌ Insufficient money. Transaction cancelled.");
        } else {
            int change = money - totalAmount;
            System.out.println("✅ Payment successful");
            System.out.println("💰 Change returned: Rs " + change);
        }

        System.out.println("Thank you! Visit again 😊");
        sc.close();
    }
}
