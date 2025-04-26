/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan601;

/**
 *
 * @author Ari Widya
 * TGL : 26 April 2025
 */
public class Pertemuan601 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        buah apel = new buah();
        apel.warna = "Hijau";
        apel.SetRasa ("Manis");
        System.out.printf("Warna Apel diset %s", apel.warna);
        System.out.printf("\nRasa Apel diset %s", apel.getRasa());
        
        buah anggur = new buah();
        anggur.warna = "Ungu";
        anggur.SetRasa("Asem");
        System.out.printf("\nWarna Anggur diset %s", anggur.warna);
        System.out.printf("\nRasa Anggur diset %s\n", anggur.getRasa());

    }
    
}

class buah {
    public String warna;
    String rasa;
    
    public void SetRasa(String txRasa){
        this.rasa = txRasa;   
    }
    public String getRasa(){
    return rasa;
    
    }
}