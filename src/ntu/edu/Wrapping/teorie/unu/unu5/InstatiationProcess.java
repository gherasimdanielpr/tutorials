package ntu.edu.Wrapping.teorie.unu.unu5;

/**
 * Created by daniel.gherasim on 10/30/2015.
 */
public class InstatiationProcess {
    private int number1 =11;
    {
        number1 = 99;
        number2 = 88;
    }
    private int number2 =22;

    public InstatiationProcess() {
    }

    public InstatiationProcess(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public static void main(String[] args) {
        InstatiationProcess instatiationProcess = new InstatiationProcess();
        System.out.println("number1 :"+instatiationProcess.number1);
        System.out.println("number2 :"+instatiationProcess.number2);

        InstatiationProcess instatiationProcess1 = new InstatiationProcess(55,66);
        System.out.println("number1 :"+instatiationProcess1.number1);
        System.out.println("number1 :"+instatiationProcess1.number2);
    }
}
