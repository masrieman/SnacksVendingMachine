/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package vendingmachine;

/**
 *
 * @author GoldenTech
 */
public interface IVendingMachine {
    void displaySnacks();
 void SelectedSnackNumber(int SnackNumber);
 void InsertMoney(ISlotMoney Money);
}
