package igrice;

// @author Nikola Vulovic 570-2015

import java.util.Scanner;

public class Program {

	private static Scanner scan;
	public static void main(String[] args) {
     scan = new Scanner(System.in);
     System.out.println("Dobro dosli na sajt. Izaberite zanr igre koju zelite da probate");
     System.out.println("1) Pucacke  2) Horor  3) Strateske  4) Open world avanture  5) Sportske");
     int a = scan.nextInt();
     Igre reigre;
     if (a == 1){
     Pucacke p = new Pucacke();
     reigre = p;
     System.out.println(reigre.zanrIgre());
     System.out.println(reigre.izaberiIgruZanr());
     int g = scan.nextInt();
             if(g == 1){
             Prvo_lice pl = new  Prvo_lice();
             System.out.println(pl.podzanrPrvolice());
             System.out.println(pl.izborIgre());
             int m = scan.nextInt();
                  switch (m){
                  case 1 :
                  System.out.println("Izabrali ste igru Battlefield 1. Uzivajte!");
                  break;
                  case 2 :
                  System.out.println("Izabrali ste igru Call Of Duty: Infinite Warfare. Uzivajte!");
                  break; 
                  case 3 :
                  System.out.println("Izabrali ste igru Doom. Uzivajte!");
                  break;
                  case 4 :
                  System.out.println("Izabrali ste igru Overwatch. Uzivajte!");
                  break;
                  case 5 :
                  System.out.println("Izabrali ste igru Borderlands 2. Uzivajte!");
                  break;
                  case 6 :
                  System.out.println("Izabrali ste igru Far Cry 5. Uzivajte!");
                  break;
                  case 7 :
                  System.out.println("Izabrali ste igru Halo 5: Guardians. Uzivajte!");
                  break; 
                  case 8 :
                  System.out.println("Izabrali ste igru Titanfall 2. Uzivajte!");
                  break; 
                  case 9 :
                  System.out.println("Izabrali ste igru Prey. Uzivajte!");
                  break;
                  default: 
                  System.out.println("Uneli ste pogresan redni broj. Molimo vas pokusajte ponovo."); 
                  }
            }
             if(g == 2){
             Trece_lice tl = new  Trece_lice();
             System.out.println(tl.podzanrTrecelice());
             System.out.println(tl.izborIgre());
             int n = scan.nextInt();
                  switch (n){
                  case 1 :
                  System.out.println("Izabrali ste igru Grand Theft Auto V. Uzivajte!");
                  break;
                  case 2 :
                  System.out.println("Izabrali ste igru Tom Clancy's Ghost Recon: Wildlands. Uzivajte!");
                  break; 
                  case 3 :
                  System.out.println("Izabrali ste igru Max Payne 3. Uzivajte!");
                  break;
                  case 4 :
                  System.out.println("Izabrali ste igru Spec Ops: The Line. Uzivajte!");
                  break;
                  case 5 :
                  System.out.println("Izabrali ste igru Uncharted 4. Uzivajte!");
                  break;
                  case 6 :
                  System.out.println("Izabrali ste igru Just Cause 3. Uzivajte!");
                  break;
                  case 7 :
                  System.out.println("Izabrali ste igru Star Wars: Battlefront. Uzivajte!");
                  break; 
                  case 8 :
                  System.out.println("Izabrali ste igru Mass Effect: Andromeda. Uzivajte!");
                  break; 
                  case 9 :
                  System.out.println("Izabrali ste igru Watch Dogs 2. Uzivajte!");
                  break;
                  default: 
                  System.out.println("Uneli ste pogresan redni broj. Molimo vas pokusajte ponovo."); 
                  }
            }
     }        
     if (a == 2){
	 Horor h = new Horor();
	 reigre = h;
	 System.out.println(reigre.zanrIgre());
	 System.out.println(reigre.izaberiIgruZanr());
     int l = scan.nextInt();
          switch (l){
          case 1 :
          System.out.println("Izabrali ste igru Resident Evil 7: Biohazard. Uzivajte!");
          break;
          case 2 :
          System.out.println("Izabrali ste igru Soma. Uzivajte!");
          break; 
          case 3 :
          System.out.println("Izabrali ste igru Outlast 2. Uzivajte!");
          break;
          case 4 :
          System.out.println("Izabrali ste igru Dying Light. Uzivajte!");
          break;
          case 5 :
          System.out.println("Izabrali ste igru Until Dawn. Uzivajte!");
          break;
          case 6 :
          System.out.println("Izabrali ste igru Layers Of Fear. Uzivajte!");
          break; 
          default: 
          System.out.println("Uneli ste pogresan redni broj. Molimo vas pokusajte ponovo."); 
          }
     }        
     if (a == 3){
	 Strateske s = new Strateske();
	 reigre = s;
	 System.out.println(reigre.zanrIgre());
	 System.out.println(reigre.izaberiIgruZanr());
     int o = scan.nextInt();
          switch (o){
          case 1 :
          System.out.println("Izabrali ste igru XCOM 2. Uzivajte!");
          break;
          case 2 :
          System.out.println("Izabrali ste igru StarCraft II: Wings Of Liberty. Uzivajte!");
          break; 
          case 3 :
          System.out.println("Izabrali ste igru Civilization VI. Uzivajte!");
          break;
          case 4 :
          System.out.println("Izabrali ste igru StarCraft II: Legacy Of The Void. Uzivajte!");
          break;
          case 5 :
          System.out.println("Izabrali ste igru Ashes Of The Singularity. Uzivajte!");
          break;
          case 6 :
          System.out.println("Izabrali ste igru Hearthstone: Heroes of Warcraft. Uzivajte!");
          break; 
          default: 
          System.out.println("Uneli ste pogresan redni broj. Molimo vas pokusajte ponovo."); 
          }
     }        
     if (a == 4){
     OpenWorldAvanture ow = new OpenWorldAvanture();
	 reigre = ow;
	 System.out.println(reigre.zanrIgre());
	 System.out.println(reigre.izaberiIgruZanr());
     int k = scan.nextInt();
          switch (k){
          case 1 :
          System.out.println("Izabrali ste igru Assassin's Creed: Origins. Uzivajte!");
          break;
          case 2 :
          System.out.println("Izabrali ste igru The Witcher 3: Wild Hunt. Uzivajte!");
          break; 
          case 3 :
          System.out.println("Izabrali ste igru Dark Souls III. Uzivajte!");
          break;
          case 4 :
          System.out.println("Izabrali ste igru Horizon Zero Dawn. Uzivajte!");
          break;
          case 5 :
          System.out.println("Izabrali ste igru For Honor. Uzivajte!");
          break;
          case 6 :
          System.out.println("Izabrali ste igru Sniper: Ghost Warrior 3. Uzivajte!");
          break; 
          default: 
          System.out.println("Uneli ste pogresan redni broj. Molimo vas pokusajte ponovo."); 
          }
     }        
     if (a == 5){
     Sportske sp = new Sportske();
	 reigre = sp;
	 System.out.println(reigre.zanrIgre());
	 System.out.println(reigre.izaberiIgruZanr());
     int v = scan.nextInt();
          switch (v){
          case 1 :
          System.out.println("Izabrali ste igru Pro Evolution Soccer 2017. Uzivajte!");
          break;
          case 2 :
          System.out.println("Izabrali ste igru FIFA 17. Uzivajte!");
          break; 
          case 3 :
          System.out.println("Izabrali ste igru NBA 2K17. Uzivajte!");
          break;
          case 4 :
          System.out.println("Izabrali ste igru Madden NFL 17. Uzivajte!");
          break;
          case 5 :
          System.out.println("Izabrali ste igru NHL 17. Uzivajte!");
          break;
          case 6 :
          System.out.println("Izabrali ste igru EA Sports UFC 2. Uzivajte!");
          break; 
          default: 
          System.out.println("Uneli ste pogresan redni broj. Molimo vas pokusajte ponovo."); 
          }
     }
     if (a>= 6){
     System.out.println("Uneli ste pogresan redni broj. Molimo vas pokusajte ponovo.");
     }
  }   
}