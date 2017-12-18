import com.sun.deploy.util.ArrayUtil;

import java.util.*;
public class bubblesort {


    public static void main(String[] args) {
        int arr[] =  {2,4,3,1,5};

    bubbleSortArray(arr);
        System.out.println(    bubbleSortArray(arr));
    }



    public static int[] bubbleSortArray(int[] arr){



        for (int i=arr.length-1;i>0;i--){
            for (int j = 0;j<i ;j++ ){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }





        return arr;
    }
}
