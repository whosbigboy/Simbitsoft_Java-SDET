package src;

public class Main {
    public static void main(String[] args){
        Runner runner1 = new Runner("Dima",19,70);
        runner1.Train(1);
        runner1.GetSportTitle();
        runner1.Train(4);
        runner1.GetSportTitle();
        runner1.Train(5);
        runner1.GetSportTitle();
        runner1.Train(25);
        runner1.GetSportTitle();
        runner1.Train(45);
        runner1.GetSportTitle();
        runner1.Info();

        Runner runner2 = new Runner("Anton", 24,85);
        runner2.Train(50);
        runner2.Train(50);

        Powerlifter pw = new Powerlifter("Leha", 20, 65);
        pw.Train(1);
        pw.GetSportTitle();
        pw.Train(4);
        pw.GetSportTitle();
        pw.Train(5);
        pw.GetSportTitle();
        pw.Train(25);
        pw.GetSportTitle();
        pw.Train(45);
        pw.GetSportTitle();
        pw.Info();

        Powerlifter pw1 = new Powerlifter("Sanya", 30,90);
        pw1.Train(50);
        pw1.Train(50);

    }
}
