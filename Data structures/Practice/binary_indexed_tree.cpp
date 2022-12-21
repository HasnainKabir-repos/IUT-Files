#include <iostream>

using namespace std;

int getSum(int tree[], int index)
{
    int sum = 0;
    index = index + 1;

    while (index>0)
    {

        sum += tree[index];
        index -= index & (-index);
    }
    return sum;
}

void update(int tree[], int n, int index, int val)
{
    index = index + 1;
    while (index <= n)
    {
    tree[index] += val;
    index += index & (-index);
    }
}

int *constructTree(int arr[], int n)
{
    int *tree = new int[n+1];
    for (int i=1; i<=n; i++)
        tree[i] = 0;
    for (int i=0; i<n; i++)
        update(tree, n, i, arr[i]);
    return tree;
}

