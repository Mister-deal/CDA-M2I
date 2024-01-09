package exercice2.interfaces;

import java.util.List;

public interface Repository<P> {

    boolean create(P o);
    boolean update(P o);
    boolean delete(P o);
    P findById(int id);
    List<P> findAll();
}
