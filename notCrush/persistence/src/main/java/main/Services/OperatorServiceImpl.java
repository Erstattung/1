package main.Services;

import main.DAO.Implementation.ClientDAOImpl;
import main.DAO.Implementation.ContractDAOImpl;
import main.DAO.Implementation.OptionDAOImpl;
import main.DAO.Implementation.TarifDAOImpl;
import main.PO.ClientPO;
import main.PO.ContractPO;
import main.PO.OptionPO;
import main.PO.TarifPO;
import org.apache.log4j.Logger;

import java.util.*;

/**
 * Created by echerkas on 29.11.2015.
 */
public class OperatorServiceImpl implements OperatorService {

        private static final Logger LOGGER = Logger.getLogger(OperatorServiceImpl.class);

        private ClientDAOImpl clientDAO = new ClientDAOImpl();
        private ContractDAOImpl contractDAO = new ContractDAOImpl();
        private TarifDAOImpl tarifDAO = new TarifDAOImpl();
        private OptionDAOImpl optionDAO = new OptionDAOImpl();

        @Override
        public void addClient(String name, String surname, Date birthday, String address, String passport, String email,
                              String password) {
            LOGGER.debug("Creating new client");
            ClientPO client = new ClientPO();
            client.setName(name);
            client.setSurname(surname);
            client.setBirthday(birthday);
            client.setAddress(address);
            client.setPassport(passport);
            client.setMail(email);
            client.setPassword(password);
            clientDAO.create(client);
        }

        @Override
        public ContractPO generateUniqueNumber() {
            LOGGER.debug("Generating unique number");
            Random random = new Random(47);
            ContractPO byNumber;
            while (true) {
                int code = random.nextInt(9) + 900;
                int num = 1000000 + random.nextInt(9000000);
                String telNum = code + "" + num;
                byNumber = contractDAO.findByNumber(telNum);
                if (byNumber.getNumber() == null){
                    byNumber.setNumber(telNum);
                    contractDAO.update(byNumber);
                    break;
                }
            }
            return byNumber;
        }

        @Override
        public List<ClientPO> getClients() {
            return clientDAO.getAll();
        }

        @Override
        public List<ContractPO> getContracts() {
            return contractDAO.getAll();
        }

        @Override
        public ClientPO find(String number) {
            LOGGER.debug("Searching client");
            return clientDAO.findByNumber(number);
        }

        @Override
        public List<OptionPO> getOptions() {
            LOGGER.debug("Getting options");
            return optionDAO.getAll();
        }

        @Override
        public ContractPO getContract(Long contractId) {
            return contractDAO.getById(contractId);
        }

        @Override
        public TarifPO getTarif(Long tariffId) {
            return tarifDAO.getById(tariffId);
        }

        @Override
        public List<TarifPO> getTarifs() {
            return tarifDAO.getAll();
        }
    }
