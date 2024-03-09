package day1;

import java.util.Scanner;

public class BinaryToNumber {

    public static void main(String []args) {

        System.out.println("Enter the Binary number");
        try(Scanner s = new Scanner(System.in)) {
            int number = s.nextInt();
            double result = convertBinaryToNumber(number);
            System.out.println("Result : "+result);
        }

    }

    private static double convertBinaryToNumber(int number) {
        int result = 0;
        long power = 0;
        while(number > 0){
            int rem = number%10;
            result += (rem * Math.pow(2,power));
            power++;
            number = number/10;
        }
        return result;
    }
}
