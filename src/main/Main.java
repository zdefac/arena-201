package main;

import main.model.personagem.concreto.Guerreira;
import main.utils.Input;

public class Main {
    public static void main (String[] args) {

        Guerreira g1 = new Guerreira(Input.st("Nome da Guerreira: "));

        g1.receberDano(20);
        System.out.println("Vida de " + g1.getNome() + ": " + g1.getVida());

        System.out.println(g1.defender(20));
        System.out.println("Vida de " + g1.getNome() + ": " + g1.getVida());

    }
}
