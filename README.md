# KontenKuApp 📱

**KontenKuApp** adalah aplikasi mobile Android berbasis Java yang dirancang untuk menampilkan konten dari API eksternal serta mendukung fitur autentikasi pengguna (Login dan Register).

## 🚀 Fitur Utama

- **Login dan Register**
  - Pengguna dapat membuat akun dan masuk ke aplikasi.
  - Autentikasi dilakukan melalui API backend dengan database MySQL.

- **Halaman Utama**
  - Menampilkan daftar konten yang diambil dari API eksternal (`jsonplaceholder.typicode.com/posts`).

- **Detail Konten**
  - Pengguna dapat mengakses informasi lebih rinci dari konten yang dipilih.

## 🛠 Teknologi yang Digunakan

- **Frontend (Mobile)**:
  - Java (Android SDK)
  - XML Layout
  - ListView untuk menampilkan konten
  - Intent untuk navigasi antar halaman

- **Backend (API)**:
  - Node.js + Express
  - MySQL Database
  - Bcrypt (hash password)

## 📦 Struktur Folder Penting

```
KontenKuApp/
├── app/
│   ├── src/
│   │   └── main/
│   │       ├── java/com/example/kontenku/
│   │       │   ├── LoginActivity.java
│   │       │   ├── RegisterActivity.java
│   │       │   ├── MainActivity.java
│   │       │   ├── DetailActivity.java
│   │       │   └── ApiClient.java
│   │       └── res/layout/
│   │           ├── activity_login.xml
│   │           ├── activity_register.xml
│   │           ├── activity_main.xml
│   │           └── activity_detail.xml`

## 🧪 Cara Menjalankan

1. Buka folder `KontenKuApp` di Android Studio.
2. Jalankan aplikasi di emulator atau perangkat Android.
3. Backend API harus sudah dijalankan secara lokal (`http://10.0.2.2:3000` untuk emulator).

## 📂 API Backend

Untuk backend dan database, gunakan repo terpisah: `backend-kontenku`

## 📸 Screenshots

![app](app/screenshots.png)

**Lisensi**: Proyek ini dikembangkan untuk keperluan tugas akhir mata kuliah *Pemrograman Mobile*.
