package main.Services;

import main.DAO.Implementation.ClientDAOImpl;
import main.DAO.Implementation.ContractDAOImpl;
import main.DAO.Implementation.OptionDAOImpl;
import main.DAO.Implementation.TarifDAOImpl;
import main.Exceptions.WrongIdException;
import main.PO.ClientPO;
import main.PO.ContractPO;
import main.PO.OptionPO;
import main.PO.TarifPO;

import javax.persistence.NoResultException;
import java.util.List;
import java.util.Set;

/**
 * Created by echerkas on 29.11.2015.
 */
public class ClientServiceImpl implements ClientService {
    private ClientDAOImpl clientDAO = new ClientDAOImpl();
    private TarifDAOImpl tarifDAO = new TarifDAOImpl();
    private ContractDAOImpl contractDAO = new ContractDAOImpl();
    private OptionDAOImpl optionDAO = new OptionDAOImpl();

    public ClientPO getClient(String email, String password) {
        ClientPO byEmailPass;
        try {
            byEmailPass = clientDAO.findByEmailPass(email, password);
        } catch (NoResultException ex) {
            byEmailPass = null;
        }

        return byEmailPass;
    }

    @Override
    public List<ContractPO> getContracts(long clientId) throws WrongIdException {

        ClientPO client = clientDAO.getById(clientId);
        if (client == null) {
            throw new WrongIdException("Client with id = " + clientId + " doesn't exist.");
        }
        return client.getContracts();
    }

    @Override
    public List<TarifPO> getTarifs() {
        return tarifDAO.getAll();
    }

    @Override
    public TarifPO getTarif(long tariffId) {
        return tarifDAO.getById(tariffId);
    }

    @Override
    public ContractPO getContract(long contractId) {
        return contractDAO.getById(contractId);
    }

    @Override
    public OptionPO getOption(long optionId) {
        return optionDAO.getById(optionId);
    }

    @Override
    public Set<OptionPO> getTarifOptions(long tariffId) throws WrongIdException {

        TarifPO tariff = tarifDAO.getById(tariffId);
        if (tariff == null) throw new WrongIdException("Tarif with id = " + tariffId + " doesn't exist.");
        return tariff.getOptions();
    }

    @Override
    public void changeTarif(long contractId, long tariffId) throws WrongIdException {
        ContractPO contract = contractDAO.getById(contractId);
        if (contract == null) throw new WrongIdException("Contract with id = " + contractId + " doesn't exist.");
        TarifPO tariff = tarifDAO.getById(tariffId);
        if (tariff == null) throw new WrongIdException("Tarif with id = " + tariffId + " doesn't exist.");

        contract.setTarif(tariff);
        contractDAO.update(contract);
    }
}