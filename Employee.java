import java.util.Objects;

public class Employee {

    static int employeeCounter = 0;

    private int age;
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        employeeCounter++;
    }

    public Employee(String firstName, String lastName, int age) {
        this(firstName, lastName, age, 50.0);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Employee employee) {
            return firstName.equals(employee.firstName) && lastName.equals(employee.lastName) && age == employee.age;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return "Employee[" + firstName +" "+ lastName + ", " + age + "]";
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public double getSalary() {
        return salary;
    }
    boolean olderThan(Employee e){
        return age > e.age;
      
    }

    public void upgrade(double salary){
        this.salary += salary;
    }
}
