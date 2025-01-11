import java.util.ArrayList;
import java.util.Collections;
public class MyApplication {
    public static void main(String[] args) {
        Employee e1 = new Employee("John", "Lennon", "Manager", 27045.78);
        Employee e2 = new Employee("George", "Harrison", "Developer", 50000.00);
        Student s1 = new Student("Ringo", "Starr", 2.5);  // Not eligible for stipend
        Student s2 = new Student("Paul", "McCartney", 3.8); // Eligible for stipend
        ArrayList<Person> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(s1);
        list.add(s2);
        Collections.sort(list);
        printData(list);
    }
    public static void printData(Iterable<? extends IPayable> payables) {
        for (IPayable payable : payables) {
            if (payable instanceof Employee) {
                System.out.println(((Employee) payable).toString() + " earns " + payable.getPaymentAmount() + " tenge");
            } else if (payable instanceof Student) {
                System.out.println(((Student) payable).toString() + " earns " + payable.getPaymentAmount() + " tenge");
            }
        }
    }
}

