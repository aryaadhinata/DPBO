class Titik{
    private:
        int x;
        int y;
    
    public:
        Titik(){
            x = 0;
            y = 0;
        }

        Titik(int xp, int yp){
            x = xp;
            y = yp;
        }

        void setX(int xp){
            x = xp;
        }

        int getX(){
            return x;
        }

        void setY(int yp){
            y = yp;
        }

        int getY(){
            return y;
        }

        ~Titik(){}
};