import java.util.Scanner;

public class HelpFromSam {
    static void calcPoints(int score)
    {
        int points=1;
        int help=1;
        while(points<score)
        {
            points=points*2;
        }
        if(points!=score)
        {
            help=help+1;
        }
        System.out.println(help);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int score=scanner.nextInt();
        calcPoints(score);
    }
}
