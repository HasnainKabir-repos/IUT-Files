package Annotations;

@BuilderHistory(builderName = "Rahim Builders", phoneNumber = 0174765)
public class House23 {
    int price = 10000000;
    int numberOfFloors = 10;

    @FloorDimension(sqFt = 1500,numberOfRooms = 6)
    public int getFourthFloor(){
        return 4;
    }

    @FloorDimension(sqFt = 1436,numberOfRooms = 6)
    public int getFiveFloor(){
        return 5;
    }
}
