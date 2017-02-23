
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nabila AAP
 */
class setor {
     private int saldo;
    public void menabung (int bal, int s){
        if (s%100!=0)
            JOptionPane.showMessageDialog(null,"Mesin ATM BRI Tidak Menerima Uang Koin \nSilahkan Ulangi Kembali!","Transaksi Gagal",0);
        else if (s<50000)
            JOptionPane.showMessageDialog(null,"Besaran Minimal Setor Tunai adalah Rp 50000,00","ERROR",0);
        else if (s>=50000){
            saldo =bal+s;
            JOptionPane.showMessageDialog(null,"Saldo Anda Saat Ini Sebesar : "+ saldo);
    }}
    public int getsaldo(){
    return saldo;
}
}
