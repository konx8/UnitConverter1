package com.RPS;


public class Application {

    ConsoleInformacion console = new ConsoleInformacion();
    Units units = new Units();

    public void Start(){

        console.firstRunInformation();
        units.setFirstUserChose(console.userUnitChose());
        console.secondRunInformation();
        units.setSecondUserChose(console.userUnitChose());
        console.userChose();

    }





}
