package day1;

import java.util.Scanner;
import java.util.Stack;

public class NumberToBinary {

    public static int printNumberToBinary(int number){
        Stack<Integer> stack = new Stack<>();
        while(number >0) {
            int rem = number %2;
            stack.push(rem);
            number = number/2;
        }
        StringBuilder result = new StringBuilder();
        while(stack.size() > 0) {
            result.append(stack.pop());
        }
        return Integer.valueOf(result.toString());
    }
    public static void main(String []args) {
        System.out.println("Enter number to convert to Binary");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Binary output is ");
        printNumberToBinary(number);
        scanner.close();
    }
}
