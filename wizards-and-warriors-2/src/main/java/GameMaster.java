public class GameMaster {

    public String describe(Character character){
        return "You're a level " + character.getLevel() + " " + character.getCharacterClass() + " with " +character.getHitPoints() + " hit points.";
    }

    public String describe(Destination destination){
        return "You've arrived at " + destination.getName() + ", which has " + destination.getInhabitants() + " inhabitants.";
    }

    public String describe(TravelMethod travelMethod){
        String msg;
        if(travelMethod == TravelMethod.HORSEBACK){
            msg = "You're traveling to your destination on horseback.";
        }else {
            msg = "You're traveling to your destination by walking.";
        }
        return msg;
    }

    public String describe(Character character, Destination destination, TravelMethod travelMethod){
        return describe(character) +" " + describe(travelMethod)+ " " + describe(destination);
    }

    public String describe(Character character, Destination destination){
        return describe(character) + " You're traveling to your destination by walking. " + describe(destination);
    }
}
