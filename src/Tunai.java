public class Tunai implements MetodeBayar {
    @Override
    public String nama() {
        return "Tunai";
    }

    @Override
    public int totalBayar(int totalBelanja) {
        return totalBelanja;
    }
}