import java.util.Scanner;

class Employee {


    int Employee_id;
    String Employee_name;
    

    Employee(int Employee_id, String Employee_name) {
        this.Employee_id = Employee_id;
        this.Employee_name = Employee_name;
    }

    void displayEmployee() {
        System.out.println("Employee id: " + Employee_id);
        System.out.println("Employee name: " + Employee_name);
    }
}

class staff extends Employee {
    int staff_id;
    String staff_name;

    staff(int Employee_id, String Employee_name, int staff_id, String staff_name) {
        super(Employee_id, Employee_name);
        this.staff_id = staff_id;
        this.staff_name = staff_name;
    }

    void displayStaff() {
        super.displayEmployee();
        System.out.println("Staff id: " + staff_id);
        System.out.println("Staff name: " + staff_name);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter employee name: ");
        String employee_name = sc.nextLine();

        System.out.println("Enter employee id: ");
        int employee_id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter staff name: ");
        String staff_name = sc.nextLine();

        System.out.println("Enter staff id: ");
        int staff_id = sc.nextInt();
        sc.nextLine();
         staff s = new staff(employee_id, employee_name, staff_id, staff_name);

        s.displayStaff();
       
    }
    }

