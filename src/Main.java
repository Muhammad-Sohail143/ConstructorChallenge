// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Sohail",1000,"qwer@haj.com");
        System.out.println("Name: " + customer.getName() +
                " Credit Limit: " + customer.getCreditLimit() +
                " email: " + customer.getEmailAddress());
        Customer customer1 = new Customer();
        System.out.println("Name: " + customer1.getName() +
                " Credit Limit: " + customer1.getCreditLimit() +
                " email: " + customer1.getEmailAddress());
        Customer customer2 = new Customer("khan","khan.com");
        System.out.println("Name: " + customer2.getName() +
                " Credit Limit: " + customer2.getCreditLimit() +
                " email: " + customer2.getEmailAddress());

    }
}