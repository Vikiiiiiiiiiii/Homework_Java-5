import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main1 {
    public static void main(String[] args) throws ParseException{
        String pattern = "dd-MM-yyyy";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        cat1 cat_1 = new cat1("Барсик", 6, true, 'М', "Русская дворовая", simpleDateFormat.parse("12-01-2018"));
        cat_1.meow(); 
        cat_1.meow(5);
        System.out.println(cat_1.humanAge() + " человеческих лет млекопитающему по имени " + cat_1.getName());
        System.out.println(cat_1);
    }
}
