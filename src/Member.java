/**
Merepresentasikan satu member yang terdaftar di Sistem gym FitTrack.
Class Member ini menyimpan beberapa data dari member beserta method getter dan setter nya
*/
public class Member {
    private static final String PREFIKS_PENOLAKAN = "Terjadi Kesalahan!";
    private static final int MINIMAL_PANJANG_TELEPON = 10;
    private static final String AWALAN_NOMOR_TELEPON = "0";
    
    private String nama;
    private String noTelepon;
    private String tanggalDaftar;
    private String jenisPaket;

   /**
    Membuat member baru dengan data lengkap. Setiap nilai dimasukkan lewat setter sehingga otomatis divalidasi.
    @param nama nama lengkap member, tidak boleh kosong
    @param noTelepon nomor telepon, diawali angka 0 dan minimal 10 digit
    @param tanggalDaftar tanggal pertama kali mendaftar, contoh 17-08-2026
    @param jenisPaket  jenis paket keanggotaan
    */
    public Member(String nama, String noTelepon, String tanggalDaftar, String jenisPaket) {
        setNama(nama);
        setNoTelepon(noTelepon);
        setTanggalDaftar(tanggalDaftar);
        setJenisPaket(jenisPaket);
    }

    /**
    Membuat method getter nama untuk mengambil nama member
    @return yaitu mengembalikan nilai dari nama lengkap member
    */
    public String getNama() {
        return nama;
    }

    /**
    Mengubah nama member setelah melalui validasi.
    Jika nama kosong, null, atau hanya berisi spasi, nama lama dipertahankan
    dan pesan penolakan dicetak. Jika valid, nama disimpan setelah spasi di awal dan akhirnya dibuang.
    @param nama nama baru member, tidak boleh kosong atau hanya berisi spasi
    */
    public void setNama(String nama) {
        if (nama == null || nama.trim().isEmpty()) {
            cetakPenolakan("Nama Tidak Boleh Kosong", this.nama);
            return;
        }
        this.nama = nama.trim();
    }
    
    
    /**
    Membuat method getter NoTelepon untuk mengambil nomor telepon member
    @return yaitu mengembalikan nilai dari nomor telepon member
    */
    public String getNoTelepon() {
        return noTelepon;
    }

    /**
    Mengubah nomor telepon member setelah melalui validasi format.
    Jika nomor tidak diawali angka 0 atau kurang dari 10 digit, nomor lama dipertahankan dan pesan penolakan dicetak.
    @param noTelepon nomor telepon baru, wajib diawali angka 0 dan memiliki panjang minimal 10 digit
    */
    public void setNoTelepon(String noTelepon) {
        if (noTelepon == null
            || !noTelepon.startsWith(AWALAN_NOMOR_TELEPON)
            || noTelepon.length() < MINIMAL_PANJANG_TELEPON || hitungKarakter(noTelepon) > 0) {
            cetakPenolakan("Nomor telepon wajib diawali angka " + AWALAN_NOMOR_TELEPON + ", dan minimal " + MINIMAL_PANJANG_TELEPON + " digit", this.noTelepon);
            return;
        }
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
    Mengubah tanggal daftar member setelah divalidasi
    Jika tanggal kosong, tanggal lama dipertahankan dan pesan penolakan dicetak
    @param tanggalDaftar tanggal baru, contoh 17-08-2026
    */
    public void setTanggalDaftar(String tanggalDaftar) {
        if (tanggalDaftar == null || tanggalDaftar.trim().isEmpty()) {
            cetakPenolakan("Tanggal daftar tidak boleh kosong, contoh format: 17-08-2026", this.tanggalDaftar);
            return;
        }
        this.tanggalDaftar = tanggalDaftar.trim();
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

    /**
    Menghitung berapa karakter dalam teks yang bukan angka. Hasil 0 berarti seluruh karakter teks adalah angka.
    @param teks teks yang diperiksa
    @return jumlah karakter yang bukan angka
    */
    private int hitungKarakter(String teks) {
        int jumlah = 0;
        for (int i = 0; i < teks.length(); i++) {
            if (!Character.isDigit(teks.charAt(i))) {
                jumlah++;
            }
        }
        return jumlah;
    }
}
