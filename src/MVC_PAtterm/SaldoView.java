/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC_PAtterm;
import DAO_Patterm.Nasabah;
import DAO_Patterm.NasabahDaolmpl;
import java.util.Scanner;
/**
 *
 * @author ADT
 */
public class SaldoView {
    NasabahDaolmpl nasabahDao = new NasabahDaolmpl();
    Nasabah errorinput = nasabahDao.getNasabah(2);
    Nasabah saldokurang = nasabahDao.getNasabah(3);

    int saldoawal = 500000;
    Scanner input = new Scanner(System.in);
    Saldo inputsaldo = new Saldo();
    
    public void printsaldo(int saldo)
    {
      System.out.println("Saldo awal anda adalah : \n--> Rp. " + saldoawal +" <--");
    }
    public void simpanUang(int simpan)
    {
        if(simpan%50000 == 0)
        {
            saldoawal = simpan + saldoawal;
            inputsaldo.setSaldo(saldoawal);
            System.out.println("Saldo anda saat ini adalah : \n--> Rp." + saldoawal +" <--");
        }else 
            System.out.println("======>"+errorinput.getName());
    }
    public void ambiluang(int ambil)
    {
        if (saldoawal <= 100000 || saldoawal <= ambil) {
           System.out.println("======>"+saldokurang.getName());
        }else if(ambil%50000 == 0)
        {
            saldoawal = saldoawal-ambil;
            inputsaldo.setSaldo(saldoawal);
            System.out.println("Saldo anda Saat ini adalah : \n-->Rp." +saldoawal +" <--");
        }else
            System.out.println("======>"+errorinput.getName());
    }
}
