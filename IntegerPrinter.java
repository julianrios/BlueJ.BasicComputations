 


public class IntegerPrinter {

    public String printIntegerAsBinary(int value){
        String binary = Integer.toBinaryString(value);
        return binary;
    }

    public String printIntegerAsOctal(int value){
        String octal = Integer.toOctalString(value);
        return octal;
    }

    public String printIntegerAsHexadecimal(int value){
        String hex = Integer.toHexString(value);
        return hex;
    }

    public static void main(String[] args){

    }
}
