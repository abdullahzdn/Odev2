
    public class Ogrenci {
        private String ad;
        private String bolum;
        private int girisyili;
        private String ogrNo;
        private double gano;
        private String bolumKodu;
        private int dersSayisi;
        private int uzatilanYil;


        public Ogrenci(String ad, String bolum, int girisyili, String bolumKodu, double gano,int dersSayisi,int uzatilanYil) {
            this.ad = ad;
            this.bolum = bolum;
            this.girisyili = girisyili;
            this.bolumKodu = bolumKodu;
            this.setGano(gano);
            this.ogrNo = OgrNo(girisyili, bolumKodu);
            this.dersSayisi=dersSayisi;
            this.uzatilanYil=uzatilanYil;
        }

        public void setDersSayisi(int dersSayisi) {
            this.dersSayisi = dersSayisi;
        }

        public void setUzatilanYil(int uzatilanYil) {
            this.uzatilanYil = uzatilanYil;
        }

        public int getDersSayisi() {
            return dersSayisi;
        }

        public int getUzatilanYil() {
            return uzatilanYil;
        }

        public String getAd() {
            return ad;
        }

        public void setAd(String ad) {
            this.ad = ad;
        }

        public String getBolum() {
            return bolum;
        }

        public void setBolum(String bolum) {
            this.bolum = bolum;
        }

        public int getGirisyili() {
            return girisyili;
        }

        public void setGirisyili(int girisyili) {
            this.girisyili = girisyili;
        }

        public String getOgrNo() {
            return ogrNo;
        }

        private void setOgrNo(String ogrNo) {
            this.ogrNo = ogrNo;
        }

        public double getGano() {
            return gano;
        }

        public void setGano(double gano) {
            if (gano > 4.0) {
                throw new IllegalArgumentException("Ganonuz 4'ten büyük olamaz");
            }
            this.gano = gano;
        }
        public String getBolumKodu() {
            return bolumKodu;
        }

        public void setBolumKodu(String bolumKodu) {
            this.bolumKodu = bolumKodu;
        }

        private String OgrNo(int girisyili, String bolumKodu) {
            int girisSirasi = 231;
            return String.format("%d%s%04d", girisyili, bolumKodu,girisSirasi);
        }

       public double harcHesaplama(int dersSayisi){
            return dersSayisi*450;
       }
       public double harcHesaplama(int dersSayisi,int uzatilanYil){
            return ((dersSayisi*450)+(uzatilanYil*1000));
       }


    }








