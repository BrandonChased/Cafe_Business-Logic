import java.util.ArrayList;

public class TestCafe {
    public static void main(String[] args) {
        CafeUtil cafe = new CafeUtil();
        Integer array[] = new Integer[10];
        ArrayList<String> cafeList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            // cafeList.add("item" + i);
        }
        // cafeList.add("Brandon");
        // System.out.println(cafe.getOrderTotal(array));
        // cafe.displayMenu(cafeList);
        // cafe.addCustomer(cafeList);
        cafe.printPriceChart("Coffee", 15.00, 4);
    }
}