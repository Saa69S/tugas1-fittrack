/**
Class pengujian untuk memverifikasi class Member.
Membuat beberapa member dan menyimpannya dalam array.
*/
public class TesFitTrack {
    private static final int JUMLAH_MEMBER = 4;

    /**
    Titik masuk program: membuat member dan menyimpannya dalam array.
    @param args argumen command line, tidak dipakai
    */
    public static void main(String[] args) {
        Member[] daftarMember = new Member[JUMLAH_MEMBER];
        
        isiMemberValid(daftarMember);
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
}
