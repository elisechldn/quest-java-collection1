import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
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
        heroes.add(new Hero("Black Widow", 34));
        heroes.add(new Hero("Captain America", 100));
        heroes.add(new Hero("Vision", 3));
        heroes.add(new Hero("Iron Man", 48));
        heroes.add(new Hero("Scarlet Witch", 29));
        heroes.add(new Hero("Thor", 1500));
        heroes.add(new Hero ("Hulk", 49));
        heroes.add(new Hero("Doctor Strange", 42));

        // TODO 3 : It's Thor birthday, now he's 1501
        
        for (int i = 0; i < heroes.size(); i++) {
            Hero thor = heroes.get(i);
            if (thor.getName().equals("Thor")) {
                thor.setAge(thor.getAge() + 1);
            }
        }
        // TODO 4 : Shuffle the heroes list
        Collections.shuffle(heroes);
        
        // TODO 5 : Keep only the half of the list
        int midList = heroes.size() / 2;
        List<Hero> remainingHeroes = heroes.subList(0, midList);

        // TODO 6 : Loop throught the list and display the name of the remaining heroes
        for (Hero hero : remainingHeroes) {
            System.out.println(hero.getName());
        }
    }
}
