'''
/**
USERID: 6887020
PASSWORD: efb53a
EXERCISEID: itds120-lab15-count-passenger-embark-class
*/
'''
# Your Python code goes here
import pandas as pd
df = pd.read_csv('data.csv')
embarked_value = df['Embarked'].unique()

for i in embarked_value:
    embarked = df[df['Embarked'] == i].sort_values(by=['Pclass','Fare'], ascending=[True, False])

    print(f'Embarked: {i}')
    print(embarked[['Pclass', 'Fare', 'Embarked']].head(5))
    print(embarked[['Pclass', 'Fare', 'Embarked']].tail(5))