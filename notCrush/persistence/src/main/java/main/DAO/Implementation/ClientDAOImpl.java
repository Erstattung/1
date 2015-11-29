package main.DAO.Implementation;

import main.DAO.GenericDAOImpl;
import main.PO.ClientPO;


/**
 * Created by echerkas on 24.11.2015.
 */
public class ClientDAOImpl extends GenericDAOImpl<ClientPO> {

    public ClientPO findByName(String name) {
        return entityManager.createQuery("SELECT c from ClientPO c WHERE " +
                "c.name = :name", ClientPO.class)
                .setParameter("name", name).getSingleResult();
    }

    public ClientPO findBySurname(String surname) {
        return entityManager.createQuery("SELECT c from ClientPO c WHERE " +
                "c.surname = :surname", ClientPO.class)
                .setParameter("surname", surname).getSingleResult();
    }

    public ClientPO findByFullName(String name, String surname) {
        return entityManager.createQuery("SELECT c from ClientPO c WHERE " +
                "c.name = :name AND c.surname = :surname", ClientPO.class)
                .setParameter("name", name).setParameter("surname", surname).getSingleResult();
    }

    public ClientPO findByNumber(String number) {
        return entityManager.createQuery("SELECT c FROM ContractPO c " +
                " WHERE c.number = :number", ClientPO.class).
                setParameter("number", number).getSingleResult();
    }


    public ClientPO findByEmailPass(String email, String password) {
        return entityManager.createQuery("SELECT c FROM ClientPO c WHERE " +
                "c.mail = :email AND c.password = :password", ClientPO.class)
                .setParameter("email", email).setParameter("password", password)
                .getSingleResult();
    }
}


