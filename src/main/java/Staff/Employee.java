package Staff;


public abstract class Employee {

    private String name;
    private int niNum;
    private double salary;

//  Employee constructor defines name, national insurance number and salary
    public Employee(String name, int niNum, double salary){
        this.name = name;
        this.niNum = niNum;
        this.salary = salary;

    }

//    getter methods for constructor

    public String getName() {
        return name;
    }

    public int getNiNum() {
        return niNum;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double raise){
        this.salary += raise;
    }

    public double payBonus(){
        return this.salary * 0.01;
    }

}
