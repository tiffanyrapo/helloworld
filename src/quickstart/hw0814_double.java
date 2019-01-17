package quickstart;

public class hw0814_double {


    //public static void main(String args[]) { //浮點數使用
    //    float num = 17.90f;
    //    System.out.println(num+"*"+num+"="+(num*num)); //印出num*num
     //   System.out.println("f_max="+Float.MAX_VALUE);//浮點數最大/小值
     //   System.out.println("f_min="+Float.MIN_VALUE);
     //   System.out.println("d_max="+Double.MAX_VALUE);
     //   System.out.println("d_min="+Double.MIN_VALUE);

    //}

//  public static void main(String args[]){
//      boolean status=false; //布林變數
//      System.out.println("status="+status);
//  }

    public static void main(String args[]){
        int a=45; //型態自動轉換
        float b=2.3f;
        System.out.println("a="+a+",b="+b);
        System.out.println("a/b="+(a/b));

        int c=25,d=9;//型態強制轉換
        System.out.println("c="+c+",d="+d);
        System.out.println("c/d="+(c/d));
        System.out.println("(float)c/d="+(float)c/d); //c強制轉成浮點數，再除d
        System.out.println("(float)c/d="+c/(float)d); //d強制轉成浮點數，再除c
        System.out.println("(float)c/d="+(float)c/(float)d); //cd強制轉成浮點數，再相除
    }
}