package labWork1;

class Person {
    private Gender gender;

    public Person(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }
    public String toString() {
        return gender == Gender.BOY ? "B" : "G";
    }
}


