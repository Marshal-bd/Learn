// Tambahkan highlight ke tombol menu yang aktif
document.querySelectorAll('.nav-btn').forEach(button => {
    button.addEventListener('click', function () {
      document.querySelectorAll('.nav-btn').forEach(btn => btn.classList.remove('active'));
      this.classList.add('active');
    });
  });
  