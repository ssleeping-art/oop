#include<iostream>
using namespace std;
class calculator{
private:
    int res;

public:
    //setter
    void setval(int x){
    res = x;
    }


    //getter
    int getval(){
    return res;
    }

};
int main(){
    int r,n;
    char g;
calculator cal;
cout<<"Enter Two Values"<<endl;
cin>>r>>n;

cout<<"Operator"<<endl;
cin>>g;


switch(g)
    {
        case '+':cal.setval(r+n);

            cout<<cal.getval();
            break;

        case '-':
            cal.setval(r-n);

            cout<<cal.getval();

            break;

        case '*':
            cal.setval(r*n);

            cout<<cal.getval();
            break;

        case '/':
            cal.setval(r/n);

            cout<<cal.getval();

            break;

             case '%':
            cal.setval(r%n);

            cout<<cal.getval();

            break;


        default:
          cout<< "Error! operator is not correct";
    }





return 0;
}

