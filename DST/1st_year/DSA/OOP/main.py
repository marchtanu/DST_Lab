from abc import ABC, abstractmethod

# ===== PYTHON OOP: COMPLETE GUIDE =====

# 1. CLASSES AND OBJECTS
# A class is a blueprint for creating objects

class Dog:
  """A simple class representing a dog"""
  
  # Class variable (shared by all instances)
  species = "Canis familiaris"
  
  # Constructor - runs when object is created
  def __init__(self, name, age):
    # Instance variables (unique to each object)
    self.name = name
    self.age = age
  
  # Instance method
  def bark(self):
    return f"{self.name} says Woof!"
  
  # Another method
  def get_age(self):
    return f"{self.name} is {self.age} years old"

# Creating objects (instances)
dog1 = Dog("Buddy", 3)
dog2 = Dog("Max", 5)

print(dog1.bark())  # Output: Buddy says Woof!
print(Dog.species)  # Access class variable


# 2. ENCAPSULATION
# Bundling data and methods, controlling access to data

class BankAccount:
  """Demonstrates encapsulation"""
  
  def __init__(self, owner, balance=0):
    self.owner = owner
    self.__balance = balance  # Private variable (name mangling with __)
  
  # Getter method
  def get_balance(self):
    return self.__balance
  
  # Setter method with validation
  def deposit(self, amount):
    if amount > 0:
      self.__balance += amount
      return f"Deposited ${amount}"
    return "Invalid amount"
  
  def withdraw(self, amount):
    if 0 < amount <= self.__balance:
      self.__balance -= amount
      return f"Withdrew ${amount}"
    return "Insufficient funds"

account = BankAccount("John", 1000)
print(account.deposit(500))  # Deposited $500
print(account.get_balance())  # 1500


# 3. INHERITANCE
# Child class inherits properties and methods from parent class

class Animal:
  """Parent class"""
  
  def __init__(self, name):
    self.name = name
  
  def make_sound(self):
    return "Some generic sound"

class Cat(Animal):
  """Child class inheriting from Animal"""
  
  def make_sound(self):
    return f"{self.name} says Meow!"

class Bird(Animal):
  """Another child class"""
  
  def make_sound(self):
    return f"{self.name} says Tweet!"

cat = Cat("Whiskers")
print(cat.make_sound())  # Whiskers says Meow!


# 4. POLYMORPHISM
# Same method name, different implementations

def animal_sound(animal):
  """Function that works with any animal"""
  print(animal.make_sound())

animal_sound(cat)  # Uses Cat's make_sound()
animal_sound(Bird("Tweety"))  # Uses Bird's make_sound()


# 5. ABSTRACTION
# Hiding complex details, showing only essential features


class Vehicle(ABC):
  """Abstract class - cannot be instantiated directly"""
  
  @abstractmethod
  def start_engine(self):
    """Method must be implemented by child classes"""
    pass
  
  @abstractmethod
  def stop_engine(self):
    pass

class Car(Vehicle):
  """Concrete class implementing abstract methods"""
  
  def start_engine(self):
    return "Car engine started: Vroom!"
  
  def stop_engine(self):
    return "Car engine stopped"

# car = Vehicle()  # Error! Cannot instantiate abstract class
car = Car()
print(car.start_engine())


# 6. SPECIAL METHODS (Dunder Methods)
# Methods with double underscores for special behavior

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


# 7. CLASS METHODS AND STATIC METHODS

class MathUtils:
  
  # Static method - doesn't access instance or class
  @staticmethod
  def add(a, b):
    return a + b
  
  # Class method - accesses class itself
  @classmethod
  def from_string(cls, value):
    return cls(int(value))

print(MathUtils.add(5, 10))  # 15


# 8. PROPERTY DECORATORS
# Use properties for getters/setters with clean syntax

class Temperature:
  
  def __init__(self, celsius=0):
    self._celsius = celsius
  
  @property
  def celsius(self):
    """Getter"""
    return self._celsius
  
  @celsius.setter
  def celsius(self, value):
    """Setter with validation"""
    if value < -273.15:
      raise ValueError("Temp too low")
    self._celsius = value

temp = Temperature(25)
print(temp.celsius)  # 25
temp.celsius = 30  # Uses setter


print("\n✓ OOP concepts covered!")