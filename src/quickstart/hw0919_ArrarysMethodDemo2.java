package quickstart;

import java.util.Arrays;

/**
 * 使用Arrays進行陣列的填充與比較
 */
public class hw0919_ArrarysMethodDemo2
{
    public static void main(String[] args)
    {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        int[] arr3 = new int[10];

        Arrays.fill(arr1, 5);
        Arrays.fill(arr2, 5);
        Arrays.fill(arr3, 10);

        System.out.print("arr1: ");
        for(int i =0; i < arr1.length; i++)
            System.out.print(arr1[i] +" ");

        System.out.println("\narr1 = arr2 ? " + Arrays.equals(arr1,arr2));
        System.out.println("arr1 = arr3 ? " + Arrays.equals(arr1,arr3));
    }
}
