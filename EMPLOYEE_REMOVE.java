import java.io.*;
public class Employee_Remove {
    public void removeFile(String ID){
        File file = new File("file"+ID+".txt");
        if(file.exists()){
            if(file.delete()){
                System.out.println("Employee has been removed succesfully");
            }
        }
        else{
            System.out.println("Employee does not exist");
        }
    }
    public static void main(String[] args) {
        Employee_Remove obj = new Employee_Remove();
        obj.removeFile("123");
    }
}
