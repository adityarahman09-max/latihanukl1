# 📘 README --- UKL Pemrograman Dasar (Java)

Dokumentasi lengkap tugas UKL Pemrograman Dasar berisi enam program Java
dengan berbagai tingkat kesulitan.

Setiap bagian berisi: - Penjelasan fungsi dan cara kerja program -
Contoh kode Java - Tempat untuk menambahkan screenshot hasil output

------------------------------------------------------------------------

## 🧩 SOAL 1 -- Mudah

### 1️⃣ Menghitung Biaya Pengiriman Barang

**🧠 Fungsi Program:**\
Menghitung total biaya pengiriman berdasarkan berat, jarak tempuh, dan
volume paket.

**⚙️ Cara Kerja Program:** 1. Input panjang, lebar, tinggi, berat, dan
jarak paket.\
2. Hitung volume: `volume = panjang * lebar * tinggi`\
3. Tentukan biaya per kg berdasarkan jarak:\
- ≤ 10 km → Rp 4.250/kg\
- \> 10 km → Rp 6.000/kg\
4. Tambahkan biaya tambahan Rp 50.000 jika volume \> 100 cm³\
5. Hitung total biaya dan tampilkan hasil.

**💻 Contoh Kode:**

``` java
if (jarak <= 10) {
    biayaPerKg = 4250;
} else {
    biayaPerKg = 6000;
}
if (volume > 100) {
    biayaTambahan = 50000;
}
total = (berat * biayaPerKg) + biayaTambahan;
```

**📸 Screenshot Output:**\
*(Tambahkan di sini gambar hasil program Anda)*

------------------------------------------------------------------------

### 2️⃣ Menentukan Bilangan Ganjil atau Genap

**🧠 Fungsi Program:**\
Menentukan apakah bilangan yang dimasukkan adalah ganjil atau genap.

**⚙️ Cara Kerja Program:** 1. Input bilangan dari pengguna.\
2. Gunakan operator modulus `%` untuk menentukan sisa bagi 2.\
3. Jika sisa 0 → genap, jika tidak → ganjil.

**💻 Contoh Kode:**

``` java
if (angka % 2 == 0) {
    System.out.println("Bilangan Genap");
} else {
    System.out.println("Bilangan Ganjil");
}
```

**📸 Screenshot Output:**\
*(Tambahkan di sini gambar hasil program Anda)*

------------------------------------------------------------------------

## ⚙️ SOAL 2 -- Sedang

### 3️⃣ Menghitung Faktorial

**🧠 Fungsi Program:**\
Menghitung nilai faktorial dari bilangan bulat positif.

**⚙️ Cara Kerja Program:** 1. Input bilangan `n`.\
2. Gunakan perulangan `for` untuk menghitung `n!`.\
3. Tampilkan hasil faktorial.

**💻 Contoh Kode:**

``` java
int hasil = 1;
for (int i = 1; i <= n; i++) {
    hasil *= i;
}
System.out.println("Faktorial: " + hasil);
```

**📸 Screenshot Output:**\
*(Tambahkan di sini gambar hasil program Anda)*

------------------------------------------------------------------------

### 4️⃣ Menghitung Volume Tabung (Dengan Fungsi)

**🧠 Fungsi Program:**\
Menghitung volume tabung menggunakan fungsi dengan parameter.

**⚙️ Cara Kerja Program:** 1. Gunakan rumus `V = π * r * r * t`.\
2. Buat fungsi `hitungVolume(double r, double t)`.\
3. Panggil fungsi di `main()` untuk menampilkan hasil.

**💻 Contoh Kode:**

``` java
public static double hitungVolume(double r, double t) {
    return Math.PI * r * r * t;
}
```

**📸 Screenshot Output:**\
*(Tambahkan di sini gambar hasil program Anda)*

------------------------------------------------------------------------

## 🧮 SOAL 3 -- Sulit

### 5️⃣ Menghitung Rata-rata Nilai Siswa

**🧠 Fungsi Program:**\
Menghitung rata-rata nilai ujian dari sejumlah siswa.

**⚙️ Cara Kerja Program:** 1. Input jumlah siswa.\
2. Gunakan perulangan untuk input nilai tiap siswa.\
3. Jumlahkan semua nilai dan bagi dengan jumlah siswa.

**💻 Contoh Kode:**

``` java
double total = 0;
for (int i = 1; i <= jumlah; i++) {
    total += nilai[i];
}
double rata = total / jumlah;
System.out.println("Rata-rata: " + rata);
```

**📸 Screenshot Output:**\
*(Tambahkan di sini gambar hasil program Anda)*

------------------------------------------------------------------------

### 6️⃣ Penjumlahan Dua Matriks

**🧠 Fungsi Program:**\
Menjumlahkan dua buah matriks berukuran sama.

**⚙️ Cara Kerja Program:** 1. Input ukuran (baris, kolom).\
2. Input elemen matriks A dan B.\
3. Tambahkan elemen A\[i\]\[j\] + B\[i\]\[j\] dan simpan ke matriks
hasil.\
4. Cetak hasil penjumlahan.

**💻 Contoh Kode:**

``` java
for (int i = 0; i < baris; i++) {
    for (int j = 0; j < kolom; j++) {
        hasil[i][j] = matriksA[i][j] + matriksB[i][j];
    }
}
```

**📸 Screenshot Output:**\
*(Tambahkan di sini gambar hasil program Anda)*

------------------------------------------------------------------------

## 🧠 Kesimpulan

Enam program di atas melatih kemampuan dasar pemrograman Java,
meliputi: - Penggunaan input/output (`Scanner`) - Struktur kendali
(`if-else`, `for` loop) - Fungsi dan parameter - Array 2 dimensi
(Matriks)

Setiap program dapat dijalankan di VS Code atau IDE Java lainnya.

------------------------------------------------------------------------

📝 **Disusun oleh:**\
Siswa RPL SMK Telkom Malang\
Untuk Tugas UKL Pemrograman Dasar
