/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankproses;

import DAO_Patterm.NasabahDaolmpl;
import DAO_Patterm.Nasabah;
import MVC_PAtterm.SaldoController;
import MVC_PAtterm.SaldoView;
import MVC_PAtterm.Saldo;
import java.util.Scanner;

/**
 *
 * @author ADT
 */
public class Bankproses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ambil = 0,simpan = 0;
        Scanner pilih = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        
        //DAO PATTERN
        NasabahDaolmpl nasabahDao = new NasabahDaolmpl();
        
        //MVC PATTERN
        Saldo model = retrievefromdatabase();
        
        SaldoView view = new SaldoView();
        
        SaldoController controller = new SaldoController(model, view);
        
        //SINGLETON PATTERN 
        MenuTidakAda show = MenuTidakAda.getInstance();
        
        System.out.println("============== BANK ABC ==============");
        Nasabah nama = nasabahDao.getNasabah(0);
        Nasabah norek = nasabahDao.getNasabah(1);
        System.out.println("Nama  Nasabah : "+ nama.getName());
        System.out.println("\tNo Rekening : "+ norek.getName());
        System.out.println("======================================");


    for (int i = 1; i >= 1 ; i++) 
    {
        System.out.println("\nPilih Menu ATM ");
        System.out.println(" 1. Cek Saldo \n 2. Simpan Uang \n 3. Ambil Uang \n 4. Keluar");        
        int menu = pilih.nextInt();
        
        switch (menu) 
        {
            case 1:
                controller.updateView();
                break;
            case 2:
                System.out.print("Masukan Uang disimpan Rp. ");
                simpan = input.nextInt();
                controller.updatesaldo(simpan);
                break;
            case 3:
                System.out.print("Masukan Uang diambil RP. ");
                ambil = input.nextInt();
                controller.tariksaldo(ambil);
                break;
            case 4:
                System.out.println("========SELAMAT TINGGAL========");
                System.exit(0);
                break;
            default:
                show.showMessage();
        }
    }
}
    private static Saldo retrievefromdatabase() {
        Saldo saldo = new Saldo();
        saldo.setSaldo(0);
        return saldo;
    }
}