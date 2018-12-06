import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

  /**
   * Main function, sorts through arrayList of products. Tests other classes.
   *
   * @param args - arguments passed in the program
   */
  public static void main(String[] args) {

    // Write one line of code to create an ArrayList of products
    ArrayList<Product> myArrayList = new ArrayList<>();

    // Write one line of code to call testCollection and assign the result to the ArrayList
    myArrayList = testCollection();
    // Write one line of code to sort the ArrayList
    Collections.sort(myArrayList, Product::compareTo);

    EmployeeInfo e = new EmployeeInfo();

    System.out.println(e.toString());

  }

  /**
   * Function testCollection creates different product objects and adds them to an arrayList.
   *
   * @return products - ArrayList of products
   */
  public static ArrayList testCollection() {

    AudioPlayer a1 = new AudioPlayer("iPod Mini","MP3");
    AudioPlayer a2 = new AudioPlayer("Walkman","WAV ");
    MoviePlayer m1 = new MoviePlayer("DBPOWER MK101",
        new Screen("720x480", 40, 22), MonitorType.LCD);
    MoviePlayer m2 = new MoviePlayer("Pyle PDV156BK",
        new Screen("1366x768", 40, 22), MonitorType.LED);

    // Write one line of code here to create the collection
    ArrayList<Product> products = new ArrayList<>();

    products.add(a1);
    products.add(a2);
    products.add(m1);
    products.add(m2);
    return products;
  }

  /**
   * Function print goes through entire list of objects and prints them.
   *
   * @param myList - List of Objects
   */
  public static void print(Iterable<?> myList) {
    //foreach loop that goes through the entire list and prints objects
    for (Object p: myList) {
      System.out.print(p);
    }
  }

}