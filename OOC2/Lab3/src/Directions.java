import java.util.Scanner;

public enum Directions {
    North{
        public String getDirection(){
            return "South";
        }
    },
    South{
        public String getDirection(){
            return "North";
        }
    },
    East{
        public String getDirection(){
            return "West";
        }
    },
    West{
        public String getDirection(){
            return "East";
        }
    };

    private static String position;

    public static String getPosition(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your directions");
        position = sc.nextLine();
        return position;
    }

    public abstract String getDirection();
    public static Directions CheckDirection(){
        for(Directions d: Directions.values()){
            if(d.name().equals(position)){
                System.out.println("I have to Go " + d.getDirection());
                return d;
            }
        }
        return null;
    }
}
