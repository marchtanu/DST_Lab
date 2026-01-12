'''
/**
USERID: 6887020
PASSWORD: efb53a
EXERCISEID: itds120-lab15-count-passenger-class-gender
*/
'''
# Your Python code goes here
import pandas as pd
df = pd.read_csv('data.csv')
m_1class = df[(df['Sex'] == 'male') & (df['Age'] > 40 ) & (df['Pclass'] == 1)]
m_2class = df[(df['Sex'] == 'male') & (df['Age'] > 40 ) & (df['Pclass'] == 2)]
m_3class = df[(df['Sex'] == 'male') & (df['Age'] > 40 ) & (df['Pclass'] == 3)]

fm_1class = df[(df['Sex'] == 'female') & (df['Age'] > 40 ) & (df['Pclass'] == 1)]
fm_2class = df[(df['Sex'] == 'female') & (df['Age'] > 40 ) & (df['Pclass'] == 2)]
fm_3class = df[(df['Sex'] == 'female') & (df['Age'] > 40 ) & (df['Pclass'] == 3)]

print('male (age>40)')
print(f"Pclass 1: {len(m_1class)}")
print(f"Pclass 2: {len(m_2class)}")
print(f"Pclass 3: {len(m_3class)}")

print('female (age>40)')
print(f"Pclass 1: {len(fm_1class)}")
print(f"Pclass 2: {len(fm_2class)}")
print(f"Pclass 3: {len(fm_3class)}")