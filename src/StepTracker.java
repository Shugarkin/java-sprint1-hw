public class StepTracker {
    inPutUser command = new inPutUser();
    int purposeOfSteps = 10000;
    MonthData[] monthToData;

    public StepTracker() {
        monthToData = new MonthData[12];
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    void newPurposeOfSteps() { //новая цель для шагов
        int newPurposeOfSteps = 0;
        System.out.println("Введите новую цель по количеству шагов в день:");
        newPurposeOfSteps = command.inPut();
        while (newPurposeOfSteps <= 0) {
            System.out.println("Количество шагов не может быть отрицательным");
            newPurposeOfSteps = command.inPut();
        }
        purposeOfSteps = newPurposeOfSteps;
    }

    public void saveDays() {// метод для ввода шагов определенный день

        System.out.println("Введите номер месяца в котором добавляется количество пройденных шагов");
        System.out.println("от 1 до 12, где январь - 1, а декабрь 12)");
        int month = command.inPut() - 1;
        while ((month < 0) || (month > 12)) {
            System.out.println("Введите значение в диапазоне 1-12");
            month = command.inPut() - 1;
        }
        System.out.println("Введите день за который необходимо ввести данные");
        System.out.println("(от 1 до 30)");
        int day = command.inPut() - 1;
        while ((day < 0) || (day > 30)) {
            System.out.println("Введите значение в диапазоне 1-30");
            day = command.inPut() - 1;
        }
        monthToData[month].saveDayStep(day);
    }


    void statictic() { //статистика
        double allDis = 0;
        double allKKal = 0;
        int month = 0;
        int day = 0;

        System.out.println("Введите номер месяца за который необходимо вывести статистику");
        System.out.println("от 1 до 12, где январь - 1, а декабрь 12)");
        month = command.inPut() - 1;
        while ((month < 0) || (month > 11)) {
            System.out.println("Введите значение в диапазоне 1-12");
            month = command.inPut() - 1;
        }
        Converter convert = new Converter();
        for (day = 0; day < 30; day++) {
            int stepDay = monthToData[month].dayX(day);
            System.out.print((day + 1) + " день: " + stepDay + ", ");

            allDis = allDis + convert.convertDist(stepDay);
            allKKal = allKKal + convert.convertKkal(stepDay);


        }
        System.out.println();
        int allMonth = monthToData[month].allStepsMonth();

        System.out.println("Общее количество шагов за месяц: " + allMonth);
        System.out.println("Максимальное количество шагов в месяце: " + monthToData[month].maxSteps());
        System.out.println("Среднее количество шагов в месяце: " + allMonth / monthToData[month].monthLength());
        System.out.println("Пройденная дистанция: " + allDis + "км");
        System.out.println("Сожженые калории: " + allKKal + "ккал");
        System.out.println("Лучшая серия: " + monthToData[month].bestSeries(purposeOfSteps));
        System.out.println();
    }

}
