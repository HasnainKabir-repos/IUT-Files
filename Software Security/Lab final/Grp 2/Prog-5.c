// Points: 6 pts

#include <unistd.h>
#include <stdlib.h> 
int main()
{
    char *buf;
    int len;

    read(0, &len, sizeof(len));

    if (len > 1000) {return 0; }
    buf = malloc(len);
    read(0, buf, len);
    return 0;
}

