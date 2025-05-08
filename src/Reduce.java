public class Reduce {
    public static void main(String[] args) {
        int num = 100;
        int steps = 0;
        while(num != 0){
            if(num % 2 == 0){
                num = num/2;
            }
            else{
                num-=1;
            }
            steps++;
        }
        System.out.println(steps);
        //50,25,24,12,6,3,2,1,0
    }
}
