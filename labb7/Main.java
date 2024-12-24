import lab7.*;

class Main
{
    public static void main(String[] args)
    {
        ComplexNumber c1 = new ComplexNumber(8,4);
        ComplexNumber c2 = new ComplexNumber(4,2);
        c1.printComplexNum();
        c1.printSum(c2);
        c1.printSubtraction(c2);
        ComplexNumber c3 = new ComplexNumber(8.2,4.2);
        ComplexNumber c4 = new ComplexNumber(4.2,2.2);
        c1.printComplexNum();
        c1.printSum(c4);
        c1.printSubtraction(c4);
        ComplexNumber c5 = new ComplexNumber(8.2f,4.2f);
        ComplexNumber c6 = new ComplexNumber(4.2f,2.2f);
        c1.printComplexNum();
        c1.printSum(c6);
        c1.printSubtraction(c6);
    }
}