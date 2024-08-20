package br.com.alura.codechella.domain.entities;

import br.com.alura.codechella.domain.FabricaDeUsuario;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    @Test
    public void naoDeveriaCadastrarUsuarioComCpfNoFormatoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new Usuario("123456789-99", "Bob",
                LocalDate.parse("1990-09-08"), "email@email.com"));
    }

    @Test
    public void deveCriarUsuarioUsandoFabricaDeUsuario() {
        FabricaDeUsuario fabrica = new FabricaDeUsuario();
        Usuario usuario = fabrica.comNomeCpfNascimento("Bob", "123.456.789-80", LocalDate.parse("1990-01-01"));

        assertEquals("Bob", usuario.getNome());

        fabrica.incluiEndereco("24.000-000", 20,  "Apto 301");

        assertEquals("Apto 301", usuario.getEndereco().getComplemento());
    }
}