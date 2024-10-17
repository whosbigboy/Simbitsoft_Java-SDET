package src;

public abstract class GymBro {

    protected String name;
    protected int age;
    protected double weight;
    protected int timeOfTrains;//общее суммарное время тренировок
    protected String skill_of_run;//уровень способностей бегуна
    protected String skill_of_powerlifting;//уровень способности силовой тяги
    protected int numOfTrophies;

    public GymBro(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
        timeOfTrains = 0;
        numOfTrophies = 0;
        skill_of_run = "freshman";
        skill_of_powerlifting = "freshman";
    }

    abstract void Info();
    abstract void Train(int time);
}
