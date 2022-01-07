#include <iostream>
using namespace std;

int main()
{

    int t;
    cin >> t;

    while (t--)
    {

        int x, a, b;
        cin >> x >> a >> b;

        int ans = (((100 - x) * b) + a) * 10;
        cout << ans << endl;
    }

    return 0;
}