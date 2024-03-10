public class Main {
    public static void main(String[] args) {
        System.out.println("Ögrencinin Bilgileri :");
        System.out.println();

        Ogrenci[] ogrenciler = {
                new Ogrenci("Abdullah", "Bilgisayar Mühendisligi", 2022, "123", 3.5,3,1),
                new Ogrenci("Enes", "Endüstiri Mühendisligi", 2019, "109", 2.3,0,0),
                new Ogrenci("Hakan", "Makine Mühendisligi", 2015, "123", 3.4,2,0),
        };
        int i = 1;
        for (Ogrenci ogrenci : ogrenciler) {
            System.out.print("OGR-"+ i + ":" + " ");
            System.out.print(ogrenci.getAd() + " ");
            System.out.print(ogrenci.getBolum() + " ");
            System.out.print(ogrenci.getOgrNo() + " ");
            System.out.println(ogrenci.getGano() + " ");

            i++;
        }
        System.out.println();
        int j=1;
        for (Ogrenci ogrenci : ogrenciler) {
            if (ogrenci.getDersSayisi()==0 && ogrenci.getUzatilanYil()==0) {

            }else
                System.out.println(j+". Ögrencinin Ödeyecegi Harç:"+ ogrenci.harcHesaplama(ogrenci.getDersSayisi(), ogrenci.getUzatilanYil()));
            j++;
        }

    }


}
