/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSV;
import Modelo.*;
import com.csvreader.CsvWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Javier
 */
public class CSVWriter {
    public static void ExportarCSV(List<Materia> materias){
        String salidaArchivo = "CargaMaterias.csv";
        boolean existe =new File(salidaArchivo).exists();
        
        if(existe){
            File archivoMaterias = new File(salidaArchivo);
            archivoMaterias.delete();
        }
        
        try{
            CsvWriter salidaCSV = new CsvWriter(new FileWriter(salidaArchivo, true), ',');
            
            salidaCSV.write("claveA");
            salidaCSV.write("claveM");
            
            salidaCSV.endRecord();
            
            for(Materia materia: materias){
                salidaCSV.write(materia.getClaveA());
                salidaCSV.write(materia.getClaveM());
                
                salidaCSV.endRecord();
            }
            
            salidaCSV.close();
            
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }
}
