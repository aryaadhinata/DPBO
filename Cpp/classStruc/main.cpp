#include <iostream>
#include "Titik.cpp"

using namespace std;

int main(){
    Titik t1;
    Titik t2(11, 9);

    t1.setX(18);
    t1.setY(28);

    cout << "t1 : nilai x :" << t1.getX() << endl;
    cout << "t1 : nilai y :" << t1.getY() << endl;

    cout << "t2 : nilai x :" << t2.getX() << endl;
    cout << "t2 : nilai y :" << t2.getY() << endl;

    return 0;
}