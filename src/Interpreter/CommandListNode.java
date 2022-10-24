package Interpreter;

import java.util.ArrayList;

public class CommandListNode extends Node {
    private ArrayList<Node> list = new ArrayList<>();

    @Override
    public void parse(Context context) throws ParseException {
        while (true) {
            if (context.currentToken() == null) {
                throw new ParseException("Missing 'end'");
            } else if ("end".equals(context.currentToken())) {
                context.skipToken("end");
                break;
            } else {
                CommandNode commandNode = new CommandNode();
                commandNode.parse(context);
                list.add(commandNode);
            }
        }
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
