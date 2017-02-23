
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
class tarik {
    private int saldo;
    public void ambil (int tab, int t){
        if (t%100!=0)
            JOptionPane.showMessageDialog(null,"Mesin ATM BRI Tidak Menerima Uang Koin \nSilahkan Ulangi Kembali!","Transaksi Gagal",0);
        else{
            if (t>tab)
                JOptionPane.showMessageDialog(null,"Saldo Anda Tidak Mencukupi\nSilahkan Lakukan Penyetoran","Transaksi Gagal",0);
        else if (t<50000)
            JOptionPane.showMessageDialog(null,"Besaran Minimal Pengambilan Tunai adalah Rp 50000,00","ERROR",0);
        else{
            saldo =tab-t;
            JOptionPane.showMessageDialog(null,"Saldo Anda Saat Ini Sebesar : "+ saldo);
            if (tab<=50000)
                JOptionPane.showMessageDialog(null,"Saldo Minimal Harus Rp 50000,00, Segera Lakukan Penyetoran untuk Menghindari Penutupan Akun","CAUTION",2);
            }
        }
    }
    public int getsaldo(){
        return saldo;
    }
}
