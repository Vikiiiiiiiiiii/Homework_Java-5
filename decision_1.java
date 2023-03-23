/* 1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, 
что 1 человек может иметь несколько телефонов.
Добавить функции: 1) Добавление номера
                  2) Вывод всего
Пример:
Я ввожу: 1
К: Введите фамилию
Я: Иванов
К: Введите номер
Я: 1242353
К: Введите 1) Добавление номера
2) Вывод всего
Я ввожу: 1
К: Введите фамилию
Я: Иванов
К: Введите номер
Я: 547568
К: Введите 1) Добавление номера
2) Вывод всего
Я: 2
Иванов: 1242353, 547568 
*/

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class decision_1 {
                                                                                
    public static void main (String [] args){   
        Map<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();                                                                                                               
        Scanner iScanner = new Scanner(System.in);                                                                                                           
        System.out.print("Что вы хотите сделать?"+
                                "\n 1.Добавить номер" +
                                "\n 2.Вывод всех данных" +
                                "\n Выберите опцию: ");          
            
        int choice = iScanner.nextInt();                                                                                       
        iScanner.nextLine();                                                                                                                                 
        switch(choice){                                                                                                                                
            case 1:                                                                                                                                                                                                                                   
                System.out.println("Введите телефон, который хотите добавить: ");                                                                                                
                String number = iScanner.nextLine();                                                                                                         
                saveContact(number);           
                System.out.println("Введите фамилию абонента: ");  
                String name = iScanner.nextLine();                                                                                                         
                saveContact(name);   
                add(map, name, number); 
                System.out.println(("Данные сохранены! \n"));                               
                break;         

            case 2:                                                                                                                                    
                System.out.println("Чьи данные необходимы?");                                                              
                addPerson();
                Scanner sc = new Scanner(System.in);
                System.out.print("Введите фамилию: ");
                String str = sc.nextLine();
                sc.close();
                findPerson(str); 
                break;      

            default:   
                System.out.print("Для того, чтобы добавить клиента в базу, наберите: 1 \n" +
                    "Для того, чтобы вывести, наберите: 2\n");                                                                                                                                
                break;  
                                                                                                                                          
        }   iScanner.close();  
    }     
    
    private static void add(Map<String, ArrayList<Integer>> map, String name, String number) {
    }

    private static void saveContact(String number) {
        
    } 

    public static Map<String, List<String>> phoneBook = new HashMap<>();

    public static void addPerson() {
        
        phoneBook.put("Ibragimova", List.of("+7(111)111-11-11", "+7(444)333-44-44"));
        phoneBook.put("Zhykova", List.of("+7(333)333-33-33", "+7(666)666-66-66"));
        phoneBook.put("Sinichkin",List.of("+7(111)999-11-11"));
        phoneBook.put("Ovsyannikova",List.of("+7(111)333-11-11"));
        phoneBook.put("Shukin",List.of("+7(444)444-44-47", "+7(111)555-11-11"));
    }

    public static void findPerson(String surname) {
        System.out.printf("%s: %s", surname, phoneBook.get(surname));
    }
}                                                                                                                                              