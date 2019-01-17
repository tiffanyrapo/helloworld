package quickstart;

import java.util.Scanner;

public class hw0820_sorce
{
    //條件運算子(條件式?成立回傳:失敗回傳)-1
//    public static void main(String args[])
//    {
//       Scanner scanner = new Scanner(System.in);
//       System.out.print("請輸入學生分數:");
//       int scoreOfStudent = scanner.nextInt();
//       System.out.println("該生是否及格? "+(scoreOfStudent >= 60? '是':'否'));
//    }

    //條件運算子(條件式?成立回傳:失敗回傳)-2
//    public static void main(String args[])
//    {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("請輸入數字:");
//        int number = scanner.nextInt();
//        System.out.println("是否為奇數?"+(number % 2 != 0 ?'是':'否'));
//    }

    //邏輯運算子&&且、||或、!反相
    public static void main(String args[])
    {
        int number = 75;
        System.out.println((number >70 && number < 80));
        System.out.println((number >80 || number < 75));
        System.out.println( ! (number >80 ||number <75));

        //位元運算子AND&、OR|、XOR^、補數~
        System.out.println("AND運算");
        System.out.println("0 AND 0\t\t"+(0&0));
        System.out.println("0 AND 1\t\t"+(0&1));
        System.out.println("1 AND 0\t\t"+(1&0));
        System.out.println("1 AND 1\t\t"+(1&1));

        System.out.println("OR運算");
        System.out.println("0 OR 0\t\t"+(0|0));
        System.out.println("0 OR 1\t\t"+(0|1));
        System.out.println("1 OR 0\t\t"+(1|0));
        System.out.println("1 OR 1\t\t"+(1|1));

        System.out.println("XOR運算");
        System.out.println("0 XOR 0\t\t"+(0^0));
        System.out.println("0 XOR 1\t\t"+(0^1));
        System.out.println("1 XOR 0\t\t"+(1^0));
        System.out.println("1 XOR 1\t\t"+(1^1));


    }
}
