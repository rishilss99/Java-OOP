public class Employee {

    String name;
    int age;
    String designation;
    int salary;

    public Employee(String name, int age, String designation, int salary){

        /*Constructor*/

        this.name = name;
        this.age =age;
        this.designation = designation;
        this.salary = salary;
    }

    public void printEmployee(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(designation);
        System.out.println(salary);
    }

}
