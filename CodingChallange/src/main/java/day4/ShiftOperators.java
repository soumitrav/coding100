package day4;

public class ShiftOperators {

        public static int leftShift(int a, int b) {
            return a << b;
        }

        public static int rightShift(int a, int b) {
            return a >> b;
        }

    public static int unsignedRightShift(int a, int b) {
        return a >>> b;
    }
    }