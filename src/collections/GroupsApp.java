package collections;

import java.util.HashSet;
import java.util.Set;

public class GroupsApp {

    public static void main(String[] args) {

        Set<String> groupA = new HashSet<>();
        Set<String> groupB = new HashSet<>();

        // ➕ Add students
        groupA.add("Ali");
        groupA.add("Sara");
        groupA.add("Omar");
        System.out.println("groupA: " + groupA);

        groupB.add("Sara");
        groupB.add("Youssef");
        groupB.add("Omar");
        System.out.println("groupB: " + groupB);

        //  Intersection
        Set<String> intersection = new HashSet<>(groupA);
        intersection.retainAll(groupB);//Garde uniquement les éléments communs aux deux groupes

        System.out.println("Intersection: " + intersection);

        // Union
        Set<String> union = new HashSet<>(groupA);
        union.addAll(groupB);
        //Ajoute tous les éléments de groupB
        //Les doublons sont ignorés automatiquement par Set
        System.out.println("Union: " + union);
    }
}
