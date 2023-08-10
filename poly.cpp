#include<iostream>
using namespace std;
class base {

   int i ,j;
public :


    void set1(int a, int b)
    {
        i =a ;
        j =b;
    }
       void show()
    {
        cout<<i<<" "<<j<<"\n";
    }
    };
    class derived : public base {
    int k;
public :
    derived (int x){k = x;}
    void showk()
    {
        cout<<k<<"\n";
    }
    };
    int main(){
    derived ob(1);
    ob.set1(1,2);
    ob.show();
    return 0;
    }
