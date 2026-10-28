import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random(); 
        Scanner scan= new Scanner(System.in);
        Random rnga= new Random();
        Random rngb= new Random();
        int randomNumber; 
        int rng1;
        int rng2;
        rng1= rnga.nextInt(1, 11);
        rng2=rngb.nextInt(1,11);
        randomNumber = random.nextInt(1, 11);  
        int raha;
        



            System.out.println("Let's gamble!!!");
            System.out.println("Syötä raha määrä pelataksesi");
                  raha=scan.nextInt();
                scan.nextLine();
            raha--;
        while (!(randomNumber==7 &&rng1==7 &&rng2==7)&& raha >0){
            System.out.println("*****");
        System.out.println("" + randomNumber+" "+ rng1+" " +rng2);
            System.out.println("*****");
        System.out.println("Rahaa jäljellä "+ raha+ " Pelaa uudelleen painamalla ENTER");
        scan.nextLine();
        
        rng1= rnga.nextInt(1, 11);
        rng2=rngb.nextInt(1,11);
        randomNumber = random.nextInt(1, 11);  
            raha--;
            if (randomNumber ==7 || rng1==7||rng2==7){
                raha+=3;
            }
            int parit=0;
            if (randomNumber==7) parit++;
            if(rng1==7) parit++;
            if(rng2==7) parit++;
                if(parit==2){
                    raha=+5;
                }
    }
        if(randomNumber ==7 &&rng1==7&&rng2==7){
                            System.out.println("$$$$$$$");
                        System.out.println("Voitit! Rahasi on "+raha);
                            System.out.println("$$$$$$$");
            } else {
                 System.out.println("Rahat loppui. Pelaa udelleen?");
            }

        scan.close();
         
    }
}
