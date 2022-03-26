package dam.utils;

public class Aleatorio {
    public static int getRandom(int min, int max){
        return (int) (Math.random() * (max - min) + min);
    }
}
