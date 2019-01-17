package homeMade;

public class BMICalculator
{
    //宣告變數
    double weight;
    double height;
    double BMI;

    public BMICalculator(double w,double h)
    {
        weight=w;
        height=h;
    }

    public double calculatwBMI()
    {
        return weight / (weight*height);
    }

    //主要運作區域
    public static void main (String[]args)
    {
        BMICalculator calculator = new BMICalculator(60,1.70);
        double bmi = calculator.calculatwBMI();

        //print BMI to screen
        System.out.println("Your BMI is"+bmi+".");
    }
}
