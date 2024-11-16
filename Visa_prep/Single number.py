N = int(input())
arr = list(map(int, input().split()))

res = 0
for n in arr:
    res = res ^ n
print(res)
