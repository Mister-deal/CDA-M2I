package org.example.repository;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.Session;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public abstract class Repository<T> {
    protected Session session;

    public Session getSession() {
        return session;
    }

    public Repository() {

    }

    public void setSession(Session session) {
        this.session = session;
    }

    public void create(T element){
        session.persist(element);
    }

    abstract T findById(Long id);
    abstract List<T> findAll();

    public void update(T element){
        session.persist(element);
    }

    public void delete(T element){
        session.remove(element);
    }
}
