public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание №3");

        //Task 1
        byte thisByte = 100;
        short thisShort = 1000;
        int thisInt = 100000;
        long thisLong = 10000000000L;
        float thisFloat = 1.1234567f;
        double thisDouble = 1.1234567890123456;
        System.out.println(
                "Задача №1:" + "\n" +
                "Значение переменной thisByte с типом byte равно " + thisByte + "\n" +
                "Значение переменной thisByte с типом short равно " + thisShort + "\n" +
                "Значение переменной thisByte с типом int равно " + thisInt + "\n" +
                "Значение переменной thisByte с типом long равно " + thisLong + "\n" +
                "Значение переменной thisByte с типом float равно " + thisFloat + "\n" +
                "Значение переменной thisByte с типом double равно " + thisDouble
        );

        //Task 2
        float goFloat = 27.12f;
        long goLong = 987678965549L;
        float goFloat2 = 2.786f;
        short goShort = 569;
        short goShort2 = -159;
        short goShort3 = 27897;
        byte goByte = 67;
        System.out.println(
                "Задача №2:" + "\n" +
                "Значение " + goFloat + " относится к типу float" + "\n" +
                "Значение " + goLong + " относится к типу long" + "\n" +
                "Значение " + goFloat2 + " относится к типу float" + "\n" +
                "Значение " + goShort + " относится к типу short" + "\n" +
                "Значение " + goShort2 + " относится к типу short" + "\n" +
                "Значение " + goShort3 + " относится к типу short" + "\n" +
                "Значение " + goByte + " относится к типу byte"
        );

        //Task3
        byte lPavlovna = 23;
        byte aSergeevna = 27;
        byte eAndreevna = 30;
        short totalPaper = 480;
        int forOneStudents = totalPaper / (lPavlovna + aSergeevna + eAndreevna);
        System.out.println("Задача №3:" + "\n" + "На каждого ученика рассчитано " + forOneStudents + " листов бумаги");

        //Task 4
        byte machineFor2Min = 16;
        int machineForOneMin = machineFor2Min / 2;
        int machineFor20Min = machineForOneMin * 20;
        int machineFor24Hours = (24 * 60) * machineForOneMin;
        int machineFor3Days = machineFor24Hours * 3;
        int machineFor1Month = machineFor3Days * 10;
        System.out.println(
                "Задача №4:" + "\n" +
                "Если машина изготавливает " + machineFor2Min + " бутылок за 2 минуты, то: " + "\n" +
                "За 20 минут машина произвела " + machineFor20Min + " штук бутылок" + "\n" +
                "За 24 часа машина произвела " + machineFor24Hours + " штук бутылок" + "\n" +
                "За 3 дня машина произвела " + machineFor3Days + " штук бутылок" + "\n" +
                "За 1 месяц (при условии если месяц это 30 дней) машина произвела " + machineFor1Month + " штук бутылок"
        );

        //Task 5
        byte totalPaintCan = 120;
        byte whiteColorForOneClass = 2;
        byte brownColorForOneClass = 4;
        int totalClass = totalPaintCan / (whiteColorForOneClass + brownColorForOneClass);
        int totalWhitePaintCan = whiteColorForOneClass * totalClass;
        int totalBrownPaintCan = brownColorForOneClass * totalClass;
        System.out.println(
                "Задача №5:" + "\n" + "В школе, где " + totalClass + " классов, нужно " + totalWhitePaintCan + " банок белой краски и " + totalBrownPaintCan + " банок коричневой краски");

        //Task 6
        byte bananas = 5;
        byte oneBananas = 80;
        short totalMilk = 200;
        byte oneMilk = 105;
        byte iceCream = 2;
        byte oneiIceCream = 100;
        byte rawEggs = 4;
        byte oneRawEggs = 70;
        int totalGrams = (oneBananas * bananas) + (totalMilk / 100 * oneMilk) + (iceCream * oneiIceCream) + (rawEggs * oneRawEggs);
        float totalKgrams = totalGrams / 1000f;
        System.out.println("Задача №6:" + "\n" + "Количество граммов в спортзавтраке равно = " + totalGrams + " граммов" + "\n" + "Количество килограммов в спортзавтраке равно = " +totalKgrams + " килограммов");

        //Task 7
        byte weight = 7;
        int weightGrams = weight * 1000;
        short onePlan = 250;
        short twoPlan = 500;
        int averageValue = (onePlan + twoPlan) / 2;
        int totalOnePlan = weightGrams / onePlan;
        int totalTwoPlan = weightGrams / twoPlan;
        float averagePlan = (float) weightGrams / averageValue;
        System.out.println(
                "Задача №7:" + "\n" +
                "Чтобы похудеть на " + weight + " кг, с рационом похудения по " + onePlan + " граммов в день, нужно " + totalOnePlan + " дней" + "\n" +
                "Чтобы похудеть на " + weight + " кг, с рационом похудения по " + twoPlan + " граммов в день, нужно " + totalTwoPlan + " дней" + "\n" +
                "В среднем чтобы похудеть на " + weight + " кг, нужно " + averagePlan + " дней, при среднем значении рациона похудения в " + averageValue + " граммов в день"
        );

        //Task 8
        //Использую везде int так как суммы после действий остаются без запятой, нет нужды использовать float
        int salaryMasha = 67760;
        int salaryYearMasha = salaryMasha * 12;
        int newSalaryMasha = (salaryMasha * 110) / 100;
        int newSalaryYearMasha = newSalaryMasha * 12;
        int diffMasha = newSalaryYearMasha - salaryYearMasha;

        int salaryDenis = 83690;
        int salaryYearDenis = salaryDenis * 12;
        int newSalaryDenis = (salaryDenis * 110) / 100;
        int newSalaryYearDenis = newSalaryDenis * 12;
        int diffDenis = newSalaryYearDenis - salaryYearDenis;

        int salaryKristina = 76230;
        int salaryYearKristina = salaryKristina * 12;
        int newSalaryKristina = (salaryKristina * 110) / 100;
        int newSalaryYearKristina = newSalaryKristina * 12;
        int diffKristina = newSalaryYearKristina - salaryYearKristina;
        System.out.println(
                "Задача №8:" + "\n" +
                "Маша получала зарплату " + salaryMasha + " руб/мес, а теперь получает " + newSalaryMasha + " руб/мес. Годовой доход Маши был " + salaryYearMasha + " руб., а сейчас он вырос на " + diffMasha + " руб. и составляет " + newSalaryYearMasha + " руб/год" + "\n" +
                "Денис получал зарплату " + salaryDenis + " руб/мес, а теперь получает " + newSalaryDenis + " руб/мес. Годовой доход Дениса был " + salaryYearDenis + " руб., а сейчас он вырос на " + diffDenis + " руб. и составляет " + newSalaryYearDenis + " руб/год" + "\n" +
                "Кристина получала зарплату " + salaryKristina + " руб/мес, а теперь получает " + newSalaryKristina + " руб/мес. Годовой доход Кристины был " + salaryYearKristina + " руб., а сейчас он вырос на " + diffKristina + " руб. и составляет " + newSalaryYearKristina + " руб/год"
        );


    }
}