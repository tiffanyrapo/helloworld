package quickstart;

import java.util.Scanner; //載入Scanner類別

public class hw0815
{
//    public static void main(String args[])
//    { //鍵盤輸入

//        Scanner scn=new Scanner(System.in); //宣告Scanner類別的物件
//        int age;
//        String name;

//        System.out.println("What's your name?");
//        name=scn.nextLine(); //輸入字串
//        System.out.println("how old are you?");
//        age=scn.nextInt();  //輸入整數

//        System.out.print("Hi,"+name+",you're");
//        System.out.println(age+"years old");
//    }

//    public static void main(String args[])
//    { //scannerDEMO-1
//        Scanner scn=new Scanner(System.in);
//        String str;
//        char ch;

//        str=scn.next();  //輸入字串
//        ch=str.charAt(3-1); //取出字串第N-1字元

//        System.out.println("you choose this word:"+ch);
//    }

//    public static void main(String args[])
//    { //1元運算子
//        byte a=Byte.MIN_VALUE;
//        boolean b=true;

//        System.out.println("a="+a+",~a="+(~a)); //~=補數
//        System.out.println("b="+b+",!b="+(!b)); //!=not
//    }

//    public static void main(String args[])
//    { //算術運算子
//        int a,b,c,sum,mod;
//        a=6+2;
//        b=a*15;
//        sum=a+b;

//        c=a/6;
//        mod=45%7;

//        System.out.println("a="+a+",b="+b+",c="+c+",mod="+mod);

//    }

    //ScannerDEMO-2
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入一個數字: ");
        System.out.printf("你輸入了 %d !\n",scanner.nextInt());
    }
}
