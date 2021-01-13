package employeeApp;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Jordan", "Hanson", 97000, true, 152, 172);
        Company company1 = new Company("SpeedCoding", 3000);
        Healthplan healthplan1 = new Healthplan("Blue Cross");
        System.out.println("Hello Java");
        System.out.println(emp1);
        System.out.println(company1);
        System.out.println(healthplan1);
    }
}