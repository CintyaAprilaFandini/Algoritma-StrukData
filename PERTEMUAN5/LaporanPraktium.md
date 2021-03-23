# PRAKTIKUM 5

## 4.2.3 Pertanyaan

1. base line Algoritma Divide Conquer untuk melakukan Pencarian nilai faktorial adalah apabila nilai dari n sudah equals atau sama dengan 1, maka program akan melakykan return 1, kemudian jika tidak maka nilai daripada variable n akan dikurang -1, yang mana disetiap loop atau perulangan yang dilakukan pada method dikalikan dengan nilai sebelumnya dan kemudian program akan mereturn pada variable fakto. atau bisa disebut divide Conquer menggunakan cara perhitungan fungsi rekursif

2. untuk 3 tahapan pada algoritma divide dan conquer yaitu : 
    - divide = faktorialDC(n-1) pengurangan pada nilai n atau membagi masalah menjadi beberapa upa-masalah yang memiliki kemiripan dengan masalah semula namun berukuran lebih kecil
    - conquer = n*faktorialDC(n-1) penyelesaian dengan rekursif
    - combine =  n*faktorialDC(n-1) pengombinasian dengan perkalian atau menggabungkan solusi masing-masing upa-masalah sehingga membentuk solusi masalah semula
3. pada method faktorialBF() dapat dirubah perulangannya yang semula menggunakan for bisa juga menggunakan perulangan jenis while maupun do while
contohnya : 
b