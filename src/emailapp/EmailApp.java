package emailapp;

public class EmailApp {
    public static void main(String[] args){

        Email em1 = new Email("Krzysztof","Kaminski");

        em1.setAlternateEmail("kk@gmail.com");
        System.out.println(em1.getAlternateEmail());

    }
}
