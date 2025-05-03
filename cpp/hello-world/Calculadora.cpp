#include <iostream>
#include <string>

using namespace std;

int sumar(int a, int b)
{
  return a + b;
}

int restar(int a, int b)
{
  return a - b;
}

int multiplicar(int a, int b)
{
  return a * b;
}

int dividir(int a, int b)
{
  return a / b;
}

int primerInput()
{
  int a;
  do
  {
    cout << "Ingresa el primer valor a operar: ";
    cin >> a;
  } while (a);

  return a;
}

int primerInput()
{
  do
  {
    cout << "Ingresa el primer valor a operar: ";
    cin >> a;
    cout << "Ingresa el segundo valor a operar: ";
    cin >> b;
  } while (a != null && b != null);
  return a;
}

string operar(int operacion)
{
  int resultado;
  switch (operacion)
  {
  case 1:
    resultado = sumar(a, b);
    break;
  case 2:
    resultado = restar(a, b);
    break;
  case 3:
    resultado = multiplicar(a, b);
    break;
  case 4:
    resultado = dividir(a, b);
    break;
  default:
    return "La operación es invalida !";
  }

  return "El resultado es: " + to_string(resultado);
}

int main()
{
  int operacion;
  do
  {
    cout << "==============" << endl;
    cout << "¿Que operación quiere realizar? \n"
         << "1. sumar\n"
         << "2. restar\n"
         << "3. multiplicad\n"
         << "4. dividir\n"
         << "5. salir"
         << endl;
    cin >> operacion;
    cout << operar(operacion) << endl;
  } while (operacion != 5);

  return 0;
}