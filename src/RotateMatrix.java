import java.util.Stack;

/**
 * Created by Cabz on 4/10/2017.
 */
public class RotateMatrix {

    public static void main(String[] args) {


        int [][] inputMatrix = new int [3][3];

        int count = 0;
        for (int i = 0; i <inputMatrix.length ; i++) {
            for (int j = 0; j <inputMatrix.length ; j++) {
            inputMatrix[i][j] = count;
                count++;
            }

        }

        rotateMatrix(inputMatrix);



    }

    public static boolean rotateMatrix(int [][]matrix){

    if(matrix.length == 0 || matrix.length != matrix[0].length) return false;

        int n = matrix.length;
        for (int layer = 0; layer < n/2 ; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i <last ; i++) {
                int offset = i - first;
                int top = matrix[first][i]; //saves top

                //left to top
                matrix[last-offset][first] = matrix[last][last - offset];

                //bottom to left
                matrix[last][last - offset] = matrix[i][last];

                //top to right
                matrix[i][last] = top;

            }

        }

        return true;

    }

}
