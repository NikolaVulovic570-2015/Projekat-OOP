package igrice;

//@author Nikola Vulovic 570-2015

public class OpenWorldAvanture extends Igre {
	OpenWorldAvanture(){
    }
	String zanrIgre(){
    return "Odabrali ste Open World Avanturisticke igre.";
    }
    String izaberiIgruZanr(){
    System.out.println("1) Assassin's Creed: Origins    2) The Witcher 3: Wild Hunt       3) Dark Souls III");
    System.out.println("4) Horizon Zero Dawn            5) For Honor                      6) Sniper: Ghost Warrior 3");
    return "Sada izaberite igru koju zelite da probate.";
    }   
}