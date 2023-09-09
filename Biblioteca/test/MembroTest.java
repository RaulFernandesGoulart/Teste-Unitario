package Biblioteca.test;

import Biblioteca.src.Membro;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class MembroTest {

    @Test
    public void testGetId() {
        Membro membro = new Membro(1, "ian");
        assertEquals(1, membro.getId());
    }

    @Test
    public void testSetId() {
        Membro membro = new Membro(1, "ian");
        membro.setId(2);
        assertEquals(2, membro.getId());
    }

    @Test
    public void testGetNome() {
        Membro membro = new Membro(1, "ian");
        assertEquals("ian", membro.getNome());
    }

    @Test
    public void testSetNome() {
        Membro membro = new Membro(1, "ian");
        membro.setNome("johnatan");
        assertEquals("johnatan", membro.getNome());
    }

    @Test
    public void testMembroPegaEmprestado() {
        Membro membro = new Membro(1, "ian");
        membro.MembroPegaEmprestado("Livro 1");
        membro.MembroPegaEmprestado("Livro 2");
        List<String> livrosEmprestados = new ArrayList<>();
        livrosEmprestados.add("Livro 1");
        livrosEmprestados.add("Livro 2");
        assertEquals(livrosEmprestados, membro.getLivrosEmprestados());
    }

    @Test
    public void testMembroRetornaLivro() {
        Membro membro = new Membro(1, "ian");
        membro.MembroPegaEmprestado("Livro 1");
        assertTrue(membro.MembroRetornaLivro("Livro 1"));
        assertFalse(membro.MembroRetornaLivro("Livro 2"));
    }

    @Test
    public void testListarLivrosEmprestados() {
        Membro membro = new Membro(1, "João");
        membro.MembroPegaEmprestado("Livro 1");
        membro.MembroPegaEmprestado("Livro 2");
        assertEquals("João possui os seguintes livros emprestados:", membro.listarLivrosEmprestados());
    }
}
