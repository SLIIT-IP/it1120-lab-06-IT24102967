import java.util.Scanner;

public class IT24102967Lab6Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfSquares = 0;
        int count = 0;

        System.out.println("Enter positive integers (terminate input with -99): ");
        
        while (true) {         
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            if (num == -99) {
                break;
            } else if (num < 0) {
                System.out.println("Invalid input. Please enter a positive integers or -99 to  terminate");
                continue;
            }

            sumOfSquares += num * num;
            count++;
        }

        if (count > 0) {
            double rms = Math.sqrt(sumOfSquares / (double) count);
            
            System.out.println('\n');
            System.out.println("The Root Mean Square (RMS) is : " + rms);
        } else {
            System.out.println("No valid numbers entered.");
        }
    }
}
