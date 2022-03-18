/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package vendingmachine;

/**
 *
 * @author GoldenTech
 */
public enum CoinSlot implements ISlotMoney{
    TEN_CENTS(10),  TWENTY_CENTS(20), FIFTY_CENTS(50),One_Dollar(100);
     private int value;

    CoinSlot(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
    
}
