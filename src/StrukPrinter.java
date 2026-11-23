public class StrukPrinter {
    private static final int LEBAR = 41;

    public void cetakKeranjang(String judul, Keranjang keranjang) {
        cetakJudul('=', judul);
        for (Buku b : keranjang.getIsi()) {
            System.out.println(b.getJudul() + " (" + b.getPenulis() + ")");
            System.out.println("  Harga       : " + Buku.formatRupiah(b.getHarga()));
            System.out.println("  Keterangan  : " + b.keterangan());
            System.out.println("  Harga akhir : " + Buku.formatRupiah(b.hargaAkhir()));
        }
        System.out.println("-".repeat(LEBAR));
        System.out.println("Total belanja : " + Buku.formatRupiah(keranjang.hitungTotal()));
    }

    public void cetakPembayaran(int totalBelanja, MetodeBayar[] pilihan) {
        cetakJudul('-', "PEMBAYARAN");
        for (MetodeBayar m : pilihan) {
            System.out.printf("%-20s : %s%n", m.nama(),
                Buku.formatRupiah(m.totalBayar(totalBelanja)));
        }
    }

    private void cetakJudul(char garis, String judul) {
        int sisa = LEBAR - judul.length() - 2;
        int kiri = sisa / 2;
        int kanan = sisa - kiri;
        String g = String.valueOf(garis);
        System.out.println(g.repeat(kiri) + " " + judul + " " + g.repeat(kanan));
    }
}