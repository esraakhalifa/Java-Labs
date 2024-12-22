package labb4;
import java.util.function.BiFunction;


public class ComputeRoots implements BiFunction<Double, Double, Double> {
        private final double t; 

        public ComputeRoots(double t) {
            this.t = t;
        }

        private Double getUnderSquareRoot(Double t1, Double t2)
        {
            Double underSquareRoot = (t1 * t1) - 4 * t * t2;
            if (underSquareRoot < 0) {
                throw new IllegalArgumentException("Discriminant is negative, roots are imaginary!");
            }
            return underSquareRoot;
        }
        private Double getSquareRoot(Double undersquareRoot)
        {
            return Math.sqrt(undersquareRoot);
        }
        private Double getDenominator()
        {
            return (2 * t);
        }
        private Double addOrSubtract(Double t1, Double squareRoot)
        {
            return (t1 > 0) ? (-t1 + squareRoot) : (-t1 - squareRoot);
        }

        private Double applyCalculation(Double t1, Double t2)
        {
            Double underSquareRoot = getUnderSquareRoot(t1,t2);
            Double squareRoot = getSquareRoot(underSquareRoot);
            Double numerator = addOrSubtract(t1, squareRoot);
            Double denominator = getDenominator();

            return numerator/denominator;

        }

        @Override
        public Double apply(Double t1, Double t2) {
            return applyCalculation(t1, t2);
        }
    }

    //Wildcards , Generics ->Bounded


