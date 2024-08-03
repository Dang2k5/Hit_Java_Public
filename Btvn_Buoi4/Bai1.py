n = int(input("Nhap n: "))
t0 = ()
my_list = []
for i in range(n):
    x = input()
    my_list.append(x)
t1 = tuple(int(x) for x in my_list)
print(t1)
tong = 0
for i in t1:
    tong += i
tbc = tong/n
print(tbc)
