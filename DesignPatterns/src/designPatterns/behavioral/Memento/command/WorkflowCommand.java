package designPatterns.behavioral.Memento.command;

public interface WorkflowCommand {

    void execute();

    void undo();
}
