package Notebook.model.repositoriy;

import java.util.List;

public interface Operation {
    List<String> readAll();
    void saveAll(List<String> data);
}
