package E04InterfacesAndAbstraction.P03_BirthdayCelebrations;

public class Citizen implements Person, Identifiable, Birthable {

    private String name;
    private int age;
    private String id;
    private String birthDate;


    public Citizen(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getBirthDate() {
        return this.birthDate;
    }

    @Override
    public String toString() {
        return String.format("Citizen: %s, age: %d, id: %s, date of birth: %s", name, age, id, birthDate);
    }
}
