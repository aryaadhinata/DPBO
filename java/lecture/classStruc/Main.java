class Main {
        public static void main(String[] args) {
        Titik t1 = new Titik();
        Titik t2 = new Titik(11, 9);

        t1.setX(18);
        t1.setY(28);

        System.out.println("t1 : nilai X : " + t1.getX());
        System.out.println("t1 : nilai Y : " + t1.getY());

        System.out.println("t2 : nilai X : " + t2.getX());
        System.out.println("t2 : nilai Y : " + t2.getY());
    }
}
