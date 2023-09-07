let str = prompt("veuillez entrer une petite phrase ici");
console.log(str);
console.log(typeof(str));

document.querySelector(".str").innerHTML += str;
document.querySelector(".min").innerHTML += str.toLowerCase();
document.querySelector(".tab").innerHTML += str.split("").join(",");
document.querySelector(".upper").innerHTML += str

  .toLowerCase()

  .split(" ")

  .map((word) => word.charAt(0).toUpperCase() + word.split(1))

  .join(" ");