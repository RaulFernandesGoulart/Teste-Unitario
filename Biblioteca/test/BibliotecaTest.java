package Biblioteca.test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import Biblioteca.src.Biblioteca;
import Biblioteca.src.Livro;
import Biblioteca.src.Membro;

public class BibliotecaTest {
    private Biblioteca biblioteca;
    private Livro livro;
    private Membro membro;

    @Before
    public void setUp() {
        biblioteca = new Biblioteca();
        livro = new Livro();
        membro = new Membro(1, "João");
    }

    @Test
    public void testRegistrarLivro() {
        biblioteca.adicionarLivro(livro);
        assertTrue(biblioteca.getLivros().contains(livro));
    }

    @Test
    public void testEmprestarLivroParaMembro() {
        biblioteca.adicionarLivro(livro);
        assertTrue(livro.getEmprestado());

        biblioteca.emprestarLivro(livro.getId(), membro.getId());
        assertTrue(membro.listarLivrosEmprestados().contains(livro.getTitulo()));
    }

    @Test
    public void testRetornarLivroDeMembro() {
        biblioteca.adicionarLivro(livro);
        biblioteca.emprestarLivro(livro.getId(), membro.getId());
        assertTrue(membro.listarLivrosEmprestados().contains(livro.getTitulo()));

        biblioteca.retornarLivro(livro.getId(), membro.getId());
        assertFalse(membro.listarLivrosEmprestados().contains(livro.getTitulo()));
    }

    @Test
    public void testEmprestarLivroNaoDisponivel() {
        biblioteca.adicionarLivro(livro);
        biblioteca.emprestarLivro(livro.getId(), membro.getId());

        assertFalse(biblioteca.emprestarLivro(livro.getId(), membro.getId()));
    }
}
