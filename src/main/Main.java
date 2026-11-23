package main;

import main.model.personagem.concreto.Guerreira;
import main.utils.Input;

public class Main {
    public static void main (String[] args) {

        Guerreira g1 = new Guerreira(Input.st("Nome da Guerreira: "));
        g1.receberDano(20);

        g1.defender(20);

    }
}
