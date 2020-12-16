
/**
 * Write a description of class Staff here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
public class Staff
{
    private String staff_name;
    int staff_id;
    String department;
    String position;
    double salary;
    
    public Staff()
    {
    }
    
    public Staff (String name, int id, String depart, String post
                  ,double gaji)
    {
        staff_name = name;
        staff_id = id;
        department = depart;
        position = post;
        salary = gaji;
    }
    
    public void setData (String name, int id, String depart, String post
                  ,double gaji)
    {
        staff_name = name;
        staff_id = id;
        department = depart;
        position = post;
        salary = gaji;    
    }
    
    public void setName (String name)
    {
        staff_name = name;
    }
    
    public void setId (int id)
    {
        staff_id = id;
    }
    
    public void setDepart (String depart)
    {
        department = depart;
    }
    
    public void setPost (String post)
    {
        position = post;
    }
    
    public void setSalary (double gaji)
    {
        salary = gaji;
    }
    
    public void display()
    {
        JOptionPane.showMessageDialog(null,
                                      "Staff name : " + staff_name +
                                      "\nStaff Id : " + staff_id +
                                      "\nDepartment : " + department +
                                      "\nPosition : " + position +
                                      "\nSalary : " + salary,
                                      "Detail",JOptionPane.PLAIN_MESSAGE);
        
    }
    
}
