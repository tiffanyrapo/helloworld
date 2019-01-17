package quickstart;

//流程控制

import java.util.Scanner;
public class hw0822_scoreLevel
{
    //if陳述句練習，用於複雜的條件陳述
//    publc static void main(String args[])
//    {
//        Scanner scanner = new Scanner(System.in);

//        System.out.println("輸入分數: ");
//        int score = scanner.nextInt();

//        if(score >= 90)
//           System.out.println("得A");
//        else if (score >= 80 && score < 90)
//           System.out.println("得B");
//        else if (score >= 70 && score < 80)
//           System.out.println("得C");
//        else if (score >= 60 && score < 70)
//           System.out.println("得D");
//        else
//           System.out.println("得E,不及格");
//    }

    //swith陳述句練習，純比對數值跟字元可用，效率較高，因只會取出變數1次
//    public static void main(String args[])
//    {
//        Scanner scanner = new Scanner(System.in);

//        System.out.println("輸入分數: ");
//        int score = scanner.nextInt();
//        int level = (int) score/10;

//        switch(level)
//        {
//            case 10:
//            case 9:
//                System.out.println("得A");
//                break;
//            case 8:
//                System.out.println("得B");
//                break;
//            case 7:
//                System.out.println("得C");
//                break;
//            case 6:
//                System.out.println("得D");
//                break;
//            default:
//                System.out.println("得E,不及格");                        );
//        }
//    }

    //for迴圈陳述練習，重複性
//    public static void main(String args[])
//    {
//        for(int i = 0; i< 10; i++)
//            System.out.print(" "+i);
//    }

    //99乘法表
//    public static void main(String args[])
//    {
//        for(int j = 1; j < 10; j++)
//        {
//            for(int i = 1; i < 10; i++)
//            {
//                System.out.printf("%d*%d=%2d  ", i, j, i*j);
//            }
//            System.out.println();
//        }
//    }

    //前測式while迴圈練習，迴圈前先條件判斷，輸入分數/輸出平均
//    public static void main(String args[])
//    {
//        Scanner scanner = new Scanner(System.in);
//        int score = 0, sum = 0, count = -1;

//        while(score != -1)
//        {
//            count++;
//            sum += score; //+= > sum = sum+score
//            System.out.println("輸入分數(-1結束): ");
//            score = scanner.nextInt();
//        }
//        System.out.println("平均: "+(double)sum/count);
//    }

    //do while迴圈練習，輸入奇數判斷
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int input = 0,replay = 0;

        do
            {
                System.out.print("輸入整數: ");
                input = scanner.nextInt();
                System.out.println("值為奇數?  "+((input %2 == 1)? 'Y':'N'));
                System.out.println("繼續? (1:繼續 0:結束)");
                replay = scanner.nextInt();
            }while(replay == 1);
    }

    /**
     * break、continue用法
     * 1.break:結束該區塊的執行，前進下一個陳述句。
     *          switch:中斷下一個case的比對；
     *          for、while、do while:中斷目前的迴圈。
     * 2.continue:結束該區塊的陳述句，跳回迴圈判斷式的開頭繼續下一個迴圈。
     */
}
