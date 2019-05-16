package retail;

import money.Wallet;

import java.util.Scanner;

public class Gift_Shop {

    public static void displayGiftShop(){
        int choice;
        int ratPoisoning = -2;
        int strongRatPoison = -4;
        int goldFish = -6;
        int petFood = -4;
        int creamOfMushroomCan = -5;
        int toyAnimal = -3;
        int zooPuzzle = -4;
        int slingshotMonkey = -5;
        int toyZoo = -7;
        int zooCup = -6;
        Scanner input = new Scanner(System.in);
        m("Welcome to the Zoo Concessions stand");
        m("What would you like to order?");
        m("1) Rat Poisoning - $2");
        m("2) Strong Rat Poisoning - $4");
        m("3) Gold Fish - $6");
        m("4) Pet Food - $4");
        m("5) Cream of Mushrooms Can - $5");
        m("6) Toy Animal - $3");
        m("7) Zoo Puzzle - $4");
        m("8) Slingshot Monkey - $5");
        m("9) Toy Zoo - $7");
        m("10) Zoo Cup - $6");

        choice = input.nextInt();
        Wallet wallet1 = new Wallet();
        switch(choice){
            case 1:
                //Price of order
                wallet1.getWallet(ratPoisoning);
                break;
            case 2:
                //price of order
                wallet1.getWallet(strongRatPoison);
                break;
            case 3:
                //price of order
                wallet1.getWallet(goldFish);
                break;
            case 4:
                //price of order
                wallet1.getWallet(petFood);
                break;
            case 5:
                //price of order
                wallet1.getWallet(creamOfMushroomCan);
                break;
            case 6:
                //price of order
                wallet1.getWallet(toyAnimal);
                break;
            case 7:
                //price of order
                wallet1.getWallet(zooPuzzle);
                break;
            case 8:
                //price of order
                wallet1.getWallet(slingshotMonkey);
                break;
            case 9:
                //price of order
                wallet1.getWallet(toyZoo);
                break;
            case 10:
                //price of order
                wallet1.getWallet(zooCup);
                break;
            default:
                m("We don't have that item");
        }

    }
    public static void m(String m){
        System.out.println(m);
    }
}
