package main.model.personagem;

public class Personagem {
    protected String nome;
    protected int vida = 100;

    public Personagem (String nome) {
        this.nome = nome;
    }

    public void receberDano(int dano) {
        vida = vida - dano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
