n , m = map(int , input("Nhap n, m: ").split())
array = set(map(int, input().split()))
a = set(map(int, input().split()))
b = set(map(int, input().split()))

res = 0
for i in array:
    if i in a:
        res += 1
    if i in b:
        res -= 1
print(f'Muc do hanh phuc la: ', res)