package PERTEMUAN6.Nomor2;

public class PremierLeague {
    public String team;
    public int play, goal, points;
    
    PremierLeague(String t, int p, int g, int po){
        team = t;
        play = p;
        goal = g;
        points = po;
    }
    void tampilPremier(){
        System.out.println("|"+team+"\t\t |"+play+"|"+goal+"|"+points+"|");
        
    }
}
