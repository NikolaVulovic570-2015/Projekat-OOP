package igrice;

//@author Nikola Vulovic 570-2015

public class Horor extends Igre {
    Horor(){
    }
    String zanrIgre(){
    return "Odabrali ste Horor igre.";
    }
    String izaberiIgruZanr(){
    System.out.println("1) Resident Evil 7: Biohazard    2) Soma          3) Outlast 2");
    System.out.println("4) Dying Light                   5) Until Dawn    6) Layers Of Fear");
    return "Sada izaberite igru koju zelite da probate.";
    }
}