package tugasbesarpbo;

class Parkiran implements Parkir {
    int kapasitas;
    int jumlahTerisi;

    public Parkiran(int kapasitas, int jumlahTerisi) {
        this.kapasitas = kapasitas;
        this.jumlahTerisi = jumlahTerisi;
    }

    @Override
    public void cekKetersediaan() {
        System.out.println("Ketersediaan tempat parkir: " + (kapasitas - jumlahTerisi) + " slot");
    }

    @Override
    public void updateJumlahTerisi() {
        System.out.println("Jumlah tempat parkir terisi: " + jumlahTerisi);
    }
}