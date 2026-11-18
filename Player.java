public class Player{
    private String name;
    private int age;
    private int health=100;
    private int happiness=100;
    private int energy=100;
    private double money=2000;
    private int knowledge=0;

    Player(String name,int age){
        this.name=name;
        this.age=age;

    }

    public  String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public int getHealth(){
        return health;
    }
    public int getHappiness(){
        return happiness;
    }
    public double getMoney(){
        return money;
    }
    public int getKnowledge(){
        return knowledge;
    }
    public int getEnergy(){
        return energy;
    }


    public  void displayStatus(){
        System.out.println("=============== PLAYER PROFILE ===============");
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Health: "+getHealth());
        System.out.println("Energy: "+getEnergy());
        System.out.println("Happiness: "+getHappiness());
        System.out.println("Knowledge: "+getKnowledge());
        System.out.println("Money: "+getMoney());
    }


}
