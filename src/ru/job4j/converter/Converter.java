

/** Converter.
 *
 * @autor Evgeniy Lymar
 */
package ru.job4j.converter;

public class Converter {
    /**
     * Method rubleToEuro.
     * @param value amount of Rubles.
     * @return Rubles to Euro.
     */
        public static int rubleToEuro(int value) {
            int rsl = value / 70;
            return rsl;
        }

    /**
     * Method rubleToDollar.
     * @param value amount of Rubles.
     * @return Rubles to Dollar.
     */
        public static int rubleToDollar(int value) {
            int rsl = value / 60; // формула перевода рублей в доллоры.
            return rsl;
        }

    /**
     * Method main
     * @param args - args.
     */
        public static void main(String[] args) {
            int euro = Converter.rubleToEuro(140);
            int dollar = Converter.rubleToDollar(180);
            System.out.println("140 rubles are " + euro + " euro.");
            System.out.println("180 rubles are " + dollar + " dollar.");
            int in = 140;
            int in1 = 180;
            int expected = 2;
            int experced1 = 3;
            int out = rubleToEuro(in);
            int out1 = rubleToDollar(in1);
            boolean passed = expected == out;
            boolean passed1 = experced1 == out1;
            System.out.println("140 rubles are 2. Test result : " + passed);
            System.out.println("180 rubles are 3. Test result : " + passed1);
         }
    }
