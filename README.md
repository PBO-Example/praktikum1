# praktikum1
Baca instruksi yang diberikan dengan baik.
>File-file berikut ini bisa anda temukan di folder **src\main\java**.
>Sejumlah file tersebut (template file) sengaja dibiarkan salah sintaks yang akan menyebabkan compile error.
>Sebelum mengerjakan butir-butir berikut ini, pastikan semua kesalahan sintaks sudah anda perbaiki sehingga lulus kompilasi. 
1. **[Poin 10]** Perbaiki file HelloWorld.java sehingga menampilkan pesan berikut ke layar: 

       Hello World!!
1. **[Poin 10]** Perbaiki file HelloPerson.java sehingga menerima input dari user misalnya Butet dan menampilkan pesan berikut ke layar: 

      Hello Butet!
	  
1. Perbaiki file Operasi.java sehingga mempunyai 4 buah method: 
     1. **[Poin 5]** method kali() yang mengembalikan hasil perkalian dua buah bilangan integer, 
     1. **[Poin 5]** method bagi() yang mengembalikan hasil pembagian bilangan integer pertama dengan bilangan integer kedua, 
     1. **[Poin 5]** method tambah() yang mengembalikan hasil penjumlahan dua bilangan integer, dan  
     1. **[Poin 5]** method kurang() yang mengembalikan hasil pengurangan bilangan integer pertama dengan bilangan integer kedua.
     1. **[Poin 10]** menampilkan pesan berikut ke layar:
	 
	 
                11x2=22
                11/2=5.5
                11+2=13
                11-2=9

1. **[10]** Perbaiki program OperasiArg.java sehingga dapat megoperasikan (kali, bagi, tambah, kurang) pada nilai operator argument yang dilewatkan saat program dieksekusi. 

Catatan Penting:
1. Anda hanya boleh mengubah kode program yang ada di src\main\java
1. **Semua kode program yang ada di src\test\java  tidak boleh diubah sama sekali!!** Jika anda ubah (akan terlihat pada history), maka nilai anda langsung 0.
1. Jangan memindah-mindahkan file, biarkan setiap file di folder di mana file tersebut berada sebelumnya.
1. Untuk dapat mengerjakan tugas ini secara offline (pada PC/laptop masing) ikuti perintah berikut ini:
	1. Pada command prompt di pc anda ketik: 
	   * git clone alamatrepo
	   contoh: git clone https://github.com/education/auto-example
	   * Silahkan anda perbaik file kode program yang diminta menggunakan edit++
    1. Pastikan semua template kode program yang ada di src\main\java sudah lulus kompilasi. Anda bisa menggunakan perintah javac atau java (pastikan package di comment dulu) atau menggunakan perintah gradle test (package tidak perlu di-comment).
	1. Setelah semua template lulus kompilasi, Anda bisa test program anda secara manual dengan ketik ini pada command prompt:
	   > Perintah gradle test akan menjalankan semua program test yang ada pada src\test\java
       
	   
	   *(masuk ke folder repo) >gradle test*
	   
	   > atau menjalankan program test satu persatu. Satu program test digunakan untuk menguji satu kode program di src\main\java.
	   
	   
	   *folder repo >gradle test --test nama_file_test*
	   
	   contoh: ***folder repo >gradle test --tests TestHello***
	   
    1. Setelah selesai, segera gunakan perintah di bawah ini untuk mengupload file-file yang sudah anda ubah ke repo github
	
	
			1. Add file: *folder repo >git add path/namafile.java*
        
		
			   misalnya: 
		
			   ***folder repo >git src/main/java/HelloWorld.java***
		
		
			   lakukan untuk setiap file yang sudah diperbaiki.
			2. Commit file: *git commit -m "isi dengan pesan perubahan"**
		
		       misalnya:
		
		       ***folder repo >git commit -m "update file HelloWorld.java dan HelloPerson.java"***
		
		    3. push file ke sertver github:*folder repo >git push *
		
		
		       git add dan git commit saja belum mentransfer file-file anda ke repo github. git push yang akan mentransfer file-file tersebut. 
	1. Jika anda tidak mengupload file-file yang sudah anda ubah di lokal anda (PC/Laptop) ke repo di githud (dengan langkah2 pada 3.c) maka nilai anda 0.
	
	Anda bisa juga menggunakan Github desktop (jangan lupa commit dan push untuk upload perubahan ke github repo)
