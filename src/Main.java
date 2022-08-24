public class Main {

    public static Employee[] employee = new Employee[10];

    public static void main(String[] args) {

        employee[0] = new Employee("Trump", "Donald", "John", 1, 111_100, Employee.getIdCounter());
        employee[1] = new Employee("Obama", "Barack", "Hussein", 4, 70_000, Employee.getIdCounter());
        employee[2] = new Employee("Clinton", "Bill", "Jefferson", 2, 89_000, Employee.getIdCounter());
        employee[3] = new Employee("Reagan", "Ronald", "Wilson", 5, 40_000, Employee.getIdCounter());
        employee[4] = new Employee("Nixon", "Richard", "Milhous", 3, 102_000, Employee.getIdCounter());
        employee[5] = new Employee("Kennedy", "John", "Fitzgerald", 3, 97_000, Employee.getIdCounter());
        employee[6] = new Employee("Truman", "Harry", "S", 2, 68_000, Employee.getIdCounter());
        employee[7] = new Employee("Hoover", "Herbert", "Clark", 4, 32_000, Employee.getIdCounter());
        employee[8] = new Employee("Bush", "George", "Walker", 4, 41_000, Employee.getIdCounter());
        employee[9] = new Employee("Johnson", "Lyndon", "Baines", 4, 91_000, Employee.getIdCounter());
        printAllEmployeesNames();



    }

    public static Object printAllEmployees() {
        for (Employee names : employee) {
            System.out.println(names);
        }
        return null;
    }

    public static double getAllSalaries() {
        double sum = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                sum = sum + employee[i].getSalary();
            }
        }
        return sum;
    }

    public static Employee getMinSalaryEmployee() {
        double minSalary = -1;
        Employee minSalaryEmployee = null;
        int sum = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                minSalary = employee[i].getSalary();
                minSalaryEmployee = employee[i];
                sum = i;
                break;
            }
        }

        for (int i = sum; i < employee.length; i++) {
            if (employee[i] != null) {
                if (minSalary > employee[i].getSalary()) {
                    minSalary = employee[i].getSalary();
                    minSalaryEmployee = employee[i];
                }
            }
        }
        return minSalaryEmployee;
    }


    public static Employee getMaxSalaryEmployee() {
        double maxSalary = 0;
        Employee maxSalaryEmployee = null;
        int sum = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                maxSalary = employee[i].getSalary();
                maxSalaryEmployee = employee[i];
                sum = i;
                break;
            }
        }
        if (maxSalaryEmployee == null) return null;

        for (int i = sum; i < employee.length; i++) {
            if (employee[i] != null) {
                if(maxSalary < employee[i].getSalary()) {
                    maxSalary = employee[i].getSalary();
                    maxSalaryEmployee = employee[i];
                }
            }

        }
        return maxSalaryEmployee;
    }

    public static double getAverageSalary() {
        double allSalaries = getAllSalaries();
        if (employee.length != 0) {
            return allSalaries / employee.length;
        } else {
            return 0;
        }
    }
    public static void printAllEmployeesNames() {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                System.out.println (employee[i].getLastName() + " " + employee[i].getFirstName() + " " + employee[i].getMiddleName());

            }

        }
    }

}




