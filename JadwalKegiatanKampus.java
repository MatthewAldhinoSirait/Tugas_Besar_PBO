package tugasbesarpbo;

import java.util.List;

public class JadwalKegiatanKampus {
    List<String> daftarKegiatan;
    List<String> waktuPelaksanaan;
    List<String> waktuSibukLaluLintas;

    public JadwalKegiatanKampus(List<String> daftarKegiatan, List<String> waktuPelaksanaan, List<String> waktuSibukLaluLintas) {
        if (daftarKegiatan.size() != waktuPelaksanaan.size() || daftarKegiatan.size() != waktuSibukLaluLintas.size()) {
            throw new IllegalArgumentException("Daftar Harus Memiliki Ukuran Yang Sama");
        }

        this.daftarKegiatan = daftarKegiatan;
        this.waktuPelaksanaan = waktuPelaksanaan;
        this.waktuSibukLaluLintas = waktuSibukLaluLintas;
    }

    public void cekWaktuSibuk() {
        for (int i = 0; i < daftarKegiatan.size(); i++) {
            System.out.println("Kegiatan Kampus Hari Ini: " + daftarKegiatan.get(i));
            System.out.println("Waktu: " + waktuPelaksanaan.get(i));
        }
    }

    public void cekWaktuSibukLaluLintas() {
        System.out.println("Waktu Sibuk Lalu Lintas:");
        for (String waktu : waktuSibukLaluLintas) {
            System.out.println(waktu);
        }
    }
}