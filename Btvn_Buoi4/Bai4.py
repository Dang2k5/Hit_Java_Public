n = int(input("Nhap n: "))
s1 = set(map(int, input().split()))
s2 = set()
target = int(input("Nhap muc tieu: "))
sum = 0
s1 = sorted(s1)
for i in s1:
    if sum + i <= target:
        s2.add(i)
        sum += i
print(s2)