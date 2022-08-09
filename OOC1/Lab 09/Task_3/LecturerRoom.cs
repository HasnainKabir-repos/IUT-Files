using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Task_3
{
    internal class LecturerRoom
    {
        public string roomName;
        public int roomNo;
        public int capacity;

        public string getRoomName()
        {
            return roomName;
        }
        public int getRoomNo()
        {
            return roomNo;
        }
        public int getCapacity()
        {
            return capacity;
        }

        public void setRoomName(string roomName)
        {
            this.roomName = roomName;
        }

        public void setRoomNo(int roomNo)
        {
            this.roomNo = roomNo;
        }

        public void setCapacity(int capacity)
        {
            this.capacity = capacity;
        }

        

    }
}
