package Java8;

import java.util.*;
import java.util.stream.Collectors;

public class EpamQuestion {
}
class Employee {
    private String name;
    private String department;
    private double salary;
    private int yearsExperience;

    public Employee(String name, String department, double salary, int yearsExperience) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.yearsExperience = yearsExperience;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getYearsExperience() {
        return yearsExperience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", yearsExperience=" + yearsExperience +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("John", "Sales", 50000.0, 5));
        employeeList.add(new Employee("Jane", "Marketing", 60000.0, 8));
        employeeList.add(new Employee("Jane", "Sales", 60000.0, 7));
        employeeList.add(new Employee("Jane", "Tech", 95000.0, 3));
        employeeList.add(new Employee("Jane", "Tech", 80000.0, 6));


        // Question 1: Filter Employees by Department "Sales"
        employeeList.stream().filter(t->t.getDepartment().equalsIgnoreCase("sales")).forEach(t->System.out.println(t));


        // Question 2: Calculate Average Salary
        double average = employeeList.stream().mapToDouble(t -> t.getSalary()).summaryStatistics().getAverage();
        System.out.println(average);
        average = employeeList.stream().mapToDouble(t -> t.getSalary()).average().getAsDouble();
        System.out.println(average);

        // Question 3: Find Highest Earning Employee
        double max = employeeList.stream().mapToDouble(t -> t.getSalary()).max().getAsDouble();
        System.out.println(max);

        // Question 4: Group Employees by Experience(for example, 0-5 years, 6-10 years, etc.)
        Map<Integer, List<Employee>> employeeMap = employeeList.stream().collect(Collectors.groupingBy(t -> t.getYearsExperience()));
        employeeMap.entrySet().stream().forEach(t-> System.out.println(t.getValue()));
        System.out.println(employeeMap);

        // Question 5: Retrieve Names of Top Earners in Each Department
        Map<String, List<Employee>> empMapDep = employeeList.stream().collect(Collectors.groupingBy(t -> t.getDepartment()));
//        empMapDep.forEach((t1,t2)->System.out.println(t1+"-"+t2));
        employeeList.stream().collect(Collectors.groupingBy(t -> t.getDepartment())).forEach((t1,t2)->{
            t2.stream().mapToDouble(p-> p.getSalary()).max().ifPresent(System.out::println);
        });

        //Question 6: Sort the Employee on name asc and Desc
        employeeList.stream().mapToDouble(t-> t.getSalary()).sorted().forEach(System.out::println);
    }
}