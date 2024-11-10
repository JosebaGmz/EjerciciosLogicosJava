class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter{

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        boolean condition = fighter.isVulnerable();

        return condition ? 10 : 6;
    }
}

class Wizard extends  Fighter{

    private boolean spell = false;

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    boolean prepareSpell(){
        return spell = true;
    }

    @Override
    boolean isVulnerable() {
        return !spell;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        return spell ? 12 : 3;
    }
}
