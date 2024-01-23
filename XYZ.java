package Task_3;

import Task_3.Product;
import Task_3.Employee;

public class XYZ {
    public static void main(String[] args)
    {

        Employee e1=new Employee(1678,"kumar",24750.98);
       Product p1=new Product(14,789.98,25);

        System.out.println(e1.calcTax(e1.getSalary()));
        System.out.println(p1.calcTax(p1.getPrice()));
    }
}