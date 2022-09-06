public class Bottles {
    public String song(){
        String songStr = "";
        for(int i=99;i>=1;i--){
            songStr +=verse(i);
        }

        return songStr;
    }
    public String verse(int bottles){
        String s;
        switch (bottles){
            case 1:
            s = "1 bottle of beer on the wall, 1 bottle of beer.\n" +
                    "Take one down and pass it around, no more bottles of beer on the wall.\n" +
                    "No more bottles of beer on the wall, no more bottles of beer.\n" +
                    "Go to the store and buy some more, 99 bottles of beer on the wall.\n";
            break;

            case 2:
            s = "2 bottles of beer on the wall, 2 bottles of beer.\n" +
                    "Take one down and pass it around, 1 bottle of beer on the wall.\n";
            break;

            default:
            s = bottles + " bottles of beer on the wall, "+ bottles +" bottles of beer.\n" +
                    "Take one down and pass it around, "+(bottles-1)+" bottles of beer on the wall.\n";
            break;
        }

        return s;
    }
}
