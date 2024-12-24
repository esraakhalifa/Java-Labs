package lab7;

public class ComplexNumber <T extends Number>
{
    T real;
    T img;
    public ComplexNumber()
    {
        this.real = null;
        this.img = null;
    }
    public ComplexNumber(T real, T img)
    {
        this.real = real;
        this.img = img;
    }
    
    private ComplexNumber sum( ComplexNumber<T>  c)
    {
        ComplexNumber<Double> result = new ComplexNumber<Double>();
        result.real = real.doubleValue() + c.real.doubleValue();
        result.img = img.doubleValue() + c.img.doubleValue();
        return result;
       
    }
    
    private ComplexNumber subtract(ComplexNumber <T> c)
    {
        ComplexNumber<Double> result = new ComplexNumber<Double>();
        result.real = real.doubleValue() - c.real.doubleValue();
        result.img = img.doubleValue() - c.img.doubleValue();
        return result;
    }

    public void printComplexNum()
    {
        if(real.doubleValue() == 0 && img.doubleValue() == 0)
        {
            System.out.println("Complex number is equal to zero");
        }
        if(img.doubleValue() > 0)
        {
            System.out.println(real.doubleValue() + " + " + img.doubleValue() + "j");
        }
        else
        {
            System.out.println(real.doubleValue() + " + " + img.doubleValue() + "j");
        }
    }

    public void printSum(ComplexNumber<T> c)
    {
        ComplexNumber result = this.sum(c);
        if(result.real.doubleValue() == 0 && result.img.doubleValue() == 0)
        {
            System.out.println("Complex number is equal to zero");
        }
        if(result.img.doubleValue() > 0)
        {
            System.out.println(result.real.doubleValue() + " + " + result.img.doubleValue() + "j");
        }
        else
        {
            System.out.println(result.real.doubleValue() + " + " + result.img.doubleValue() + "j");
        }
    }
    public void printSubtraction(ComplexNumber<T> c)
    {
        ComplexNumber result = this.subtract(c);
        if(result.real.doubleValue() == 0 && result.img.doubleValue() == 0)
        {
            System.out.println("Complex number is equal to zero");
        }
        if(result.img.doubleValue() > 0)
        {
            System.out.println(result.real.doubleValue() + " + " + result.img.doubleValue() + "j");
        }
        else
        {
            System.out.println(result.real.doubleValue() + " + " + result.img.doubleValue() + "j");
        }
    }

    
}