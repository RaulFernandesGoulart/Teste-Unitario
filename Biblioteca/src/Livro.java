package Biblioteca.src;
import java.util.ArrayList;
import java.util.List;

public class Livro {
    private static ArrayList<Livro> list = new ArrayList<Livro>();
    private int id;
    private String titulo = "";
    private String autor = "";
    private boolean emprestado;

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getId() {
        return id;
    }
    public String getTitulo() {
        return titulo;
    }
    public boolean getEmprestado() {
        return emprestado;
    }
    public static Livro novoLivro (int id, String titulo, String autor, boolean emprestado){
        Livro livro = new Livro();
        livro.setId(id);
        livro.setAutor(autor);
        livro.setTitulo(titulo);
        livro.setEmprestado(emprestado);
        list.add(livro);
        return livro;
    }
}