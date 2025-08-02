function descargarCodigo() {
    const nombre = prompt("Nombre del archivo de código:", "codigo.ru");
    if (!nombre) return;

    const contenido = document.getElementById("editor").value;
    const blob = new Blob([contenido], { type: "text/plain" });
    const url = URL.createObjectURL(blob);
    const a = document.createElement("a");
    a.href = url;
    a.download = nombre;
    a.click();
    URL.revokeObjectURL(url);
}

function descargarResultado() {
    const nombre = prompt("Nombre del archivo de salida:", "salida.txt");
    if (!nombre) return;

    const contenido = document.getElementById("output").textContent;
    const blob = new Blob([contenido], { type: "text/plain" });
    const url = URL.createObjectURL(blob);
    const a = document.createElement("a");
    a.href = url;
    a.download = nombre;
    a.click();
    URL.revokeObjectURL(url);
}

document.getElementById("abrirArchivo").addEventListener("change", function(event) {
    const archivo = event.target.files[0];
    if (!archivo) return;

    const reader = new FileReader();
    reader.onload = function(e) {
        const contenido = e.target.result;
        document.getElementById("editor").value = contenido;
    };
    reader.readAsText(archivo);
});

async function evaluar() {
    const codigo = document.getElementById("editor").value;

    const res = await fetch("http://localhost:3000/ejecutar", {
        method: "POST",
        headers: { "Content-Type": "text/plain" },
        body: codigo
    });

    const texto = await res.text();
    const outputEl = document.getElementById("output");

    // Limpiar clases previas
    outputEl.classList.remove("error");

    if (texto.includes("ERROR")) {
        outputEl.classList.add("error");
        outputEl.innerHTML = texto
            .split("\n")
            .map(linea => `<div>${linea}</div>`)
            .join("");
    } else {
        outputEl.innerHTML = texto
            .split("\n")
            .map(linea => `<div>${linea}</div>`)
            .join("");
    }
}


