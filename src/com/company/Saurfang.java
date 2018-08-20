package com.company;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Saurfang {

   int i, k;
   String n1, n2;
   public void Scan(){
       n1 = JOptionPane.showInputDialog("Vvedite pervoe chislo");
       n2 = JOptionPane.showInputDialog("Vvedite vtoroechislo");
       i = Integer.parseInt(n1);
       k  = Integer.parseInt(n2);
    }
    public void Scan(int a, int b){
       JOptionPane.showMessageDialog(null, "Teper vashe pervoe chislo = " + a);
        JOptionPane.showMessageDialog(null,  "Teper vashe vtoroe chislo = " +b);
    }
}
