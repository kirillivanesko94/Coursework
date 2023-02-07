public class Main {
    private static final Employee[] employees = new Employee[10];


    public static void main(String[] args) {
        employees[0] = new Employee("Иванов Иван Иванович", 1, 25_000);
        employees[1] = new Employee("Иванов Иван Сергеевич", 2, 60_000);
        employees[3] = new Employee("Иванов Иван Андреевич", 3, 70_000);
        employees[4] = new Employee("Иванов Иван Петрович", 3, 50_000);
        printAllEmployee();
        getTotalSalary();
        getMaxSalary();
        getMinSalary();
        getAverageSalary();
        getFullNameEmployee();
        getSalaryIncreaseByIndex(1.05);
        getMinSalaryInDepartment(3);
        getMaxSalaryInDepartment(3);
        getTotalSalaryInDepartment(3);
        getAverageSalaryInDepartment(3);
        getDepartmentSalaryIncreaseByIndex(3, 1.05);
        printEmployeeInDepartment(3);
        getAllEmployeesWithALowerThanNumber(55_000);
        getAllEmployeesWithAMoreThanNumber(60_000);


    }

    private static void printAllEmployee() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    private static void getTotalSalary() {
        double totalSum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSum += employee.getSalary();
            }
        }
        System.out.println("Итого сумма затрат на заработную плату: " + totalSum);

    }

    private static void getMaxSalary() {
        double max = Double.MIN_VALUE;
        Employee employeeWithMaxSalary = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
                employeeWithMaxSalary = employee;
            }
        }
        System.out.println("Максимальная заработная плата: " + employeeWithMaxSalary);
    }

    private static void getMinSalary() {
        double min = Double.MAX_VALUE;
        Employee employeeWithMinSalary = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < min) {
                employeeWithMinSalary = employee;
                min = employee.getSalary();
            }
        }
        System.out.println("Минимальная заработная плата: " + employeeWithMinSalary);
    }

    private static void getAverageSalary() {
        int count = 0;
        double totalSum = 0;
        double averageSalary;
        for (Employee employee : employees) {
            if (employee != null) {
                count++;
                totalSum += employee.getSalary();
            }
        }
        averageSalary = totalSum / count;
        System.out.println("Средний заработок: " + averageSalary);
    }

    private static void getFullNameEmployee() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }

    private static void getSalaryIncreaseByIndex(double indexSize) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println("Новая заработная плата сотрудника: " + employee.getFullName() + ", составляет - " +
                        employee.getSalary() * indexSize);
            }
        }
    }

    private static void getMinSalaryInDepartment(int department) {
        Employee employeeWithMinSalary = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                if (employeeWithMinSalary == null || employee.getSalary() < employeeWithMinSalary.getSalary())
                    employeeWithMinSalary = employee;
            }

        }
        if (employeeWithMinSalary == null) {
            System.out.println("Введено неверное значение");
        } else System.out.println("Сотрудник с минимальной заработной платой: " + employeeWithMinSalary);

    }

    private static void getMaxSalaryInDepartment(int department) {
        Employee employeeWithMaxSalary = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                if (employeeWithMaxSalary == null || employee.getSalary() > employeeWithMaxSalary.getSalary())
                    employeeWithMaxSalary = employee;
            }

        }
        if (employeeWithMaxSalary == null) {
            System.out.println("Введено неверное значение");
        } else System.out.println("Сотрудник с максимальной заработной платой: " + employeeWithMaxSalary);

    }

    private static void getTotalSalaryInDepartment(int department) {
        double totalSalary = 0.0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                totalSalary += employee.getSalary();
            }
        }
        System.out.println("Сумма заработной платы отдела: " + department + ", составляет - " + totalSalary);
    }

    private static void getAverageSalaryInDepartment(int department) {
        double totalSalary = 0.0;
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                count++;
                totalSalary += employee.getSalary();
            }
        }
        System.out.println("Средняя заработная плата отдела: " + department + ", составляет: " + totalSalary / count);
    }

    private static void getDepartmentSalaryIncreaseByIndex(int department, double indexSize) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                System.out.println("Новая заработная плата сотрудника отдела: " + employee.getDepartment() + ", "
                        + employee.getFullName() + ", составляет - " +
                        employee.getSalary() * indexSize);

            }
        }
    }

    private static void printEmployeeInDepartment(int department) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                System.out.println("ID: " + employee.getId() + ", ФИО: " + employee.getFullName() +
                        ", Заработная плата: " + employee.getSalary());
            }
        }
    }

    private static void getAllEmployeesWithALowerThanNumber(double sum) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < sum) {
                System.out.println(employee);
            }
        }
    }

    private static void getAllEmployeesWithAMoreThanNumber(double sum) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= sum) {
                System.out.println(employee);
            }
        }
    }
}