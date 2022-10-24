package Interpreter;

public class PrimitiveCommandNode extends Node {
    private String name;

    @Override
    public void parse(Context context) throws ParseException {
        name = context.currentToken();
        context.skipToken(name);

        switch (name) {
            case "go":
            case "right":
            case "left":
                break;
            default:
                throw new ParseException(name + "is undefined.");
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
