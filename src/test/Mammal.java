package test;
//0685
class Mammal{
    String name = "furry";
    String makeNoise(){return "generic noise";}
}
class Zebra extends Mammal{
    String name = "stripes";
    String makeNoise(){return "bray";}
}
