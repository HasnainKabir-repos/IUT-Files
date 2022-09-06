#include <iostream>
#include<queue>
using namespace std;

queue<int> queue1;

int ping(int t) {
 // YOUR CODE HERE
        queue1.push(t);

        while(queue1.front() < t-3000){
            queue1.pop();
        }
        return queue1.size();
}
int main() {
     cout << ping(1) << "\n";
     cout << ping(2) << "\n";
     cout << ping(3) << "\n";
     cout << ping(4) << "\n";
     cout << ping(3001) << "\n";
     cout << ping(3002) << "\n";
     cout << ping(3003) << "\n";
     cout << ping(6003) << "\n";
     cout << ping(10003) << "\n";
     return 0;
}


