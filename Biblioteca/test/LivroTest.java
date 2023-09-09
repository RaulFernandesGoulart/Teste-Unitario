package Biblioteca.test;
import Biblioteca.src.Livro;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.*;

public class LivroTest {
    Livro livro = new Livro();
    private static ArrayList<Livro> list = new ArrayList<Livro>();


    @Test
    public void testCriarLivro() {
        livro.setId(111);
        livro.setAutor("Rick Riordan");
        livro.setTitulo("Percy Jackson E O Ladrao De Raios");
        livro.setEmprestado(false);
        list.add(livro);

    }
    
    @Test
    public void testEmprestarLivro() {
        livro.setId(111);
        livro.setAutor("Rick Riordan");
        livro.setTitulo("Percy Jackson E O Ladrao De Raios");
        livro.setEmprestado(false);
        list.add(livro);
    }

    @Test
    public void testRetornarLivro() {
        livro.setId(111);
        livro.setAutor("Rick Riordan");
        livro.setTitulo("Percy Jackson E O Ladrao De Raios");
        livro.setEmprestado(true);        
        list.add(livro);
    }
}
