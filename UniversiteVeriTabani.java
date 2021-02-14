
public class UniversiteVeriTabani {
    
    public static void main(String[] args) {
        
        Ogrenci ogrenci = new Ogrenci("Berkay", "Yaroğlu", "Sayısal", 12, 15, 4);
        Universite universite = new Universite(ogrenci);
        
        if(universite.ogrenciKabulSorgula())
        {
            System.out.println("Öğrenci baraj puanı geçip üniversiteye kaydolmaya hak kazanmıştır...");
            System.out.println(ogrenci.getOgrenci_puan());
            
        }
        
        else{  
            System.out.println("Öğrenci baraj puanı geçememiştir.");
        }
    }
}
