package Constructor;

public class Person {
    //미리 만들어놓은 기본 객체
    static Person man = new Person("익명",0, "M",0, 0, false);
    static Person female = new Person("익명", 0,"F",0, 0, false);
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

    //정적 팩토리 메소드
    public static Person ofAgeMan(String name, int age) {
        return new Person(name, age, "M", 0, 0, false);
    }
    //새로운 형태를 만들기 위해서는 메소드를 아래와 같이 추가해야만 한다
    public static Person ofAgeMarriedWoman(String name, int age) {
        return new Person(name, age, "F", 0, 0, true);
    }

    //객체를 새로 만들기 않고 기존에 만든 객체를 가져오고 싶을때는 메소드를 아래와 같이 구현하면된다.
    public static Person getMan() {
        return man;
    }

    public static Person getFemale() {
        return female;
    }

    public Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.weight = builder.weight;
        this.height = builder.height;
        this.gender = builder.gender;
        this.isMarried = builder.isMarried;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", isMarried=" + isMarried +
                '}';
    }

    public static class Builder {
        String name;
        int age;
        String gender;
        int weight;
        int height;
        boolean isMarried;

        public Builder(String name) {
            this.name = name;
        }

        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder weight(int weight) {
            this.weight = weight;
            return this;
        }

        public Builder height(int height) {
            this.height = height;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder age(boolean isMarried) {
            this.isMarried = isMarried;
            return this;
        }

        public Person build() { // build 함수에서  현재 데이터를 이용하여 Person 객체를 생성하고  리턴
            return new Person(this);
        }
    }
}
