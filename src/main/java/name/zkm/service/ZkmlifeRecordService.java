package name.zkm.service;

import name.zkm.model.ZkmlifeRecords;
import java.util.List;

public interface ZkmlifeRecordService {

    public List<ZkmlifeRecords> findAll();

    public void save(ZkmlifeRecords zkmlifeRecords);
}
