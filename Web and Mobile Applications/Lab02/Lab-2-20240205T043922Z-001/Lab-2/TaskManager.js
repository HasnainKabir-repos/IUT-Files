'use strict'
class TaskManager {
    constructor(tasksInfo, id, callback) {
      this.id = id;
      this.callback = callback;
      this.tasks = tasksInfo
    }
    
    render(date) {
      const taskManagerElement = document.getElementById(this.id);
      taskManagerElement.innerHTML = '';

      const endDate = new Date(date);
      endDate.setDate(endDate.getDate() + 6);

      const date_data = document.createElement('span');
      const h3 = document.createElement('h3');
      

      const data = document.createElement('span');
      data.innerHTML=` ${date.toDateString()} - ${endDate.toDateString()} `;

      const left_brac = document.createElement('span');
      left_brac.className = 'left_angular';
      left_brac.innerHTML = '<';
      
      left_brac.addEventListener('click', ()=> {
        const newDate = new Date(date)
        newDate.setDate(newDate.getDate() - 7);
        this.render(newDate);
      });

      const right_brac = document.createElement('span');
      right_brac.className = 'right_angular';
      right_brac.innerHTML = '>';

      right_brac.addEventListener('click', ()=> {
        const newDate = new Date(date)
        newDate.setDate(newDate.getDate() + 7);
        this.render(newDate);
      });

      h3.appendChild(left_brac);
      h3.appendChild(data);
      h3.appendChild(right_brac);

      date_data.appendChild(h3);

      taskManagerElement.appendChild(date_data);

      const filteredTasks = this.tasks.filter(task => task.dueDate >= date && task.dueDate <= endDate);
      filteredTasks.sort((a, b) => a.priority - b.priority);

      const daysOfWeek = ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat','Sun'];

      const startIndex = (date.getDay() + 6) % 7;

      const reorderedDaysOfWeek = [
        ...daysOfWeek.slice(startIndex),
        ...daysOfWeek.slice(0, startIndex)
      ];

      const table = document.createElement('table');
      console.log(filteredTasks);

      reorderedDaysOfWeek.forEach(day => {
          const row = document.createElement('tr');
          const table_data = document.createElement('td');
          table_data.innerHTML = `<h3>${day}</h3>`;
          row.appendChild(table_data);
          const tasksForDay = filteredTasks.filter(task => {
            const taskDayIndex = (task.dueDate.getDay() + 6) % 7; 
            const reorderedTaskDay = reorderedDaysOfWeek[taskDayIndex];
            return reorderedTaskDay === day;
          });

          tasksForDay.forEach(task => {
              const taskElement = document.createElement('td');
              taskElement.classList.add('task');
              taskElement.innerHTML = `
                  <span class="task-name">${task.name}</span>
              `;
              row.appendChild(taskElement);

              taskElement.addEventListener('click', ()=>{
                this.callback(task);
               });
          });

          table.appendChild(row);
          
      });
      taskManagerElement.appendChild(table);
  }

}