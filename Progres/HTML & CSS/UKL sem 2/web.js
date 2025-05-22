const burger = document.getElementById("img-navbar");
const sidebar = document.getElementById("slide-nav");
const sidebar2 = document.getElementById("nav-slide");
const sidebar3 = document.getElementById("nav-slide1");
const sidebar4 = document.getElementById("nav-slide-2");

burger.addEventListener("click", () => {
  if (sidebar.style.visibility == "hidden") {
    sidebar.style.visibility = "visible";
    sidebar2.style.visibility = "visible";
    sidebar3.style.visibility = "visible";
    sidebar4.style.visibility = "visible";
  } else {
    sidebar.style.visibility = "hidden";
    sidebar2.style.visibility = "hidden";
    sidebar3.style.visibility = "hidden";
    sidebar4.style.visibility = "hidden";
  }
});
