import java.util.regex.Pattern;

public class Account {

    private final String name;

    private final Pattern pattern = Pattern.compile("(?=(^\\S+\\s\\S+$))(.{3,19})");

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */

        return name!=null && pattern.matcher(name).matches();

    }
}