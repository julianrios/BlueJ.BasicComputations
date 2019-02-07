import java.util.Scanner;

public class ShortCalculator {
    public static void main(String[] args) {
        Short a = userInput();
        Short b = userInput();
        
        add(a,b);
        subtract(a,b);
        multiply(a,b);
        divide(a,b);
        remainder(a,b);        
    }
    public static Short userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 65535");
        
        Short n = scanner.nextShort();
        return n;
    }
    


    public static Short add(short baseValue, short difference) {
        Short sum = (short)(baseValue + difference);
        return sum;
    }

    public static Short subtract(short baseValue, short difference) {
        Short diff = (short)(baseValue - difference);
        return diff;
    }

    public static Short multiply(short multiplicand, short multiplier) {
        Short product = (short)(multiplicand * multiplier);
        return product;
    }

    public static Short divide(short dividend, short divisor) {
        Short division = (short)(dividend / divisor);
        return division;
    }

    public static Short remainder(short dividend, short divisor) {
        Short remainder = (short)(dividend % divisor);
        return remainder;
    }

}
