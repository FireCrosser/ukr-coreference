package ua.edu.ukma.ukrcoref.hobbs.utils.semantics;

public interface SemanticConstraint<T, S> {

    T getFirstArgument();

    S getSecondArgument();
    
    boolean check();
}
