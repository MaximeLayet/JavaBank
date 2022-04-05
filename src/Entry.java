import model.Compte;
import model.CompteEpargne;
import model.ComptePayant;
import model.CompteSimple;

import java.util.Scanner;

public class Entry {
    public static void main(String[] args){

        Compte c = new Compte(100);
        c.retirer(50);
        System.out.println(c.countAmount());


//        Compte c = new Compte( 500);
//        Compte c2 = new Compte(1400);
//
//        System.out.println(c.countAmount());
//        c.verser(14);
//        System.out.println(c.countAmount());
//        c.retirer(12);
//        System.out.println(c.countAmount());
    }
}
