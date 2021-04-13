package PERTEMUAN9.Nomor2;
public class tugas2{
    public int noTransaksi, jmBarang, totalHarga;
    public String tglPembelian;
    int size;
    int top;
    tugas2 data[];
public tugas2(int nt, String tp, int jb, int th){
    noTransaksi = nt;
    tglPembelian = tp;
    jmBarang = jb;
    totalHarga = th;
}
public tugas2(int size){
   this.size = size;
   data = new tugas2[size];
   top = -1;
}
public boolean isEmpety(){
   if (top == -1){
       return true; 
   } else {
       return false;
       
   }
}
public boolean isFull(){
   if (top == size - 1) {
       return true;
   }else{
       return false;
   }
}
public void push(tugas2 dt){
   if (!isFull()) {
       top++;
       data[top] = dt;
   }else{
       System.out.println("Isi stack penuh!");
   }
}
public void pop(){
   if (!isEmpety()) {
       tugas2 x = data[top];
       top--;
       System.out.println("Data yang keluar : " + x.noTransaksi + " | | " + x.tglPembelian + " | | " + x.jmBarang +  " | | " + x.totalHarga);
   }else{
       System.out.println("Stack masih kosong");
   }
}
public void print(){
   for (int i = top; i >= 0; i--) {
       System.out.println(data[i].noTransaksi + " | | " + data[i].tglPembelian + " | | " + data[i].jmBarang + " | |  " + data[i].totalHarga);
   }
   System.out.println("");
}
}