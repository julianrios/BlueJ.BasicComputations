 


public class NormalizeAngle {

    public Integer normalizeValueUsingModulo(Integer angle){
        Integer result = angle % 360; 
        return result;

    }

    public Integer normalizeValueUsingFloorMod(Integer integer){
        return Math.floorMod(integer, 360);
    }

    public static void main(String[] args){

    }
}
