public class Main {
    public static void main(String[] args) {

        Human maksim = new Human("Максим", "Минск", 35,"бренд-менеджер");
        Human ania = new Human("Аня", "Москва", 29, "методист образовательных программ");
        Human katya = new Human("Катя", "Калининград", 28, "продакт-менеджер");
        Human artem = new Human("Артем", "Москва", 27, "директор по развитию бизнеса");

        System.out.println("Урок 2.1 ООП. Домашнее задание - 1 и 2.");
        printSeparator();

        maksim.printHuman();
        ania.printHuman();
        katya.printHuman();
        artem.printHuman();

        printSeparator();
    }

    private static void printSeparator() {
        System.out.println("-----------------------------------------------------------");
    }
}