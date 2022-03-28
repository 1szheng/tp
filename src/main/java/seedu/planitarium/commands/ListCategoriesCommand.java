package seedu.planitarium.commands;

import seedu.planitarium.ProjectLogger;
import seedu.planitarium.category.Category;
import seedu.planitarium.person.Family;


import java.util.logging.Level;

public class ListCategoriesCommand extends Command {
    private static final String className = CommandFactory.class.getSimpleName();
    private static final String fileName = className + ".log";
    private static final ProjectLogger logger = new ProjectLogger(className, fileName);

    protected static final String LOG_LISTCAT_INFO = "List categories command is going to be executed";
    protected static final String LOG_EXECUTE_INFO = "List categories command is executed";

    public ListCategoriesCommand(String userInput, Family family) {
        super(userInput, family);
        logger.log(Level.INFO, LOG_LISTCAT_INFO);
    }

    @Override
    public void execute() {
        Category.listCategories();
        logger.log(Level.INFO, LOG_EXECUTE_INFO);
    }
}
