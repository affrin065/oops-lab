/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eb;

import java.util.Scanner;

/**
 *
 * @author 21CSE065
 */
public class Eb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        bill obj=new bill();
        obj.getdata();
        obj.calc();
        obj.display();
        //cu TODO code application logic here
    }
    
}
class bill
{
    int consumernum;
    String consumername;
    int prevreading;
    int currreading;
    String type;
    int unit;
    float bill;
    void getdata()
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("enter consumer num");
        consumernum=obj.nextInt();
        System.out.print("enter consumer name");
        consumername=obj.next();
        System.out.print("enter prev reading");
        prevreading=obj.nextInt();
        System.out.print("enter curr reading");
        currreading=obj.nextInt();
        System.out.print("enter type");
        type=obj.next();
        
        
    }
    void calc()
    {
         unit=currreading-prevreading;
         if(type.equals("D"))
         {
             if(unit<=100)
                 bill=(float)(1*unit);
             else if(unit>100 && unit<=200)
                 bill=(float)((1*100)+(2.50*(unit-100)));
             else if(unit>200 && unit<=500)
                 bill=(float)((1*100)+(2.50*100)+(4*(unit-200)));
             else
                 bill=(float)((1*100)+(2.50*100)+(4*300)+((unit-500)*6));
         }
         else{
             if(unit<=100)
                 bill=(float)(2*unit);
             else if(unit>100 && unit<=200)
                 bill=(float)((1*100)+(4.50*(unit-100)));
             else if(unit>200 && unit<=500)
                 bill=(float)((1*100)+(4.50*100)+(6*(unit-200)));
             else
                 bill=(float)((1*100)+(4.50*100)+(6*300)+((unit-500)*7));
         }
    }
    void display()
    {
        System.out.println("Consumername"+consumername);
        System.out.println("Consumernum"+consumernum);
         if(type.equals("D"))
             System.out.println("type of connection"+type);
         else
             System.out.println("type of connection"+type);
        System.out.println("curr month reading"+currreading);
        System.out.println("prev month reading"+prevreading); 
        System.out.println("total units"+unit);
        System.out.println("total bill"+bill);
    }
    

}
