package com.kodilla.rps;

import com.kodilla.rps.movement.MovementByKey;
import com.kodilla.rps.movement.MovementRandom;
import com.kodilla.rps.player.PlayerImp;

import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args) {
/*
klawisz 1 - zagranie "kamień", klawisz 2 - zagranie "papier", klawisz 3 - zagranie "nożyce",
klawisz x - zakończenie gry, poprzedzone pytaniem "Czy na pewno zakończyć grę?",
klawisz n - uruchomienie gry od nowa, poprzedzone pytaniem "Czy na pewno zakończyć aktualną grę?",
 */
        // Czy na pewno zakończyć grę?
        //Czy na pewno zakończyć aktualną grę?


        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj imię: ");
        System.out.println("Podaj liczbę wygranych rund po których następuje zwycięstwo: ");

        System.out.println(
                "Obsługa gry:\n" +
                        "klawisz 1 - zagranie \"kamień\",\n" +
                        "klawisz 2 - zagranie \"papier\",\n" +
                        "klawisz 3 - zagranie \"nożyce\",\n" +
                        "klawisz x - zakończenie gry\n" +
                        "klawisz n - uruchomienie gry od nowa"
        );

        String userName = "Player A";

        RpsGame rpsGame = new RpsGame(
                new PlayerImp("Computer", new MovementRandom()),
                new PlayerImp(userName, new MovementByKey())
        );

        rpsGame.start();


    }

}
