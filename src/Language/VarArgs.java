package Language;
// Run this through cmd/terminal
// 1. javac VarArgs.java
// If compiled successfully,
// 2. java VarArgs arg1 arg2 arg3 ....
// You can put any number of arguments and check this out
public class VarArgs {
    public static void main (String... args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
