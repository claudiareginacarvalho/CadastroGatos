import gato.Gato;
import org.junit.jupiter.api.Test;

public class GatoTest {

    @Test
    void test(){

        Gato gatotest = new Gato (1,"n", 1.2,2);

        System.out.println(gatotest.toString());
    }
}
