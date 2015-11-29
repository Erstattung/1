package main.Services;

import main.Exceptions.WrongIdException;
import main.PO.ClientPO;
import main.PO.ContractPO;
import main.PO.OptionPO;
import main.PO.TarifPO;

import java.util.List;
import java.util.Set;

/**
 * Created by echerkas on 29.11.2015.
 */
public interface ClientService {

    public ClientPO getClient(String email, String password);


    public List<ContractPO> getContracts(long clientId) throws WrongIdException;

    public List<TarifPO> getTarifs();

    public TarifPO getTarif(long tariffId);

    public ContractPO getContract(long contractId);

    public OptionPO getOption(long optionId);


    public Set<OptionPO> getTarifOptions(long tariffId) throws WrongIdException;


    public void changeTarif(long contractId, long tariffId) throws WrongIdException;
}
