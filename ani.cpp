#include<iostream>
using namespace std;
class animal
{

public :

    void animalsound()
    {
        cout<<"The animal makes a sound\n";
    }
};
class pig : public animal
{
public :

    void animalsound()
    {
        cout<<"The pig says wee wee\n";
    }
};
class dog: public animal
{

public :
   void animalsound()
    {
        cout<<"The dog says bow bow\n";
    }
};
int main()
{
   animal myanimal;
   pig mypig;
   dog mydow;
   myanimal.animalsound();
   mypig.animalsound();
  mydow. animalsound();


    return 0;
}



