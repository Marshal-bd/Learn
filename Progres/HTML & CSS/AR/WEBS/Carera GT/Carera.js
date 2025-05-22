const burger = document.getElementById("LOEXK");
const sidebar = document.getElementById("RIXKE");

burger.addEventListener("click", () => {
  if (sidebar.style.left === "0px") {
    sidebar.style.left = "-250px";
  } else {
    sidebar.style.left = "0";
  }
});
