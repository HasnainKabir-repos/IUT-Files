using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Task_1
{
    public class Car
    {
        
        public int maximum_acceleration;
        public int fuel_capacity;

        public Car_Seat car_seat;
        public Wheel wheel;
        public Engine engine;
        public Door door;

        public Car()
        {
            car_seat = new Car_Seat();
            wheel = new Wheel();
            engine = new Engine();
            door = new Door();
            
        }

        public void display()
        {
            car_seat.display_seat();
            wheel.display_wheel();
            engine.display_engine();
            door.display_door();
        }
        
    }
}
