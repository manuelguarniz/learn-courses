#include <iostream>
// #include <string>

using namespace std;

void saludar()
{
  cout << "Saludar !" << endl;
}

void saludarA(string name)
{
  cout << "Hola" << name << "!" << endl;
}

int calcularExponente(int base, int exponente)
{
  return pow(base, exponente);
}

int main()
{
  int edad;
  saludar();
  cout << "=======================" << endl;
  cout << "¿Cual es tu edad?" << endl;
  cin >> edad;

  cout << "=======================" << endl;
  cout << "La potencia cubica de 4 es: " << calcularExponente(4, 3) << endl;
  return 0;
}