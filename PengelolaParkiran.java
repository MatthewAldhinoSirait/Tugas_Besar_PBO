package tugasbesarpbo;

class PengelolaParkiran {
    String namaPengelola;
    Parkir parkir;

    public PengelolaParkiran(String namaPengelola, Parkir parkir) {
        this.namaPengelola = namaPengelola;
        this.parkir = parkir;
    }

    public void kelolaParkiran() {
        System.out.println("Pengelola Parkiran: " + namaPengelola);
        parkir.updateJumlahTerisi();
        parkir.cekKetersediaan();
    }
}