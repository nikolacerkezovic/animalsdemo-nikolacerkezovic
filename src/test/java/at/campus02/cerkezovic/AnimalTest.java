package at.campus02.cerkezovic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    Animal eins;
    Animal zwei;
    Animal drei;

    @BeforeEach
    void setUp() {
        eins = new Animal();
        eins.setName("Leo");
        eins.setAge(3);
        eins.setSpecies("lion");

        zwei = new Animal();
        zwei.setName("Felix");
        zwei.setAge(5);
        zwei.setSpecies("cat");

        drei = new Animal();
        drei.setName("doggo");
        drei.setAge(1);
        drei.setSpecies("dog");
    }

    @Test
    void giveAnimalLoud() {
        Assertions.assertEquals("roarr", eins.giveAnimalLoud());
        Assertions.assertEquals("miau", zwei.giveAnimalLoud());
        Assertions.assertEquals("wuff", drei.giveAnimalLoud());
    }

    @Test
    void getNameAndAge() {
        Assertions.assertEquals("name: Leo age: 3", eins.getNameAndAge());
        Assertions.assertEquals("name: Felix age: 5", zwei.getNameAndAge());
        Assertions.assertEquals("name: doggo age: 1", drei.getNameAndAge());

    }

    @Test
    void ageCategory() {
        Assertions.assertEquals("young animal", eins.ageCategory());
        Assertions.assertEquals("old animal", zwei.ageCategory());
        Assertions.assertEquals("baby animal", drei.ageCategory());
    }
}