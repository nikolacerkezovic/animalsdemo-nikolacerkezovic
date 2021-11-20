package at.campus02.cerkezovic;

public class Animal {
    private String name;
    private int age;
    private String species;
    private String animalLoud;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getAnimalLoud() {
        return animalLoud;
    }

    public void setAnimalLoud(String animalLoud) {
        this.animalLoud = animalLoud;
    }

    public String giveAnimalLoud() {
        if (species.equals("lion")) return "roarr";
        else if (species.equals("dog")) return "wuff";
        else if (species.equals("cat")) return "miau";
        else return null;
    }




}
