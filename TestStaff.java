
/**
 * Write a description of class TestStaff here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
public class TestStaff
{
    public static void main(String[] args)
    {
            String str, name, depart, post;
            int id;
            double salary;
        Staff staff1 = new Staff();
        staff1.setData("Muhammad Fakhri",2215,"Finance","Executive",4500.0);
        staff1.display();
        
        Staff staff2 = new Staff("Siti Saleha",2432,"Marketing","Administrator",3500.0);
        staff2.display();
        
        staff1.setSalary(5200.0);
        staff2.setPost("Senior Administrator");
        
        Staff staff3 = new Staff();
        
        name = JOptionPane.showInputDialog("Enter staff name: ");
        staff3.setName(name);
        
        str = JOptionPane.showInputDialog("Enter staff id: ");
        id = Integer.parseInt(str);
        staff3.setId(id);
        
        depart = JOptionPane.showInputDialog("Enter department: ");
        staff3.setDepart(depart);
        
        post = JOptionPane.showInputDialog("Enter position: ");
        staff3.setPost(post);
        
        str = JOptionPane.showInputDialog("Enter salary: ");
        salary = Double.parseDouble(str);
        staff3.setSalary(salary);
        
        staff3.display();

    }
}
