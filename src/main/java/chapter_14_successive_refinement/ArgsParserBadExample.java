package chapter_14_successive_refinement;

public class ArgsParserBadExample {
    private String[] args;

    public ArgsParserBadExample(String[] args) {
        this.args = args;
    }

    public boolean getBoolean(String arg) {
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-" + arg)) {
                return true;
            }
        }
        return false;
    }
}

