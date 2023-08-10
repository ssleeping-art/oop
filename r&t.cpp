#include<iostream>
using namespace std;
class base
{
    int i, j;

public :

    void value (int x,int y)
    {
        i =x;
        j =y;

    }
    int re ()
    {
        return i*j;
    }
    int tr ()
    {
        return .5*i*j;
    }

};
class rect : public base
{
public :
    void show()
    {
        cout<<"Area of the rectangle is "<<re()<<endl;
    }
};
class tri: public base
{

public :
   void show1()
    {
          cout<<"Area of the triangle is "<<tr()<<endl;
    }
};
int main()
{ int a,c;
   base b;
   rect r;
   tri t;

  cout<<"Enter the length and breadth"<<endl;
 cin>>a;
 cin>>c;
   r.value(a,c);
  r.show();

  cout<<"Enter the base and hight"<<endl;
   cin>>a;
 cin>>c;


   t.value(a,c);
  t.show1();



    return 0;
}




