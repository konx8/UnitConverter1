package com.RPS;

import java.util.Scanner;

public class ConsoleInformacion {

    public void firstRunInformation(){
        System.out.println("Wybierz jednostkę do przekonwertowania");
        System.out.println("1 = km \n" +
                             "2 = m \n" + "3 = cm\n" + "4 = mm\n");
    }

    public int userScaner(){

        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public void userChose(){
        if (userScaner() == 1){
            System.out.println("Wybrałeś km");
        }
        else if (userScaner() == 2){
            System.out.println("Wybrałeś m");
        }
        else if (userScaner() == 3){
            System.out.println("Wybrałeś cm");
        }
        else if (userScaner() == 4){
            System.out.println("Wybrałeś mm");
        }
    }


}
