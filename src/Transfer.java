public class Transfer implements MetodeBayar {
    private static final int BIAYA = 2500;

    @Override
    public String nama() {
        return "Transfer (+" + Buku.formatRupiah(BIAYA) + ")";
    }

    @Override
    public int totalBayar(int totalBelanja) {
        return totalBelanja + BIAYA;
    }
}