import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes listı
        ArrayList<Hero> heroes = new ArrayList<>();

        // TODO 2 : Add those heroes to the list
        // name: Black Widow, age: 34
        // name: Captain America, age: 100
        // name: Vision, age: 3
        // name: Iron Man, age: 48
        // name: Scarlet Witch, age: 29
        // name: Thor, age: 1500
        // name: Hulk, age: 49
        // name: Doctor Strange, age: 42

        Hero blackWidow = new Hero("Blac Widow", 34);
        Hero captainAmerica = new Hero("Captain America", 100);
        Hero vision = new Hero("Vision", 3);
        Hero ironMan = new Hero("Iron Man", 48);
        Hero scarletWitch = new Hero("Scarlet Witch", 29);
        Hero thor = new Hero("Thor", 1500);
        Hero hulk = new Hero("Hulk", 49);
        Hero doctorStrange = new Hero("Doctor Strange", 42);

        heroes.add(blackWidow);
        heroes.add(captainAmerica);
        heroes.add(vision);
        heroes.add(ironMan);
        heroes.add(scarletWitch);
        heroes.add(thor);
        heroes.add(hulk);
        heroes.add(doctorStrange);

        System.out.println();
        System.out.println("Voici la liste complète des héros : ");
        for (Hero hero : heroes) {
            System.out.println("- " + hero.getName() + " : " + hero.getAge() + " ans");
        }

        // TODO 3 : It's Thor birthday, now he's 1501

        Hero thor1501 = new Hero("Thor", 1501);
        heroes.set(5, thor1501);
        Hero thorUpdated = heroes.get(5);

        System.out.println();
        System.out.println("Voici Thor avec son age mis à jour : ");
        System.out.println("- " + thorUpdated.getName() + " : " + thorUpdated.getAge() + " ans");

        // TODO 4 : Shuffle the heroes list
        Collections.shuffle(heroes);

        System.out.println();
        System.out.println("Voici la liste des héros mélangée : ");
        for (Hero hero : heroes) {
            System.out.println("- " + hero.getName() + " : " + hero.getAge() + " ans");
        }

        // TODO 5 : Keep only the half of the list
        List<Hero> subListHeroes = heroes.subList(0, 4);

        // TODO 6 : Loop throught the list and display the name of the remaining heroes

        System.out.println("Voici la liste des héros mélangée et réduite : ");
        for (Hero hero : subListHeroes) {
            System.out.println("- " + hero.getName() + " : " + hero.getAge() + " ans");
        }

    }
}
