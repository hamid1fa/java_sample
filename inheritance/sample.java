import java.lang.String;
import java.util.Date;

class Doctor {

    private String name;
    private int age;
    private Date enrollDate;


    public Doctor(String name, int age, Date enrollDate) {
        this.name = name;
        this.age = age;
        this.enrollDate = enrollDate;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Date getEnrollDate() {
        return enrollDate;
    }

    protected void details() {
        System.out.println(name + ", " + age + ", " + enrollDate);
    }

}

class Surgeon extends Doctor {

    private String specialist;

    public Surgeon(String name, int age, Date enrollDate, String specialist) {
        super(name, age, enrollDate);
        this.specialist = specialist;
    }

    
    protected void details() {
        super.details();
        System.out.println(specialist);
    }
}

class Physiotherapist extends Doctor {

    private String type;

    public Physiotherapist(String name, int age, Date enrollDate, String type) {
        super(name, age, enrollDate);
        this.type = type;
    }

    protected void details() {
        super.details();
        System.out.println(type);
    }
}

public class sample {

    public static void knowDetails(Doctor doctor) {
        doctor.details();
    }

    public static void main(String args[]) {
        Surgeon s = new Surgeon("a", 30, new Date(), "Cancer");
        knowDetails(s);

        Physiotherapist p = new Physiotherapist("b", 35, new Date(), "hand");
        knowDetails(p);

    }
}