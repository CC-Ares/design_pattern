package cjc.ares.designpattern.visitor;

/**
 * 访问者模式
 * 在开发过程中，可能存在一个集合中有多种类型，每种类型又有多个处理者对其进行不同处理，此时可以使用访问者模式
 */
public class Test {
    public static void main(String[] args) {
        EmployeeList employeeList = new EmployeeList();
        IEmployee iEmployee1 = new FullTimeEmployee("ares1",1000,45);
        IEmployee iEmployee2 = new FullTimeEmployee("ares2",2000,50);
        IEmployee iEmployee3 = new FullTimeEmployee("ares3",3000,30);
        IEmployee iEmployee4 = new FullTimeEmployee("ares4",4000,40);
        IEmployee iEmployee5 = new PartTimeEmployee("ares5",80,20);
        IEmployee iEmployee6 = new PartTimeEmployee("ares6",60,30);
        employeeList.addEmployee(iEmployee1);
        employeeList.addEmployee(iEmployee2);
        employeeList.addEmployee(iEmployee3);
        employeeList.addEmployee(iEmployee4);
        employeeList.addEmployee(iEmployee5);
        employeeList.addEmployee(iEmployee6);

        Department fianceHandler = new FinanceDepartment();
        Department HRHandler = new HRDepartment();
        employeeList.accept(fianceHandler);
        employeeList.accept(HRHandler);
    }
}
