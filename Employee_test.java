public class Employee_test {
    public static void main(String[] args ){

        Employee emp1 = new Employee("Rishil Shah",19,"CTO",0);

        emp1.age = 19;
        emp1.designation = "CTO";
        emp1.salary = 0;

        emp1.printEmployee();
    }
}
