#include<iostream>
#include<vector>
#include<queue>
#include<algorithm>
using namespace std;

struct Process
{
     int id;
    int arrivalTime;
    int burstTime;
    int remainingTime;
    int startTime;
    int finishTime;
    int waitingTime;
    int responseTime;
};

bool compareArrival(Process p1, Process p2)
{
    return p1.arrivalTime < p2.arrivalTime;
}

void RoundRobin(struct Process processes[], int quantum, int n)
{

    int remainingTime[n];
    int currentTime = 0;

    for (int i = 0; i < n; i++)
    {
        remainingTime[i] = processes[i].remainingTime;
    }

    while (1)
    {
        int done = 1;

        for (int i = 0; i < n; i++)
        {
            if (remainingTime[i] > 0)
            {
                done = 0;

                int executionTime = (remainingTime[i] > quantum) ? quantum : remainingTime[i];

                if (processes[i].responseTime == 0)
                {
                    processes[i].responseTime = currentTime;
                }

                currentTime += executionTime;
                remainingTime[i] -= executionTime;

                if (remainingTime[i] == 0)
                {
                    processes[i].finishTime = currentTime;
                    processes[i].waitingTime = currentTime - processes[i].arrivalTime - processes[i].burstTime;
                }
            }
        }

        if (done == 1)
        {
            break;
        }
    }

    for (int i = 0; i < n; i++)
    {
        cout << "P" << processes[i].id << ":\n";
        cout << "Start Time - " << processes[i].responseTime << "\n";
        cout << "Finish Time - " << processes[i].finishTime << "\n";
        cout << "Response Time - " << processes[i].responseTime << "\n";
        cout << "Waiting Time - " << processes[i].waitingTime << "\n";
    }

    float totalWaitingTime = 0;
    float totalResponseTime = 0;

    for (int i = 0; i < n; i++)
    {
        totalWaitingTime += processes[i].waitingTime;
        totalResponseTime += processes[i].responseTime;
    }

    float averageWaitingTime = totalWaitingTime / n;
    float averageResponseTime = totalResponseTime / n;

    cout << "Average Response Time - " << averageResponseTime << "\n";
    cout << "Average Waiting Time - " << averageWaitingTime << "\n";

}

int main()
{
    struct Process processes[] =
    {
       {1, 3, 10, 10, 0, 0, 0, 0},
        {2, 0, 1, 1, 0, 0, 0, 0},
        {3, 1, 2, 2, 0, 0, 0, 0},
        {4, 4, 7, 7, 0, 0, 0, 0},
        {5, 5, 5, 5, 0, 0, 0, 0}
    };

    int n = sizeof(processes) / sizeof(processes[0]);

    sort(processes, processes + n, compareArrival);



    int quantum = 4;
    RoundRobin(processes, quantum, 5);
}
