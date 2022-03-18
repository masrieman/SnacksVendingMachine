/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package vendingmachine;

/**
 *
 * @author GoldenTech
 */
public enum Snack {
   TWIX(1,10), Lotus(2,50), Cadbury(3,50), Nestle(4,30), Kitkat(5,50),
   COKE(6,100), Pepsi(7,50), Sprite(8,100), Fanta(9,100), Redbull(10,100),
   IcedTea(11,100), IcedCoffee(12,50), AppleـJuice(13,20), OrangeJuice(14,150), Water(15,3),
    Lays(16,40), Doritos(17,50), Pringles(18,30), Ruffless (19,50), Parle(20,20),
     Mars(21,100), Ferrero(22,10), Hershey(23,50), Fantsa(24,100),  laviva(25,20),Empty(26,0);
   
   private int number;
    private long price;
   Snack(int number, long price)
   {
       this.number = number;
        this.price = price;
   }
   public int getNumber(){
        return number;
    }

    public long getPrice(){
        return this.price;
    }
    
}
