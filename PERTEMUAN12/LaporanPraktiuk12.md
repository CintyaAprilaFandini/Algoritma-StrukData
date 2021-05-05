# Laporan Praktikum 12

## pertanyaan 12.2.3

1. perbedaan single linked list dengan double linked list. 
- jika single linked list adalah linked list yang hanya memiliki satu variabel pointer yang menunjuk ke node selanjutnya, biasanya field pada tail menunjuk ke NULl. 
- jika double linked list adalah linked list yang memiliki dua variabel pointer yaitu, pointer yang menunjuk ke node selanjutnya dan pointer yang menunjuk ke node sebelumnya.

2.  - pointer next digunakan untuk menunjukkan node setelahnya 
    - pointer prev digunakan untuk menunjukkan node sebelumnya

3. - head = nul berfungsi untuk menginisialisasikan node terdepan bernilai null
    - size berfungsi untuk menginisialisasikan data atau nilai pada double linked list bernilai 0

4. karena data paling awal adalah head, sedangkan kita menambah data di letakkan sebelum head, dimana tidak ada nilai(null) ditempat tersebut untuk di previous

5. statement tersebut bearti prev pada head menunjuk nilai di dalam object newNode.

6. karena pengisian object pada kondisi tersebut adalah penambahan data pada akhir index, maka penujuk prev diisikan nilai current dan next diisikan null yang bearti bahwa tidak ada data selanjutnya.

## pertanyaan 12.3.3

1. ketika dilakukan penghapusan node di index pertama, maka posis head berpindah ke posisi node selanjutnya dan pointer prev pada head bernilai null

2. dengan melakukan seleksi perulangan yang dilakukan oleh current. 

3. kode program tersebut termasuk penambahan nilai tidak cocok digunakan pada method remove lebih sering digunakan menambahkan data pada head atau data terdepat di indeks ke-0

4. pointer next pada node sebelumnya akan menunjuk node selanjutnya, dan pointer prev pada node selanjutnya akan menunjuk node sebelumnya

## pertanyaan 12.4.3

1. method size akan mereturn nilai 0 jika double linked list dalam keadaan kosong.

2. menggunakan cara perulangan head sama dengan indeks 0 atau 1

3. perbedaan karakteristik fungsi add pada double linked list ada dua null atau ruang kosong yang disiapkan setelah menambah node, sedangkan pada single list hanya ada satu ruang kosong yang disiapkan setelah menambah node

4. kode pertama merupakan pengecekan apakah node kosong jika size atau banyak data = 0, maka akan mereturn true sedangkan pada kode yang kedua, mengecek dengan cara apakah data paling awal kosong atau sama dengan null. ßß