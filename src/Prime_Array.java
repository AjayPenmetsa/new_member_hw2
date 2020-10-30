//to display array as string
import java.util.Arrays;

public class Prime_Array {
    public static void main(String[] args) {
        //array
        int[] first_10_prime = {1, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        //+1
        for (int i = 0; i <= 9; i++) {
            first_10_prime[i] = first_10_prime[i] + 1;
        }
        //print array
        System.out.println(Arrays.toString(first_10_prime));
    }
}

