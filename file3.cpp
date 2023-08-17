#include<iostream>
#include<fstream>
#include<string>
using namespace std;

int main(){
    int a,i,b;
        string p;
    cout<<"How many friends do you have?"<<endl;
    cin>>a;
        ofstream wf("filefriend.txt");
    for(i=0;i<a;i++){


    cin>>p;
    cout<<"Age "<<endl;
    cin>>b;





     wf<<"Name "<<p<<". Age "<<b<<endl;


             }
                wf.close();

        string text;
        ifstream rf("filefriend.txt");
        while(getline(rf,text)){
            cout<<text<<endl;
        }
        rf.close();




return 0;
}

