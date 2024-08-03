n = int(input("Nhap n: "))
arr = []
for i in range(n):
    arr.append(input())
b = tuple(arr)
cnt = 0
for i in b:
    if i.isdigit():
        cnt += 1
print("So phan tu trong b co dang so la: ", cnt)
