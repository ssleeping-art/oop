#include<iostream>
using namespace std;
class mycl{
int a,b;
public:
    friend int sum (mycl x);
    void set1(int i, int j);
    };
    void mycl::set1(int i, int j){
     a = i;
     b =j;
    }
    int sum (mycl x){
    return x.a+x.b;
    }

    int main(){
    mycl n;
    n.set1(3,4);
    cout<<sum(n);
    return 0;



    }

