/**
Class pengujian untuk memverifikasi class Member.
Membuat beberapa member dan menyimpannya dalam array.
*/
public class TesFitTrack {
    private static final int JUMLAH_MEMBER = 5;
    private static final String NO_TELEPON_SALAH = "81234";
    private static final String PAKET_SALAH = "Gold";

    /**
    Titik masuk program: membuat member dan menyimpannya dalam array.
    @param args argumen command line, tidak dipakai
    */
    public static void main(String[] args) {
        Member[] daftarMember = new Member[JUMLAH_MEMBER];
        
        isiMemberValid(daftarMember);
        isiMemberTidakValid(daftarMember);
        cetakSemuaMember(daftarMember);
    }
    
    /**
    Mengisi array dengan member yang datanya valid:
    tiga jenis paket berbeda dan satu member tanpa paket.
    @param daftarMember array yang akan diisi
    */
    private static void isiMemberValid(Member[] daftarMember) {
        daftarMember[0] = new Member("As-Sajadah Khaira", "081234567890", "15-08-2026", Member.PAKET_BASIC);
        daftarMember[1] = new Member("Kyandaru Annisa Putri", "081234567891", "20-08-2026", Member.PAKET_PREMIUM);
        daftarMember[2] = new Member("Najahal Khaira", "081234567892", "25-09-2026", Member.PAKET_VIP);
        daftarMember[3] = new Member("Raisa Fahira", "081234567893", "30-09-2026");
    }

    /**
    Mengisi posisi terakhir array dengan member yang nomor telepon dan
    jenis paketnya melanggar aturan validasi.
    @param daftarMember array yang akan diisi
    */
    private static void isiMemberTidakValid(Member[] daftarMember) {
        daftarMember[JUMLAH_MEMBER - 1] = new Member("Siti Tara Maisura", NO_TELEPON_SALAH, "05-10-2026", PAKET_SALAH);
    }

    /**
    Mencetak seluruh member dalam array memakai perulangan for
    @param daftarMember array member yang akan dicetak
    */
    private static void cetakSemuaMember(Member[] daftarMember) {
        for (int i = 0; i < daftarMember.length; i++) {
            System.out.println((i + 1) + ". " + daftarMember[i]);
        }
    }
}
