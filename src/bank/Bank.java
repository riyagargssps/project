/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author lenovo
 */
public class Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
       banksplash call=new banksplash();
        call.setVisible(true);
        login ob=new login();
        try
        {
            for(int i=0;i<=100;i++)
            {
                Thread.sleep(30);
                call.a.setValue(i);
                
                   if(i==100)
                   {call.setVisible(false);
                   ob.setVisible(true);
                   }
                
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
    
}
