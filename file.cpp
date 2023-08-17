#include<iostream>
#include<fstream>
#include<string>
using namespace std;

int main(){
    ofstream wf("filename.txt");
    wf<<"File can be tricky, but it is fun enough!"<<endl;
        wf<<"2 File can be tricky, but it is fun enough!";
        wf.close();
        string text;
        ifstream rf("amarfile.txt");
        while(getline(rf,text)){
            cout<<text<<endl;
        }
        rf.close();




return 0;
}

