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
    
    public static List<Asignatura> ImportarAsignaturaCSV(){
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
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
        return asignaturas;
    }
    
    public static List<Alumno> ImportarAlumnoCSV(){
        List<Alumno> alumnos = new ArrayList();
        try{
            
            
            CsvReader leerAlumnos = new CsvReader("Alumnos.csv");
            leerAlumnos.readHeaders();
            
            
            while(leerAlumnos.readRecord()) {
                String matricula = leerAlumnos.get(0);
                String nombre = leerAlumnos.get(1);
                String apellido = leerAlumnos.get(2);
                
                alumnos.add(new Alumno(matricula,nombre,apellido));                
            }
            
            leerAlumnos.close(); // Cierra el archivo            
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
        return alumnos;
    }
    
    public static List<Maestro> ImportarMaestroCSV(){
        List<Maestro> maestros = new ArrayList();
        try{
            
            
            CsvReader leerMaestros = new CsvReader("Maestros.csv");
            leerMaestros.readHeaders();
            
            
            while(leerMaestros.readRecord()) {
                String claveM = leerMaestros.get(0);
                String nombreM = leerMaestros.get(1);
                String apellidoM = leerMaestros.get(2);
                
                maestros.add(new Maestro(claveM,nombreM,apellidoM));                
            }
            
            leerMaestros.close(); // Cierra el archivo            
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
        return maestros;
    }
    
    public static List<Materia> ImportarMateriasCSV(){
        List<Materia> materias = new ArrayList();
        try{
            
            
            CsvReader leerMaterias = new CsvReader("CargaMaterias.csv");
            leerMaterias.readHeaders();
            
            
            while(leerMaterias.readRecord()) {
                String claveA = leerMaterias.get(0);
                String claveM = leerMaterias.get(1);
                
                materias.add(new Materia(claveA,claveM));                
            }
            
            leerMaterias.close(); // Cierra el archivo            
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
        return materias;
    }
    
}
