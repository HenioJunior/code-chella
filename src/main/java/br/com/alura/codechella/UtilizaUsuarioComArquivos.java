package br.com.alura.codechella;

import br.com.alura.codechella.domain.entities.usuario.Usuario;
import br.com.alura.codechella.infra.gateways.RepositorioDeUsuarioEmArquivo;

import java.time.LocalDate;

public class UtilizaUsuarioComArquivos {

    public static void main(String[] args) {
        RepositorioDeUsuarioEmArquivo repositorio = new RepositorioDeUsuarioEmArquivo();

        repositorio.cadastrarUsuario(new Usuario("987.654.321-00", "Bob", LocalDate.parse("1973-02-19"), "bob@email.com"));
        repositorio.cadastrarUsuario(new Usuario("887.654.321-00", "Maria", LocalDate.parse("1973-02-19"), "maria@email.com"));
        repositorio.cadastrarUsuario(new Usuario("787.654.321-00", "Alex", LocalDate.parse("1973-02-19"), "alex@email.com"));
        repositorio.cadastrarUsuario(new Usuario("687.654.321-00", "Jaqueline", LocalDate.parse("1973-02-19"), "jaqueline@email.com"));

        //System.out.println(repositorio.listarTodos());
        repositorio.gravaEmArquivo("usuarios.txt");
    }
}
