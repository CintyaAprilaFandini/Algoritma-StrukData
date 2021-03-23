package PERTEMUAN6.Nomor2;
import java.util.Scanner;
public class mainLeague {
    public static void main(String[] args) {
        PremierLeagueService data = new PremierLeagueService();
        PremierLeague[] l = new PremierLeague[20];
        l[0] = new PremierLeague("liverPoll", 29, 45, 82);
        l[1] = new PremierLeague("ManchesterCity", 27, 39, 57);
        l[2] = new PremierLeague("Leichester", 28, 26, 50);
        l[3] = new PremierLeague("Chelsea", 29, 9, 48);
        l[4] = new PremierLeague("WolverhamptonWanderers", 29, 7, 43);
        l[5] = new PremierLeague("SheffieldUnited", 28, 5, 43);
        l[6] = new PremierLeague("manchesterUnited", 28, 12,42);
        l[7] = new PremierLeague("TottenhamHotspur", 29, 7, 41);
        l[8] = new PremierLeague("Arsenal", 28, 4, 40);
        l[9] = new PremierLeague("Burnley", 29, -6, 39);
        l[10] = new PremierLeague("Crystalpalace", 29, -6, 39);
        l[11] = new PremierLeague("Everton", 29, -6, 37);
        l[12] = new PremierLeague("NewcastleUnited", 29, -16, 35);
        l[13] = new PremierLeague("Southamptopm", 29, -17, 34);
        l[14] = new PremierLeague("Brigthon", 29, -8, 29);
        l[15] = new PremierLeague("West Ham United", 29, -15, 27);
        l[16] = new PremierLeague("Watford", 29, -17, 27);
        l[17] = new PremierLeague("AFC Bournemouth", 29, -18, 27);
        l[18] = new PremierLeague("Aston Villa", 27, -18, 25);
        l[19] = new PremierLeague("Norwich City", 29, -27, 21);

        for (int a = 0; a < 20; a++) {
            data.tambah(l[a]);
        }
        
        System.out.println("Daftar Liga Inggris Sebelum Sorting : ");
        data.tampil();

        System.out.println();
        System.out.println("============================================");
        System.out.println("Daftar Liga Inggris Setelah Insertion Sort secara Asc : ");
        data.insertionSortA();
        data.tampil();

        System.out.println();
        System.out.println("============================================");
        System.out.println("Daftar Liga Inggris Setelah Insertion Sort secara Desc : ");
        data.insertionSortD();
        data.tampil();
    }
    }
