package Biblioteca.src;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    private List<Membro> membros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.membros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void adicionarMembro(Membro membro) {
        membros.add(membro);
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public List<Membro> getMembros() {
        return membros;
    }

    public boolean emprestarLivro(int livroId, int membroId) {
        Livro livro = encontrarLivroPorId(livroId);
        Membro membro = encontrarMembroPorId(membroId);

        if (livro != null && membro != null && !livro.getEmprestado()) {
            livro.setEmprestado(true);
            membro.MembroPegaEmprestado(livro.getTitulo());
            return true;
        }

        return false;
    }

    public boolean retornarLivro(int livroId, int membroId) {
        Livro livro = encontrarLivroPorId(livroId);
        Membro membro = encontrarMembroPorId(membroId);

        if (livro != null && membro != null && livro.getEmprestado() && membro.getLivrosEmprestados().contains(livro.getTitulo())) {
            livro.setEmprestado(false);
            membro.MembroRetornaLivro(livro.getTitulo());
            return true;
        }

        return false;
    }

    private Livro encontrarLivroPorId(int livroId) {
        for (Livro livro : livros) {
            if (livro.getId() == livroId) {
                return livro;
            }
        }
        return null;
    }

    private Membro encontrarMembroPorId(int membroId) {
        for (Membro membro : membros) {
            if (membro.getId() == membroId) {
                return membro;
            }
        }
        return null;
    }
}
