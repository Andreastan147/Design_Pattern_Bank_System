/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO_Patterm;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ADT
 */
public class NasabahDaolmpl implements NasabahDao{
    List<Nasabah> nasabah;

    public NasabahDaolmpl() 
    {
        nasabah = new ArrayList<Nasabah>();
        nasabah.add(new Nasabah("Andreas David DL Hardi",0));
        nasabah.add(new Nasabah("6702020009", 1));
        nasabah.add(new Nasabah("uang yang anda setor/tarik harus kelipatan 50.000",2));
        nasabah.add(new Nasabah("MAAF SALDO ANDA KURANG!!! ", 3));
    }
    @Override
    public List<Nasabah> getAllNasabah() {
        return nasabah;
    }

    @Override
    public Nasabah getNasabah(int rollNo) {
        return nasabah.get(rollNo);
    }
    
}
