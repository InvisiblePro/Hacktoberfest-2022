#include<iostream>
#include<windows.h>    //used for PlaySound function
#include<fstream>    //used for file handling

using namespace std;

int main()
{
  char audiofile_char[50];
  string audiofile_str;
  fstream fp;
  
  //Enter name of a 'wav' audio file with .wav extension and make sure it is present in the folder where your program is saved.
  cout<<"Enter the name of an audio file: ";
  cin>>audiofile_char;
  
  fp.open(audiofile_char, ios::in);
    if (fp != NULL)
    {
      /* open function doesn't work with a variable of string type and PlaySound function doesn't work with char array hence first we used char array and here we are converting it to a string. so that we can use it in PlaySound function */ 
      string audiofile_str =audiofile_char;  
      
  /* PlaySound function is used to play a sound specified by the given file name. */
  /* SND_SYNC : play sound synchronously */
  /* .c_str() function is used to return a pointer to an array that contains a null-terminated sequence of characters representing the current value of the string object. */
  PlaySound(audiofile_str.c_str(), NULL, SND_SYNC);
  }
  else
  {
    cout<<"\nAudio file couldn't run..!!";
    cout<<"\nCheck the following things: \n 1. Your file is an original .wav audio file. \n 2. You have mentioned '.wav' extension in the name of file. \n 3. It is present in the folder where your program is saved.";
  }  
  
  fp.close();
  
  return 0;
}