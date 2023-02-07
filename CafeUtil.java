import java.util.ArrayList;

public class CafeUtil {

    int getStreakGoal(int[] numsWeek) {
        int sum = 0;
        for (int i = 1; i < numsWeek.length; i++) {
            sum += 1;
        }
        return sum;
    }

    Integer getOrderTotal(Integer[] prices) {
        Integer totalPrice = 0;
        for (int i = 0; i < prices.length; i++) {
            totalPrice += prices[i];
        }
        return totalPrice;
    }

    void displayMenu(ArrayList<String> menuItems) {

        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    void addCustomer(ArrayList<String> customers) {
        System.out.println("Please Enter your name: ");
        String userName = System.console().readLine();
        System.out.println(userName);
        customers.add(userName);
        System.out.println(customers);
    }

    void printPriceChart(String product, double price, int maxQuantity) {
        // ArrayList<String> cafeList = new ArrayList<>();
        System.out.println(product);
        for(int  i = 1; i < maxQuantity;i++) {
            String productPrice = "$" + (price * i);
            System.out.println(String.format("%s - %s", i, productPrice));
        }
    }

}
