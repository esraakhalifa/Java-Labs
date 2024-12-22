package labb4;
import java.util.function.Function;

public class Fahrendheit implements Function<Double, Double>
{
    private Double calculateFahrendheit(Double degree)
    {
        return (degree * 1.8) + 32;
    }
    @Override
    public Double apply(Double degree)
    {
        return calculateFahrendheit(degree);
    }
}