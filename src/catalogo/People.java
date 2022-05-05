package catalogo;

import java.util.Date;

public class People {
    String name;
    Date birthday;
    Birthplace birthplace;

    public People(String name, Date birthday, Birthplace birthplace) {
        this.name = name;
        this.birthday = birthday;
        this.birthplace = birthplace;
    }

    public People(String name, int year, int month, int day, String city, String state, String country) {
        Date birthday = new Date(year, month, day);
        Birthplace birthplace = new Birthplace(city, state, country);

        this.name = name;
        this.birthday = birthday;
        this.birthplace = birthplace;
    }
}
