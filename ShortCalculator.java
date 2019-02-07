public class ShortCalculator {

    public Short add(short baseValue, short difference) {
        Short sum = (short)(baseValue + difference);
        return sum;
    }

    public Short subtract(short baseValue, short difference) {
        Short diff = (short)(baseValue - difference);
        return diff;
    }

    public Short multiply(short multiplicand, short multiplier) {
        Short product = (short)(multiplicand * multiplier);
        return product;
    }

    public Short divide(short dividend, short divisor) {
        Short division = (short)(dividend / divisor);
        return division;
    }

    public Short remainder(short dividend, short divisor) {
        Short remainder = (short)(dividend % divisor);
        return remainder;
    }

}
