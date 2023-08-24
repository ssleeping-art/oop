#include<iostream>
using namespace std;
class tan
{

public:

    virtual void pika()
    {
        cout<<"This is tan's pika()\n";
    }
};
class dead1:public tan
{

public:

    void pika()
    {
        cout<<"This is dead1's pika()\n";
    }
};
class dead2:public tan
{

public:

    void pika()
    {
        cout<<"This is dead2's pika()\n";
    }
};


int main()
{
    tan *p,b;
    dead1 d1;
    dead2 d2;
    p=&d1;
    p->pika();
    p=&d2;
    p->pika();


    return 0;



}



