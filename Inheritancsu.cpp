#include <iostream>
using namespace std;
class base{
public:
    base(){cout<<"Base constructs\n";}
    ~base(){cout<<"Base dies\n";}
};
class base2 {
public:
    base2(){cout<<"Base2 constructs\n";}
    ~base2(){cout<<"Base2 dies\n";}
};
class derived2:public base,public base2{
public:
    derived2(){cout<<"Derived constructs\n";}
    ~derived2(){cout<<"Derived dies\n";}
};
int main(){
    derived2 ob;
    return 0;
}
