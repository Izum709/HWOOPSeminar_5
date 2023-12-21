package Notebook;

import Notebook.controller.UserController;
import Notebook.model.repositoriy.GBRepository;
import Notebook.model.repositoriy.impl.FileOperation;
import Notebook.model.repositoriy.impl.UserRepository;
import Notebook.view.UserView;

import static Notebook.controller.util.DBConnector.DB_PATH;
import static Notebook.controller.util.DBConnector.createDB;

public class Main {
    public static void main(String[] args) {
        createDB();
        FileOperation fileOperation = new FileOperation(DB_PATH);
        GBRepository repository = new UserRepository(fileOperation);
        UserController controller = new UserController(repository);
        UserView view = new UserView(controller);
        view.run();
    }
}
