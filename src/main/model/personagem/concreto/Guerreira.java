package main.model.personagem.concreto;

import main.model.personagem.Personagem;

public class Guerreira extends Personagem {
    private int escudo = 3;

    public Guerreira(String nome) {
        super(nome);
    }

    public String defender (int dano) {

        if (escudo > 0) {
            escudo -= 1;
            return nome + " defende!";
        } else if (escudo == 1) {
            escudo =- 1;
            return nome + " defende! O escudo de " + nome + " quebrou.";
        }

        receberDano(dano);
        System.out.println("O escudo de " + nome + " está quebrado! ");

        return nome + " tomou " + dano + " pontos de dano. ";
    }
}
