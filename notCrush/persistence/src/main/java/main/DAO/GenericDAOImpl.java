package main.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by echerkas on 24.11.2015.
 */
public abstract class GenericDAOImpl<T> implements GenericDAOInterface<T> {

    protected Class<T> entityClass;
    protected final EntityManager entityManager;
//    protected EntityManager em;

    public GenericDAOImpl(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PersistenceUnit");
        this.entityManager = factory.createEntityManager();
        ParameterizedType genericSuperclass = (ParameterizedType) getClass()
                .getGenericSuperclass();
        this.entityClass = (Class<T>) genericSuperclass
                .getActualTypeArguments()[0];
    }

    @Override
    public T create(T t) {
        this.entityManager.persist(t);
        return t;
    }

    @Override
    public T update(T t) {
        return this.entityManager.merge(t);
//        this.entityManager.merge(t);
//        return t;
    }

    @Override
    public void remove(T t) {
        t = this.entityManager.merge(t);
        this.entityManager.remove(t);
    }

    @Override
    @SuppressWarnings("unchecked")
    public T getById(Long id) {
        return (T) entityManager.find(entityClass, id);
    }

    @Override
    public List<T> getAll() {
        TypedQuery<T> query = entityManager.createQuery("from " + entityClass.getName(), entityClass);
        return query.getResultList();
    }
}