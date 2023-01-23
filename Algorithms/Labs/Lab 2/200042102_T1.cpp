#include<iostream>
#include<queue>
using namespace std;

struct Node {
    int x, y;
    int moves;
    Node() {}
    Node(int x, int y, int moves)
        : x(x)
        , y(y)
        , moves(moves)
    {
    }
};

int dx[] = {-2, -1, 1, 2, -2, -1, 1, 2};
int dy[] = {-1, -2, 2, 1, 1, 2, -2, -1};


int BFS(int knightPos[], int targetPos[]){
    int visited[8][8] = {0};

    queue<Node> q;

    q.push(Node(knightPos[0], knightPos[1], 0));

    visited[knightPos[0]][knightPos[1]] = 1;

    while(!q.empty()){

        Node cell = q.front();
        q.pop();

        if(cell.x == targetPos[0] && cell.y == targetPos[1]){
            return cell.moves;
        }

        for(int i=0;i<8;i++){

            int x = cell.x + dx[i];
            int y = cell.y + dy[i];

            if(x>=0 && x<8 && y>=0 && y<8 && visited[x][y] == 0){
                q.push(Node(x, y, cell.moves+1));
                visited[x][y] = 1;
            }
        }
    }
}

int main(){
    int n;
    cin>>n;

    while(n--){
        string a,b;
        cin>>a>>b;

        int a1 = a[0] - 'a';
        int a2 = a[1] - '1';

        int b1 = b[0] - 'a';
        int b2 = b[1] - '1';

        int knightPos[2];
        knightPos[0] = a1;
        knightPos[1] = a2;
        int targetPos[2];
        targetPos[0] = b1;
        targetPos[1] = b2;

        int res = BFS(knightPos, targetPos);

        cout<<"To get from "<<a<<" to "<<b<<" would take "<<res<<" moves "<<endl;
    }
}
