package Problems;

public class TenMinWalk {

    public static boolean isValid(char[] walk) {
        int x = 0;
        int y = 0;
        if (walk.length != 10){
            return false;
        }
        else {
            for(char direction : walk){
                y += direction == 'n' ? 1 : 0;
                y += direction == 's' ? -1 : 0;
                x += direction == 'e' ? 1 : 0;
                x += direction == 'w' ? -1 :0;
            }
        }
        return (y==0 && x==0);
    }
}