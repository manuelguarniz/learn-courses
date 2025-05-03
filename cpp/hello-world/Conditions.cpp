#include <iostream>

using namespace std;

int main()
{
  int edad = 18;
  if (edad >= 18)
  {
    cout << "18 es mayor de edad" << endl;
  }

  int hora = 15;
  if (hora >= 12)
  {
    if (hora < 7)
    {
      cout << "Las 15 esta en la tarde" << endl;
    }
    else
    {
      cout << "Las 15 esta en la noche" << endl;
    }
  }
  else if (hora == 0)
  {
    cout << "Son las 00 horas" << endl;
  }
  else
  {
    cout << "Nose que hora es" << endl;
  }

  cout << "=============" << endl;
  cout << "otros prints" << endl;

  int a = 10, b = 5;
  cout << a + b << endl;
  cout << (a > b) << endl;
  cout << (a < b) << endl;

  cout << "=============" << endl;
  cout << "trabajando con inputs" << endl;

  cout << "Cual es tu edad?" << endl;
  cin >> edad;
  cout << "Tienes " << edad << " años, y eres " << ((edad >= 18) ? "mayor" : "menor") << " de edad" << endl;

  return 0;
}