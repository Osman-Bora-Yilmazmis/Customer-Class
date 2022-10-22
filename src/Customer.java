/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fikre
 */
public class Customer {
    //ID VE AD SOYAD TANIMLANIR
    private int ID;
    private String adSoyad;
    
    public Customer(){
        ID = 0;
        adSoyad = null;
    }
    public Customer(int ID, String adSoyad){
        this.ID=ID;
        this.adSoyad=adSoyad;    
    }

    /**
     * @return the ID
     */
    
    //GET VE SET METODLARI OLUSTURUR
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the adSoyad
     */
    public String getAdSoyad() {
        return adSoyad;
    }

    /**
     * @param adSoyad the adSoyad to set
     */
    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }
    
    //TO STRING METODU OLUSTURUR
    @Override
    public String toString(){
        return String.format("%d  %s  ", getID() ,getAdSoyad() );
        
    }
    
}
