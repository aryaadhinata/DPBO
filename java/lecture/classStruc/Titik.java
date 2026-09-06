class Titik {
    private int x;
    private int y;

    Titik(){
        x = 0;
        y = 0;
    }   

    Titik(int xp, int yp){
        x = xp;
        y = yp;
    }

    public void setX(int xp){
        x = xp;
    }

    public int getX(){
        return x;
    }
    
    public void setY(int yp){
        y = yp;
    }

    public int getY(){
        return y;
    }
}
