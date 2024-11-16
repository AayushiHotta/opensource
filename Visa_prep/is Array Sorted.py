def is_sorted(arr, n):
    for i in range(n-1):
        if(arr[i] > arr[i+1]):
            return "false"
        
    return "true";

n = int(input())
arr = list(map(int, input().split()))

print(is_sorted(arr, n))
