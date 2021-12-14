public class Random {

    public static int nextInt(int r){
        int x;
        if (r < 0)
            System.exit(10);
            do {
                x = (int) (Math.random() * r);
            }
            while (x == r);
            return x;

    }

    public static double nextDouble(){
        return Math.random();
        }

    public static boolean nextBoolean(){
        int x = nextInt(2);
        if (x == 0)
            return true;
        else
            return false;

    }
}
