
import java.util.ArrayList;


public class Sarkici {
    
    ArrayList<String> sarkiciListesi=new ArrayList<String>();
    
    public void sarkicilari_bastir()
    {
        for(int i=0;i<sarkiciListesi.size();i++)
        {
            System.out.println(sarkiciListesi.get(i));
        }
    }
    public void sarkici_ekle(String eklenenSarkici)
    {
        sarkiciListesi.add(eklenenSarkici);
    }
    public void sarkici_guncelle(String yeni_sarkici ,int pozisyon)
    {
        sarkiciListesi.set(pozisyon,"yeni_sarkici");
    }
    public void sarkici_sil(int pozisyon)
    {
        sarkiciListesi.remove(pozisyon);
    }
    
    public void sarkici_ara(String sarkici_ismi)
    {
        int pozisyon=sarkiciListesi.indexOf(sarkici_ismi);
        
        if(pozisyon >=0 )
        {
            System.out.println(pozisyon);
        }
        else
            System.out.println("Şarkıcı ismi bulunamadı...");
        
        
        
        
    }
}
