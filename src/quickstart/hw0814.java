package quickstart;

//public class hw0814 {
    //整數型態的溢位
//    public static void main (String args[]){
//        int i=java.lang.Integer.MAX_VALUE; //將I設為整數最大值
//        int sum;

//        System.out.println("I="+i); //印出I

//        sum=i+1;
//        System.out.println("I+1="+sum); //印出I+1

//        sum=i+2;
//        System.out.println("I+2="+sum); //印出I+2
//    }
//}


//import java.io.PrintStream;

//public class hw0814 {
      //整數型態的溢位處理1
//   public static void main (String args[]){
//      int i=java.lang.Integer.MAX_VALUE; //將I設為整數最大值

//      System.out.println("I="+i); //印出I
//      System.out.println("I+1="+(i+1)); //會發生溢位
//      System.out.println("I+2="+(i+2L));
//       final PrintStream printf = System.out.printf("I+3=%d%n", (long) i + 3);
//   }
//}

public class hw0814 {

    public static void main(String args[]) { //整數型態的溢位處理2

        int i = java.lang.Integer.MAX_VALUE; //將I設為整數最大值

        System.out.println("I=" + i); //印出I
        System.out.println("I+1=" + (i + 1)); //會發生溢位
        System.out.println("I+2=" + (i + 2L));
        System.out.printf("I+3=%d%n", (long) i + 3);
    }
}