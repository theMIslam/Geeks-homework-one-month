public class homework2 {
    public static void main(String[] args) {
        home(22,38);
        home(12,53);
        home(15,43);
        home(10,99);
        home(5,73);
        home(generateRandomAge(),23);
        home(generateRandomAge(),10);
    }

    public static String home (int age , int temperature){

        String home1 = "Можно идти гулять";
        String home2 = ("Оставайтесь дома");

        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 35){
            return home1;
        }else if (age < 20 && temperature >= 0 && temperature <= 28 ){
            return home1;
        }else if (age > 45 && temperature >= -10 && temperature <= 25){
            return home1;
        }else
            return home2;



    }
    public static int generateRandomAge(){
        int ageRandom=0+(int)(Math.random()*100);
        return ageRandom;
    }
}