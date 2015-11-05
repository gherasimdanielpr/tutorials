package ntu.edu.exercitii.cinci.cinci1;

/**
 * Created by daniel.gherasim on 10/30/2015.
 */
public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer("Gheorghe");
        customer.setMemberype("Premium");
        customer.setMember(true);
        System.out.println(customer);
        double discount = new DiscountRate().getServiceDiscountRate(customer.getMemberype());
        System.out.println("discount:"+discount);


    }
}
