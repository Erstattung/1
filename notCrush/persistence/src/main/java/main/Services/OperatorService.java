package main.Services;

import main.PO.ClientPO;
import main.PO.ContractPO;
import main.PO.OptionPO;
import main.PO.TarifPO;

import java.util.Date;
import java.util.List;

/**
 * Created by echerkas on 26.11.2015.
 */
public interface OperatorService {

    void addClient(String name, String surname, Date birthday, String address, String passport, String email,
                   String password);

    ContractPO generateUniqueNumber();

    List<ClientPO> getClients();

    List<ContractPO> getContracts();

    ClientPO find(String number);

    List<OptionPO> getOptions();

    ContractPO getContract(Long contractId);

    TarifPO getTarif(Long tariffId);

    List<TarifPO> getTarifs();
    //void lockNumber(String number);
//
//
//    void unlockNumber(String number);
}
