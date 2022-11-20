public class Main {
    public static void main(String[] args) {
        System.out.println("Приветствую вас!");
        printMenu();
        StepTracker userStep = new StepTracker();
        inPutUser command = new inPutUser();
        int userCommand = command.inPut();

        while (userCommand != 0) {// пока не введен 0
            if (userCommand == 1) {
                userStep.saveDays();// кол шагов
                printMenu();
                userCommand = command.inPut();
            } else if (userCommand == 2) {//статистика
                userStep.statictic();
                printMenu();
                userCommand = command.inPut();
            } else if (userCommand == 3) { //изменить цель шагов
                userStep.newPurposeOfSteps();
                printMenu();
                userCommand = command.inPut();
            } else {
                System.out.println("Выбирите значение в диапозоне 0-3");
                printMenu();
                userCommand = command.inPut();
            }
        }
        System.out.println("Программа завершена");
    }

    public static void printMenu() {

        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - Ввести количество шагов за определённый день");
        System.out.println("2 - Напечатать статистику за определённый месяц");
        System.out.println("3 - Изменить цель по количеству шагов в день");
        System.out.println("0 - Выйти из приложения");

    }
}
