import Human as H

class Student(H.Human):
    def __init__(self, name, age, gender, student_id, major):
        super().__init__(name, age, gender)
        self.student_id = student_id
        self.major = major


guy = Student('John', 25, 'Male', 'S12345', 'Computer Science')
print(guy.introduce())
print(H.Human.__is_adult__)