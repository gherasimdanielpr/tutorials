package magda.EmployeeDB;

/**
 * Created by daniel.gherasim on 10/23/2015.
 */
public class Person {
    private String nume;
    private String prenume;
    private int age;
    private String dataNasterii;
    private String skills;

    public Person(String nume, String prenume, int age, String dataNasterii, String skills) {
        this.nume = nume;
        this.prenume = prenume;
        this.age = age;
        this.dataNasterii = dataNasterii;
        this.skills = skills;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDataNasterii() {
        return dataNasterii;
    }

    public void setDataNasterii(String dataNasterii) {
        this.dataNasterii = dataNasterii;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", age=" + age +
                ", dataNasterii='" + dataNasterii + '\'' +
                ", skills='" + skills + '\'' +
                '}';
    }
}
