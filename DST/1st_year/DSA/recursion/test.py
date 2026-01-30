from pathlib import Path
import sys
from DSA.recursion.main import countdown, factorial, fibonacci, sum_list, binary_search, fib_memo
import io
from contextlib import redirect_stdout

# Add parent directories to path for absolute import
sys.path.insert(0, str(Path(__file__).parent.parent.parent))



def test_factorial():
  assert factorial(1) == 1
  assert factorial(5) == 120
  assert factorial(0) == 1
  assert factorial(10) == 3628800


def test_fibonacci():
  assert fibonacci(0) == 0
  assert fibonacci(1) == 1
  assert fibonacci(6) == 8
  assert fibonacci(10) == 55


def test_sum_list():
  assert sum_list([]) == 0
  assert sum_list([1, 2, 3, 4, 5]) == 15
  assert sum_list([10]) == 10
  assert sum_list([-1, 2, -3, 4]) == 2


def test_binary_search():
  assert binary_search([1, 3, 5, 7, 9], 7, 0, 4) == 3
  assert binary_search([1, 3, 5, 7, 9], 1, 0, 4) == 0
  assert binary_search([1, 3, 5, 7, 9], 9, 0, 4) == 4
  assert binary_search([1, 3, 5, 7, 9], 6, 0, 4) == -1
  assert binary_search([1, 3, 5, 7, 9], 0, 0, 4) == -1


def test_countdown():
  f = io.StringIO()
  with redirect_stdout(f):
    countdown(3)
  output = f.getvalue()
  assert "3" in output
  assert "2" in output
  assert "1" in output
  assert "Done!" in output


def test_fib_memo():
  assert fib_memo(0) == 0
  assert fib_memo(1) == 1
  assert fib_memo(10) == 55
  assert fib_memo(15) == 610
