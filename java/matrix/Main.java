import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int baris = 0, kolom = 0, temp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("masukan baris");
        try{
            baris = sc.nextInt();
        }catch(Exception e){};

        System.out.println("masukan kolom");
        try{
            kolom = sc.nextInt();
        }catch(Exception e){};
        
        Matrix m = new Matrix(baris, kolom);
        m.setMat();
        
        for(int i = 0; i < baris; i++){
            for(int j = 0; j < kolom; j++){
                System.out.println("Isikan angka:");
                try{
                    temp = sc.nextInt();
                    m.setSel(i, j, temp);
                }catch(Exception e){};
            }
        }
        sc.close();
        for(int i = 0; i < baris; i++){
            for(int j = 0; j < kolom; j++){
                System.out.print(m.getSel(i, j)+" ");
            }
            System.out.println("");
        }
    }
}
