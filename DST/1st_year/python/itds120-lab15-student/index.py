def welcome(name, role, level="beginner"):
  return f"Welcome {name}, you are a {level} {role}!"
continue_choice = "yes"
while continue_choice == "yes":
  name = input("Enter your name: ")
  role = input("Enter your role: ")
  message = welcome(name, role)
  print(message)
  continue_choice = input("Do you want to continue? (yes/no): ").strip().lower()