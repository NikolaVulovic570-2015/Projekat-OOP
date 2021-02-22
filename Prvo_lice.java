package igrice;

//@author Nikola Vulovic 570-2015

public class Prvo_lice extends Pucacke {
    Prvo_lice(){
    }
    String podzanrPrvolice(){
    return "Odabrali ste pucacke igre iz prvog lica.";
    }
    String izborIgre(){
    System.out.println("1) Battlefield 1       2) Call Of Duty: Infinite Warfare    3) Doom");
    System.out.println("4) Overwatch           5) Borderlands 2                     6) Far Cry 5");
    System.out.println("7) Halo 5: Guardians   8) Titanfall 2                       9) Prey");
    return "Sada izaberite igru koju zelite da probate.";
    }    
}