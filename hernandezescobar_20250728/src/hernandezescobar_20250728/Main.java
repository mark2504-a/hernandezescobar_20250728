/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hernandezescobar_20250728;

/**
 *
 * @author UFG
 */
public class Main {
    
    public static String nombres = "Mark Dylan";
    public static String apellidos = "Hernández Escobar";
    public static int anio_nacimiento = 2004;
    public static int mes_nacimiento = 11;
    public static float estatura = 1.75f; //ESTATURA EN METROS
    public static float peso = 190.1f; //PESO EN LIBRAS
    public static char genero = 'H';
    public static String estado_familiar = "Esperando...";
    public static double salario_mensual = 400.00d;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        double imc = 0.0d;
        float tasa_kilogramo = 0.453592f; //UNA LIBRA EQUIVALE A 0.453592 Kg
        int dias_laborales = 22; // 22 DIAS LABORALES AL MES
        int horas_laborales = 8; //8 HORAS LABORALES AL DIA
        
        //CONVERTIR EL PESO DE LIBRAS A KILOGRAMOS
        float peso_kilogramos = Main.peso*tasa_kilogramo;
        
        //ELEVANDO EL VALOR DE LA ESTATURA AL CUADRADO
        float estatura_al_cuadrado = Main.estatura*Main.estatura;
        
        //CALCULAR EL INDICE DE MASA CORPORAL
        
        imc = peso_kilogramos/estatura_al_cuadrado;
        
        
        //CALCULANDO EL SALARIO DIARIO
        double salario_diario = Main.salario_mensual/dias_laborales;
        
        //CALCULANDO EL SALARIO POR HORA
        double salario_hora = salario_diario/horas_laborales;
        /************************/
        //***SALIDA DE DATOS***//
        /***********************/
        
        System.out.println("Saludos "+Main.nombres+" "+Main.apellidos);
        System.out.println("Su peso en libras es: "+Main.peso+", peso en kilogramos es: "+peso_kilogramos);
        System.out.println("Su Indice de Masa Corporal es: "+imc);
        System.out.println("Su salario mensual es: "+Main.salario_mensual);
        System.out.println("Su salario diario es: "+salario_diario);
        System.out.println("Su salario por hora es: "+salario_hora);
    }
    
}
