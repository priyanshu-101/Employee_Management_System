import java.util.*;
public class EmployDetail {
    String name;
    String father_name;
    String email;
    String position;
    String employ_id;
    String employ_salary;
    String employ_contact;
    public void getInfo()
    {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter Employee's name --------: ");
        name=s1.nextLine();
        System.out.print("Enter Employee's Father name -: ");
        father_name=s1.nextLine();
        System.out.print("Enter Employee's ID ----------: ");
        employ_id=s1.nextLine();
        System.out.print("Enter Employee's Email ID ----: ");
        email=s1.nextLine();
        System.out.print("Enter Employee's Position ----: ");
        position=s1.nextLine();
        System.out.print("Enter Employee contact Info --: ");
        employ_contact=s1.nextLine();
        System.out.print("Enter Employee's Salary ------: ");
        employ_salary=s1.nextLine();
        s1.close();
    }
}

