package Notebook.controller.util.mapper;

import Notebook.model.User;

public interface Mapper {
    String toInput(User e);
    User toOutput(String str);
}
