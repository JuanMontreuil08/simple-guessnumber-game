import random

guess_number = random.randint(0,20)

#Optional, only if you want to see the result
print(guess_number)

def game():
    my_number= input("what is your number: " )
    if int(my_number) == guess_number:
        print("your are right")
    elif int(my_number) > guess_number:
        print("my number is lower")
    else:
        print("my number is higher")

#6 Chances
game()
game()
game()
game()
game()
game()
print("Do not worry, Try it Again!")

