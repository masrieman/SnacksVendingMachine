/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vendingmachine;

import java.util.Scanner;

/**
 *
 * @author GoldenTech
 */
public class MainProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
        
        IVendingMachine vendingMachine=new VendingMachine();
        vendingMachine.displaySnacks();     
       
        int SnackNumber= scanner.nextInt(); 
        vendingMachine.SelectedSnackNumber(SnackNumber);
        
  vendingMachine.InsertMoney(CoinSlot.FIFTY_CENTS);
  //vendingMachine.InsertMoney(NotesSlot.TWENTY_Dollar);
    

       
        
    }
    
}
