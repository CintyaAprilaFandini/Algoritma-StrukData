package PERTEMUAN6.Nomor2;

public class PremierLeagueService {
    PremierLeague[] listliga = new PremierLeague [20];
    int index;
    
    void tambah(PremierLeague l) {
    if(index<listliga.length) {
        listliga[index] = l;
        index++;
    }else {
        System.out.println("Data sudah penuh!!");
    }
    }
    void tampil() {
     for(PremierLeague l : listliga) {
           l.tampilPremier();
        }
    }
    void insertionSortA() {
        int a, b;
        for(a=1; a<listliga.length; a++) {
            PremierLeague temp = listliga[a];
            b=a;
            while((b>0) && (listliga[b-1].points>temp.points)) {
                listliga[b] = listliga[b-1];
                b--;
            }
            listliga[b] = temp;
        }
    }
    void insertionSortD() {
        int a, b;
        for(a=1; a<listliga.length; a++) {
            PremierLeague temp = listliga[a];
            b=a;
            while((b>0) && (listliga[b-1].points < temp.points)) {
                listliga[b] = listliga[b-1];
                b--;
            }
            listliga[b] = temp;
        }
    }
}
