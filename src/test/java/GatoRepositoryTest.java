import gato.Gato;
import gato.GatoRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GatoRepositoryTest {
    private GatoRepository repository;

    @Test
    void testListarVazio() {
        GatoRepository repository = new GatoRepository();
        List<Gato> gatos = repository.listar();

        assertTrue(gatos.isEmpty(), "A lista deveria iniciar vazia.");
    }

    @Test
    void testSalvarEElistar() {
        Gato gato = new Gato(1, "Mingau", 4.5, 3);

        repository.salvar(gato);
        List<Gato> gatos = repository.listar();

        assertEquals(1, gatos.size(), "A lista deveria conter 1 gato.");
        assertEquals("Mingau", gatos.get(0).getNome());
    }

    @Test
    void testAtualizarPeso() {
        Gato gato = new Gato(1, "Simba", 3.0, 2);
        repository.salvar(gato);

        repository.atualizarPeso("Simba", 3.8);

        assertEquals(3.8, repository.listar().get(0).getPeso(), "O peso deveria ter sido atualizado.");
    }

    @Test
    void testDeletarPorId() {
        Gato gato = new Gato(1, "Frajola", 4.0, 4);
        repository.salvar(gato);

        repository.deletar(1);

        assertTrue(repository.listar().isEmpty(), "A lista deveria estar vazia após a exclusão.");
    }

    @Test
    void testDeletarPorNome() {
        Gato gato = new Gato(1, "Garfield", 5.0, 5);
        repository.salvar(gato);

        repository.deletarPorNome("Garfield");

        assertTrue(repository.listar().isEmpty(), "A lista deveria estar vazia após remover por nome.");
    }

}
