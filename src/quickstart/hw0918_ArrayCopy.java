package quickstart;

public class hw0918_ArrayCopy
{
    //陣列複製
//    public static void main(String[] args)
//    {
//        int[] arr1 = {0, 2, 3, 4, 5};
//        int[] arr2 = new int[5];

//        for(int i = 0; i < arr1.length; i++)
//        {arr2[i] = arr1[i];}

//        for(int i = 0; i < arr2.length; i++)
//        {System.out.print(arr2[i]+ " ");}

//        System.out.println();
//    }

    //使用System類別提供的arraycopy()方法
    public static void main(String[] args)
    {
        int[] arr1 = {0, 2, 7, 4, 5};
        int[] arr2 = new int[5];

        System.arraycopy(arr1, 0, arr2, 0, arr1.length);

        for(int i = 0; i < arr2.length; i++)
        {System.out.print(arr2[i] + " ");}

        System.out.println();
    }
}
