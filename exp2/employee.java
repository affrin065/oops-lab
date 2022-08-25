/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emp;

import java.util.Scanner;

/**
 *
 * @author Amrudha
 */
public class employee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        employe obj= new employe(101,"affrin","fowmiya",10000);
        int percent;
        System.out.println(obj.getid());
        System.out.println(obj.getfirstname());
        System.out.println(obj.getlastname()); 
        System.out.println(obj.getname()); 
        System.out.println(obj.getsalary()); 
        System.out.println(obj.getannualsalary());
        Scanner obj1=new Scanner(System.in);
        System.out.println("enter percent:");
        percent=obj1.nextInt();
        System.out.println(obj.raisedsalary(percent));
        System.out.println(obj.toString()); 
        
    }
    
}
class employe
{
   int id;
   String firstname;
   String lastname;
   static int salary;
    
    employe(int ids,String fname,String lname,int s)
    {
        id=ids;
        firstname=fname;
        lastname=lname;
        salary=s;
    }
   
   int getid()
    {
        return id;
    }
    String getfirstname()
    {
       return firstname;
    }
    String getlastname()
    {
        return lastname;
    }
    String getname()
    {
     return firstname+' ' +lastname;
    }
    int getsalary()
    {
     return salary;   
    }
    int getannualsalary()
    {
        return salary*12;
    }
    int raisedsalary(int percent)
    {
        salary=salary+((salary*percent)/100);
        return salary;
    }
    @Override
    public String toString()
    {
        return "id..."+id+' '+"name..."+firstname+' '+lastname+' '+"salary..."+salary;
    }
   }
