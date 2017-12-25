package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {

    public static void main(String[] args) {
/*

        Processor processor = new Processor();
        // ExecutorSaySamothing executorSaySamothing = new ExecutorSaySamothing();

        Executor codeToExecute = () -> System.out.println("This is lambda text.");
        processor.execute(codeToExecute);

        codeToExecute = () -> System.out.println("This is another lambda text.");
        processor.execute(codeToExecute);

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);


        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

*/

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


        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

    }
}
