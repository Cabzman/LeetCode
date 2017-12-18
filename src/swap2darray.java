import java.util.Arrays;

public class swap2darray {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2,3},{4,5,6}, {7, 8,9}};


        flipHorizontalAxis(matrix);


    }


    public static void flipHorizontalAxis(int[][] imgArray) {
        int temp;
        for (int i = 0; i < imgArray.length / 2; i++) {
            for (int j = 0; j < imgArray[i].length; j++) {
                temp = imgArray[i][j];
                imgArray[i][j] = imgArray[imgArray.length - 1 - i][j];
                imgArray[imgArray.length - 1 -i][j] = temp;
            }
        }
        System.out.println(Arrays.deepToString(imgArray));
    }
}
