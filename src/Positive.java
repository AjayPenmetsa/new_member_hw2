import java.util.ArrayList;
import java.util.Scanner;

class Positive {
    public static void main(String[] args) {
        //first arraylist to collect numbers
        ArrayList all_numbers = new ArrayList();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input numbers (To end input enter something that isn't a int): ");
        //collecting numbers and adding to first list
        while (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            all_numbers.add(i);
        }
        //second arraylist to sort non positive numbers out
        ArrayList numbers = new ArrayList();
        //sorting out non-positive numbers
        for (int j = 0; j < all_numbers.size() ; j++) {
            if ((int) all_numbers.get(j) > 0) {
                numbers.add(all_numbers.get(j));
            }
        }
        //prints
        System.out.println("All numbers: " + all_numbers);
        System.out.println("Only positive numbers: " + numbers);
    }
}





