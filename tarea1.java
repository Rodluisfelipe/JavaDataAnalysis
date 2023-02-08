/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.suma;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class Suma {
  //Declaramos las variables privadas para proteger su acceso y controlar su modificación
  private int[] datos;
  private int n;
  
  //Constructor que recibe el número de datos a capturar
  public Suma(int n) {
    this.n = n;
    datos = new int[n];
  }
  
  //Método que captura los datos y los guarda en el arreglo
  public void capturarDatos() {
    for (int i = 0; i < n; i++) {
      datos[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato " + (i + 1)));
    }
  }
  
  //Método que muestra los datos capturados
  public void mostrarDatos() {
    String mensaje = "Datos: ";
    for (int i = 0; i < n; i++) {
      mensaje += datos[i] + " ";
    }
    JOptionPane.showMessageDialog(null, mensaje);
  }
  
  //Método que muestra los datos ordenados
  public void mostrarDatosOrdenados() {
    Arrays.sort(datos);
    String mensaje = "Datos ordenados: ";
    for (int i = 0; i < n; i++) {
      mensaje += datos[i] + " ";
    }
    JOptionPane.showMessageDialog(null, mensaje);
  }
  
  //Método que devuelve el mayor de los datos
  public int obtenerMayor() {
    int mayor = datos[0];
    for (int i = 1; i < n; i++) {
      if (datos[i] > mayor) {
        mayor = datos[i];
      }
    }
    return mayor;
  }
  
  //Método que devuelve el menor de los datos
  public int obtenerMenor() {
    int menor = datos[0];
    for (int i = 1; i < n; i++) {
      if (datos[i] < menor) {
        menor = datos[i];
      }
    }
    return menor;
  }
  
  //Método que devuelve el promedio de los datos
  public double obtenerPromedio() {
    int suma = 0;
    for (int i = 0; i < n; i++) {
      suma += datos[i];
    }
    return (double)suma / n;
  }
  
  //Método que devuelve la desviación estándar de los datos
  public double obtenerDesviacionEstandar() {
    double promedio = obtenerPromedio();
double suma = 0;
for (int i = 0; i < n; i++) {
suma += Math.pow(datos[i] - promedio, 2);
}
return Math.sqrt(suma / n);
}

//Método que muestra los x mayores datos
public void mostrarXMayores(int x) {
Arrays.sort(datos);
String mensaje = "Los " + x + " mayores datos: ";
for (int i = n - 1; i >= n - x; i--) {
mensaje += datos[i] + " ";
}
JOptionPane.showMessageDialog(null, mensaje);
}

//Método que muestra los x menores datos
public void mostrarXMenores(int x) {
Arrays.sort(datos);
String mensaje = "Los " + x + " menores datos: ";
for (int i = 0; i < x; i++) {
mensaje += datos[i] + " ";
}
JOptionPane.showMessageDialog(null, mensaje);
}

//Método main para ejecutar el programa
public static void main(String[] args) {
int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de datos a capturar"));
Suma datos = new Suma(n);
datos.capturarDatos();
datos.mostrarDatos();
datos.mostrarDatosOrdenados();
JOptionPane.showMessageDialog(null, "El mayor dato es: " + datos.obtenerMayor());
JOptionPane.showMessageDialog(null, "El menor dato es: " + datos.obtenerMenor());
JOptionPane.showMessageDialog(null, "El promedio es: " + datos.obtenerPromedio());
JOptionPane.showMessageDialog(null, "La desviación estándar es: " + datos.obtenerDesviacionEstandar());
int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de datos mayores a mostrar"));
datos.mostrarXMayores(x);
x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de datos menores a mostrar"));
datos.mostrarXMenores(x);
}
}
