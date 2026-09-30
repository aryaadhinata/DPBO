class Matrix{
    private int baris;
    private int kolom;
    private int mat[][];

    Matrix(){
    }

    Matrix(int baris, int kolom){
        this.baris = baris;
        this.kolom = kolom;
        mat = new int[baris][kolom];
    }

    void setBaris(int baris){
        this.baris = baris;
    }

    int getBaris(){
        return baris;
    }
    
    void setKolom(int kolom){
        this.kolom = kolom;
    }

    int getKolom(){
        return kolom;
    }

    void setMat(){
        mat = new int[baris][kolom];
    }

    int[][] getMat(){
        return mat;
    }

    void setSel(int baris, int kolom, int nilai){
        mat[baris][kolom] = nilai;
    }

    int getSel(int baris, int kolom){
        return mat[baris][kolom];
    }
}