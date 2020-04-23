package ru.job4j.converter;

/** Converter.
 *
 * @autor Evgeniy Lymar
 */
public class Converter {
    /**
     * Method rubleToEuro.
     * @param value amount of Rubles.
     * @return Rubles to Euro.
     */
        public static int rubleToEuro(int value) {
            int result = value / 70;
            return result;
        }

    /**
     * Method rubleToDollar.
     * @param value amount of Rubles.
     * @return Rubles to Dollar.
     */
        public static int rubleToDollar(int value) {
            int result = value / 60;
            return result;
        }

    /**
     * Method main
     * @param args - args.
     */
        public static void main(String[] args) {
            int euro = Converter.rubleToEuro(140);
            int dollar = Converter.rubleToDollar(180);
            System.out.println("140 rubles are " + euro + " toEuro.");
            System.out.println("180 rubles are " + dollar + " dollar.");
            int in = 140;
            int in1 = 180;
            int expected = 2;
            int expect = 3;
            int toEuro = rubleToEuro(in);
            int toDollar = rubleToDollar(in1);
            boolean passed = expected == toEuro;
            boolean pass = expect == toDollar;
            System.out.println("140 rubles are 2. Test result : " + passed);
            System.out.println("180 rubles are 3. Test result : " + pass);
         }
    }
