package Model;

public class Student {
  String name;
  int age;
  int registration;
    public Student(String name, int age, int registration) {
        this.name = name;
        this.age = age;
        this.registration = registration;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRegistration() {
        return registration;
    }

    @Override
    public String toString() {
        return "student characteristics are " +
                "name is: '" + name + '\'' +
                ", age is:  " + age +
                ", registration is: " + registration
                ;
    }
}
