package Constructor;

public class Person {
    //미리 만들어 놓은 기본 객체
    static Person man = new Person("익명", 0, "M", 0, 0, false);
    static Person female = new Person("익명", 0, "F", 0, 0, false);

    String name;
    int age;
    String gender;
    int weight;
    int height;
    boolean isMarried;

    public Person(String name, int age, String gender, int weight, int height, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
        this.isMarried = isMarried;
    }

    public static Person ofAgeMan(String name, int age) {
        return new Person(name, age, "M", 0, 0, false);
    }

    public static Person ofAgeMarriedWoman(String name, int age) {
        return new Person(name, age, "F", 0, 0, true);
    }

    public static Person getMan() {
        return man;
    }

    public static Person getFemale() {
        return female;
    }
}
