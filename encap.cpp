#include<iostream>
using namespace std;
class emp{
private:
    int sal;
public:
    //setter
    void setsal(int s){
    sal = s;}
    int getsal(){
    return sal;}
};
int main(){
emp ob;
ob.setsal(50000);
cout<<ob.getsal();
return 0;}
