package test;

public class ZooKeeper{
    public static void main(String[] args){
        new ZooKeeper().go();
    }
    void go(){
        Mammal m = new Zebra();
        System.out.println(m.name + m.makeNoise());
    }
}
