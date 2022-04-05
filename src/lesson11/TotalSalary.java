package lesson11;

import java.util.ArrayList;
import java.util.List;

public class TotalSalary {
    int getTotalSalary(List<Employee> employeeList){
        int totalSalary = 0 ;
        if (employeeList.isEmpty()){
            System.out.println("There are no employees in the list");
        }else{
            for (Employee employee : employeeList) {
                totalSalary = totalSalary + employee.salary();
            }
        }
        return totalSalary;
    }
    public static void main(String[] args) {
        int totalSalary;
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Contractor());
        employeeList.add(new Contractor());
        employeeList.add(new FullTimeEmployee());
        employeeList.add(new FullTimeEmployee());
        employeeList.add(new FullTimeEmployee());

        totalSalary = new TotalSalary().getTotalSalary(employeeList);
        System.out.println(totalSalary);

    }

}
