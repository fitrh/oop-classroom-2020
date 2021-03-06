# Race Run

<p align="center">
  <img src="assets/img/race-run-uml.png" alt="Class Diagram">
</p>

Berdasarkan kelas diagram diatas, buatlah sebuah program yang mensimulasikan perlombaan lari.
Didalam perlombaan ini, terdapat 3 pemenang, yaitu juara 1, 2, dan 3, sehingga membutuhkan minimal 3 peserta.
Jika juara 1, 2, dan 3 telah ditentukan, maka peserta lainnya dinyatakan kalah.
Juara 1, 2, dan 3 tidak mungkin peserta yang sama.
Juara 1, 2, dan 3 tidak mungkin berada pada daftar peserta yang kalah begitupula sebaliknya.

## Berikut **Penjelasan** dari Class Diagram diatas

- `Runner::joinRace(Race race)` adalah method yang digunakan oleh `class Runner` untuk mengikuti sebuah pertandingan.
  - Setiap `Runner` yang mengikuti sebuah `Race` akan mengakibatkan durasi `Race` bertambah 1 detik.
- `Runner::start()` adalah method yang digunakan oleh `class Runner` untuk mulai berlari (menjalankan method `run()` dari `interface Runnable`).
  - Jika `Runner` belum mengikuti `Race`, maka akan muncul pesan "`Runner-%d have not entered any race`", dimana `%d` adalah nomor `Runner`.
  - Jika `Runner` telah mengikuti `Race`, namun `Race` yang diikuiti belum dimulai, maka akan muncul pesan "`Hey Runner-%d, the race hasn't started yet`".
  - Jika salah satu pesan diatas muncul, berarti `Runner` yang dimaksud tidak mengikuti `Race`.
  - Jika Runner memanggil method `joinRace` namun tidak memanggil method `start`, maka Runner secara otomatis kalah dan masuk kedalam daftar pemain yang kalah.
- `Race::start()` adalah method yang digunakan oleh `class Race` untuk menandakan bahwa perlombaan telah dimulai.
  - Jika method `start` dipanggil, maka akan muncul pesan "`The race starts . . .`".
  - Jika method `start` dipanggil, namun jumlah peserta belum mencukupi, maka akan mucul pesan "`The race cannot be started, runners are not enough`" dan perlombaan tidak dimulai.
- `Race::result()` adalah method yang digunakan oleh `class Race` untuk menampilkan hasi pertandingan.
  - method ini harus dipastikan terpanggil setelah perlombaan selesai.
  - Jika method ini berhasil dipanggil, maka akan muncul pesan "`The race is over.`" diikuti dengan daftar pemenang dan peserta yang kalah.
- Pada `class Race`, tidak ada `reference` ke `class Runner`, sehingga tidak ada objek dari `class Runner` di `class Race`.
- Atribut dari `class Race` silahkan anda tentukan sendiri, namun tidak ada atribut bertipe `Runner` pada `class` ini.
- Atribut pada `class Runner` dan `Race` dapat anda tambahkan sesuai kebutuhan.
- Method pada `class Runner` dan `Race` dapat anda tambahkan sesuai kebutuhan.
- *Logic* untuk menentukan pemenang dan yang kalah tidak menggunakan metode *sorting*.

## Contoh main method

```java
public static void main(String[] args) {
    Integer number = 0;
    Race race = new Race();
    Runner[] runners = new Runner[10];

    for (int i = 0; i < runners.length; i++) {
      runners[i] = new Runner(++number);
      runners[i].joinRace(race);
    }

    race.start();

    for (Runner runner : runners) {
      runner.start();
    }

    race.result();
  }
```

## Contoh Output

<p align="center">
    <img src="assets/gif/w-start-method.gif">
     <p align="center"><i>Output Normal, terdapat jeda 10 detik sebelum selesai<br>Jeda tersebut ditentukan oleh banyaknya peserta</i></p>
</p>
<br>
<p align="center">
    <img src="assets/gif/wo-start-method.gif">
     <p align="center"><i>Output jika method start dari class Runner dipanggil namun method start dari class Race belum dipanggil<br>Tidak ada jeda, program langsung selsesai</i></p>
</p>

## Jika penerapan konsep *Thread* telah sesuai, *Runner* tidak akan terurut dan hasil *Race* akan selalu berbeda disetiap *run* program
