// Ambil elemen navbar dan tombol toggle
const navbar = document.getElementById('navbar');
const menuToggle = document.getElementById('menu-toggle');

// Fungsi untuk toggle navbar
menuToggle.addEventListener('click', () => {
  navbar.classList.toggle('show'); // Toggle class 'show' untuk menampilkan/menyembunyikan navbar
});
