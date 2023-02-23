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
        
        int szam1 = 7, szam2 =4;
        kiir("%d + %d = %d\n".formatted(osszead(szam1, szam2)))
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
