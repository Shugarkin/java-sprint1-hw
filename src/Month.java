class MonthData {
    public inPutUser command = new inPutUser();
    public int[] monthDays = new int[30]; // массив для дней в месяце
    public int allStepsMonth() { // метод для общего кол шагов в месяце
        int allStM = 0;
        for (int i = 0; i < monthDays.length; i++) {
            allStM = allStM + monthDays[i];

        }
        return allStM;
    }

    public int maxSteps() { //метод для макс кол шагов
        int max = 0;
        for (int i = 0; i < monthDays.length; i++) {
            if (max < monthDays[i]) {
                max = monthDays[i];
            }
        }
        return max;
    }

    public int dayX(int i) { //возвращает кол шагов за определенный день

        return monthDays[i];
    }


    public void saveDayStep(int i) { // сохранение шагов
        System.out.println("Введите количество шагов");
        int newStepDay = command.inPut();
        while (newStepDay < 0) {
            System.out.println("Количество шагов не может быть отрицательным");
            newStepDay = command.inPut();
        }
        monthDays[i] = newStepDay;
    }


    public int monthLength() { // для длинны месяца
        int x = monthDays.length;
        return x;
    }

    public int bestSeries(int purposeOfSteps) { //метод для серии
        int maxSeries = 0;
        int[] dayGoal = new int[30];
        int x = 0;

        for (int i = 0; i < monthDays.length; i++) {

            if (monthDays[i] > purposeOfSteps) {
                maxSeries = maxSeries + 1;
            } else {
                if (maxSeries != 0) {
                    dayGoal[x] = maxSeries;
                    x = x + 1;
                    maxSeries = 0;
                }
            }

        }
        for (int i = 0; i < dayGoal.length; i++) {
            if (dayGoal[i] > maxSeries) {
                maxSeries = dayGoal[i];
            }
        }
        return maxSeries;
    }
}
