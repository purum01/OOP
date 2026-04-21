package bookcode.ch08.code8_4;

public class Button {
    private Command theCommand;

    public Button(Command theCommand) {
        setCommand(theCommand);
    }

    public void setCommand(Command newCommand) {
        this.theCommand = newCommand;
    }

    public void pressed() {
        theCommand.execute();
    }
}