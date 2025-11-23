package Constructor;

public class Main {
    public static void main(String[] args) {
        Person builderPerson = new Person.Builder("쫑이").age(20).gender("M").height(180).build();
        System.out.println(builderPerson.toString());
    }
}
