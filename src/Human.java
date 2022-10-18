import java.util.Calendar;

public class Human {

    String name;
    String town;
    int yearOfBirth;
    String job;
    Calendar calendar = Calendar.getInstance();

    Human (String name, String town, int yearOfBirth, String job) {
        this.name = name;
        this.town = town;
        this.yearOfBirth = yearOfBirth;
        this.job = job;
    }

    void printHuman() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town +
                ". Я родился в " + (calendar.get(Calendar.YEAR) - yearOfBirth) +
                " году. Я работаю на должности " + job + ". Будем знакомы!");
    }

}
