/* Descarga el contenido del editor como un archivo de texto */
function descargarCodigo() {
    /* Solicita al usuario el nombre del archivo, por defecto "codigo.ru" */
    const nombre = prompt("Nombre del archivo de código:", "codigo.ru");
    if (!nombre) return;

    /* Obtiene el contenido escrito en el editor */
    const contenido = document.getElementById("editor").value;

    /* Crea un archivo (blob) de tipo texto con ese contenido */
    const blob = new Blob([contenido], { type: "text/plain" });

    /* Crea una URL temporal para ese archivo */
    const url = URL.createObjectURL(blob);

    /* Crea un enlace <a> y simula un clic para descargarlo */
    const a = document.createElement("a");
    a.href = url;
    a.download = nombre;
    a.click();

    /* Libera la URL de memoria */
    URL.revokeObjectURL(url);
}

/* Descarga el contenido del área de salida como un archivo de texto */
function descargarResultado() {
    /* Solicita al usuario el nombre del archivo, por defecto "salida.txt" */
    const nombre = prompt("Nombre del archivo de salida:", "salida.txt");
    if (!nombre) return;

    /* Toma el texto mostrado como resultado */
    const contenido = document.getElementById("output").textContent;

    /* Crea un archivo (blob) con ese contenido */
    const blob = new Blob([contenido], { type: "text/plain" });

    /* Genera una URL temporal para ese blob */
    const url = URL.createObjectURL(blob);

    /* Crea un enlace para descargar el archivo */
    const a = document.createElement("a");
    a.href = url;
    a.download = nombre;
    a.click();

    /* Libera la URL de memoria */
    URL.revokeObjectURL(url);
}

/* Carga el contenido de un archivo de texto en el editor */
document.getElementById("abrirArchivo").addEventListener("change", function(event) {
    /* Obtiene el archivo seleccionado */
    const archivo = event.target.files[0];
    if (!archivo) return;

    /* Lector de archivos */
    const reader = new FileReader();

    /* Al terminar de leer el archivo, coloca el contenido en el editor */
    reader.onload = function(e) {
        const contenido = e.target.result;
        document.getElementById("editor").value = contenido;
    };

    /* Lee el archivo como texto */
    reader.readAsText(archivo);
});

/* Envía el código del editor al backend y muestra la salida o errores */
async function evaluar() {
    /* Obtiene el código desde el editor */
    const codigo = document.getElementById("editor").value;

    /* Envía el código al servidor para evaluación */
    const res = await fetch("http://localhost:3000/ejecutar", {
        method: "POST",
        headers: { "Content-Type": "text/plain" },
        body: codigo
    });

    /* Recibe el resultado como texto */
    const texto = await res.text();

    /* Elemento donde se mostrará la salida */
    const outputEl = document.getElementById("output");

    /* Limpia cualquier clase de error previa */
    outputEl.classList.remove("error");

    /* Si contiene errores, los muestra en rojo y con salto de línea */
    if (texto.includes("ERROR")) {
        outputEl.classList.add("error");
        outputEl.innerHTML = texto
            .split("\n")
            .map(linea => `<div>${linea}</div>`)
            .join("");
    } else {
        /* Muestra la salida línea por línea */
        outputEl.innerHTML = texto
            .split("\n")
            .map(linea => `<div>${linea}</div>`)
            .join("");
    }
}