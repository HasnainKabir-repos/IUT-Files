#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

struct Process
{
    int id;
    int arrivalTime;
    int burstTime;
    int priority;
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

bool comparePriority(Process p1, Process p2)
{
    if (p1.priority != p2.priority)
        return p1.priority < p2.priority;
    else
        return p1.arrivalTime < p2.arrivalTime;
}

void PriorityScheduling(vector<Process>& vec)
{
    sort(vec.begin(), vec.end(), compareArrival);
    int current_time = 0;
    int finished_processes = 0;
    int n = vec.size();
    vector<Process> readyQueue;


    int total_response_time = 0;
    int total_waiting_time = 0;

    while(finished_processes < n)
    {
        for(auto& process: vec)
        {
            if(process.arrivalTime <= current_time && process.burstTime > 0)
            {
                readyQueue.push_back(process);
                process.burstTime = 0;
            }
        }

        if(!readyQueue.empty())
        {
            sort(readyQueue.begin(), readyQueue.end(), comparePriority);
            Process currentProcess = readyQueue[0];
            readyQueue.erase(readyQueue.begin());

            currentProcess.startTime = current_time;
            currentProcess.responseTime = currentProcess.startTime - currentProcess.arrivalTime;
            total_response_time += currentProcess.responseTime;

            current_time += currentProcess.burstTime;
            currentProcess.finishTime = current_time;
            currentProcess.waitingTime = currentProcess.finishTime - currentProcess.burstTime - currentProcess.arrivalTime;
            total_waiting_time += currentProcess.waitingTime;

            cout<< "P" << currentProcess.id << ":"<<endl;
            cout<<"Start Time: "<<currentProcess.startTime<<endl;
            cout<<"Finish Time: "<<currentProcess.finishTime<<endl;
            cout<<"Response Time: " <<currentProcess.responseTime<<endl;
            cout<<"Waiting Time: "<<currentProcess.waitingTime<<endl;
            cout<<endl;

            finished_processes++;
        }
        else
        {
            current_time++;
        }
    }


    double avg_response_time = (double)total_response_time / n;
    double avg_waiting_time = (double)total_waiting_time / n;

    cout << "Average Response Time: " << avg_response_time << endl;
    cout << "Average Waiting Time: " << avg_waiting_time << endl;
}

int main()
{
    vector<Process> processes = {
        {1, 3, 10, 3, 10, 0, 0, 0, 0},
        {2, 0, 1, 1, 1, 0, 0, 0, 0},
        {3, 1, 2, 3, 2, 0, 0, 0, 0},
        {4, 4, 7, 4, 7, 0, 0, 0, 0},
        {5, 5, 5, 2, 5, 0, 0, 0, 0}
    };
    PriorityScheduling(processes);
}

