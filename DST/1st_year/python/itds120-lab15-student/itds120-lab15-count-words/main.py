'''
/**
USERID: 6887020
PASSWORD: efb53a
EXERCISEID: itds120-lab15-count-words
*/
'''
# Your Python code goes here
import pandas as pd
df = pd.read_csv('data.csv')
word = input()
counts = df['text'].str.count(word).sum()
print(counts)