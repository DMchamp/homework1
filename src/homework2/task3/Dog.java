package homework2.task3;

public class Dog {
    int age;
    String nickname;
    int  weight;

    public Dog(int ageDog, String nicknameDog, int weightDog){
        this.age = ageDog;
        this.nickname = nicknameDog;
        this.weight = weightDog;
    }

    public void setAge(int ageDog){
        this.age = ageDog;
    }

    public void  setWeight(int weightDog){
        this.weight = weightDog;
        System.out.println(nickname + " ты потолстел, пирожок");
    }

    public void setNickname(String nicknameDog){
        this.nickname = nicknameDog;
    }

    public String getNickname(){
        return "Милый " + this.nickname;

    }
}
