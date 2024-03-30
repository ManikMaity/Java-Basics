import java.util.Scanner;

public class loops {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        // for loop  & break & continue
        for (int i = 0; i <= 10; i++){
            if (i == 2) {
                continue; // skip one tiem
            }
            if (i == 9){
                break; // loop end if condition meet
            }
            System.out.println("The number is " + i);
        }

        // while loop
        System.out.println("How manyy times print?");
        int n = scanner.nextInt();
        int j = 0;
        while (j < n) {
            System.out.println("Print no." + (++j));
        }

        // do while loop
        int num2 = 5;
        do{
            System.out.println("Number is " + num2);
        }while(num2 > 10); // Number is 5

    }
}
