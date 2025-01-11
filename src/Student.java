public class Student extends Person {
    private double gpa;
    public Student() {}
    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    @Override
    public String toString() {
        return "Student: " + super.toString();
    }
    @Override
    public String getPosition() {
        return "Student";
    }
    @Override
    public double getPaymentAmount() {
        return (gpa > 2.67) ? 36660.00 : 0.00;
    }
    @Override
    public int compareTo(Person other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }
}

