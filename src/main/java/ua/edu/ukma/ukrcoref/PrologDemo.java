package ua.edu.ukma.ukrcoref;

import java.util.Arrays;
import org.jpl7.Atom;
import org.jpl7.Compound;
import org.jpl7.Query;
import org.jpl7.Term;

public class PrologDemo {

    public static void main(String[] args) {
        Term goal = new Compound("teacher_of", new Term[]{new Atom("aristotle"),new Atom("alexander")});
Query q = new Query(goal);
System.out.println(Arrays.toString(q.allSolutions()));
    }
}
