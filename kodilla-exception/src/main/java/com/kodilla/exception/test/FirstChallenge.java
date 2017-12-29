package com.kodilla.exception.test;

public class FirstChallenge {

    /**
     * This main can throw an ArithmeticException!!!
     *
     * @param args
     */
    public static void main(String[] args) {

        int a = 3, b = 0;

        try {

            FirstChallenge firstChallenge = new FirstChallenge();

            double result = firstChallenge.divide(a, b);

            System.out.println(result);

        } catch (ArithmeticException e) {

            System.out.println("Niedozwolone dzielenie przez 0!");
        } finally {

            System.out.println("Koniec obliczeń.");
        }

    }

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }
}
