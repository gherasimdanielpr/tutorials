package ntu.edu.exercitii.cinci.cinci1;

/**
 * Created by daniel.gherasim on 10/30/2015.
 */
public class Customer {
    private String name;
    private boolean member;
    private String membetype;

    public Customer(String name) {
        this.name = name;

    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", member=" + member +
                ", memberype='" + membetype + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public String getMemberype() {
        return membetype;
    }

    public void setMemberype(String memberype) {
        this.membetype = memberype;
    }
}
