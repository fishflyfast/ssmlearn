package name.zkm.dao;

import name.zkm.model.ZkmlifeRecords;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ZkmlifeRecordDao {

    @Select("select * from zkmlife_myrecord_records limit 20")
    public List<ZkmlifeRecords> findAll();

}
