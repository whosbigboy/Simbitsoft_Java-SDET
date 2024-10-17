package src;
import java.util.Random;
import java.util.Scanner;

public class Powerlifter extends GymBro implements IGetMoreAthletic, IGetSportTitle{
    Random random = new Random();
    public Powerlifter(String name, int age, float weight) {
        super(name, age, weight);
    }

    @Override
    void Train(int time) {

        timeOfTrains+=time;
        weight+=time/20d;
        InfoMessageRun(time);
        GetMoreAthletic();

    }

    @Override
    public void GetMoreAthletic() {
        if (timeOfTrains>=5 && skill_of_run == "freshman") {
            skill_of_run = "amateur";
            InfoMessageRun();
            if (timeOfTrains>=20){
                skill_of_run = "advanced";
                InfoMessageRun();
                if (timeOfTrains>=50){
                    skill_of_run = "pro";
                    InfoMessageRun();
                    if (timeOfTrains>=100){
                        skill_of_run = "king of gym";
                        InfoMessageRun();
                    }
                }
            }
        }

        if (timeOfTrains>=20 && skill_of_run == "amateur"){
            skill_of_run = "advanced";
            InfoMessageRun();
            if (timeOfTrains>=50){
                skill_of_run = "pro";
                InfoMessageRun();
                if (timeOfTrains>=100){
                    skill_of_run = "legend";
                    InfoMessageRun();
                }
            }
        }

        if (timeOfTrains>=50 && skill_of_run == "advanced"){
            skill_of_run = "pro";
            InfoMessageRun();
            if (timeOfTrains>=100){
                skill_of_run = "king of gym";
                InfoMessageRun();
            }
        }

        if (timeOfTrains>=100 && skill_of_run == "pro"){
            skill_of_run = "king of gym";
            InfoMessageRun();
        }
    }

    @Override
    public void GetSportTitle() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("****** COMPETION ******\n%s решается участвовать в соревнованиях.\nЕго текущий уровень мастерства: %s\n" +
                "В какой группе будете принимать участие:Easy или Hard?\n ",name,skill_of_run);
        String group = sc.next();
        int win = random.nextInt(1,11);

