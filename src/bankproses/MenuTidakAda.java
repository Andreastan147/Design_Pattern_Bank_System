/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankproses;

/**
 *
 * @author ADT
 */
public class MenuTidakAda {
    private static MenuTidakAda instance = new MenuTidakAda();
 
    private MenuTidakAda() {}
    
    public static MenuTidakAda getInstance()
    {
        return instance;
    }
    
    public void showMessage()
    {
        System.out.print("Menu Tidak Ada ");
        System.out.print("Ulangi Pilih Menu ATM");
    }
}