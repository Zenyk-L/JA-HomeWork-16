package ua.lviv.lgs.shared;

import java.util.List;

public interface AbstractCRUD<T> {
    T create(T t);

    T read(int id);

    T update(T t);

    void delete(int id);

      List<T> readAll();


}
