package quickstart;

public class hw0911_TwoDimArray
{
//    public static void main(String args[])
//    {
          //二維陣列練習-1
//        int[][] arr = {{1, 2, 3},
//                       {4, 5, 6}};

//        for(int i = 0; i < arr.length; i++)
//        {
//            for(int j = 0; j < arr[0].length; j++)
//                System.out.print(arr[i][j] + " ");
//            System.out.println();
//        }
//    }

    public static void main(String args[])
    {
        //二維陣列練習-2
        int[][] arr = {{1, 2, 3},
                       {4, 5, 6}};

        int[] foo = arr[0]; //將arr[0]所參考的陣列物件指定給foo

        for(int i = 0; i < foo.length; i++)
        {
            System.out.print(foo[i]+ " ");
        }

        System.out.println();
        foo = arr[1];  //將arr[1]所參考的陣列物件指定給foo

        for(int i = 0; i < foo.length; i++)
        {
            System.out.print(foo[i] + " ");
        }

        System.out.println();
    }
}
