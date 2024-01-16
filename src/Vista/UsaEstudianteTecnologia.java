package Vista;

/*
*  Clase UsaEstudianteTecnologia
*  Creado por: Orlando Arboleda Molina
*  Actualizado: 15-Enero-2025
*
*  Descripci�n: 
*  Clase principal con la l�gica de implementaci�n del EjercicioInicial, 
*  para el curso de POO en la Universidad Aut�noma de Occidente
*
*  Nota: es una clase incompleta
*/


import Modelo.EstudianteTecnologia;
import javax.swing.JOptionPane;
//import javax.swing.JOptionPane;


public class UsaEstudianteTecnologia {

    public static void main(String[] args) {
        // variables para lectura de cada atributo del estudianteTecnolog�a
        int nroEstudiantes, elCodigo;
        String elNombre;
        double laNotaDesarrollo;
        double laNotaMatematica;

        // lectura de variable entera, usando una VENTANA EMERGENTE
        nroEstudiantes = Integer.parseInt(
                JOptionPane.showInputDialog("Digite Cantidad Estudiantes"));
        
        EstudianteTecnologia[] losEstudiantes = new EstudianteTecnologia[nroEstudiantes];
        
        // ciclo en Java equivalente al indicado en el flujograma del proceso principal
        for (int contador = 0; contador < nroEstudiantes; contador++) {
            elCodigo = Integer.parseInt(
                    JOptionPane.showInputDialog("Digite el codigo"));
            // lectura de variable cadena, usando una VENTANA EMERGENTE
            elNombre = JOptionPane.showInputDialog("Digite el nombre");
            // lectura de variable real, usando una VENTANA EMERGENTE
            laNotaDesarrollo = Double.parseDouble(
                    JOptionPane.showInputDialog("Digite la Nota en Desarrollo"));
            laNotaMatematica = Double.parseDouble(
                    JOptionPane.showInputDialog("Digite la Nota en Matematica"));  
            
//             crea o instancia el objeto de la clase EstudianteTecnolog�a
            EstudianteTecnologia objT = new EstudianteTecnologia(elCodigo, elNombre,
                    laNotaMatematica, laNotaDesarrollo);         
            
            // Eliminar e incluir instrucci�n para almacenar en el arreglo a objT
            losEstudiantes[contador] = objT;
        }
        
        JOptionPane.showMessageDialog(null, desplegarTodos(losEstudiantes));         
    } // fin del m�todo main
 
    
    // info ser� el nombre que se le dar� al arreglo suministrado en la invocaci�n
    public static String desplegarTodos(EstudianteTecnologia[] info)
    {
        String res="Los estudiantes ingresados fueron:\n";
        
        EstudianteTecnologia elDato;
        for (int i=0; i<info.length; i++)
        {
            elDato = info[i];
            res += elDato.desplegarEstado()+
                   "  Definitiva:" + elDato.calcularDefinitiva()+
                   "  Aprobaci�n:" + elDato.calcularAprobacion()+"\n";
        }
        
        return res;
    }
}
