def bubble_sort(arr):
    n = len(arr)
    for i in range(n):
        for j in range(0, n-i-1):
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]
    return arr

def selection_sort(arr):
    n = len(arr)
    for i in range(n):
        min_idx = i
        for j in range(i+1, n):
            if arr[j] < arr[min_idx]:
                min_idx = j
        arr[i], arr[min_idx] = arr[min_idx], arr[i]
    return arr

def insertion_sort(arr):
    n = len(arr)
    for i in range(1, n):
        key = arr[i]
        j = i - 1
        while j >= 0 and key < arr[j]:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = key
    return arr

def merge_sort(arr):
    if len(arr) > 1:
        mid = len(arr) // 2
        L = arr[:mid]
        R = arr[mid:]

        merge_sort(L)
        merge_sort(R)

        i = j = k = 0

        while i < len(L) and j < len(R):
            if L[i] < R[j]:
                arr[k] = L[i]
                i += 1
            else:
                arr[k] = R[j]
                j += 1
            k += 1

        while i < len(L):
            arr[k] = L[i]
            i += 1
            k += 1

        while j < len(R):
            arr[k] = R[j]
            j += 1
            k += 1
    return arr

def quick_sort(arr):
    if len(arr) <= 1:
        return arr
    else:
        pivot = arr[len(arr) // 2]
        left = [x for x in arr if x < pivot]
        middle = [x for x in arr if x == pivot]
        right = [x for x in arr if x > pivot]
        return quick_sort(left) + middle + quick_sort(right)
    
def counting_sort(arr):
    max_val = max(arr)
    count = [0] * (max_val + 1)
    for num in arr:
        count[num] += 1
    sorted_arr = []
    for i, c in enumerate(count):
        sorted_arr.extend([i] * c)
    return sorted_arr

def radix_sort(arr):
    max_val = max(arr)
    exp = 1
    while max_val // exp > 0:
        arr = counting_sort_by_digit(arr, exp)
        exp *= 10
    return arr

def counting_sort_by_digit(arr, exp):
    n = len(arr)
    output = [0] * n
    count = [0] * 10

    for i in range(n):
        index = (arr[i] // exp) % 10
        count[index] += 1

    for i in range(1, 10):
        count[i] += count[i - 1]

    for i in range(n - 1, -1, -1):
        index = (arr[i] // exp) % 10
        output[count[index] - 1] = arr[i]
        count[index] -= 1

    return output

def heap_sort(arr):
    n = len(arr)

    def heapify(arr, n, i):
        largest = i
        l = 2 * i + 1
        r = 2 * i + 2

        if l < n and arr[l] > arr[largest]:
            largest = l

        if r < n and arr[r] > arr[largest]:
            largest = r

        if largest != i:
            arr[i], arr[largest] = arr[largest], arr[i]
            heapify(arr, n, largest)

    for i in range(n // 2 - 1, -1, -1):
        heapify(arr, n, i)

    for i in range(n - 1, 0, -1):
        arr[i], arr[0] = arr[0], arr[i]
        heapify(arr, i, 0)

    return arr

def shell_sort(arr):
    n = len(arr)
    gap = n // 2

    while gap > 0:
        for i in range(gap, n):
            temp = arr[i]
            j = i
            while j >= gap and arr[j - gap] > temp:
                arr[j] = arr[j - gap]
                j -= gap
            arr[j] = temp
        gap //= 2

    return arr

def bucket_sort(arr):
    if len(arr) == 0:
        return arr

    max_val = max(arr)
    min_val = min(arr)
    bucket_count = len(arr)
    buckets = [[] for _ in range(bucket_count)]

    for num in arr:
        index = int((num - min_val) / (max_val - min_val + 1) * bucket_count)
        buckets[index].append(num)

    sorted_arr = []
    for bucket in buckets:
        sorted_arr.extend(sorted(bucket))

    return sorted_arr

def counting_sort_for_radix(arr, exp):
    n = len(arr)
    output = [0] * n
    count = [0] * 10

    for i in range(n):
        index = (arr[i] // exp) % 10
        count[index] += 1

    for i in range(1, 10):
        count[i] += count[i - 1]

    for i in range(n - 1, -1, -1):
        index = (arr[i] // exp) % 10
        output[count[index] - 1] = arr[i]
        count[index] -= 1

    for i in range(n):
        arr[i] = output[i]

    return arr

def best_sort(arr):
    return sorted(arr)

def sort(arr, method):
    if method == 'bubble':
        return bubble_sort(arr)
    elif method == 'selection':
        return selection_sort(arr)
    elif method == 'insertion':
        return insertion_sort(arr)
    elif method == 'merge':
        return merge_sort(arr)
    elif method == 'quick':
        return quick_sort(arr)
    elif method == 'counting':
        return counting_sort(arr)
    elif method == 'radix':
        return radix_sort(arr)
    elif method == 'heap':
        return heap_sort(arr)
    elif method == 'shell':
        return shell_sort(arr)
    elif method == 'bucket':
        return bucket_sort(arr)
    elif method == 'best':  
        return best_sort(arr)
    else:
        raise ValueError("Invalid sorting method"
                         "Choose from: bubble, selection, insertion, merge, quick, counting, radix, heap, shell, bucket")
    
def BigO(method):
    if method == 'bubble':
        return "O(n^2)"
    elif method == 'selection':
        return "O(n^2)"
    elif method == 'insertion':
        return "O(n^2)"
    elif method == 'merge':
        return "O(n log n)"
    elif method == 'quick':
        return "O(n log n) on average, O(n^2) worst case"
    elif method == 'counting':
        return "O(n + k) where k is the range of the input"
    elif method == 'radix':
        return "O(d * (n + k)) where d is the number of digits and k is the range of the input"
    elif method == 'heap':
        return "O(n log n)"
    elif method == 'shell':
        return "O(n log n) on average, O(n^2) worst case"
    elif method == 'bucket':
        return "O(n + k) where k is the number of buckets"
    elif method == 'best':
        return "O(n log n)"
    else:
        raise ValueError("Invalid sorting method"
                         "Choose from: bubble, selection, insertion, merge, quick, counting, radix, heap, shell, bucket")


print(sort([3,67,2,15,-50,44], 'best'))