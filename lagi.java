# finalprojek-strukturdata-java
Program di atas adalah program sederhana untuk penjadwalan tugas. Program ini memungkinkan pengguna untuk menambahkan, menghapus, memanipulasi, dan menampilkan tugas-tugas yang telah dijadwalkan. Berikut adalah deskripsi singkat dari program tersebut:
1. Program dimulai dengan deklarasi kelas `Task`. Setiap objek `Task` memiliki atribut `description` yang menyimpan deskripsi tugas dan `nextTask` yang merupakan referensi ke objek `Task` berikutnya dalam linked list.
2. Ada beberapa metode dalam kelas `Task`:
   - Konstruktor `Task(String description)`: Metode ini digunakan untuk membuat objek `Task` baru dengan deskripsi yang diberikan.
   - `getDescription()`: Metode ini mengembalikan deskripsi tugas dari objek `Task`.
3. Program juga memiliki inner class `TaskScheduler` yang bertanggung jawab untuk mengelola tugas-tugas yang dijadwalkan.
   - Konstruktor `TaskScheduler()`: Metode ini digunakan untuk membuat objek `TaskScheduler` baru dengan head yang kosong.
   - `addTask(String description)`: Metode ini digunakan untuk menambahkan tugas baru ke dalam penjadwalan. Tugas baru akan ditambahkan ke akhir linked list.
   - `removeTask(String description)`: Metode ini digunakan untuk menghapus tugas dengan deskripsi yang diberikan dari penjadwalan. Jika tugas ditemukan, tugas tersebut akan dihapus dari linked list.
   - `manipulateTask(String description, String newDescription)`: Metode ini digunakan untuk memanipulasi tugas dengan mengganti deskripsi tugas yang lama dengan deskripsi baru.
   - `displayTasks()`: Metode ini digunakan untuk menampilkan semua tugas yang telah dijadwalkan.
4. Metode `main()` merupakan titik masuk utama program. Program akan menampilkan menu pilihan untuk menambahkan tugas, menghapus tugas, memanipulasi tugas, menampilkan tugas, dan keluar dari program.
5. Program menggunakan `Scanner` untuk menerima input dari pengguna. Pengguna akan diminta untuk memasukkan pilihan mereka berdasarkan menu yang ditampilkan.
6. Program menggunakan `switch` untuk menangani berbagai kasus berdasarkan pilihan pengguna:
   - Jika pilihan adalah 1, program akan meminta pengguna untuk memasukkan deskripsi tugas baru dan menambahkannya ke penjadwalan menggunakan metode `addTask()`.
   - Jika pilihan adalah 2, program akan meminta pengguna untuk memasukkan deskripsi tugas yang ingin dihapus dan menghapusnya dari penjadwalan menggunakan metode `removeTask()`.
   - Jika pilihan adalah 3, program akan meminta pengguna untuk memasukkan deskripsi tugas yang ingin dimanipulasi dan deskripsi baru. Metode `manipulateTask()` akan digunakan untuk memanipulasi tugas dengan mengganti deskripsi lama dengan deskripsi baru.
   - Jika pilihan adalah 4, program akan menampilkan semua tugas yang telah dijadwalkan menggunakan metode `displayTasks()`.
   - Jika pilihan adalah 5, program akan memberikan pesan selamat dan keluar dari program.
7. Loop akan berjalan terus menerus sehingga pengguna dapat terus melakukan operasi pada penjadwalan tugas. Loop hanya akan berhenti jika pengguna memilih opsi keluar.
8. Setelah selesai, `Scanner` akan ditutup dan program akan keluar.
