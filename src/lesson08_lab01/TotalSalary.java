package lesson08_lab01;

import java.util.ArrayList;
import java.util.List;

public class TotalSalary {
    public void totalSalary(List<Employee> employeeList){
            int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary = totalSalary + employee.employee();
        }
        System.out.println("Total Salary of company : "+ totalSalary);
    }
    public static void main(String[] args) {
        TotalSalary totalSalary = new TotalSalary();

        Employee fullTimeEmployee1 = new FullTimeEmployee();
        Employee fullTimeEmployee2 = new FullTimeEmployee();
        Employee fullTimeEmployee3 = new FullTimeEmployee();

        Employee contractEmployee1 = new ContractEmployee();
        Employee contractEmployee2 = new ContractEmployee();

        List<Employee> employees = new ArrayList<>();
        employees.add(fullTimeEmployee1);
        employees.add(fullTimeEmployee2);
        employees.add(fullTimeEmployee3);
        employees.add(contractEmployee1);
        employees.add(contractEmployee2);

        totalSalary.totalSalary(employees);
    }
}
