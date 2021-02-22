package igrice;

//@author Nikola Vulovic 570-2015

public class Sportske extends Igre {
    Sportske(){
    }
    String zanrIgre(){
    return "Odabrali ste Sportske igre.";
    }
    String izaberiIgruZanr(){
    System.out.println("1) Pro Evolution Soccer 2017     2) FIFA 17       3) NBA 2K17");
    System.out.println("4) Madden NFL 17                 5) NHL 17        6) EA Sports UFC 2");
    return "Sada izaberite igru koju zelite da probate.";
    }    
}
