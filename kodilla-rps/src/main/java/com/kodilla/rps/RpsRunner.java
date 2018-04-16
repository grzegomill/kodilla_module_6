package com.kodilla.rps;

import com.kodilla.rps.movement.InputFromKeyboard;

public class RpsRunner {


    public static void main(String[] args) {

        InputFromKeyboard input = new InputFromKeyboard();

        String name = input.getString("Podaj imię: ");

        int count = input.getInt("Podaj liczbę wygranych rund po których następuje zwycięstwo: ");


        System.out.println(
                "Obsługa gry:\n" +
                        "klawisz 1 - zagranie \"kamień\",\n" +
                        "klawisz 2 - zagranie \"papier\",\n" +
                        "klawisz 3 - zagranie \"nożyce\",\n" +
                        "klawisz x - zakończenie gry\n" +
                        "klawisz n - uruchomienie gry od nowa"
        );




    /*    RpsGame rpsGame = new RpsGame(
                new PlayerImp("Computer", new MovementRandom()),
                new PlayerImp(userName, new MovementByKey())
        );

        rpsGame.start();*/


    }


}
