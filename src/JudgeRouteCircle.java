import java.util.*;
import java.util.stream.Collectors;

public class JudgeRouteCircle {

    public static void main(String[] args) {
        System.out.println(judgeCircle("LDRRLRUULR"));
    }

    public static boolean judgeCircle(String moves){
        int x = 0;
        int y = 0;
        for (char ch:moves.toCharArray()) {
            if(ch == 'U'){
                y++;
            }else if(ch == 'D'){
                y--;
            }
            if(ch == 'L'){
                x++;
            }else if(ch == 'R'){
                x--;
            }
        }
        if(x == 0 && y == 0){
            return true;
        }else{
            return false;
        }
    }
}
