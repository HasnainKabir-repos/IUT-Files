using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Task_3
{
    internal class N28_Building
    {
        List<Lab> labs = new List<Lab>();
        List<LecturerRoom> rooms = new List<LecturerRoom>();

        public void showAllLabs()
        {
            for(int i = 0; i < labs.Count; i++)
            {
                Console.WriteLine(labs[i].getLabName());
            }
        }

        public void showAllLecturerRoom()
        {
            for (int i = 0; i < rooms.Count; i++)
            {
                Console.WriteLine(rooms[i].getRoomName());
            }
        }

        public void addRoom(LecturerRoom lecturerRoom)
        {
            rooms.Add(lecturerRoom);
        }

        public void addLab(Lab lab)
        {
            labs.Add(lab);
        }
    }
}
