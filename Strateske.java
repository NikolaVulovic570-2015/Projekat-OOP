package igrice;

//@author Nikola Vulovic 570-2015

public class Strateske extends Igre {
    Strateske(){
    }
    String zanrIgre(){
    return "Odabrali ste Strateske igre.";
    }
    String izaberiIgruZanr(){
    System.out.println("1) XCOM 2                                2) StarCraft II: Wings Of Liberty    3) Civilization VI");
    System.out.println("4) StarCraft II: Legacy Of The Void      5) Ashes Of The Singularity          6) Hearthstone: Heroes of Warcraft");
    return "Sada izaberite igru koju zelite da probate.";
    }
}