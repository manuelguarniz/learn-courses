#include <iostream>
#include <string>

using namespace std;

void saludar()
{
  cout << "Saludar !" << endl;
}

void saludarA(string name)
{
  cout << "Hola" << name << "!" << endl;
}

int main()
{
  int edad;
  saludar();
  cin >> edad;
  return 0;
}