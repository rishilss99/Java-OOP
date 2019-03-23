import java.util.Date;

public class Entrypoint {
    public  static void main(String[] args){

        Date date1 = new Date(118,11,12);

        Date date2 = date1;
        date2.setYear(116);

        String s1 = "Hey there";

        String s2 = s1;
        s2 = "How you doing";

        System.out.println(date1);
        System.out.println(s1);


        String s = "Hello World";
        s += "Java";
        System.out.println(s);

    }
}
