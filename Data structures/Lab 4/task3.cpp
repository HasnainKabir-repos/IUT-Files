
#include <iostream>
#include<queue>
using namespace std;
class Stack_q{
    queue<int> q;
public:
    void push_s(int x){
        q.push(x);
    }

    void pop_s(){
        queue<int> q2;

        while(q.size()!=1){
            q2.push(q.front());
            q.pop();
        }

        q = q2;
        q2 = {};
    }

    int top_s(){
        return q.back();
    }

    bool empty_s(){
        return q.empty();
    }
};

int main() {
    Stack_q st;
     st.push_s(10);
     cout << st.top_s() << endl;
     st.push_s(20);
     cout << st.top_s() << endl;
     st.pop_s();
     cout << st.top_s() << endl;
     st.push_s(100);
     cout << st.top_s() << endl;
     cout << st.empty_s() << endl;
     st.pop_s();
     st.pop_s();
     cout << st.empty_s() << endl;
}

