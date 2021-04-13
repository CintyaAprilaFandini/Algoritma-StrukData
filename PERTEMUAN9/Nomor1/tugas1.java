package PERTEMUAN9.Nomor1;
public class tugas1 {
    int size;
    int top;
    String data[];
    
   public tugas1(int size){
       this.size = size;
       data = new String[size];
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
   public void push(String dt){
       if (!isFull()) {
           top++;
           data[top] = dt;
       }else{
           System.out.println("Isi stack penuh!");
       }
   }
   public void pop(){
       if (!isEmpety()) {
           top--;
       }else{
           System.out.println("Stack masih kosong");
       }
   }
}
