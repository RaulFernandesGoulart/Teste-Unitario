# Teste-Unitario
Temos um sistema de biblioteca da PUC MG e queremos testar esse sistema.   
Imagine um sistema básico de biblioteca que permite registrar livros, emprestar livros para membros e retornar livros.

## Classes Principais:

Livro: Tem atributos como id, titulo, autor e emprestado.
Membro: Tem atributos como id, nome e livrosEmprestados.
Biblioteca: Tem métodos para registrarLivro(Livro livro), emprestarLivro(int livroId, int membroId) e retornarLivro(int livroId, int membroId).
