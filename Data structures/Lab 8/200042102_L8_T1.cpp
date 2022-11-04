#include<iostream>

using namespace std;

class WordDictionary{
public:
    WordDictionary* children[26] = {} ;
    bool isEndOfWord = false;

    void addWord(string word){
        WordDictionary* temp = this;

        for(int i=0;i<word.length();i++){
            int id = word[i] - 'a';

            if(temp->children[id] == NULL){
                temp->children[id] = new WordDictionary();
            }

            temp = temp->children[id];
        }

        temp->isEndOfWord = true;
        cout<<"word added"<<endl;
    }

    bool search(string word){
        WordDictionary* temp = this;

        bool found = false;

        for(int i=0;i<word.length();i++){
            if(word[i] == '.'){
                for(int j = 0;j<26;j++){
                    if(temp->children[j] != NULL){
                        found = true;
                        temp = temp->children[j];
                        break;
                    }
                }
            }else{
                int id = word[i] - 'a';

                if(temp->children[id] == NULL){
                    found = false;
                    break;
                }

                temp = temp->children[id];
            }
        }

        found = temp->isEndOfWord;

        if(found) cout<<"word found"<<endl;
        else cout<<"word not found"<<endl;

        return found;
    }
};


int main(){
    WordDictionary wd = WordDictionary();
    wd.addWord("bada");
    wd.addWord("dada");
    wd.addWord("madc");
    wd.addWord("madx");
    wd.addWord("madg");
    wd.search(".a.");
//    wd.search("bad");
//    wd.search(".ad");
//    wd.search("b..");
//    wd.search("c..");
}
