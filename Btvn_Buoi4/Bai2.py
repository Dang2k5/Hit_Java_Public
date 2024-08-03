s1 = {'sv1', 'sv2', 'sv3', 'sv4', 'sv5'}
s2 = {'sv2', 'sv3', 'sv6', 'sv5', 'sv9'}
print("Danh sach sinh vien hoc ca hai ban: ", s1 & s2)
print("Danh sach sinh vien dang ky: ", s1 | s2)
print("Danh sach sinh vien dang ky ban 1 ko dang ky ban 2: ", s1 - s2)