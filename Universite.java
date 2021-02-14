
public class Universite {
    
    private static final int baraj_notu = 120;
    private Ogrenci ogrenci;

    public Universite(Ogrenci ogrenci) {
        this.ogrenci = ogrenci;
    }
    
    public Ogrenci getOgrenci() {
        return ogrenci;
    }

    public void setOgrenci(Ogrenci ogrenci) {
        this.ogrenci = ogrenci;
    }
    
    public boolean ogrenciKabulSorgula()
    {
        if(ogrenci.getOgrenci_puan() < baraj_notu)
        {
            return false;
        }
        
        else if(ogrenci.getOgrenci_puan() >= baraj_notu)
        {
            return true;
        }
        else 
            return false;
    }
    
}
