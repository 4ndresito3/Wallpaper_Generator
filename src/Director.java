public class Director {
    public static int getRandom(int min, int max){
        int rango = max - min;
        return (int) (Math.random() * rango) + min;
    }
    public static int getRandomScreenPoint(int max){
        return getRandom(0, max);
    }
}
