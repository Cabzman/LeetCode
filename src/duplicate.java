import java.util.Map;
import java.util.*;

public class duplicate {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,3,4,2,1,2,4};
        Map<Integer, Integer> dup = new HashMap<Integer, Integer>();

        for (int number:numbers) {
            if(dup.containsKey(number)){
                dup.put(number,dup.get(number)+1);
            }else{
                dup.put(number,1);
            }
        }



    }
    public static int getRandom(int max){
        return (int) (Math.random()*max);
    }

}

