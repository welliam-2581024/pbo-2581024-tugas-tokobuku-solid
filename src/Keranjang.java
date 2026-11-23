import java.util.ArrayList;

public class Keranjang {
    private ArrayList<Buku> isi = new ArrayList<>();

    public void tambah(Buku buku) {
        isi.add(buku);
    }

    public ArrayList<Buku> getIsi() {
        return isi;
    }

    public int hitungTotal() {
        int total = 0;
        for (Buku b : isi) {
            total += b.hargaAkhir();
        }
        return total;
    }
}