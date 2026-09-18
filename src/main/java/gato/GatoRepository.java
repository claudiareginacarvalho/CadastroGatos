package gato;

import java.util.ArrayList;
import java.util.List;

public class GatoRepository {
     private List<Gato> bancoDeDados = new ArrayList<>();

     public void salvar (Gato gato){
         bancoDeDados.add(gato);
         System.out.println("gato.Gato: " + gato.getNome() + " cadastrado com sucesso!");
     }

    public List<Gato> listar () {
        return bancoDeDados;
    }

    public void atualizarPeso (String nome, double novoPeso){

         for(Gato g : bancoDeDados) {
             if (g.getNome().equals(nome)){
                g.setPeso(novoPeso);
                 System.out.println("Peso Alterado com sucesso!");
             }
         }

    }

    public void deletar(int id) {
        bancoDeDados.removeIf(g -> g.getId() == id);
        System.out.println("Cadastro removido do sistema.");
    }

    public void deletarPorNome(String nome) {
        bancoDeDados.removeIf(g -> g.getNome() == nome);
        System.out.println("Cadastro removido do sistema.");
    }

}
