package tugasbesarpbo;

class PengunjungKampus {
    String nama;
    String nomorIdentitas;
    JadwalKegiatanKampus jadwalKegiatan;
    TransportasiUmum kendaraan;

    public PengunjungKampus(String nama, String nomorIdentitas, JadwalKegiatanKampus jadwalKegiatan, TransportasiUmum bus) {
        this.nama = nama;
        this.nomorIdentitas = nomorIdentitas;
        this.jadwalKegiatan = jadwalKegiatan;
        this.kendaraan = bus;
    }

    public void cekJadwalKegiatan() {
        System.out.println("Jadwal Kegiatan untuk " + nama + " (" + nomorIdentitas + "):");
        if (jadwalKegiatan != null) {
            jadwalKegiatan.cekWaktuSibuk();
            jadwalKegiatan.cekWaktuSibukLaluLintas();
        } else {
            System.out.println("Jadwal kegiatan tidak tersedia.");
        }
        if (kendaraan != null) {
            System.out.println("Jadwal Bus: Setiap 30 menit");
            kendaraan.memasukiKampus();
        } else {
            System.out.println("Kendaraan tidak tersedia.");
        }
    }
}