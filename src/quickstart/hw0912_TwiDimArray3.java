package quickstart;

public class hw0912_TwiDimArray3
{
    //三維、不規則陣列練習
    public static void main(String args[])
    {
        int [][] arr;

        arr = new int[2][];
        arr[0] = new int[3]; //參考至長度為3的一維陣列
        arr[1] = new int[5]; //參考至長度為5的一維陣列

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                arr[i][j] = j + 1;
            }
        }

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
