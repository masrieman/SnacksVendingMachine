/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vendingmachine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author GoldenTech
 */
public class VendingMachine implements  IVendingMachine {
    private int SnackNumber;
    private Snack SelectedSnack;
    private long insertedMoney;
    
 @Override
    public void displaySnacks() {
         for(Snack snack: Snack.values()){
            if(!Snack.Empty.equals(snack)) {
                
                System.out.println("     " + snack.getNumber() + "  " + snack.name() +  "   ");
            }
        }
        System.out.println("                                              ");
        System.out.println(" Please select your Snack: ");
        
       
        
 }

   public void SelectedSnackNumber(int SnackNumber)
    {
        var validSnackNumber=false;
        for(Snack snack: Snack.values()){
            if(snack.getNumber()==SnackNumber)
            {
                System.out.println("     Your  Snack is " + snack.name()  +", Price: "+ snack.getPrice() +  "   ");
                System.out.println(" Please enter sufficient amount of money: ");
                this.SelectedSnack=snack;
                validSnackNumber=true;
                break;
            }    
        }
        if(validSnackNumber==false)
        {
             System.out.println("     Invalid Snack Number ");
        }
    }
  
   public void InsertMoney(ISlotMoney Money)
   {
       TotalMoney(Money);
        ValidateMoney();
        
   
   }
 private void TotalMoney(ISlotMoney money) {
      
        insertedMoney += money.getValue();
        
    }
 
   private void ValidateMoney()
   {
        System.out.println("Total Money Entered: "+ this.insertedMoney);
        if ( SelectedSnack.getPrice()<= insertedMoney) {
            getSnackAndChange();
           
        }else
        {
            System.out.println("Enter Sufficient amount of money please");
        }
        
        }
   private void getSnackAndChange()
   {
       long change=insertedMoney - SelectedSnack.getPrice() ;
       CalculateChange(change);
      
        
        
   }
   private void CalculateChange(long amount)  {
        List<ISlotMoney> change = new ArrayList<>();
        int TotalChangeAmount=0;
        while (amount >= 10) {
            if (NotesSlot.TWENTY_Dollar.getValue() <= amount)
            {
                amount -= NotesSlot.TWENTY_Dollar.getValue();
                change.add(NotesSlot.TWENTY_Dollar);
            } else if (CoinSlot.One_Dollar.getValue() <= amount ) {
                amount -= CoinSlot.One_Dollar.getValue();
                change.add(CoinSlot.One_Dollar);
            } else if (CoinSlot.FIFTY_CENTS.getValue() <= amount) {
                amount -= CoinSlot.FIFTY_CENTS.getValue();
                change.add(CoinSlot.FIFTY_CENTS);
            } else if (CoinSlot.TWENTY_CENTS.getValue() <= amount) {
                amount -= CoinSlot.TWENTY_CENTS.getValue();
                change.add(CoinSlot.TWENTY_CENTS);
            } else if (CoinSlot.TEN_CENTS.getValue() <= amount) {
                amount -= CoinSlot.TEN_CENTS.getValue();
                change.add(CoinSlot.TEN_CENTS);
            } else if (amount >= 10) {
                System.out.println("No enough change");
            }
        }
         for(ISlotMoney changeAmount: change) {
             int changes=changeAmount.getValue();
            System.out.print(changes +" Cent  ");
             TotalChangeAmount +=changes;
                 System.out.println(" ");
        }
        System.out.println("You can get the Snack and the total Change is "+ TotalChangeAmount +" Cent" );
       
        
}
    }
   
   

    

