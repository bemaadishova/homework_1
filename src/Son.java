final public class Son extends Father{
    private String position;
    private Hobby hobby;

    public Son(int age, String name, Hobby hobby, String work, String position, Hobby hobby1) {
        super(age, name, hobby, work, hobby1);
        this.position = position;
        this.hobby = hobby1;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public Hobby getHobby() {
        return hobby;
    }

    public String getInfo(){
        return "Position: " + position +
                "\nHobby:" + hobby;
    }


}
