package quickstart;

import java.io.*;
public class hw0820
{
//    public static void main(String args[]) throws IOException
// {
        //BufferedReaderDemo
//        BufferedReader bufferedReader =
//                new BufferedReader (new InputStreamReader(System.in));
//        System.out.print("請輸入一列文字，可包含空白: ");
//        String text = bufferedReader.readLine();
//        System.out.println("您輸入的文字: " +text);
//    }

//    public static void main(String args[])
//    {
        //ErrDemo
//        System.out.println("使用out輸出訊息");
//        System.out.println("使用err輸出訊息");
//    }

    public static void main(String args[])
    {
        //格式控制字元
        /**
         * 1.\u0000 - 16進位指定unicode字元輸出
         * 2.\xxx - 8進位指定unicode字元輸出
         * 3.\b - 倒退一個字元
         * 4.\f - 換頁
         * 5.\n - 換行
         * 6.\r - 游標移至行首
         * 7.\t - 跳格(1個tab)
         */

        System.out.println("指定unicode輸出hello: "+"\u0048\u0065\u006c\u006c\u006F");
        //進位數值轉換-法1
        System.out.println("10進位轉2進位: "+Integer.toBinaryString(19));
        System.out.println("10進位轉16進位: "+Integer.toHexString(19));
        System.out.println("10進位轉8進位: "+Integer.toOctalString(19));
        //法2
        System.out.printf("%d%n",19);
        System.out.printf("%o%n",19);
        System.out.printf("%x%n",19);

    }

}
