/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodusok;

/**
 *
 * @author tumpi
 */
public class MetodusokGyak1 {
    public static void main(String[] args){
        int osszeg = elso10SzamOsszege();
        String kimenet ="Az elsõ 10 szám összege: " + osszeg + "\n";
        kiir(kimenet);
        
        int szam1 = 7, szam2 = 4, szam3 = 2, szam4 = 10;
        kiir("%d + %d + %d + %d = %d\n".formatted(szam1, szam2, szam3, szam4, osszeg));
    }
    
    private static int elso10SzamOsszege(){
        //összead
        int osszeg = 0;
        for (int i = 0; i < 10; i++){
            osszeg += i;
        
        }
        return osszeg;
}
 private static int osszead(int a, int b) {
    return a + b;
  }
 
private static void kiir(String szoveg) {
    System.out.print(szoveg);
}
}
