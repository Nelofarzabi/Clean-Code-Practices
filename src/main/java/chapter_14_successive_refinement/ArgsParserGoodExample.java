package chapter_14_successive_refinement;

import java.util.HashMap;
import java.util.Map;

public class ArgsParserGoodExample {
    private Map<String, Argument> arguments = new HashMap<>();

    public ArgsParserGoodExample(String schema, String[] args) {
        parseSchema(schema);
        parseArguments(args);
    }

    private void parseSchema(String schema) {
        for (String element : schema.split(",")) {
            String trimmed = element.trim();
            if (trimmed.endsWith("*")) {
                arguments.put(trimmed.substring(0, trimmed.length() - 1), new StringArgument());
            } else if (trimmed.endsWith("#")) {
                arguments.put(trimmed.substring(0, trimmed.length() - 1), new IntegerArgument());
            } else {
                arguments.put(trimmed, new BooleanArgument());
            }
        }
    }

    private void parseArguments(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            if (arg.startsWith("-")) {
                String key = arg.substring(1);
                Argument argument = arguments.get(key);
                if (argument instanceof BooleanArgument) {
                    argument.setValue("true");
                } else if ((i + 1) < args.length) {
                    argument.setValue(args[++i]);
                }
            }
        }
    }

    public boolean getBoolean(String arg) {
        Argument argument = arguments.get(arg);
        return argument != null && Boolean.parseBoolean(argument.getValue());
    }

    public String getString(String arg) {
        Argument argument = arguments.get(arg);
        return argument != null ? argument.getValue() : "";
    }

    public int getInt(String arg) {
        Argument argument = arguments.get(arg);
        return argument != null ? Integer.parseInt(argument.getValue()) : 0;
    }

    private interface Argument {
        void setValue(String value);
        String getValue();
    }

    private class BooleanArgument implements Argument {
        private String value = "false";

        public void setValue(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    private class StringArgument implements Argument {
        private String value = "";

        public void setValue(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    private class IntegerArgument implements Argument {
        private String value = "0";

        public void setValue(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
}

