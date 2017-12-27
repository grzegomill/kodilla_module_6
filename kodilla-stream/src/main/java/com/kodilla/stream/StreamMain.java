package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {

    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("TEXT TO BEAUTIFY", (text) -> ">>" + text.toLowerCase() + "<<<");

        poemBeautifier.beautify("text to upper", (text) -> text.toUpperCase());

        poemBeautifier.beautify("jAN jaKub koWalski",

                (text) ->
                {
                    String firstLetter, strText, phrase = "";
                    String[] words = text.toLowerCase().split(" ");
                    for (String word : words) {
                        firstLetter = word.substring(0, 1);
                        strText = word.replaceFirst(firstLetter, firstLetter.toUpperCase());
                        phrase = (phrase == "") ? strText : phrase + " " + strText;
                    }
                    return phrase;
                }

        );


    }
}
