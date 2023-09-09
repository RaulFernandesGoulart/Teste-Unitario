package Biblioteca.src;

public class Membro {
    private int id;
    private String nome = "";
    private int livrosEmprestados;

    public void setId(int id) {
        this.id = id;
    }
    public void setLivrosEmprestados(int livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getId() {
        return id;
    }
    public int getLivrosEmprestados() {
        return livrosEmprestados;
    }
    public String getNome() {
        return nome;
    }
    public static Membro novoMembro (int id, String nome, int livrosEmprestados){
        Membro membro = new Membro();
        return membro;
    }
}
