#include<iostream>
using namespace std;
class B;
class A
{
    int a;
public:


    void set1(int i)
    {
        a = i;
    }
        friend int MAX (A ob, B oc);
};
class B
{
    int b;
public:


    void set2(int j)
    {
        b = j;
    }
        friend int MAX (A ob, B oc);
};
int MAX (A ob, B oc)
{
    cout<<"MAX is ";
    return ob.a > oc.b? ob.a : oc.b;

}



int main()
{ int q,w;
    A n;
    B m;
    cin>>q>>w;
    n.set1(q);
    m.set2(w);


            cout<<    MAX (n,m);


    return 0;
    }


