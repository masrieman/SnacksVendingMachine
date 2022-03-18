/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package vendingmachine;

/**
 *
 * @author GoldenTech
 */
public enum NotesSlot  implements ISlotMoney{
     TWENTY_Dollar(2000), FIFTY_Dollar(5000);
     private int value;

    NotesSlot(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
    
}
