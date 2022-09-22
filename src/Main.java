public class Main {
    public static void main(String[] args) {

        float gramsPerKilogram = 1000f;
        float weightInKilos = 7f;
        float twoHundredAndFiftyGramsPerDay = 250f;
        float fiveHundredGramsPerDay = 500f;

        float daysIfTwoHundredAndFiftyGrams = (gramsPerKilogram * weightInKilos) / twoHundredAndFiftyGramsPerDay;
            System.out.println("Если худеть на " + twoHundredAndFiftyGramsPerDay + " грамм в день потребуется " + daysIfTwoHundredAndFiftyGrams + " дней, чтобы похудеть на " + weightInKilos + " килограмм");

        float daysIfFiveHundredGramsPerDay = (gramsPerKilogram * weightInKilos) / fiveHundredGramsPerDay;
            System.out.println("Если худеть на " + fiveHundredGramsPerDay + " грамм в день потребуется " + daysIfFiveHundredGramsPerDay + " дней, чтобы похудеть на " + weightInKilos + " килограмм");

        float averageDaysToLoseWeight= (daysIfFiveHundredGramsPerDay + daysIfTwoHundredAndFiftyGrams) / 2;
            System.out.println("В среднем потребуется " + averageDaysToLoseWeight + " день, чтобы похудеть " + weightInKilos + " килограмм");

            // task 7 complete
    }
}