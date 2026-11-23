public interface MetodeBayar {
    String nama();
    // KONTRAK totalBayar:
    //  - hasilnya TIDAK PERNAH negatif
    int totalBayar(int totalBelanja);
}