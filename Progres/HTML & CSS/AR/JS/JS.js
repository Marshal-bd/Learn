function Stat(Bonus, Attack, Health, DEF) {
  var Attack = (Bonus / 100) * Attack + Attack;
  var Health = (Bonus / 100) * Health + Health;
  var DEF = (Bonus / 100) * DEF + DEF;

  if ((Bonus = undefined)) {
    Attack = Attack;
    Health = Health;
    DEF = DEF;
  }

  return (
    "Attack: " + Attack + " " + "Health: " + Health + " " + "Defends: " + DEF
  );
}

var Character = Stat(200, 2700, 12000, 800);
document.getElementById("Hasil").innerHTML = Character;

const car = [
  { Name: "Carera GT", Year: 2004, Manufactor: "Porsche" },
  { Name: "911 GT3 RS", Year: 2011, Manufactor: "Porsche" },
];
document.getElementById("CAR").innerHTML =
  car[1]["Name"] +
  " is the best car from " +
  car[1]["Manufactor"] +
  " tht born at " +
  car[1]["Year"] +
  "but my favorit car from " +
  car[1]["Manufactor"] +
  " is " +
  car[0]["Name"] +
  " that is the best car from" +
  car[1]["Manufactor"] +
  " i love this car so much, this car born at " +
  car[0]["Year"] +
  " i wish i can buy it in future";
document.getElementById("CAR").style.textAlign = "center-justify";
document.getElementById("CAR").style.fontFamily = "Space Grotesk";

function CAR(Merek, Tahun, Pabrik, Rating) {
  this.merek = Merek;
  this.tahun = Tahun;
  this.pabrik = Pabrik;
  this.rating = Rating;
}

var Lamborghini = new CAR("Revuelto", 2021, "Lamborghini", 9.5);
var Porsche = new CAR("Carrera GT", 2004, "Porsche", 9.7);
var Konisegg = new CAR("Jesko Absolut", 2023, "Konisegg", 9.9);

document.getElementById("DER").innerHTML =
  "Car 1 " +
  "<br>" +
  "<hr>" +
  "TYPE: " +
  Lamborghini.merek +
  "<br>" +
  "MANUFACTOR: " +
  Lamborghini.pabrik +
  "<br>" +
  "YEAR: " +
  Lamborghini.tahun +
  "<br>" +
  "RATE: " +
  Lamborghini.rating +
  "<hr>" +
  "Car 2 " +
  "<br>" +
  "<hr>" +
  "TYPE: " +
  Porsche.merek +
  "<br>" +
  "MANUFACTOR: " +
  Porsche.pabrik +
  "<br>" +
  "YEAR: " +
  Porsche.tahun +
  "<br>" +
  "RATE: " +
  Porsche.rating +
  "<hr>" +
  "Car 3 " +
  "<br>" +
  "<hr>" +
  "TYPE: " +
  Konisegg.merek +
  "<br>" +
  "MANUFACTOR: " +
  Konisegg.pabrik +
  "<br>" +
  "YEAR: " +
  Konisegg.tahun +
  "<br>" +
  "RATE: " +
  Konisegg.rating +
  "<hr>";
document.getElementById("DER").style.fontFamily = "Space Grotesk";