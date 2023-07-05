package Stacks;
import java.util.Stack;
class Main {
    public static void main(String[] args) {
        /*Stack - LIFO data structure. Last-In First-Out.
        *         Stores objects into a sort of "vertical tower".
        *         push() to add to the top.
        *         pop() to remove from the top.*/

        Stack<String> games = new Stack<String>();

        //This will return true, since stack is empty at this point.
        //System.out.println(games.empty());
        games.push("Minecraft");
        games.push("Skyrim");
        games.push("Doom");
        games.push("Borderlands");
        games.push("Final Fantasy VII");

        //This will return false, since stack isn't empty anymore.
        //System.out.println(games.empty());

        //This will print all of the object in a stack.
        //System.out.println(games);

        //This will remove the top element(last added) from a stack, in this case: Final Fantasy VII.
        //String myFavoriteGame = games.pop();
        //Popping when there is no element in stack to pop anymore will return EmptyStackException exception.
        //System.out.println(myFavoriteGame);
        //System.out.println(games);
        //Peek() gives us the last element of the stack without removing it, as in Pop() case.
        //System.out.println(games.peek());
        System.out.println(games.search("Minecraft"));

        //You can run out of space when working with stacks, as seen in the example below.
        /*for(int i = 0; i < 1000000000; i++) {
            games.push("Fallout 76");
        }*/

        /*Uses of Stacks?:
        * 1. Undo/Redo features in text editors.
        * 2. Moving back/forward through browser history.
        * 3. Backtracking algorithms (maze, file directories)
        * 4. Calling functions (call stack)*/

    }
}
