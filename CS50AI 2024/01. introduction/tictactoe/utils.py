def suma_matrices(tablero):
  suma_acumulada = 0

  for casillero in tablero:
    if type(casillero) is list:
      suma_acumulada = suma_acumulada + suma_matrices(casillero)
    else:
      if casillero is not None:
        suma_acumulada = suma_acumulada + 1
      
  return suma_acumulada