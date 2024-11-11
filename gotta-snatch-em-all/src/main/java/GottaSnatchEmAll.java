import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        boolean myHasUniqueCards = myCollection.stream().anyMatch(card -> !theirCollection.contains(card));
        boolean theirHasUniqueCards = theirCollection.stream().anyMatch(card -> !myCollection.contains(card));

        return myHasUniqueCards && theirHasUniqueCards;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> commons = new HashSet<>(collections.get(0));

        for(Set<String> collection : collections){
            commons.retainAll(collection);
        }

        return commons;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> allCards = new HashSet<>();

        for(Set<String> collection : collections){
            allCards.addAll(collection);
        }
        return allCards;
    }
}
