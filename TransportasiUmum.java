package tugasbesarpbo;

class TransportasiUmum {
    String jenis;
    String jadwal;
    String rute;

    public TransportasiUmum(String jenis, String jadwal, String rute) {
        this.jenis = jenis;
        this.jadwal = jadwal;
        this.rute = rute;
    }

    public void cekJadwal() {
        System.out.println("Jadwal " + jenis + ": " + jadwal);
    }

    public void dapatkanRutePerjalanan() {
        System.out.println("Rute Perjalanan " + jenis + ": " + rute);
    }

    public void memasukiKampus() {
    }
}