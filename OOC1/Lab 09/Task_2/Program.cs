// See https://aka.ms/new-console-template for more information
namespace Task_2
{
    public class program
    {
        public static void Main(String[] args)
        {
            Staff staff = new Staff();
            Teacher teacher = new Teacher();
            Console.WriteLine(staff.whoAmI(teacher));
        }
    }
}
