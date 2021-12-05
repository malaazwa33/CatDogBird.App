package com.example.aplikasiku;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import com.example.aplikasiku.model.Anjing;
import com.example.aplikasiku.model.Hewan;
import com.example.aplikasiku.model.Kucing;
import com.example.aplikasiku.model.Burung;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing("Angora", "Turki",
                "Aslinya berasal dari Ankara, Turki dengan ciri khas berbulu panjang dan lembut", R.drawable.cat_angora));
        kucings.add(new Kucing("Bengal", "Inggris",
                "Merupakan hasil persilangan antara Kucing Leopard Asia dengan kucing domestik Inggris", R.drawable.cat_bengal));
        kucings.add(new Kucing("Birmani", "Birma/Myanmar",
                "Konon awalnya merupakan ras kucing yand biasa menemani para biksu yang menetap pada kuil di Birma", R.drawable.cat_birman));
        kucings.add(new Kucing("Persia", "Iran",
                "Kucing berbulu panjang dengan wajah bundar dan hidung pesek. Awalnya berasal dari Iran kemudian diimpor ke Italia", R.drawable.cat_persia));
        kucings.add(new Kucing("Siam", "Thailand",
                "Kucing hasil turunan dari Wichian Maat (Kucing Thailand) dengan ciri khas berbadan panjang dan langsing, wajah lonjong, telinga lebar, dan mata kebiruan", R.drawable.cat_siam));
        kucings.add(new Kucing("Siberia", "Rusia",
                "Kucing domestik Rusia dengan bulu lebat dan badan besar tapi sangat lincah dan terkenal dengan kemampuan melompatnya ", R.drawable.cat_siberian));
        return kucings;
    }

    private static List<Anjing> initDataAnjing(Context ctx) {
        List<Anjing> anjings = new ArrayList<>();
        anjings.add(new Anjing("Bulldog", "Inggris",
                "Anjing populer yang dikenal dengan badan yang gemuk berotot, wajah seperti kain kusut, dan hidung yang pesek", R.drawable.dog_bulldog));
        anjings.add(new Anjing("Husky", "Alaska,Siberia,Finlandia (daerah bersalju) ",
                "Anjing jenis khusus yang awalnya digunakan untuk menarik kereta salju", R.drawable.dog_husky));
        anjings.add(new Anjing("Kintamani", "Indonesia",
                "Ras anjing asli pulau Bali ", R.drawable.dog_kintamani));
        anjings.add(new Anjing("Samoyed", "Rusia",
                "Anjing yang berasal dari Siberia yang awalnya biasa digunakan untuk menjaga ternak oleh suku Samoyed", R.drawable.dog_samoyed));
        anjings.add(new Anjing("Shepherd", "Jerman",
                "Anjing pintar dan kuat, sekarang banyak digunakan sebagai anjing penjaga, pengawal, dan anjing polisi (K9)", R.drawable.dog_shepherd));
        anjings.add(new Anjing("Shiba", "Jepang",
                "Anjing dari daerah Shiba ini gesit dan lincah sehingga awalnya banyak digunakan untuk berburu ", R.drawable.dog_shiba));
        return anjings;
    }

    private static List<Burung> initDataBurung(Context ctx) {
        List<Burung> burungs = new ArrayList<>();
        burungs.add(new Burung("Jalak", "Bali, Indonesia",
                "Burung jalak Bali mempunyai nama latin Leucopsar rothschildi. Untuk warna dasar dari tubuh burung ini merupakan putih dimana memiliki ujung sayap serta memiliki ekor dengan warna hitam. " +
                        "Keunikan burung ini adalah saat berkicau bulu yang ada pada bagian kepala akan berdiri dengan tegap seperti jambul. ", R.drawable.bird_jalak));
        burungs.add(new Burung("Burung Emu", "Australia",
                "burung ini mempunyai nama ilmiah dromaius novaehollandiae. Burung emu termasuk kedalam salah satu jenis dari burung besar yang juga tidak dapat" +
                        " terbang. Selain itu, burung emu ini adalah burung yang paling tinggi di Australia serta menjadi burung tertinggi kedua di dunia setelah burung unta. ", R.drawable.bird_emu));
        burungs.add(new Burung("Kiwi", "Selandia Baru",
                "Burung kiwi ini adalah salah satu burung yang juga tidak bisa terbang serta merupakan endemik di kawasan Selandia baru. Burung ini juga termasuk pada genus apteryx, yang adalah satu-satunya dai genus yang ada dalam keluarga pterygidae." +
                        " Untuk ukuran dari burung kiwi ini hampir sama dengan seekor ayam domestik. ", R.drawable.bird_kiwi));
        burungs.add(new Burung("Kakapo", "Selandia Baru",
                "Burung ini adalah hewan nokturnal, memiliki wajah yang sangat mirip dengan burung hantu, ketika burung kakapo ini berdiri menyerupai hewan penguin serta cara berjalannya juga sama seperti bebek kecoklatan.", R.drawable.bird_kakapo));
        burungs.add(new Burung("Kenari", "Canary Island",
                "Burung kenari termasuk jenis burung pintar menirukan suara burung lainnya. Karena ukuran tubuhnya kecil, burung kenari tidak terlalu berbahaya untuk anak-anak dan keluarga.", R.drawable.bird_kenari));
        burungs.add(new Burung("Nuri", "Papua, Maluku",
                "Burung nuri sudah dikenal sebagai jenis burung peliharaan yang paling mudah jinak dan paling mudah dalam perawatannya. Burung nuri juga suka bermain dan terkadang sering dilatih untuk melakukan atraksi tertentu. ", R.drawable.bird_nuri));
        return burungs;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataAnjing(ctx));
        hewans.addAll(initDataBurung(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
