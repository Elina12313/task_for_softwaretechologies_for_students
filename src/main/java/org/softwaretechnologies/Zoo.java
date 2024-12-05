package org.softwaretechnologies;

import org.softwaretechnologies.animals.Animal;
import org.softwaretechnologies.animals.AnimalType;

import java.util.*;

public class Zoo {
    private final List<Animal> animalList = new ArrayList<>();
    public void addAnimal(Animal animal) {

        animalList.add(animal);
    }

    /**
     * Метод должен возвращять список звуков животных.
     * Звуки животных должны быть отсортированы по имени житного. Пример
     * Животные:
     *
     * Корова: Яша
     * Кошка: Дуся
     * Собака: Жучка
     * Корова: Абракадабра
     * Собака: Шарик
     * Кошка: Мурзик
     * Собака: Бобик
     *
     * Вовращаемый список звуков: moo, woof, meow, woof, meow, woof, moo
     *
     * @return Звуки животных, в алфавитном порядке имени животного.
     */
    public List<String> soundAllAnimalsSortByName() {
        List<String> sounds = new ArrayList<>();
        // TODO заполните корректно список звуков
        Comparator <Animal> animalComparator = new Comparator<Animal>() { //Сортировка животных по имени
            @Override
            public int compare(Animal animal, Animal animal1) {
                return animal.getName().compareTo(animal1.getName());
            }

        };
        animalList.sort(animalComparator); // Сортируем животных и добавляем звуки
        for (Animal a:animalList){
            sounds.add(a.sound());
        }

        return sounds;
    }


}
