import labb4.*;
import java.util.function.Function;

class Main{
    public static void main(String[] args) {
        Fahrendheit fahrendheit = new Fahrendheit();
        System.out.println(fahrendheit.apply(10.0));
        ComputeRoots roots = new ComputeRoots(1.0); 
        System.out.println("X : " + roots.apply(3.0, 2.0)); 
    }
}
