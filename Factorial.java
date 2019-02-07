import java.math.BigInteger;

public class Factorial {

    public BigInteger factorialOf(Integer value){
     	BigInteger result = BigInteger.ONE;
     	BigInteger bigValue = BigInteger.valueOf(value);
     	
     	while(!bigValue.equals(BigInteger.ZERO)) {
     		// 
     		result = result.multiply(bigValue);
     		bigValue = bigValue.subtract(BigInteger.ONE);
     	}
     	return result;
    }
}
