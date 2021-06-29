package Services;

import Entities.Criteria;
import RestModels.CriteriaSearchRequest;

import java.util.List;
import java.util.Optional;

public interface CriteriaServiceInterface {

    Optional<Criteria> getCriteria();

    void saveCriteria() throws Exception;

    List<Criteria> searchCriteria(CriteriaSearchRequest request);

    void removeCriteria(long id) throws Exception;

}
