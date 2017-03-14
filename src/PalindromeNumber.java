/**
 * Created by Cabz on 3/13/2017.
 */
public class PalindromeNumber {
    public static void main(String[] args) {


        System.out.println( isPalindrome( 12321));
    }


    public static boolean isPalindrome(int x){

        //if negative return false because palindromes can not be negative
        if(x <0){
            return false;
        }
        int tempPassed = x;
        int storage = 0;

        //Same idea as reverse int, avoids overflow of Integer.reverse
        while(tempPassed > 0){
            storage = storage * 10 + tempPassed%10;
            tempPassed = tempPassed/10;
        }
        //if they are a copy they are a palindrome.
        if(storage == x){
            return true;
        }



        return false;

    }


}
