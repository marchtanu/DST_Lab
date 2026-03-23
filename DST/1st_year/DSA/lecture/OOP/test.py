class Book:
  """Demonstrates special methods"""
  
  def __init__(self, title, author, pages):
    self.title = title
    self.author = author
    self.pages = pages
  
  # String representation
  def __str__(self):
    return f"'{self.title}' by {self.author}"
  
  # Developer-friendly representation
  def __repr__(self):
    return f"Book({self.title!r}, {self.author!r}, {self.pages})"
  
  # Comparison
  def __eq__(self, other):
    return self.pages == other.pages
  
  def __lt__(self, other):
    return self.pages < other.pages
  
  # Length
  def __len__(self):
    return self.pages

book1 = Book("Python 101", "John Doe", 300)
book2 = Book("Advanced Python", "Jane Smith", 500)

print(str(book1))  # 'Python 101' by John Doe
print(book1 < book2)  # True (300 < 500)
print(len(book1))  # 300
