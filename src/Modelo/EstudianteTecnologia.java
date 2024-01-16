package Modelo;

/*
*  Clase EstudianteTecnologia
*  Creado por: Orlando Arboleda Molina
*  Actualizado: 15-Enero-2025
*
*  Descripción: 
*  Clase que es la implementación de la clase para la construcción de los 
*  objetos necesarios del EjercicioInicial, para el curso de POO en la 
*  Universidad Autónoma de Occidente
*
*/


public class EstudianteTecnologia {
    private int codigo;
    private String nombre;
    private double notaDesarrollo;
    private double notaMatematica;

    public EstudianteTecnologia(int codigo, String nombre, double notaDesarrollo, double notaMatematica) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.notaDesarrollo = notaDesarrollo;
        this.notaMatematica = notaMatematica;
    }

    public String desplegarEstado(){
        return "Codigo:" + codigo + "  Nombre:" + nombre +
               "  NotaDesarrollo:" + notaDesarrollo+
               "  NotaMatematica:" + notaMatematica;
    } 

    public double calcularDefinitiva(){
        double res;
        
        res = 0.6*notaDesarrollo + 0.4*notaMatematica;
        
        return res;
    }

    public String calcularAprobacion(){
        double def = calcularDefinitiva();
        String res;
        
        if (def < 3.5){
            res = "NO APRUEBA";            
        }else{
            res = "SI APRUEBA";            
        }
                
        return res;
    }   
}
