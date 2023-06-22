# finalprojek-strukturdata-java
Program sederhana untuk pemesanan makanan, minuman, dan cemilan di sebuah warung makan. Berikut adalah deskripsi singkat dari program tersebut:
1. Program dimulai dengan deklarasi kelas `Warung`. Kelas ini memiliki inner class `Node`, yang digunakan untuk implementasi struktur data linked list.
2. Ada beberapa metode dalam kelas `Warung`:
   - `isEmpty()`: Metode ini memeriksa apakah linked list kosong atau tidak.
   - `insertFront()`: Metode ini digunakan untuk menyisipkan elemen baru di bagian depan linked list.
   - `insertBack()`: Metode ini digunakan untuk menyisipkan elemen baru di bagian belakang linked list.
   - `printList()`: Metode ini digunakan untuk mencetak semua elemen dalam linked list.
3. Metode `main()` merupakan titik masuk utama program. Program akan menampilkan pesan selamat datang dan opsi menu makanan, minuman, dan cemilan yang tersedia.
4. Pengguna diminta untuk memasukkan pilihan mereka menggunakan `Scanner`. Pilihan tersebut akan disimpan dalam variabel `pilih`.
5. Program kemudian menggunakan `switch` untuk menangani berbagai kasus berdasarkan pilihan pengguna:
   - Jika pilihan adalah 1, program akan menampilkan menu makanan yang tersedia dan meminta pengguna untuk memasukkan nama makanan yang ingin dipesan. Program akan memeriksa apakah makanan tersedia atau tidak dalam daftar makanan yang telah didefinisikan. Jika makanan tersedia, maka program akan melanjutkan ke langkah berikutnya. Jika makanan tidak tersedia, program akan memberikan pesan bahwa makanan tidak tersedia dan keluar dari loop.
   - Jika pilihan adalah 2, program akan menampilkan menu minuman yang tersedia dan meminta pengguna untuk memasukkan nama minuman yang ingin dipesan. Program akan memeriksa apakah minuman tersedia atau tidak dalam daftar minuman yang telah didefinisikan. Jika minuman tersedia, maka program akan memberikan pesan bahwa minuman berhasil dipesan. Jika minuman tidak tersedia, program akan memberikan pesan bahwa minuman tidak tersedia.
   - Jika pilihan adalah 3, program akan menampilkan menu cemilan yang tersedia dan meminta pengguna untuk memasukkan nama cemilan yang ingin dipesan. Program akan memeriksa apakah cemilan tersedia atau tidak dalam daftar cemilan yang telah didefinisikan. Jika cemilan tersedia, maka program akan memberikan pesan bahwa cemilan berhasil dipesan. Jika cemilan tidak tersedia, program akan memberikan pesan bahwa cemilan tidak tersedia.
   - Jika pilihan tidak valid, program akan memberikan pesan bahwa pilihan tidak valid.
6. Setelah selesai, `Scanner` akan ditutup.
Program ini hanya menyediakan fitur dasar untuk memesan makanan, minuman, dan cemilan dari daftar yang telah didefinisikan. Fitur lain seperti pengolahan pembayaran atau pengelolaan stok makanan tidak ada dalam program ini. Program ini juga tidak mengimplementasikan penyimpanan pesanan atau penggunaan struktur data linked list dalam konteks yang lebih luas.
