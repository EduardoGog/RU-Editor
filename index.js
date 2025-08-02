const express = require("express");
const fs = require("fs");
const { exec } = require("child_process");
const cors = require("cors");
const path = require("path");

const app = express();
app.use(cors());
app.use(express.text());

/* Sirve frontend */
app.use(express.static("frontend"));

/* Ruta para ejecutar código Ru */
app.post("/ejecutar", (req, res) => {
    fs.writeFileSync("entrada.txt", req.body);

    exec(
        'type entrada.txt | java -cp "antlr-4.13.2-complete.jar;out/production/Tarea4_Final" Launcher',
        (err, stdout, stderr) => {
            /* Esto captura tanto errores como salida útil en el mismo mensaje */
            if (err || stderr) {
                const errores = (stderr || "").split("\n").filter(Boolean).map(linea => "ERROR " + linea).join("\n");
                return res.send(errores + (stdout ? "\n" + stdout : ""));
            }
            res.send(stdout || "Sin salida");

        }
    );

});

/* Ruta para cargar el index.html */
app.get("/", (req, res) => {
    res.sendFile(path.join(__dirname, "frontend/index.html"));
});

app.listen(3000, () => console.log("Servidor ejecutándose en http://localhost:3000"));
