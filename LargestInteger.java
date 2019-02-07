public class LargestInteger {
	
    public Integer findLargestNumberUsingConditional(Integer[] integers){
        Integer biggest = (integers[0] > integers[1]) && (integers[0] > integers[2]) ? integers[0] : integers[1];
        Integer result = (biggest > integers[2]) ? biggest : integers[2]; 
        return result;
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        Integer biggest = Math.max(integers[0],integers[1]);
        // System.out.println(biggest);
        Integer result = Math.max(biggest, integers[2]);
        // System.out.println(result);
        return result;
    }

}