        switch (group){

            case "Easy":
                switch (skill_of_powerlifting){
                    case "freshman":
                        if (win>8) {
                            numOfTrophies+=1;
                            System.out.printf("Неожиданно новичок выйграл, мои поздравления!\n+1 трофей в вашей копилке\n" +
                                    "Всего трофеев: %d\n\n", numOfTrophies);
                        }
                        else System.out.printf("Поражение...\nНичего страшного, тренировки тебе помогут набраться опыта и навыка\n" +
                                "Всего трофеев: %d\n\n", numOfTrophies);
                        break;

                    case "amateur":
                        if (win>7) {
                            numOfTrophies+=1;
                            System.out.printf("В упорной борьбе первое место забирает %s, мои поздравления!\n+1 трофей в вашей копилке\n" +
                                    "Всего трофеев: %d\n\n", name, numOfTrophies);
                        }
                        else System.out.printf("Поражение...\nНичего страшного, тренировки тебе помогут набраться опыта и навыка\n"+
                                "Всего трофеев: %d\n\n", numOfTrophies);
                        break;

                    case "advanced":
                        if (win>5) {
                            numOfTrophies+=1;
                            System.out.printf("Довольно уверенно выйграл %s, мои поздравления!\n+1 трофей в вашей копилке\n" +
                                    "Всего трофеев: %d\n\n",name,numOfTrophies);
                        }
                        else System.out.printf("Поражение...\nНичего страшного, тренировки тебе помогут набраться опыта и навыка\n" +
                                "Всего трофеев: %d\n\n", numOfTrophies);
                        break;

                    case "pro":
                        if (win>3){
                            numOfTrophies+=1;
                            System.out.printf("Спокойно эти соревнования выигрывает %s, мои поздравления!\n+1 трофей в вашей копилке\n" +
                                    "Всего трофеев: %d\n\n",name,numOfTrophies);
                        }
                        else System.out.printf("Поражение...\nНичего страшного, тренировки тебе помогут набраться опыта и навыка\n" +
                                "Всего трофеев: %d\n", numOfTrophies);
                        break;

                    case "king of gym":
                        if (win>1) {
                            numOfTrophies+=1;
                            System.out.printf("Это была обычная разминка для %s, мои поздравления!\n+1 трофей в вашей копилке\n" +
                                    "Всего трофеев: %d\n\n",name,numOfTrophies);
                        }
                        else System.out.printf("Поражение...\nНеожиданно %s упускает победу\n" +
                                "Всего трофеев: %d\n\n", name, numOfTrophies);
                        break;
                }
                timeOfTrains+=5;
                weight+=0.25;
                break;

            case "Hard":
                switch (skill_of_powerlifting){
                    case "freshman":
                        if (win>9) {
                            numOfTrophies+=1;
                            System.out.printf("Неожиданно новичок выйграл, мои поздравления!\n+1 трофей в вашей копилке\n" +
                                    "Всего трофеев: %d\n\n", numOfTrophies);
                        }
                        else System.out.printf("Поражение...\nНичего страшного, тренировки тебе помогут набраться опыта и навыка\n" +
                                "Всего трофеев: %d\n\n", numOfTrophies);
                        break;

                    case "amateur":
                        if (win>8) {
                            numOfTrophies+=1;
                            System.out.printf("В упорной борьбе первое место забирает %s, мои поздравления!\n+1 трофей в вашей копилке\n" +
                                    "Всего трофеев: %d\n\n", name, numOfTrophies);
                        }
                        else System.out.printf("Поражение...\nНичего страшного, тренировки тебе помогут набраться опыта и навыка\n"+
                                "Всего трофеев: %d\n\n", numOfTrophies);
                        break;

                    case "advanced":
                        if (win>7) {
                            numOfTrophies+=1;
                            System.out.printf("Довольно уверенно выйграл %s, мои поздравления!\n+1 трофей в вашей копилке\n" +
                                    "Всего трофеев: %d\n\n",name,numOfTrophies);
                        }
                        else System.out.printf("Поражение...\nНичего страшного, тренировки тебе помогут набраться опыта и навыка\n" +
                                "Всего трофеев: %d\n\n", numOfTrophies);
                        break;

                    case "pro":
                        if (win>5){
                            numOfTrophies+=1;
                            System.out.printf("Спокойно эти соревнования выигрывает %s, мои поздравления!\n+1 трофей в вашей копилке\n" +
                                    "Всего трофеев: %d\n\n",name,numOfTrophies);
                        }
                        else System.out.printf("Поражение...\nНичего страшного, тренировки тебе помогут набраться опыта и навыка\n" +
                                "Всего трофеев: %d\n", numOfTrophies);
                        break;

                    case "king of gym":
                        if (win>3) {
                            numOfTrophies+=1;
                            System.out.printf("Это была обычная разминка для %s, мои поздравления!\n+1 трофей в вашей копилке\n" +
                                    "Всего трофеев: %d\n\n",name,numOfTrophies);
                        }
                        else System.out.printf("Поражение...\nНеожиданно %s упускает победу\n" +
                                "Всего трофеев: %d\n\n", name, numOfTrophies);
                        break;
                }
                timeOfTrains+=5;
                weight+=0.25;
                break;

            default:
                System.out.println("Неправильно веденные данные, попробуйте еще\n");
                GetSportTitle();
        }
    }

    @Override
    public void Info(){
        System.out.printf("~~~~~~ INFO ~~~~~~\nКАЧОК\nИмя: %s\nВозраст: %d\nВес: %f\nУровень мастерства: %s\nКол-во трофеев: %d" +
                "\n Кол-во тренировок: %d\n\n",name,(age+timeOfTrains/100),weight,skill_of_run,numOfTrophies,timeOfTrains);
    }

    private void InfoMessageRun(int time){
        System.out.printf("------ TRAIN ------\n%s занимался качем %d занятий за последнее время.\n" +
                "Его уровень силы: %s\nВес на данный момент: %f\nВсего занятий: %d\n\n", name, time, skill_of_powerlifting,weight,timeOfTrains );
    }

    private void InfoMessageRun(){
        System.out.printf("!!!!!! UPDATE !!!!!!\n%s отзанимался достаточно, чтобы повысить уровень мастерства." +
                "\nТеперь его уровень силы: %s\n\n",name,skill_of_powerlifting);
    }
}
