import java.util.*;

public class SwiggyApp {
    static Scanner sc = new Scanner(System.in);
    static String[] hotels = {"Buhari", "A2B", "Amma Unavagam"};
    static String[][] menus = {
        {"Mutton Biriyani", "Chicken Biriyani", "Prawn Biriyani"},
        {"Meals", "Paneer Rice", "Veg Biriyani"},
        {"Sambar Rice", "Idli", "Poori"}
    };
    static int[][] prices = {
        {250, 180, 220},
        {120, 150, 100},
        {30, 10, 25}
    };

    public static void main(String[] args) {
        System.out.println("Select Hotel:");
        for (int i = 0; i < hotels.length; i++)
            System.out.println((i + 1) + ". " + hotels[i]);
        int h = sc.nextInt() - 1;

        System.out.println("Menu:");
        for (int i = 0; i < menus[h].length; i++)
            System.out.println((i + 1) + ". " + menus[h][i] + " - ₹" + prices[h][i]);
        int item = sc.nextInt() - 1;

        System.out.print("Quantity: ");
        int qty = sc.nextInt();
        int total = prices[h][item] * qty;
        System.out.println("Total: ₹" + total);

        System.out.println("Payment Method:\n1.Card\n2.UPI\n3.COD");
        int pay = sc.nextInt();
        processPayment(pay, total);
    }

    static void processPayment(int method, int amount) {
        System.out.println("Processing ₹" + amount + " via " + (method == 1 ? "Card" : method == 2 ? "UPI" : "COD"));
        System.out.println("OTP: " + (int)(Math.random() * 9000 + 1000));
        System.out.println("Payment Successful ✅");
    }
}
