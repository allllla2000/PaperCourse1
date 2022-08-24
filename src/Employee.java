public class Employee {
    private String lastName;
    private String firstName;
    private String middleName;
    private int department;
    private double salary;
    private int id;

    static int idCounter;


    public Employee(String lastName, String firstName, String middleName, int department, double salary, int id) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
        this.id = id++;

    }


    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public static int getIdCounter() {
        return idCounter++;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }




    @Override
    public String toString() {
        return "Employee " + lastName + " " + firstName + " " + middleName + ", department " +  department + ", salary "
        + salary + ", id " + id + " ";
    }
}
