#include <bits/stdc++.h>
using namespace std;
const int N = 1e5 + 10;
vector<int> v[N];
int sum[N];
int eve[N];
void dfs(int vertex, int par = 0)
{
    if (vertex % 2 == 0)
    {
        eve[vertex]++;
    }
    sum[vertex] += vertex;
    for (auto child : v[vertex])
    {

        if (child == par)
        {
            continue;
        }
        dfs(child, vertex);
        sum[vertex] += sum[child];
        eve[vertex] += eve[child];
    }
}
int main()
{
    int n;
    cin >> n;
    for (int i = 0; i < n - 1; i++)
    {
        int a, b;
        cin >> a >> b;
        v[a].push_back(b);
        v[b].push_back(a);
    }
    dfs(1);
    for (int i = 1; i <= n; i++)
    {
        cout << sum[i] << " " << eve[i] << endl;
    }

    return 0;
}
