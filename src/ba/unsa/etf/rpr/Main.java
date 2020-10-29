package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    public static int sumaCifara(int broj){
        int zbirC = 0;
        do{
            zbirC = zbirC + broj%10;
            broj = broj/10;
        }while(broj != 0);
        return  zbirC;
    }
    public static void main(String[] args) {

        System.out.println("Unesite broj n: ");
        Scanner ulaz = new Scanner(System.in);
        int n = ulaz.nextInt();
        for(int i = 1; i < n; i++){
           if(i % sumaCifara(i) == 0){
               System.out.println(i);
           }
        }
    }
}
