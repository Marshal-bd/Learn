let Input1 = document.getElementById("Angka1");
let Input2 = document.getElementById("Angka2");
let Hasil = document.getElementById("hasil");

function Equal(SamaDengan) {
  document.getElementById("Symbol").textContent = SamaDengan;
  let input1 = parseInt(Input1.value);
  let input2 = parseInt(Input2.value);
  let hasil = 0;

  switch (SamaDengan) {
    case "+":
      hasil = input1 + input2;
      break;
    case "-":
      hasil = input1 - input2;
      break;
    case "*":
      hasil = input1 * input2;
      break;
    case "/":
      if (input2 === 0) {
        alert("!!! Tidak Bisa Dibagi Nol !!!");
      }
      hasil = input1 / input2;
      break;
    default:
      alert("!!! Operator Tidak Dikenali !!!");
      break;
  }
  Hasil.textContent = hasil;
}
