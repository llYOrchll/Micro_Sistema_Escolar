/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSV;
import Modelo.*;
import com.csvreader.CsvReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Javier
 */
public class CSVReader {
    
    public static List<Asignatura> ImportarCSV(){
        List<Asignatura> asignaturas = new ArrayList();
        try{
            
            
            CsvReader leerAsignaturas = new CsvReader("Asignaturas.csv");
            leerAsignaturas.readHeaders();
            
            
            while(leerAsignaturas.readRecord()) {
                String clave = leerAsignaturas.get(0);
                String licenciatura = leerAsignaturas.get(1);
                String nombreAsignatura = leerAsignaturas.get(2);
                
                asignaturas.add(new Asignatura(clave,licenciatura,nombreAsignatura));                
            }
            
            leerAsignaturas.close(); // Cierra el archivo
            
            // Recorremos la lista y la mostramos en la pantalla
//            for(Asignatura asignatura : asignaturas) {
//                System.out.println(asignatura.getClave() + " , "+ asignatura.getLicenciatura() + " , "+asignatura.getNombreAsignatura());
//            }
            
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
        return asignaturas;
    }
    
}
