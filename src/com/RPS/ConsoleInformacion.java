package com.RPS;

import java.util.Scanner;

public class ConsoleInformacion {

    Units units = new Units();


    public void firstRunInformation(){
        System.out.println("Wybierz rządaną jednostkę koncową");
        System.out.println("1 = km \n" + "2 = m \n" +
                            "3 = cm\n" + "4 = mm\n");
    }
    public void secondRunInformation(){
        System.out.println("Wybierz z jakiej jednostki chcesz liczyć");
        System.out.println("1 = km \n" + "2 = m \n" +
                "3 = cm\n" + "4 = mm\n");
    }

    public int userUnitChose(){

        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public float userValue(){

        Scanner scanner = new Scanner(System.in);
        return scanner.nextFloat();
    }
    public void userChose(){

        if (units.getFirstUserChose() == 1 && units.getSecondUserChose() == 1){
            System.out.println("konwersja z km na m, podaj wartość \n");
            units.setUserValue(userValue());
            float result = userValue()*1000;
            System.out.println(result);
        }
        if (units.getFirstUserChose() == 1 && units.getSecondUserChose() == 2){
            System.out.println("konwersja z km na cm, podaj wartość \n");
            float result = userValue()*100000;
            System.out.println(result);
        }

    }
    public void kmToM(){
        System.out.println(userValue() / 100);
    }


}
