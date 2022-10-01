/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankproses;

/**
 *
 * @author ADT
 */
public class SaldoController {
    private Saldo model;
    private SaldoView view;

    public SaldoController(Saldo model, SaldoView view) 
    {
        this.model = model;
        this.view = view;
    }

    public void setSaldo(int saldo)
    {
        model.setSaldo(saldo);
    }
    public int getSaldo()
    {
        return model.getSaldo();
    }
    public void updateView()
    {
        view.printsaldo(model.getSaldo());
    }
    
}
