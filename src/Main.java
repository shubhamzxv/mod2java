import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tax Calculator App");
        System.out.println("-----Welcome----");

        Scanner scanner = new Scanner(System.in);
        int person = 0;
        System.out.println("Enter the total person count :");
        person = scanner.nextInt();
        String[] name = new String[person];
        long[] income = new long[person];
        for (int i = 0; i < person; i++) {
            System.out.println("Enter the name " + (i + 1) + ":");
            name[i] = scanner.next();
            System.out.println("Enter " + name[i] + "'s Annual Income:");
            income[i] = scanner.nextLong();
        }
        System.out.println("Name with liable tax");
        System.out.println("--------------------");
        for (int i=0;i<person;i++){
            calculateTax(name[i],income[i]);
        }
    }

    public static void calculateTax(String str, long income) {
        if (income >= 300000) {
            System.out.println(str + ": ₹" + income * 0.2);
        } else if (income >= 100000) {
            System.out.println(str + ": ₹" + income * 0.1);
        }
        else {
            System.out.println(str + ": ₹" + 0);
        }
    }
}