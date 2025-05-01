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

  return 0;
}