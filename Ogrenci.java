
public class Ogrenci {
    
    private String ogrenci_ad;
    private String ogrenci_soyad;
    private String ogrenci_bolum;
    private int mat_net;
    private int fen_net;
    private int turkce_net;
    private int ogrenci_puan;

    public Ogrenci(String ogrenci_ad, String ogrenci_soyad, String ogrenci_bolum,int mat_net, int fen_net, int turk_net) {
        this.ogrenci_ad = ogrenci_ad;
        this.ogrenci_soyad = ogrenci_soyad;
        this.ogrenci_bolum = ogrenci_bolum;
        this.mat_net = mat_net;
        this.fen_net = fen_net;
        this.turkce_net = turk_net;
                
     
        if(ogrenci_bolum.equals("Sayısal"))
        {
            this.ogrenci_puan = Sayisal.puanHesapla(mat_net, fen_net, turk_net);
        }
        
        else if(ogrenci_bolum.equals("Eşit Ağırlık"))
        {
            this.ogrenci_puan = EsitAgirlik.puanHesapla(turk_net, mat_net, fen_net);
        }
    }

    public String getOgrenci_ad() {
        return ogrenci_ad;
    }

    public void setOgrenci_ad(String ogrenci_ad) {
        this.ogrenci_ad = ogrenci_ad;
    }

    public String getOgrenci_soyad() {
        return ogrenci_soyad;
    }

    public void setOgrenci_soyad(String ogrenci_soyad) {
        this.ogrenci_soyad = ogrenci_soyad;
    }

    public String getOgrenci_bolum() {
        return ogrenci_bolum;
    }

    public void setOgrenci_bolum(String ogrenci_bolum) {
        this.ogrenci_bolum = ogrenci_bolum;
    }

    public int getMat_net() {
        return mat_net;
    }

    public void setMat_net(int mat_net) {
        this.mat_net = mat_net;
    }

    public int getFen_net() {
        return fen_net;
    }

    public void setFen_net(int fen_net) {
        this.fen_net = fen_net;
    }

    public int getTurkce_net() {
        return turkce_net;
    }

    public void setTurkce_net(int turkce_net) {
        this.turkce_net = turkce_net;
    }

    public int getOgrenci_puan() {
        return ogrenci_puan;
    }

    public void setOgrenci_puan(int ogrenci_puan) {
        this.ogrenci_puan = ogrenci_puan;
    }
    
    
    
}
