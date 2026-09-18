import gato.Gato;
import gato.GatoRepository;
import org.junit.jupiter.api.Test;
import java.util.List;

public class GatoRepositoryTest {
    @Test
    void testSalvarEListar () {
        GatoRepository repository = new GatoRepository();
        Gato gato = new Gato (1 ,"Pack", 1.0,1);
        repository.salvar(gato);
        List <Gato> gatos = repository.listar();
    }

    @Test
    void testAtualizarPeso (){
        GatoRepository repository = new GatoRepository();
        Gato gato = new Gato (1 ,"Pack", 1.0,1);
        repository.salvar(gato);
        repository.atualizarPeso("Pack", 5.0);

    }

}
