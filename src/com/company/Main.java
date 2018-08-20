package com.company;

import java.io.IOException;
import java.io.Reader;
//import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        Saurfang r = new Saurfang();
        r.Scan();
        r.i = count(r.i);
        r.k = count(r.k);
       r.Scan(r.i, r.k);

        }
        private static int count (int x){
        x = x+1;
        return x;

    }
}
