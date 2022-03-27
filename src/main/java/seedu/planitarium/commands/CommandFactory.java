package seedu.planitarium.commands;

import seedu.planitarium.exceptions.PlanITariumException;
import seedu.planitarium.exceptions.UnknownInputException;
import seedu.planitarium.parser.Parser;
import seedu.planitarium.person.Family;
import seedu.planitarium.ProjectLogger;

import java.util.logging.Level;

/**
 * Generates different command classes for execution according to user instruction.
 */
public class CommandFactory {
    private static final String className = CommandFactory.class.getSimpleName();
    private static final String fileName = className + ".log";
    private static final ProjectLogger logger = new ProjectLogger(className, fileName);

    protected static final String ADD_PERSON_CMD = "add";
    protected static final String DELETE_PERSON_CMD = "delete";
    protected static final String ADD_INCOME_CMD = "addin";
    protected static final String DELETE_INCOME_CMD = "deletein";
    protected static final String ADD_SPENT_CMD = "addout";
    protected static final String DELETE_SPEND_CMD = "deleteout";
    protected static final String CALC_REMAIN = "remain";
    protected static final String LIST = "list";
    protected static final String EXIT = "bye";

    protected static final String LOG_EXECUTE_CMD = "'%s' command is returned";

    public CommandFactory() {
    }

    public Command getCommand(String userInput, Family family) throws PlanITariumException {
        try {
            Command newCommand;
            switch (Parser.parseKeyword(userInput)) {
            case ADD_PERSON_CMD:
                newCommand = new AddPersonCommand(userInput, family);
                break;
            case DELETE_PERSON_CMD:
                newCommand = new DeletePersonCommand(userInput, family);
                break;
            case ADD_INCOME_CMD:
            case ADD_SPENT_CMD:
                newCommand = new AddRecordCommand(userInput, family);
                break;
            case DELETE_INCOME_CMD:
            case DELETE_SPEND_CMD:
                newCommand = new DeleteRecordCommand(userInput, family);
                break;
            case CALC_REMAIN:
                newCommand = new RemainCommand(userInput, family);
                break;
            case LIST:
                newCommand = new ListCommand(userInput, family);
                break;
            case EXIT:
                newCommand = new ExitCommand(userInput, family);
                break;
            default:
                throw new UnknownInputException(CommandFactory.class.getSimpleName());
            }
            logger.log(Level.INFO, String.format(LOG_EXECUTE_CMD, newCommand.getType()));
            return newCommand;
        } catch (PlanITariumException e) {
            throw e;
        }
    }

}
