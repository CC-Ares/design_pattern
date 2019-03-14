package cjc.ares.designpattern.visitor;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
    private List<IEmployee> employeeList = new ArrayList<IEmployee>();

    public void addEmployee(IEmployee employee){
        employeeList.add(employee);
    }

    public void accept(Department handler){
        for(IEmployee iEmployee:employeeList){
            iEmployee.accept(handler);
        }
    }
}
