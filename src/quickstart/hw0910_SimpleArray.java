package quickstart;

public class hw0910_SimpleArray
{
    //參考: https://caterpillar.gitbooks.io/javase6tutorial/content/c5_1.html
//    public static void main(String args[])
//    {
        //陣列的 length 屬性可取回陣列的長度，也就是陣列中的元素個數。
//        int[] score ={90, 85, 55, 94, 77};

//        for(int i =0; i < score.length; i++)
//            System.out.printf("score[%d] = %d\n", i, score[i]);
//    }

    public static void main(String args[])
    {
        //注1: 若想使用new新增陣列時一併指定初始值，此方式不必指定陣列長度，寫法如注2
        //注2: int[] score = new int[]{90, 85, 55, 94, 77};
        int[] arr = new int[10];

        System.out.print("arr 初始值: ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
            arr[i] = i;
        }

        System.out.print("\narr 設定值: ");
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}
