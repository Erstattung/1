package main.DAO.Implementation;

import main.DAO.GenericDAOImpl;
import main.PO.ContractPO;

/**
 * Created by echerkas on 24.11.2015.
 */
public class ContractDAOImpl extends GenericDAOImpl<ContractPO> {

    public ContractPO findByNumber(String number) {
        return entityManager.createQuery("SELECT c from ContractPO c WHERE " +
                "c.number = :number", ContractPO.class)
                .setParameter("number", number).getSingleResult();
    }

    public ContractPO findByTarif(String tarif) {
        return entityManager.createQuery("SELECT c from ContractPO c WHERE " +
                "c.tarif = :id_tarif", ContractPO.class)
                .setParameter("id_tarif", tarif).getSingleResult();
    }
}
