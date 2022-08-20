public class Main {
    public static void main(String[] args) {

        // ЗАДАНИЕ 1
        int sugar = 3;
        System.out.println(sugar);
        byte box = 5;
        System.out.println(box);
        short banana = 76;
        System.out.println(banana);
        long cat = 105L;
        System.out.println(cat);
        float fish = 2.2f;
        System.out.println(fish);
        double man = 0.646466;
        System.out.println(man);

        //ЗАДАНИЕ 2

        float manOne = 78.2f;
        float manTwo = 82.7f;

        float manWeight = manOne + manTwo;
        System.out.println("общий вес бойцов" +  manWeight + "кг");
        float mansWeight = manOne - manTwo;
        System.out.println("разница в весе" +  mansWeight + "кг");

        //ЗАДАНИЕ 3

        int bananas = 5;
        int bananaWeight = bananas * 80;
        System.out.println("общий вес бананов" +  bananaWeight + "г" );

        int milk = 2;
        int milkWeight = milk * 105;
        System.out.println("общий вес молока" +  milkWeight + "г" );

        int iceСream = 2;
        int iceСreamWeight = iceСream * 100;
        System.out.println("общий вес мороженого" +  iceСreamWeight + "г" );

        int egg = 4;
        int eggWeight = egg * 70;
        System.out.println("общий вес яйц" +  eggWeight + "г" );

        int productsWeight = bananaWeight + milkWeight + iceСreamWeight + eggWeight;
        System.out.println("общий вес спорт завтрака" +  productsWeight + "г" );

         float productsWeightKg = productsWeight / 1000f;
        System.out.println("общий вес спорт завтрака" +  productsWeightKg + "кг" );


        //ЗАДАНИЕ 4

        float boyA = 7;
        float daysA = boyA / 0.25f;
        System.out.println("количство дней для достижения результата спортсмена при сбросе 250 г " +  daysA + "дней" );

        float boyB = 7;
        float daysB = boyB / 0.5f;
        System.out.println("количство дней для достижения результата спортсмена при сбросе 500 г " +  daysB + "дней" );

        float finishDays = (daysA + daysB) / 2f;
        System.out.println("количство дней со средним  достижением результата спортсмена при сбросе 250 г и 500 г  " +  finishDays + "дней" );

        //ЗАДАНИЕ 5

        int masha = 67760;
       float generalMasha = (masha *0.1f) + masha;
       float heightMasha = generalMasha -  masha;


        System.out.println("Маша теперь получает " + generalMasha + "Годовой доход вырос на" + heightMasha   );

        int denis = 83690;
        float generalDenis = (denis * 0.1f) + denis;
        float heightDenis = generalDenis - denis;


        System.out.println("Маша теперь получает " +   generalDenis + "Годовой доход вырос на" + heightDenis   );


        int kristina = 76230;
        float generalKristina = (kristina * 0.1f) + kristina;
        float heightKristina = generalKristina - kristina;


        System.out.println("Маша теперь получает " +    generalKristina + "Годовой доход вырос на" + heightKristina   );











    }
}