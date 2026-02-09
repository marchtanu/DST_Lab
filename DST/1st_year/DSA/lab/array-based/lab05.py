import sys

data = []

print(f"{'Length':<10}{'Size in Byte':<15}")
print("-" * 25)

for k in range(50):
  length = len(data)
  size_in_bytes = sys.getsizeof(data)
  print(f"{length:<10}{size_in_bytes:<15}")
  data.append(data)

print(data)