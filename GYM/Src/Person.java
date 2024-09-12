public abstract class Person {
    protected String name;
    protected enum Gender {Male , Female};
    public Gender gender;
    protected int age;
    public Person () {
        name = "Invail name";
        gender = gender.Male;
        age = 0;
    }
    public Person (String name) {
        this.name = name;
    }
    public Person (String name , Gender gender) {
        this.name = name;
        this.gender = gender;
    }
    public Person (String name , Gender gender , int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public void setName (String name) {
        this.name = name;
    }
    public String getName () {
        return this.name;
    }
    public void ShowDate(){
        System.out.println("Name is : " + this.name);
        System.out.println("Gender is : " + this.gender);
        System.out.println("Age is : " + this.age);
    }
}
