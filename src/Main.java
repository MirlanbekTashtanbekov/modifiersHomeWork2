//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Country деген класс тузунуз .
//        Анын поляларын бериниз.
//        Аты, калкы, аянты, тили ушундай полялары болсун.
//        Маанилерин конструктор аркылуу бериниз. 3 объект тузунуз .Ошондой эле 1 static метод кошунуз.
//        Mетод параметирине Country - нин массивин алып бизге аянты боюнча эн чон олкону таап берсин.

        Country country1 = new Country("New Zealand",5223L,268000.5,"English");
        System.out.println(country1.toString());
        Country country2 = new Country("Canada",40000L,9985000,"English");
        System.out.println(country2.toString());
        Country country3 = new Country("Swiss",8850L,41285.5,"French");
        System.out.println(country3.toString());
        System.out.println(" ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Country[] countries= {country1,country2,country3};

        Country largestCountry = Country.findLargestCountry(countries);
        System.out.println("The largest country by area:  " + largestCountry.getName());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");



    }


}