struct Process {
    int id;
    int burst;
    int priority;
    int arrivalTime;
    int waitingTime;
    int responseTime;
    int finishTime;
};

void calculateAverages(struct Process processes[], int n);

void roundRobin(struct Process processes[], int n, int quantum);

int main() {
    int n = 5;

    int quantum = 4;

    struct Process processes[] = {
        {1, 10, 3, 3, 0, 0, 0},
        {2, 1, 1, 0, 0, 0, 0},
        {3, 2, 3, 1, 0, 0, 0},
        {4, 7, 4, 4, 0, 0, 0},
        {5, 5, 2, 5, 0, 0, 0}
    };

    printf("RoundRobin \n");
    roundRobin(processes, n, quantum);

    return 0;
}

void calculateAverages(struct Process processes[], int n) {
    for (int i = 0; i < n; i++) {
        printf("P%d:\n", processes[i].id);
        printf("Start Time - %d\n", processes[i].responseTime);
        printf("Finish Time - %d\n", processes[i].finishTime);
        printf("Response Time - %d\n", processes[i].responseTime);
        printf("Waiting Time - %d\n", processes[i].waitingTime);
    }

    float totalWaitingTime = 0;
    float totalResponseTime = 0;

    for (int i = 0; i < n; i++) {
        totalWaitingTime += processes[i].waitingTime;
        totalResponseTime += processes[i].responseTime;
    }

    float averageWaitingTime = totalWaitingTime / n;
    float averageResponseTime = totalResponseTime / n;

    printf("Average Response Time - %.2f\n", averageResponseTime);
    printf("Average Waiting Time - %.2f\n", averageWaitingTime);
}

void roundRobin(struct Process processes[], int n, int quantum) {
    int remainingTime[n];
    int currentTime = 0;

    for (int i = 0; i < n; i++) {
        remainingTime[i] = processes[i].burst;
    }

    while (1) {
        int done = 1;

        for (int i = 0; i < n; i++) {
            if (remainingTime[i] > 0) {
                done = 0;

                int executionTime = (remainingTime[i] > quantum) ? quantum : remainingTime[i];

                if (processes[i].responseTime == 0) {
                    processes[i].responseTime = currentTime;
                }

                currentTime += executionTime;
                remainingTime[i] -= executionTime;

                if (remainingTime[i] == 0) {
                    processes[i].finishTime = currentTime;
                    processes[i].waitingTime = currentTime - processes[i].arrivalTime - processes[i].burst;
                }
            }
        }

        if (done == 1) {
            break;
        }
    }

    calculateAverages(processes, n);
}
