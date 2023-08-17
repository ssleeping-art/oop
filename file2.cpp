#include<iostream>
using namespace std;

int main(){
   try{
   int a,b;
   cin>>a>>b;

   if(b!=0){
    cout<<"It is divisible\n"<<(double)a/b;
   }
   else{
    throw(b);
   }


   }
   catch (int c){
        cout<<"It is not divisible."<<endl;
         cout<<"Dnominator is "<<c;
   }
return 0;
}
