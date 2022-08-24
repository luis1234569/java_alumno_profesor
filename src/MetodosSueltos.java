public class MetodosSueltos {

    public static int getRandomNumber(int min, int max){
        int num = (int)Math.floor(Math.random()*(min-(max+1))+(max+1));
        return num;
    }


}
