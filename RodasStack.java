/*
 * This class creates an integer stack.
 *
 * @author  Rodas Nega
 * @version 1.0
 * @since   2022-10-23
*/

import java.util.ArrayList;
/**
*  Make class MrCoxallStack.
*/

public class RodasStack {
    /**
     * The number of revolutions of the peddles per minute.
    */
    private ArrayList<Integer> stackAsList = new ArrayList<Integer>();

    /**
     * The push() function.
     *
     * @param pushedNumber an element is implemented in an array
    */
    public void pushClass(final int pushedNumber) {
        stackAsList.add(pushedNumber);
    }

    /**
     * The pop() function.
     *
     * @return extract the last element
    */
    public int popClass() {
        return stackAsList.remove(stackAsList.size() - 1);
    }

    /**
     * The peek() function.
     *
    */
    public void peekClass() {
        stackAsList.clear();
    }

    /**
     * The clear() function.
    */
    public void clearClass() {
        stackAsList.clear();
    }

    /**
     * The stackArray() function.
    */
    public void stackArray() {
        System.out.println(stackAsList);
    }
}

