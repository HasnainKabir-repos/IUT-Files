#include<iostream>
using namespace std;

int rowNbr[] = {-1,  0,  1, -1, 1, -1, 0, 1};
int colNbr[] = {-1, -1, -1,  0, 0,  1, 1, 1};

bool isInside(int row, int col){
    if(row >=0 && row <5 && col>=0 && col<8){
        return true;
    }

    return false;
}

void DFS(int visited[5][8], int grid[5][8], int row, int col){
    visited[row][col] = 1;
    for(int i=0;i<8;i++){
        if(isInside(row + rowNbr[i], col + colNbr[i]) && visited[row][col]==0 && grid[row][col]==0){
            DFS(visited, grid, row+rowNbr[i], col+colNbr[i]);
        }
    }
}


int main(){
    int grid[5][8];

    for(int i=0;i<5;i++){
        for(int j=0;j<8;j++){
            cin>>grid[i][j];
        }
    }

    int visited[5][8] = {0};

    int count = 0;

    for(int i=0;i<5;i++){
        for(int j=0;j<8;j++){
            if(visited[i][j] == 0 && grid[i][j] == 0){
                visited[i][j] = 1;

                DFS(visited, grid, i, j);
                count++;
            }
        }
    }

    cout<<count<<endl;
}
