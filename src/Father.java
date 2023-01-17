public class Father extends Grandfather {
    private String work;
    private Hobby hobby;

    public Father(int age, String name, Hobby hobby, String work, Hobby hobby1) {
        super(age, name, hobby);
        this.work = work;

    }


    public String getWork() {
        return work;
    }

    @Override
    public Hobby getHobby() {
        return hobby;
    }

    public final void makeVoice(){
        System.out.println("Hello!");
    }
    public  void makeVoice(String voice){
        System.out.println(voice);
    }
    public String getInfo(){
        return "Work: " + work +
                "\nHobby: " + hobby;
    }
}
