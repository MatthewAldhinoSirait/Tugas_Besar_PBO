package tugasbesarpbo;

abstract class Kendaraan {
    String nomorKendaraan;
    String jenisKendaraan;
    String pemilik;

    public Kendaraan(String nomorKendaraan, String jenisKendaraan, String pemilik) {
        this.nomorKendaraan = nomorKendaraan;
        this.jenisKendaraan = jenisKendaraan;
        this.pemilik = pemilik;
    }

    public abstract void memasukiKampus();

    public abstract void meninggalkanKampus();
}