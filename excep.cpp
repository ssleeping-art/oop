#include<iostream>
using namespace std;

int main(){
   try{
   int age;
   cin>>age;

   if(age>=18){
    cout<<"Access granted - you are old enough.";
   }
   else{
    throw(age);
   }


   }
   catch (int myNum){
        cout<<"Access Denied - you must be at least 18 years old."<<endl;
         cout<<"Age is: "<<myNum;
   }
return 0;
}


