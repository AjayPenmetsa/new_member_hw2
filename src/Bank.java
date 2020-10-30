import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Bank Ajay = new Bank();
        String owner = "owner";
        int year_created = 1987;
        //initial money that gets updated
        int new_money = 1000;
        //initial money that won't change (for comparison)
        int money = new_money;

        System.out.println("Current Total: " + money);

        Scanner scanner = new Scanner(System.in);

        boolean question_loop = true;
        while (question_loop) {
            System.out.println("Enter: Add + 'amount', Subtract + 'amount', Clear, or Done");
            String question = scanner.next();
            {
////////////////add
                if (question.contains("Add")) {
                    int x = scanner.nextInt();
                    System.out.println(x + " has been added to " + new_money);
                    new_money = new_money + x;
                    System.out.println("New total is: " + new_money);
////////////////subtract
                } else if (question.contains("Subtract")) {
                    int y = scanner.nextInt();
                    System.out.println(y + " has been subtracted from " + new_money);
                    new_money = new_money - y;
                    System.out.println("New total is: " + new_money);
////////////////clear
                } else if (question.contains("Clear")) {
                    System.out.println("Total Money was: " + new_money);
                    new_money = new_money - new_money;
                    System.out.println("Total Money is " + new_money);
////////////////end
                } else if (question.contains("Done")) {
                    System.out.println("Original Money was: " + money);
                    System.out.println("Current Money is: " + new_money);
                    question_loop = false;
////////////////etc.
                } else
                    System.out.println("Error");
            }
        }
    }
}
//ADD MONEY
//            int x = scanner.nextInt();
//            System.out.println(x + " has been added.");
//            new_money = new_money + x;
//            System.out.println("New total is: " + new_money);
//
//REMOVE MONEY
//            int y = scanner.nextInt();
//            System.out.println(y + " has been subtracted.");
//            new_money = new_money - y;
//            System.out.println("New total is: " + new_money);
//
//CLEAR
//            boolean error_loop = true;
//            while (error_loop) {
//                String clear = scanner.next();
//                {  //reads string before the space
//                      if (clear.contains("Clear")) {
//                        new_money = new_money - new_money;
//                        System.out.println(new_money);
//
//                    } else
//                        System.out.println("Error");
//                }
//            }

