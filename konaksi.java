package akbar;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class konaksi {
    
    static Connection sambung;
    public static Connection gettConnection(){
        try{
            sambung=DriverManager.getConnection("jdbc:mysql://localhost/harsyajava","root","");
                
        }catch (Exception e){
            JOptionPane.showConfirmDialog(null, "Koneksi Gagal");
        }return sambung;
    }
    
    
}
