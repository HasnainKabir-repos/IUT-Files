#include <cstdio>
#include <cstdlib>
#include <ctime>

bool leap(int year)
{
    if((year%400==0 || year%100) &&(year%4==0))
        return true;
    else
        return false;
}

int main()
{
    printf("Enter your student ID: ");
    int ID;
    scanf("%d", &ID);
    srand(ID);
    freopen("table.sql", "w", stdout);
    int a_id;
    int t_id=1;
    printf("DROP TABLE TRANSACTIONS CASCADE CONSTRAINTS;\n");
    printf("DROP TABLE ACCOUNT CASCADE CONSTRAINTS;\n");
    printf("CREATE TABLE ACCOUNT\n(\n\tA_ID NUMBER,\n\tCONSTRAINT PK_ACCOUNT PRIMARY KEY (A_ID)\n);\n");
    printf("\n");
    printf("CREATE TABLE TRANSACTIONS\n(\n\tT_ID NUMBER,\n\tDTM DATE,\n\tA_ID NUMBER,\n\tAMOUNT NUMBER,\n\tTYPE CHAR(1),\n\tCONSTRAINT PK_TRANSACTIONS PRIMARY KEY (T_ID),\n\tCONSTRAINT FK_TRANSACTIONS_ACCOUNT FOREIGN KEY (A_ID) REFERENCES ACCOUNT\n);\n");
    printf("\n\n");
    int no_of_accounts=100+rand()%200;
    for(int i=0; i<no_of_accounts; i++)
        printf("INSERT INTO ACCOUNT VALUES(%d);\n", i+1);
    printf("\n");
    for(int i=0; i<no_of_accounts; i++)
    {
        int times=rand()%10+1;
        for(int k=0; k<times; k++)
        {
            int amount=rand();
            int year=rand()%23+2000;
            int month=rand()%12+1;
            int day=rand()%28+1;
            if(rand()%2)
            {
                if(month==2)
                {
                    if(leap(year))
                        day++;
                }
                else
                {
                    if(month==4 || month==6 || month==9 || month==11)
                        day+=2;
                    else
                        day+=3;
                }
            }
            int hour=rand()%24;
            int minute=rand()%60;
            int second=rand()%60;
            int type=rand()%2;
            printf("INSERT INTO TRANSACTIONS VALUES(%d, TO_DATE('%d/%02d/%02d %02d:%02d:%02d', 'yyyy/mm/dd hh24:mi:ss'), %d, %d, %d);\n", t_id++, year, month, day, hour, minute, second, i+1, amount*50, type);
        }
    }
    printf("COMMIT;\n");

    return 0;
}
