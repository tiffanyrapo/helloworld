package quickstart;

import java.util.Scanner;
import java.util.Date;

public class hw0827_knowObject
{
    //顯示目前系統時間
//    public static void main(String args[])
//    {
//        Date date = new Date();
//        System.out.println(date.toString());
//    }

//    public static void main(String args[])
//    {
        //字串的操作
//        String text = "Have a nice day!! :)";

//        System.out.println("原文: "+ text);

        //回傳全為大寫
//        System.out.println("大寫: "+ text.toUpperCase());
        //回傳全為小寫
//        System.out.println("小寫: " + text.toLowerCase());
        //計算字串長度
//        System.out.println("長度: " + text.length());
        //傳回取代文字後的字串
//        System.out.println("取代: " + text.replaceAll("nice","good"));
        //傳回指定位置後的子字串
//        System.out.println("子字串: " + text.substring(6));
//    }

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();

        System.out.println("使用者名稱: ");
        username = scanner.next();

        System.out.println("使用者密碼: ");
        String password = scanner.next();

        if("caterpillar".equals(username) && "1975".equals(password))
        {
            System.out.println("秘密資訊在此!");
        }
        else
            {
                System.out.println(username + "您好，輸入的資料有誤，請重新修改");
            }
    }


}
