public class TokoBukuSolid {
    public static void main(String[] args) {
        BukuCetak cetak1 = new BukuCetak("Pemrograman Java", "John Doe", 120000, 750);
        BukuCetak cetak2 = new BukuCetak("Algoritma Dasar", "Jane Smith", 95000, 400);
        BukuDigital digital = new BukuDigital("Belajar OOP", "Ani Wijaya", 80000, 12.5);
        BukuAudio audio = new BukuAudio("Kisah Programmer", "Budi Santoso", 60000, 240);

        Keranjang pertama = new Keranjang();
        pertama.tambah(cetak1);
        pertama.tambah(cetak2);
        pertama.tambah(digital);
        pertama.tambah(audio);

        Keranjang kedua = new Keranjang();
        kedua.tambah(digital);

        StrukPrinter printer = new StrukPrinter();

        printer.cetakKeranjang("KERANJANG PERTAMA", pertama);
        System.out.println();
        printer.cetakKeranjang("KERANJANG KEDUA", kedua);
    }
}