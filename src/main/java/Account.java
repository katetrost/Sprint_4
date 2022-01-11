import java.util.regex.Pattern;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */

        return name!=null &&
                name.length() >= 3 &&
                name.length() <= 19 &&
                Pattern.matches("\\S+\\s\\S+",name); // проверка на наличие одного пробела и пробелов в начале и в конце, что их нет.
    }

}