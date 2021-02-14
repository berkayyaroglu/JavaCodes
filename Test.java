
public class Test {
    public static void main(String[] args) {
        
        Ogrenci ogrenci1 = new Ogrenci("Berkay", "Yaroğlu", "Sayısal", 12, 9, 12);
        Universite dpu = new Universite(ogrenci1);
        System.out.println(ogrenci1.getOgrenci_puan());
    }
}
