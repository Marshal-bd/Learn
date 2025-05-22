document
  .getElementById("contact-form")
  .addEventListener("submit", function (event) {
    event.preventDefault();
    alert("Pesan telah terkirim! Terima kasih.");
    this.reset();
  });
