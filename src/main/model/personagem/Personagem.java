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
}
