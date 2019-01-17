package quickstart;

//public class hw0814_char {
//    public static void main(String args[]){
//        char ch1 =49;  //設定字元變數ch1=編碼71的字元
//        char ch2 ='G'; //設定字元變數ch2='G'
//        char ch3='\u0047'; //以16進位值設定變數

//        System.out.println("ch1="+ch1);
//        System.out.println("ch2="+ch2);
//        System.out.println("ch3="+ch3);

//    }
//}

public class hw0814_char { //跳脫序列
    public static void main(String args[]){
        char ch1 ='\n';  //將值設為\"
        char ch2 ='\77'; //設值為8進位
        char ch3=0x3e; //設值為16進位

        System.out.println(ch1+"Time flies.="+ch1);
        System.out.println("\"Time is money!\"");
        System.out.println(ch2+"Tomorrow never comes"+ch3);

    }
}