package main.DAO.Implementation;

import main.DAO.GenericDAOImpl;
import main.PO.TarifPO;

/**
 * Created by echerkas on 24.11.2015.
 */
public class TarifDAOImpl extends GenericDAOImpl<TarifPO> {

    public TarifPO findByName (String name){
        return entityManager.createQuery("SELECT c from TarifPO c WHERE " +
                "c.name = :name", TarifPO.class)
                .setParameter("name", name).getSingleResult();
    }
}
