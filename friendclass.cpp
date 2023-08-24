#include<iostream>
using namespace std;
class twovalues
{
    int a,b;
public:
    twovalues (int i,int j)
    {
        a =i;
        b = j;
    }
    friend class Min;
};
class Min{
 public:
    int min1(twovalues x);

};
int Min::min1(twovalues x)
{
    return x.a < x.b? x.a : x.b;
}


int main()
{
twovalues ob (10,20);
Min m;
    cout<<m.min1(ob);
    return 0;



}


