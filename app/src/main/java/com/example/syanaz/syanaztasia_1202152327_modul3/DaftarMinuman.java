package com.example.syanaz.syanaztasia_1202152327_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class DaftarMinuman extends AppCompatActivity {
//menggunakan recyclerview untuk menampilkan list secara lebih rapi dan terstruktur
    private RecyclerView recyclerView;
    private MinumanAdapter mAdapter;

    public static ArrayList<ItemMinuman> dataMinuman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_minuman);
//inisiasi data sebagai dataMinuman dan membuat adapter untuk mengatur data agar ditampilkan dalam recyclreview sbg single item
        dataMinuman = data();
        recyclerView = (RecyclerView)findViewById(R.id.RecyclerList1);
        mAdapter = new MinumanAdapter(dataMinuman);
        recyclerView.setAdapter(mAdapter);

        int gridColumnCount = getResources().getInteger(R.integer.grid_column_count);
//menentukan ukuran dan posisi dari komponen dengan menggunakan layout manager
        recyclerView.setLayoutManager(new GridLayoutManager(this, gridColumnCount));

    }
//menggunakan array untuk memasukkan data-data minuman kedalam variabel data()
    public ArrayList<ItemMinuman> data(){
        ArrayList<ItemMinuman> data = new ArrayList<>();
        data.add(new ItemMinuman("Vit","Ini adalah air mineral merk VIT","VIT adalah sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Tirta Investama di Indonesia.",R.drawable.vit));
        data.add(new ItemMinuman("Le Minerale","Ini adalah air mineral LE MINERALE","merupakan air mineral yang diambil dari mata air dari Gunung Bromo. Air mineral yang berasal dari sumber air pegunungan yang kaya akan mineral alami yang diperlukan tubuh setiap hari.",R.drawable.leminerale));
        data.add(new ItemMinuman("Pristine","Ini adalah air mineral merk PRISTINE","Sumber mata air PRISTINE murni dan asli berasal dari Pegunungan Pangrango Gede,30 mil dari Jakarta Selatan ( 1.5 jam dari Jakarta Pusat),berlokasi disamping “ Taman Nasional Pangrango Gede”",R.drawable.pristine));
        data.add(new ItemMinuman("Aqua","Ini adalah air mineral merk AQUA","Aqua adalah air minum kemasan yang didirikan oleh Tirto Utomo, warga asli Wonosobo pada 1973. Tirto mendirikan pabrik pertamanya di Pondok Ungu, Bekasi, dengan nama Golden Missisippi. Kapasitas awal pabrik itu enam juta liter per tahun. Tirto sempat ragu dengan nama Golden Missisippi akhirnya mengganti dengan nama Aqua karena cocok terhadap label air minum dalam botol serta tidak sulit untuk diucapkan. ",R.drawable.aqua));
        data.add(new ItemMinuman("Amidis","Ini adalah air mineral merk AMIDIS","AMIDIS adalah produk Air Minum Dalam Kemasan (AMDK) yang sudah diproduksi sejak tahun 1997 dan merupakan air minum distilasi pertama di Indonesia yang telah menjadi salah satu produk AMDK yang dipercaya karena kualitas mutu dan kemurniannya.",R.drawable.amidis));
        data.add(new ItemMinuman("Nestle","Ini adalah air mineral merk NESTLE","Dulu Nestle PureLife bernama Aberfoyle Springs karena diproduksinya oleh Aberfoyle Springs sejak tahun 1993. Namun pada 2002, Nestle membelinya dan mengganti namanya menjadi pun dilakukan menjadi Nestle Pure Life Natural Spring Water. Penjualan produk ini mencapai 5 juta air per hari. Hal yang menarik dari Nestle adalah dari proses pemurnian airnya. Begitupun dengan botol-botolnya, hingga mengalami 12 langkah pemurnian dan peningkatan kualitas.",R.drawable.nestle));
        data.add(new ItemMinuman("Cleo","Ini adalah air mineral merk CLEAO","Air Murni Cleo diambil dari mata air pegunungan dan diproses melalui hyper membrane filter 0,0001 mikron sehingga tidak mengandung mikroorganisme dan mineral anorganik, misalnya chlorine dan natrium fluoride.",R.drawable.cleo));
        data.add(new ItemMinuman("Evian","Ini adalah air mineral merk EVIAN","EVIAN adalah sebuah merek air mineral Perancis yang berasal dari berbagai sumber dekat Évian-les-Bains, di pesisir selatan Lac Léman.",R.drawable.evian));
        data.add(new ItemMinuman("Club","Ini adalah air mineral merk CLUB","Club adalah produk perusahaan Grup Tirta Bahagia (TB) yang berdiri sejak akhir 80an. Saat ini, perusahaan itu telah di akuisisi oleh  PT Indofood CBP Sukses Makmur Tbk (ICBP) melalui dua anak usahanya PT Tirta Makmur Perkasa (TMP) dan PT Tirta Sukses Perkasa (TSP) sebesar Rp 2,2 triliun. Air minum ini awalnya hanya di pasarkan di Jawa Timur, Sekarang kita bisa melihatnya dimana-mana.",R.drawable.club));
        data.add(new ItemMinuman("Equil","Ini adalah air mineral merk EQUIL","Equil adalah air minum yang cukup terkenal di kalangan menengah atas dan ekspatriat. Morgen Sutanto adalah pendiri  PT. Equilindo Lestari dan memulai usahanya tahun 1997. Ia melihat potensi air mineral murni cukup luas terbuka lebar. Para produsen lokal saat itu hanya bermain dalam produk air minum dalam kemasan (AMDK). Untuk air mineral premium masih dikuasai produk impor. Indonesia kaya akan mata air, akan sangat ironis kalau air pun harus mengimpor. Sekarang kita bisa melihat Equil hadir di meja restoran, hotel bintang lima, hingga meja Istana Negara saat rapat kabinet.",R.drawable.equil));



        return data;
    }
}

