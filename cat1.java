import java.util.Date;
import java.util.Random;

public class cat1 {
    private String name;
    private int age;
    private boolean isVacctinated;
    private char male;
    private String breed;
    private Date birthDate;

    public cat1(){

    }

    public cat1 (String name, int age, boolean isVacctinated, char male, String breed, Date birthDate){
        this.name = name;
        this.age = age;
        this.isVacctinated = isVacctinated;
        this.male = male;
        this.breed = breed;
        this.birthDate = birthDate;
    }

    public boolean isVacctinated(){
        return isVacctinated;
    }

    public void setVacctinated(boolean vacctinated){
        isVacctinated = vacctinated;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public char getMale(){
        return male;
    }

    public void setMale(char male){
        this.male = male;
    }

    public String getBreed(){
        return breed;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public Date getBirthDate(){
        return birthDate;
    }

    public void setBirthDate(Date birthDate){
        this.birthDate = birthDate;
    }

    public void meow (){
        Random random = new Random();
        if(male == 'ж')
            System.out.println(name + " мяукнула " + random.nextInt(0,10) + " раз ");
        else
            System.out.println(name + " мяукнул " + random.nextInt(0,10) + " раз ");
    }

    public void meow (int count) {
        Random random = new Random();
        if(male == 'ж')
            System.out.println(name + " мяукнула " + count + " раз ");
        else
            System.out.println(name + " мяукнул " + count + " раз ");
    }

    public int humanAge(){
        return age * 4;
    }

    public void vacctinate(){
        if (isVacctinated){
            System.out.println(name + "уже вакцинирован/а");
        }
        else {
            isVacctinated = true;
            System.out.println("Мы вакцинировали" + name);
        }
    }

    @Override
    public String toString(){
        return "Cat{" +
        "name='" + name + '\'' +
        ", age =" + age + 
        ", isVacctinated=" + isVacctinated + 
        ", male =" + male + 
        ", breed ='" + breed + '\'' +
        ", birthDate =" + birthDate + 
        '}';
    }
}