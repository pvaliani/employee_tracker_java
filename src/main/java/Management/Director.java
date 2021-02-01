package Management;

import Staff.Employee;

public class Director extends Employee {


    private Double budget;

    public Director(String name, int niNum, double salary, double budget){
        super(name, niNum, salary);
        this.budget = budget;

    }
}
