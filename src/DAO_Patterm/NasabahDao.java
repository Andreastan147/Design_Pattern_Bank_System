/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO_Patterm;

import java.util.List;

/**
 *
 * @author ADT
 */
public interface NasabahDao {
    public List<Nasabah> getAllNasabah();
    public Nasabah getNasabah(int rollNo);
}
