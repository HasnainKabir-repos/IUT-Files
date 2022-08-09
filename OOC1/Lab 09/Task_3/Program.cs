// See https://aka.ms/new-console-template for more information
namespace Task_3
{
    public class Program
    {
        public static void Main(String[] args)
        {
            LecturerRoom lecturerRoom = new LecturerRoom();
            lecturerRoom.setRoomName("SWE") ;
            lecturerRoom.setRoomNo(106);
            
            Lab lab = new Lab();
            lab.setLabName("Mobile Lab");
            lab.setCapacity(57);

            N28_Building n28 = new N28_Building();
            n28.addRoom(lecturerRoom);
            n28.addLab(lab);

            n28.showAllLabs();
            n28.showAllLecturerRoom();
        }
    }
}
