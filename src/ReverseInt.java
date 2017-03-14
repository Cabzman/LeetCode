import java.util.LinkedList;
/**
 * Created by Christian on 3/10/2017.
 */
public class ReverseInt {

    public static void main(String[] args) {
        //Example Should return 4321
        System.out.println(reverse(1234));
    }

    public static int reverse(int x){
        int input = x;
        int answer = 0;
        boolean negative = false;
        //If x is negative, get the positive value of it(could most likely use Math.Abs
        if(x <0){
            x = x - 2*x;
            System.out.println(x);
            negative = true;
            input = x;
        }

        //Break the received int down into individual characters and add them into a queue.
        LinkedList<Integer> temp = new LinkedList();
        while(input >0){
            //Grabs the last digit by modding by 10, then divides by 10 to make it smaller. E.G
            //Grabs 4 3 2 1 in regards to the example above,
            temp.add(input%10);
            input = input/10;
        }

        //counter is to give the number the appropriate magnatude when it comes out of the queue
        int counter = (int) Math.pow(10,temp.size()-1);
        //grab the max size of the linked list so that you can iterate over it.
        int tempsize = temp.size();

        try {
            for (int i = 0; i < tempsize ; i++) {
                int holder = temp.remove();

                int multiply = Math.multiplyExact(holder,counter);

                answer = Math.addExact(answer,multiply);
                counter = counter /10;

            }
            //If the number over/underflows catch the error and return 0.
        }catch (ArithmeticException e){
            System.out.println("over/underflow error");
            return 0;
        }

        //If the answer was orginally negative, turn it back into a negative number.
        if(negative == true){
            answer = answer - 2 * answer;
        }



        return answer;
    }
}
