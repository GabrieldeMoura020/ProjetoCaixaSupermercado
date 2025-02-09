package Repository;

import Entidades.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class PessoaDAO {

    static List<Pessoa> pessoas = new ArrayList<>();

    public static void salvar(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public static List<Pessoa> buscarTodos() {
        System.out.println(pessoas);
        return pessoas;
    }

    public static List<Pessoa> buscarPorNome(String nome) {
        List<Pessoa> pessoasFiltradas = new ArrayList<>();
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getNome().contains(nome)) {
                pessoasFiltradas.add(pessoa);
            }
        }
        return pessoasFiltradas;
    }

    public static Object[] findPessoasInArray() {
        List<Pessoa> pessoas = PessoaDAO.buscarTodos();
        List<String> pessoasNomes = new ArrayList<>();

        for (Pessoa pessoa : pessoas) {
            pessoasNomes.add(pessoa.getNome());
        }

        return pessoasNomes.toArray();
    }
}
