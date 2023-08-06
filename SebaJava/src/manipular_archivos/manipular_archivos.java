package manipular_archivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class manipular_archivos {
    public static void main(String ars[]){
        try {
            String ruta = "C:\\Users\\seeba\\Desktop\\filename.txt";
            String contenido = "Contenido de ejemplo";
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
