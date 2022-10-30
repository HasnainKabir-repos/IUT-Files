#include<iostream>

using namespace std;

struct TrieNode{
    struct TrieNode* children[26];
    bool isEndofWord;
};

struct TrieNode* getNode(){
    struct TrieNode* temp = new TrieNode;

    temp->isEndofWord = false;

    for(int i=0;i<26;i++){
        temp->children[i] = NULL;
    }

    return temp;
};

void insert(TrieNode* root, string key){
    struct TrieNode* temp = root;

    for(int i=0;i<key.length();i++){

        int id = key[i] - 'a';

        if(temp->children[id] == NULL){
            temp->children[id] = getNode();
        }

        temp = temp->children[id];
    }

    temp->isEndofWord = true;
}

bool search(TrieNode* root, string key){

    struct TrieNode* temp = root;

    for(int i=0;i<key.length();i++){

        int id = key[i] - 'a';

        if(temp->children[id] == NULL)
            return false;

        temp = temp->children[id];
    }

    return (temp->isEndofWord);
}


int main(){
    TrieNode* root = getNode();
    insert(root, "cat");
    insert(root, "cats");
    insert(root, "dog");
    insert(root, "and");

    cout<<search(root, "cat")<<search(root, "cats")<<search(root, "and")<<search(root, "dogs");
}
