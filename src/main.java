import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {

        People p1 = new People("asdasd","asdasd");
        People.showpeoplelist();
        p1.setnameLastname("jfdjkdf","h473h");
        People.showpeoplelist();
        People p2 = new People("asdasd","asdasd");
        People.showpeoplelist();
        People p3 = new People("jfdjkdf","h473h");
        People.showpeoplelist();
        p1.getnameLastname();
        p2.getnameLastname();
        p3.getnameLastname();
        //System.out.println(p1.hashCode()+" "+p2.hashCode()+" "+p3.hashCode());

        p1.serialize();
        p2.serialize();
        p3.serialize();


        System.out.println("p1="+p1.hashCode()+" p2="+ p2.hashCode()+" p3="+ p3.hashCode());
        System.out.println(p1.equals(p1));
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));

    }

}
