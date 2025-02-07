const elementos = document.getElementsByTagName("li");

for (const elemento of elementos) {
    elemento.style.backgroundColor = "lightgray";
    elemento.textContent = "🔥" + elemento.textContent
}

elementos[1].style.backgroundColor = "blue"

