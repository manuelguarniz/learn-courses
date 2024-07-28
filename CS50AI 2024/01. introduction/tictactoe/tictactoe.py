"""
Tic Tac Toe Player
"""

import math
from utils import suma_matrices

X = "X"
O = "O"
EMPTY = None


def initial_state():
    """
    Returns starting state of the board.
    """
    return [[EMPTY, EMPTY, EMPTY],
            [EMPTY, EMPTY, EMPTY],
            [EMPTY, EMPTY, EMPTY]]


def player(board):
  indicador_jugador = suma_matrices(board)
  if indicador_jugador % 2 == 0:
    return X
  return O


def actions(board):
    """
    Returns set of all possible actions (i, j) available on the board.
    """
    raise NotImplementedError


def result(board, action):
  new_board = initial_state()[:]
  for index_y, row in enumerate(board):
    for index_x, col in enumerate(row):
      
      value = action[index_y][index_x]
      
      if value is not EMPTY:
        if col is not EMPTY:
          raise NameError("Movimiento invalido")
        else:
          new_board[index_y][index_x] = value
      else:
        new_board[index_y][index_x] = col
  return new_board


def winner(board):
    """
    Returns the winner of the game, if there is one.
    """
    raise NotImplementedError


def terminal(board):
    """
    Returns True if game is over, False otherwise.
    """
    raise NotImplementedError


def utility(board):
    """
    Returns 1 if X has won the game, -1 if O has won, 0 otherwise.
    """
    raise NotImplementedError


def minimax(board):
    """
    Returns the optimal action for the current player on the board.
    """
    raise NotImplementedError
