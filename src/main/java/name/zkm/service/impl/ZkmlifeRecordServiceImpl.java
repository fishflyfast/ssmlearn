package name.zkm.service.impl;

import name.zkm.dao.ZkmlifeRecordDao;
import name.zkm.model.ZkmlifeRecords;
import name.zkm.service.ZkmlifeRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("zkmlifeRecordService")
public class ZkmlifeRecordServiceImpl implements ZkmlifeRecordService {

    @Autowired
    private ZkmlifeRecordDao zkmlifeRecordDao;

    @Override
    public List<ZkmlifeRecords> findAll() {
        System.out.println("find all...");
        return zkmlifeRecordDao.findAll();
    }

    @Override
    public void save(ZkmlifeRecords zkmlifeRecords) {
        System.out.println("save records....");
    }
}
