class Countdown:
  def __init__(self, start):
    self.current = start

  def __iter__(self):
    return self
  def __next__(self):
    if self.current <= -10:
      print("Countdown finished!")
      raise StopIteration
    self.current -= 1
    print("Countdown!")
    return self.current + 1 

c = Countdown(5)
print(list(c))
