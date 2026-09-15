from Manusia import Manusia
from Karyawan import Karyawan

m = Manusia()
k = Karyawan()

m.set_nama("Nina")
m.set_alamat("Jl. Mawar No. 10")
m.set_no_ktp("1234567890")
m.set_no_telepon("081234567890")

print("m Nama:", str(m.get_nama()))
print("m Alamat:", str(m.get_alamat()))
print("m No. KTP:", str(m.get_no_ktp()))
print("m No. Telepon:", str(m.get_no_telepon()))

k.set_nama("Budi")
k.set_alamat("Jl. Melati No. 20")
k.set_no_ktp("0987654321")
k.set_no_telepon("089876543210")
k.set_no_pegawai("PEG001")
k.set_jabatan("Manager")
k.set_department("HRD")

print("k Nama:", str(k.get_nama()))
print("k Alamat:", str(k.get_alamat()))
print("k No. KTP:", str(k.get_no_ktp()))
print("k No. Telepon:", str(k.get_no_telepon()))
print("k No. Pegawai:", str(k.get_no_pegawai()))
print("k Jabatan:", str(k.get_jabatan()))
print("k Department:", str(k.get_department()))