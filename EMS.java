import java.util.*;
public class EMS {
    public static void main(String[] args) {
          /** To clear the output Screen **/
          System.out.print("\033[H\033[2J");
          Scanner sc=new Scanner(System.in);
          Employee_Show epv =new Employee_Show();
      
          int i=11;
          MainMenu obj1 = new MainMenu();
          obj1.menu();
          while(i<5)
          {
      
            System.out.print("\nPlease Enter choice :");
            i=Integer.parseInt(sc.nextLine());
    
            switch(i)
            {
              case 1:
              {
              Employee_Add ep =new Employee_Add();
              ep.createFile();
      
            //   System.out.print("\033[H\033[2J");
              obj1.menu();
              break;
              }
              case 2:
              {
                System.out.print("\nPlease Enter Employee's ID :");
                String s=sc.nextLine();
                try
                {
                  epv.viewFile(s);}
                  catch(Exception e){System.out.println(e);}
      
      
                  System.out.print("\nPress Enter to Continue...");
                  sc.nextLine();
                  System.out.print("\033[H\033[2J");
                  obj1.menu();
                  break;
                }
      
              case 3:
              {
                System.out.print("\nPlease Enter Employee's ID :");
                String s=sc.nextLine();
                Employee_Remove epr =new Employee_Remove();
                epr.removeFile(s);
      
                System.out.print("\nPress Enter to Continue...");
                sc.nextLine();
                System.out.print("\033[H\033[2J");
                obj1.menu();
                break;
              }
              case 4:
              {
                CodeExit obj = new CodeExit();
                obj.out();
              }
            }
          }
          sc.close();

    }
}
