#include<iostream>
using namespace std;
class base
{
protected:

    int i,j;
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
class derived1 : public base
{
    int k;
public :
    void setk()
    {
        k = i*j;
    }
    void showk()
    {
        cout<<k<<"\n";
    }
};
class derived2 : public derived1
{
    int m;
public :
    void setm()
    {
        m = i-j;
    }
    void showm()
    {
        cout<<m<<"\n";
    }
};
int main()
{
    derived1 ob1;
    derived2 ob2;
    ob1.set1(1,2);
    ob1.show();
    ob2.set1(3,4);
    ob2.show();
    return 0;
}

