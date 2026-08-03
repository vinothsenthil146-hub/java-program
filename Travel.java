import java.util.ArrayList;
import java.util.Scanner;

public class CityOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> city = new ArrayList<>();

        // Initial List
        System.out.print("Enter number of cities: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter city names:");
        for (int i = 0; i < n; i++) {
            city.add(sc.nextLine());
        }

        // Append Operation
        System.out.print("Enter city to append: ");
        String appendCity = sc.nextLine();
        city.add(appendCity);
        System.out.println("Updated List: " + city);

        // Insert Operation
        System.out.print("Enter index: ");
        int index = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter city to insert: ");
        String insertCity = sc.nextLine();
        city.add(index, insertCity);
        System.out.println("List after insertion: " + city);

        // Search Operation
        System.out.print("Enter city to search: ");
        String searchCity = sc.nextLine();

        int pos = city.indexOf(searchCity);

        if (pos != -1) {
            System.out.println("City found at index: " + pos);
        } else {
            System.out.println("City not found");
        }

        // Display Cities Starting with Given Letter
        System.out.print("Enter starting letter: ");
        char ch = sc.next().charAt(0);

        System.out.println("Cities starting with '" + ch + "':");
        for (String c : city) {
            if (c.charAt(0) == ch) {
                System.out.println(c);
            }
        }

        sc.close();
    }
}
