package quickstart;
import java.util.Arrays;

/**
 * 對三個2維陣列進行深層比較與深層輸出
 */
public class hw0921_NewArraysDemo
{
    public static void main(String args[])
    {
        int[][] arr1 ={{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int[][] arr2 ={{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int[][] arr3 ={{0, 1, 3},{4, 6, 4},{7, 8, 9}};

        System.out.println("arr1 內容等於 arr2 ? " +Arrays.deepEquals(arr1,arr2));
        System.out.println("arr1 內容等於 arr3 ? " +Arrays.deepEquals(arr1,arr3));
        System.out.println("arr1 deepToString ? " +Arrays.deepToString(arr1));
    }
}
