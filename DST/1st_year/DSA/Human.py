class Human:
    __is_adult__ = False
    def __init__(self, name, age, gender):
        self.name = name
        self.age = age
        self.gender = gender

        if self.age > 18:
            __is_adult__ = True


    def introduce(self):
        for i in self.__dict__:
            print(self.__dict__[i])
        return f"Hello, my name is {self.name}, I am {self.age} years old"

Guy = Human('Nigga', 25, 'Male')
