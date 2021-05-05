
import java.util.Scanner;


public class Main {
    
    private static Sarkici sarkici=new Sarkici();
    private static Scanner scanner = new Scanner(System.in);

    public static void islemleri_bastir() {
        
        System.out.println("\t 0-İşlemleri Görüntüle");
        System.out.println("\t 1-Şarkıcıları Görüntüle");
        System.out.println("\t 2-Şarkıcı Ekle");
        System.out.println("\t 3-Şarkıcı Güncelle");
        System.out.println("\t 4-Şarkıcı Sil");
        System.out.println("\t 5-Şarkıcı Ara");
        System.out.println("\t 6-Uygulamadan Çık");
        
    }
    
    
    public static void sarkicilari_goruntule()
    {
        sarkici.sarkicilari_bastir();
    }
    public static void sarkici_ekle()
    {
        String yeni_sarkici=scanner.nextLine();
        sarkici.sarkici_ekle(yeni_sarkici);
    }
    public static void sarkici_guncelle()
    { 
        int pozisyon=scanner.nextInt();
        String yeni_sarkici=scanner.nextLine();
        
        sarkici.sarkici_guncelle(yeni_sarkici, pozisyon);
    }
    public static void sarkici_sil()
    {
        int pozisyon=scanner.nextInt();
        
        sarkici.sarkici_sil(pozisyon);
    }
    public static void sarkici_ara()
            
    {
        String sarki=scanner.nextLine();
        
        sarkici.sarkici_ara(sarki);
    }
    public static void main(String [] args )
    {
        System.out.println("\t Şarkıcı Uygulamasına Hoşgeldiniz...");
        
        islemleri_bastir();
        
        boolean cikis = false;
        
        int islem;
        
        while(!cikis) {
            System.out.println("Bir işlem seçiniz:");
            
            islem = scanner.nextInt();
            
            scanner.nextLine();
            
            switch(islem) {
                case 0:
                    islemleri_bastir();
                    break;
                case 1:
                    sarkicilari_goruntule();
                    break;
                case 2:
                    sarkici_ekle();
                    break;
                case 3:
                    sarkici_guncelle();
                    break;
                case 4:
                    sarkici_sil();
                    break;
                case 5:
                    sarkici_ara();
                    break;
                case 6:
                    cikis = true;
                    System.out.println("Uygulamadan çıkılıyor...");
                    break;
           
        
        
        
        
    }
    
}
    }
}