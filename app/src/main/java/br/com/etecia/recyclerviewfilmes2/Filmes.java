package br.com.etecia.recyclerviewfilmes2;

public class Filmes {
    private String titulo;
    private String descricao;
    private String categoria;
    private int imagem;

    public Filmes(String titulo, String descricao, String categoria, int imagem){
        this.titulo = titulo;
        this.descricao = descricao;
        this.categoria = categoria;
        this.imagem = imagem;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getImagem() {
        return imagem;
    }
}
