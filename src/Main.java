public class Main {
    public static void main(String[] args) {

            Father father = new Father(43,"Denis",Hobby.READ_A_BOOK,"Air traffic controller",
                    Hobby.DO_EXERCISES);
            System.out.println(father.getInfo());
            father.makeVoice();

            Son son = new Son(16, "Max",Hobby.DRAW, "Artist", "Student",Hobby.DRAW);
            System.out.println(son.getInfo());
            son.makeVoice();
        
    }
}