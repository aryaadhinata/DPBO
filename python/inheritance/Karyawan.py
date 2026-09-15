from Manusia import Manusia

class Karyawan(Manusia):
    
    def __init__(self):
        self.no_pegawai = ""
        self.jabatan = ""
        self.department = ""
    
    def set_no_pegawai(self, no_pegawai):
        self.no_pegawai = no_pegawai
    
    def get_no_pegawai(self):
        return self.no_pegawai
    
    def set_jabatan(self, jabatan):
        self.jabatan = jabatan
    
    def get_jabatan(self):
        return self.jabatan
    
    def set_department(self, department):
        self.department = department
    
    def get_department(self):
        return self.department