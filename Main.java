package tugasbesarpbo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Inisialisasi Kendaraan
        Kendaraan kendaraan1 = new Kendaraan("B 1234 CD", "Mobil", "Mahasiswa") {
            @Override
            public void memasukiKampus() {
                System.out.println("Kendaraan " + jenisKendaraan + " (" + nomorKendaraan + ") milik " + pemilik + " memasuki kampus");
            }

            @Override
            public void meninggalkanKampus() {
                System.out.println("Kendaraan " + jenisKendaraan + " (" + nomorKendaraan + ") milik " + pemilik + " meninggalkan kampus");
            }
        };

        Kendaraan kendaraan2 = new Kendaraan("D 5678 EF", "Motor", "Staf") {
            @Override
            public void memasukiKampus() {
                System.out.println("Kendaraan " + jenisKendaraan + " (" + nomorKendaraan + ") milik " + pemilik + " memasuki kampus");
            }

            @Override
            public void meninggalkanKampus() {
                System.out.println("Kendaraan " + jenisKendaraan + " (" + nomorKendaraan + ") milik " + pemilik + " meninggalkan kampus");
            }
        };

        Kendaraan kendaraan3 = new Kendaraan("F 9101 GH", "Mobil", "Mahasiswa") {
            @Override
            public void memasukiKampus() {
                System.out.println("Kendaraan " + jenisKendaraan + " (" + nomorKendaraan + ") milik " + pemilik + " memasuki kampus");
            }

            @Override
            public void meninggalkanKampus() {
                System.out.println("Kendaraan " + jenisKendaraan + " (" + nomorKendaraan + ") milik " + pemilik + " meninggalkan kampus");
            }
        };

        kendaraan1.memasukiKampus();
        kendaraan2.memasukiKampus();
        kendaraan3.memasukiKampus();

        Kendaraan kendaraanKeluar1 = new Kendaraan("J 1213 KL", "Motor", "Staf") {
            @Override
            public void memasukiKampus() {
                System.out.println("Kendaraan " + jenisKendaraan + " (" + nomorKendaraan + ") milik " + pemilik + " memasuki kampus");
            }

            @Override
            public void meninggalkanKampus() {
                System.out.println("Kendaraan " + jenisKendaraan + " (" + nomorKendaraan + ") milik " + pemilik + " meninggalkan kampus");
            }
        };
        kendaraanKeluar1.meninggalkanKampus();

        Kendaraan kendaraanKeluar2 = new Kendaraan("A 7943 SB", "Mobil", "Mahasiswa") {
            @Override
            public void memasukiKampus() {
                System.out.println("Kendaraan " + jenisKendaraan + " (" + nomorKendaraan + ") milik " + pemilik + " memasuki kampus");
            }

            @Override
            public void meninggalkanKampus() {
                System.out.println("Kendaraan " + jenisKendaraan + " (" + nomorKendaraan + ") milik " + pemilik + " meninggalkan kampus");
            }
        };
        kendaraanKeluar2.meninggalkanKampus();

        // Inisialisasi TransportasiUmum
        TransportasiUmum bus = new TransportasiUmum("Bus", "Setiap 30 menit", "Rute Depok-Pasar Minggu");

        bus.cekJadwal();
        bus.dapatkanRutePerjalanan();

        TransportasiUmum angkot = new TransportasiUmum("Angkot", "Setiap 5 menit", "Rute Depok-Lenteng Agung");

        angkot.cekJadwal();
        angkot.dapatkanRutePerjalanan();

        TransportasiUmum kereta = new TransportasiUmum("Kereta", "Setiap 15 menit", "Rute Bogor-Jakarta Kota");
        kereta.cekJadwal();
        kereta.dapatkanRutePerjalanan();

        // Inisialisasi JadwalKegiatanKampus
        List<String> kegiatanKampusList = new ArrayList<>();
        kegiatanKampusList.add("Seminar Teknologi");
        kegiatanKampusList.add("Pancasila Festival");

        List<String> waktuPelaksanaanList = new ArrayList<>();
        waktuPelaksanaanList.add("Pukul 09.00 - 14.00");
        waktuPelaksanaanList.add("Pukul 19.00 - 22.00");

        List<String> waktuSibukLaluLintasList = new ArrayList<>();
        waktuSibukLaluLintasList.add("Pukul 07.00 - 09.00");
        waktuSibukLaluLintasList.add("Pukul 17.00 - 19.00");

        JadwalKegiatanKampus jadwalKegiatanKampus = new JadwalKegiatanKampus(kegiatanKampusList, waktuPelaksanaanList, waktuSibukLaluLintasList);

        // Inisialisasi PengunjungKampus
        PengunjungKampus pengunjungKampus = new PengunjungKampus("Matthew Aldhino Sirait", "4522210087", jadwalKegiatanKampus, bus);
        pengunjungKampus.cekJadwalKegiatan();

        // Inisialisasi Parkiran
        Parkiran parkiran1 = new Parkiran(100, 75);
        Parkiran parkiran2 = new Parkiran(60, 48);

        // Inisialisasi PengelolaParkiran
        PengelolaParkiran pengelolaParkiran1 = new PengelolaParkiran("Pak Yoel", parkiran1);
        pengelolaParkiran1.kelolaParkiran();

        PengelolaParkiran pengelolaParkiran2 = new PengelolaParkiran("Pak Edwin", parkiran2);
        pengelolaParkiran2.kelolaParkiran();
    }
}