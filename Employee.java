package Task_3;

public class Employee implements Taxable{

    private long empId;
   private  String name;
    private double salary;

    public Employee(long empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double calcTax(double salary) {

        return (salary*Taxable.incomeTax);
    }
}
