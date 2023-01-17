import java.util.Random;

public class Grandfather {
    private int age;

    private String name;
    private Hobby hobby;

    public Grandfather(int age, String name, Hobby hobby) {
        this.age = age;
        this.name = name;
        this.hobby = hobby;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Hobby getHobby() {
        return hobby;
    }


    public String getInfo(){
    return "Age: " + age +
           " Name: " + name +
            " Hobby: " + hobby;
    }
}
