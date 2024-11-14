import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class DnDCharacter {

    private final int strength;
    private final int dexterity;
    private final int constitution;
    private final int intelligence;
    private final int wisdom;
    private final int charisma;
    private final int hitpoints;

    public DnDCharacter() {
        this.strength = ability(rollDice());
        this.dexterity = ability(rollDice());
        this.constitution = ability(rollDice());
        this.intelligence = ability(rollDice());
        this.wisdom = ability(rollDice());
        this.charisma = ability(rollDice());
        this.hitpoints = 10 + modifier(constitution);
    }

    int ability(List<Integer> scores) {
        List<Integer> sortedScores = new ArrayList<>(scores);
        sortedScores.sort(Collections.reverseOrder());
        return sortedScores.get(0) + sortedScores.get(1) + sortedScores.get(2);
    }

    List<Integer> rollDice() {
        List<Integer> rolls = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            rolls.add(random.nextInt(6) + 1); // Generar un número de 1 a 6
        }
        return rolls;
    }

    int modifier(int input) {
        return Math.floorDiv(input - 10, 2);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return hitpoints;
    }
}
