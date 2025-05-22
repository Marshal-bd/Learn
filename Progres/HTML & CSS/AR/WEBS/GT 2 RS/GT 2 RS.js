const NAVI = document.getElementById("BGR-Bar");
const Side_Navi = document.getElementById("Side-Nav");

NAVI.addEventListener("click", () => {
  if (Side_Navi.style.left === "0px") {
    Side_Navi.style.left = "-250px";
  } else {
    Side_Navi.style.left = "0px";
  }
});
