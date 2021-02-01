package Management;

import Staff.Employee;

// Manager constructor initialised with deptName as a new parameter set up

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, int niNum, double salary, String deptName){
        super(name, niNum, salary);
        this.deptName = deptName;
    }
//    getter method for department name
    public String getDeptName(){
        return this.deptName;
    }

}
