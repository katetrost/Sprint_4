import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountTest {

    // создали поля тестового класса
    private final String name;
    private final boolean expected;

    // создали конструктор тестового класса
    public AccountTest(String name, boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    // передали тестовые данные
    @Parameterized.Parameters
    public static Object[] getName() {
        return new Object[][] {
                { "Тимоти Шаламе", true},
                { "Т Ш", true}, // длина строки 3 символа
                { "Екатерина Тростянск", true}, // длина строки 19 символов
                { "Екатерина Тростянская", false}, // длина строки больше 19 символов
                { "Ти", false}, // длина строки меньше 3 символов
                { " ", false},
                { "", false}, // пустая строка
                { null, false}, // значение null
                { "ТимотейШевроле", false}, // нет хотя бы 1 пробела
                { " Тимоти Шаламе", false}, // пробел в начале строки
                { "Тимоти Шаламе ", false}, // пробел в конце строки
                { "Тимотей   Шевроле", false}, // два пробела в середине
        };
    }

    @Test
    public void checkingNameForCorrectness() {
        Account account = new Account(name);
        boolean actual = account.checkNameToEmboss();
        assertEquals(expected, actual); // сравнили ожидаемый и фактический результат
    }
}
