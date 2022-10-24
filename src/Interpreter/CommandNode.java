package Interpreter;

public class CommandNode extends Node {
    private Node node;

    @Override
    public void parse(Context context) throws ParseException {
        if ("repeat".equals(context.currentToken())) {
            node = new RepeatCommandNode();
        } else {
            node = new PrimitiveCommandNode();
        }
        node.parse(context);
    }

    @Override
    public String toString() {
        return node.toString();
    }
}
