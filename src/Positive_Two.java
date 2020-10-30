import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Positive_Two {
    public static void main(String[] args) {

        List all_numbers = new ArrayList();
        List numbers = new ArrayList();
        //List numbers = all_numbers

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input numbers (To end input enter something that isn't a int): ");
        while (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            all_numbers.add(i);
            if (i > 0) {
                numbers.add(i);
            }




        }
        System.out.println("All numbers: " + all_numbers);
        System.out.println("Only positive numbers: " + numbers);
    }
}

