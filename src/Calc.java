public class Calc {
        public Drob sum(Drob first, Drob second) {
            int numerator = first.getNumerator() * second.getDenominator() + second.getNumerator() * first.getDenominator();
            int denominator = first.getDenominator() * second.getDenominator();

            return new Drob(numerator, denominator);
        }

        public Drob minus(Drob first, Drob second) {
            int numerator = first.getNumerator() * second.getDenominator() - second.getNumerator() * first.getDenominator();
            int denominator = first.getDenominator() * second.getDenominator();

            return new Drob(numerator, denominator);
        }

        public Drob times(Drob first, Drob second) {
            int numerator = first.getNumerator() * second.getNumerator();
            int denominator = first.getDenominator() * second.getDenominator();

            return new Drob(numerator, denominator);
        }

        public Drob divide(Drob first, Drob second) {
            int numerator = first.getNumerator() * second.getDenominator();
            int denominator= first.getDenominator() * second.getNumerator();

            return new Drob(numerator, denominator);
        }

}
