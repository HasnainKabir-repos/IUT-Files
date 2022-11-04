
#include<iostream>
#include<vector>
using namespace std;


struct TrieNode{
    TrieNode* children[26];
    bool isEndOfWord;
};

struct TrieNode* getNode(){
    struct TrieNode* temp = new TrieNode;

    temp->isEndOfWord = false;

    for(int i=0;i<26;i++){
        temp->children[i] = NULL;
    }

    return temp;
};

void insert(TrieNode* root, string key){
    TrieNode* temp = root;

    for(int i=0;i<key.length();i++){

        int id = key[i] - 'a';

        if(temp->children[id] == NULL){
            temp->children[id] = getNode();
        }

        temp = temp->children[id];
    }

    temp->isEndOfWord = true;
}

bool startWith(TrieNode* root, string prefix){
    TrieNode* temp = root;

    for(int i=0;i<prefix.length();i++){

        int id = prefix[i] - 'a';

        if(temp->children[id] == NULL){
            return false;
        }

        temp = temp->children[id];
    }

    return true;
}

void gotoEnd(TrieNode* Trie, vector<string> result, string prefix){
    if(result.size() == 3) return;

    if(Trie->isEndOfWord) result.push_back(prefix);

    for(int i=0;i<26;i++){
        if(Trie->children[i]!= NULL){
            gotoEnd(Trie->children[i], result, prefix + (char)('a'+i));
        }
    }
}


vector<string> checkPrefix(TrieNode* trie, string prefix){
    vector<string> vec;
    string str = prefix;

    for(int i=0;i<prefix.length();i++){
        int id = prefix[i] - 'a';
        trie = trie->children[id];
        //trie->isEndOfWord = false;
    }

    gotoEnd(trie, vec, prefix);
    return vec;
}


int main(){
    TrieNode* trie = getNode();

    vector<string> products = {"mobile","mouse","moneypot","monitor","mousepad"};
    string searchWord = "mouse";

    for(int i=0;i<products.size();i++){
        insert(trie, products[i]);
    }

    vector<vector<string>> vec;

    int j =0;
    for(int i=0;i<searchWord.length();i++){
        if(startWith(trie, searchWord.substr(0, i+1))){
            vec.push_back(checkPrefix(trie, searchWord.substr(0, i+1)));
            j++;
        }

    }

    for(int i=0;i<vec.size();i++){
        for(int j=0;i<vec[i].size();j++){
            cout<<vec[i][j]<<endl;
        }
    }
}


