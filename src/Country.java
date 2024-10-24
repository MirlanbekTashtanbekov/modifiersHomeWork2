public class Country {
    private String name;
    private long population;
    private double area;
    private String language;

    public Country() {
    }

    public Country(String name, long population, double area, String language) {
        this.name = name;
        this.population = population;
        this.area = area;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public double getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public static Country findLargestCountry(Country[] countries) {

        Country largestCountry = countries[0];

        for (int i = 1; i < countries.length; i++) {
            if (countries[i].getArea() > largestCountry.getArea()) {
                largestCountry = countries[i];
            }
        }
        return largestCountry;
    }



    @Override
    public String toString() {
        return "\nCountry name: " + name +
                "\nPopulation: " + population +
                "\nArea: " + area +
                "\nLanguage: " + language ;
    }
}
