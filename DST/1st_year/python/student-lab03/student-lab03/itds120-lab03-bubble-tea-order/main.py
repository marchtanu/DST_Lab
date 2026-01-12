'''
/**
USERID: XXX
PASSWORD: XXX
EXERCISEID: itds120-lab03-bubble-tea-order
 */
'''

# YOUR CODE HERE

member = input() #Y
size = input() #M
topping = input() #Y

if size == "M":
    price = 50
elif size == "L":
    price = 60
if topping == "N":
    price = price - 10
if member == "Y":
    price = price * 0.9



print(f'Total price: {price}')

