'''
/**
USERID: 6887020
PASSWORD: efb53a
EXERCISEID: itds120-lab03-grade-calculation
 */
'''

# YOUR CODE HERE
l = (float(input())/12) * 10
a = (float(input())/12) * 10
q = (float(input())/12) * 10
c = (float(input())/80) * 50
p = (float(input())/100) * 20

grade = l + a + q+ c + p

if 85 <= grade <=100 :
    print("Grade: A")

elif 80 <= grade < 85 :
    print("Grade: B+")

elif 75 <= grade < 80 :
    print("Grade: B")

elif 70 <= grade < 75 :
    print("Grade: C+")

elif 65 <= grade < 70 :
    print("Grade: C")

elif 60 <= grade < 65 :
    print("Grade: D+")

elif 50 <= grade < 60 :
    print("Grade: D")

elif grade < 50 :
    print("Grade: F")