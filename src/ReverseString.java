import java.util.*;



public class ReverseString {

    public static void main(String[] args) {
        System.out.println(revereseString("Reverse this"));
    }

    public static String revereseString(String toBeReversed){
        Stack revereser = new Stack();
        String reversed = "";
        for (int i = 0; i <toBeReversed.length() ; i++) {
            revereser.push(toBeReversed.charAt(i));
        }

        while(revereser.empty() == false){
            reversed+= revereser.pop();
        }
        System.out.println(reversed);
        return reversed;
    }


}
