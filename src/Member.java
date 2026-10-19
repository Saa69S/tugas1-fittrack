/**
Merepresentasikan satu member yang terdaftar di Sistem gym FitTrack.
Class Member ini menyimpan beberapa data dari member beserta method getter dan setter nya
*/
public class Member {
    private static final String PREFIKS_PENOLAKAN = "Terjadi Kesalahan!";
    private String nama;
    private String noTelepon;
    private String tanggalDaftar;
    private String jenisPaket;

    /**
    Membuat member baru dengan data lengkap
    @param nama                Nama Lengkap Member
    @param noTelepon           Nomor Telepon Member
    @param tanggalDaftar       Tanggal Pertama Kali Mendaftar 
    @param jenisPaket          Jenis Paket Keanggotaan
    */
    public Member(String nama, String noTelepon, String tanggalDaftar, String jenisPaket) {
        this.nama = nama;
        this.noTelepon = noTelepon;
        this.tanggalDaftar = tanggalDaftar;
        this.jenisPaket = jenisPaket;
    }

    /**
    Membuat method getter nama untuk mengambil nama member
    @return yaitu mengembalikan nilai dari nama lengkap member
    */
    public String getNama() {
        return nama;
    }

    /**
    Membuat method setter nama untuk mengubah nama member
    @param nama yaitu nama baru member
    */
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    /**
    Membuat method getter NoTelepon untuk mengambil nomor telepon member
    @return yaitu mengembalikan nilai dari nomor telepon member
    */
    public String getNoTelepon() {
        return noTelepon;
    }

    /**
    Membuat method setter NoTelepon untuk mengubah nomor telepon member
    @param noTelepon yaitu nomor telepon baru
    */
    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    /**
    Membuat method getter TanggalDaftar untuk mengambil tanggal daftar member.
    @return yaitu mengembalikan nilai tanggal member pertama kali mendaftar
    */
    public String getTanggalDaftar() {
        return tanggalDaftar;
    }

    /**
    Membuat method setter TanggalDaftar untuk mengubah tanggal daftar member.
    @param tanggalDaftar yaitu tanggal baru, contoh 17-08-2026
    */
    public void setTanggalDaftar(String tanggalDaftar) {
        this.tanggalDaftar = tanggalDaftar;
    }

    /**
    Membuat method getter JenisPaket untuk mengambil jenis paket member.
    @return yaitu mengembalikan nilai dari jenis paket keanggotaan
    */
    public String getJenisPaket() {
        return jenisPaket;
    }

    /**
    Membuat method setter JenisPaket untuk mengubah jenis paket member.
    @param jenisPaket yaitu jenis paket baru
    */
    public void setJenisPaket(String jenisPaket) {
        this.jenisPaket = jenisPaket;
    }
    
    /**
    Menghasilkan representasi teks dari objek member dengan rapi
    Method ini menggantikan output bawaan yang hanya berupa alamat memori,
    sehingga data member bisa langsung dibaca saat dicetak.
    @return teks berisi nama, nomor telepon, tanggal daftar, dan jenis paket member
    */
    @Override 
    public String toString() {
        return  "Member [Nama = "+ nama + ", No Telepon = "+ noTelepon + ", Tanggal Daftar = "+ tanggalDaftar + ", Jenis Paket = "+ jenisPaket + "]";
    }

    /**
    Mencetak pesan penolakan validasi ke layar dalam format yang seragam.
    Pesan berisi alasan nilai ditolak dan nilai lama yang tetap dipertahankan,
    @param alasan    penjelasan mengapa nilai yang dimasukkan ditolak
    @param nilaiLama nilai atribut sebelumnya yang tetap dipakai setelah penolakan
    */
    private void cetakPenolakan (String alasan, String nilaiLama) {
        System.out.println (PREFIKS_PENOLAKAN + alasan + " Nilai lama dipertahankan: " + nilaiLama);
    }
}
