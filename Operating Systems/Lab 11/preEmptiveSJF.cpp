#include<iostream>
#include<vector>
#include<queue>
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

struct Compare
{
    bool operator()(const Process* p1, const Process* p2)
    {
        return p1->remainingTime > p2->remainingTime;
    }
};

void SJF(vector<Process>& vec)
{
    priority_queue<Process*, vector<Process*>, Compare> q;

    int current_time = 0;
    int finished_processes = 0;

    Process* currentProcess = nullptr;

    int total_response_time = 0;
    int total_waiting_time = 0;

    while(finished_processes < vec.size())
    {
        for(auto& process: vec)
        {
            if(process.arrivalTime <= current_time && process.remainingTime > 0)
            {
                q.push(&process);
            }
        }

        if(!q.empty())
        {
            currentProcess = q.top();
            q.pop();
        }
        else
        {
            current_time++;
            continue;
        }

        if(currentProcess->remainingTime == currentProcess->burstTime)
        {
            currentProcess->startTime = current_time;
            currentProcess->responseTime = current_time - currentProcess->arrivalTime;
            total_response_time += currentProcess->responseTime;
        }
        current_time++;
        currentProcess->remainingTime--;

        if(currentProcess->remainingTime == 0)
        {
            finished_processes++;

            currentProcess->finishTime = current_time;
            currentProcess->waitingTime = currentProcess->finishTime - currentProcess->burstTime - currentProcess->arrivalTime;
            total_waiting_time += currentProcess->waitingTime;

            cout<< "P" << currentProcess->id << ":"<<endl;
            cout<<"Start Time: "<<currentProcess->startTime<<endl;
            cout<<"Finish Time: "<<currentProcess->finishTime<<endl;
            cout<<"Response Time: " <<currentProcess->responseTime<<endl;
            cout<<"Waiting Time: "<<currentProcess->waitingTime<<endl;
            cout<<endl;
        }
    }


    double avg_response_time = (double)total_response_time / vec.size();
    double avg_waiting_time = (double)total_waiting_time / vec.size();

    cout << "Average Response Time: " << avg_response_time << endl;
    cout << "Average Waiting Time: " << avg_waiting_time << endl;
}


int main()
{
    vector<Process> processesPtr{
        {1, 3, 10, 10, 0, 0, 0, 0},
        {2, 0, 1, 1, 0, 0, 0, 0},
        {3, 1, 2, 2, 0, 0, 0, 0},
        {4, 4, 7, 7, 0, 0, 0, 0},
        {5, 5, 5, 5, 0, 0, 0, 0}
    };
    SJF(processesPtr);
}
