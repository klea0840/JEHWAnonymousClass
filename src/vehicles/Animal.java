package vehicles;

public enum Animal {

    TIGER(8), PUMA(2), LINX(5);

    int age;

    Animal(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "My cat is " + super.toString() + " and it is " + getAge() + " years old";
    }
}
