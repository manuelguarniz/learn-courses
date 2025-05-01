#include <iostream>
#include <string>

using namespace std;

int main()
{
  int edad = 21;             // enteros con signo
  unsigned int puntos = 150; // enteros sin signo (+)
  short dias = 7;            // enteros cortos
  long poblacion = 8000000;  // enteros largos

  float temperatura = 3.6f; // decimales con menor precisión
  double altura = 1.75;     // decimales con mayor precisión
  long double pi = 3.14159; // decimales con alta precisión

  char inicial = 'M';      // un solo caracter
  string nombre = "Maria"; // cadena de texto (requiere #include <string>)

  bool estudiante = true; // true o false

  cout << "Nombre: " << nombre << endl;
  cout << "Inicial: " << inicial << endl;
  cout << "Edad: " << edad << " años" << endl;
  cout << "Altura: " << altura << "metros" << endl;
  cout << "Temperatura coportal: " << temperatura << "ºC" << endl;
  cout << "Puntos acumulados: " << puntos << endl;
  cout << "Estudiante: " << (estudiante ? "Si" : "No") << endl;
  cout << "Población estimada: " << poblacion << endl;
  cout << "Días de la semana: " << dias << endl;
  cout << "Valor de pi: " << pi << endl;

  cout << "Hola, Mundo !" << endl;
  return 0;
}
