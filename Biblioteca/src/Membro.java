package Biblioteca.src;

import java.util.ArrayList;
import java.util.List;

public class Membro {
	 private int id;
	    private String nome;
	    private List<String> livrosEmprestados;

	    public Membro(int id, String nome) {
	        this.id = id;
	        this.nome = nome;
	        this.livrosEmprestados = new ArrayList<>();
	    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void CriarMembro(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public void MembroPegaEmprestado(String livro) {
        livrosEmprestados.add(livro);
    }
//Se o livro estiver dentro da lista "livrosEmprestados" remova o da lista e o retorne como livro delvolvido, se não o livro não foi emprestado
    public void MembroRetornaLivro(String livro) {
        if (livrosEmprestados.contains(livro)) {
            livrosEmprestados.remove(livro);
            System.out.println(livro + "foi delvido pelo membro:" + nome);
        } else {
            System.out.println(nome + " não possui este livro emprestado: " + livro);
        }
    }
//listar todos os livros que um membro pode ter emprestado
    public List<String> listarLivrosEmprestados() {
        return livrosEmprestados; 
    }  

	public List<String> getLivrosEmprestados() {
        return livrosEmprestados;
    }
	

}



