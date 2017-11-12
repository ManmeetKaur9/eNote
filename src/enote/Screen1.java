/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enote;

/**
 *
 * @author Microsoft
 */
public class Screen1 {
    public static void main(String[] args) {
        Splash s=new Splash();
        s.setVisible(true);
        Home h=new Home();
        try {
            for(int i=0;i<=100;i++)
            {
                Thread.sleep(40);
                Splash.jLabel2.setText(Integer.toString(i)+"%");
                Splash.jProgressBar1.setValue(i);
                if(i==100)
                {
                    s.setVisible(false);
                    h.setVisible(true);
                }
            }
        } catch (Exception e) {
        }
    }
   
}
