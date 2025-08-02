import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.*;

public class Launcher {
    public static void main(String[] args) {
        try {
            /* Leer el código fuente */
            String inputCode = new String(System.in.readAllBytes());
            CharStream input = CharStreams.fromString(inputCode);

            /* Preparar captura de errores léxicos/sintácticos */
            ByteArrayOutputStream errorStream = new ByteArrayOutputStream();
            PrintStream originalErr = System.err;
            System.setErr(new PrintStream(errorStream));

            /* Lexer y Parser */
            RuLexer lexer = new RuLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            RuParser parser = new RuParser(tokens);

            /* Parsear el programa */
            ParseTree tree = parser.programa();

            /* Restaurar error stream para errores de ejecución */
            System.setErr(originalErr);

            /* Capturar errores del parser */
            String errores = errorStream.toString().trim();
            if (!errores.isEmpty()) {
                for (String linea : errores.split("\\r?\\n")) {
                    System.out.println("ERROR " + linea);
                }
                return;
            }

            /* Evaluar solo si no hubo errores */
            MyVisitor visitor = new MyVisitor();
            visitor.visit(tree);

        } catch (IOException e) {
            System.err.println(" Error al leer entrada: " + e.getMessage());
        }
    }
}
