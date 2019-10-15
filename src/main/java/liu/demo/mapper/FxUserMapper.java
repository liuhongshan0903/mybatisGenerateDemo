package liu.demo.mapper;

import java.util.List;
import liu.demo.model.FxUser;
import liu.demo.model.FxUserExample;
import org.apache.ibatis.annotations.Param;

public interface FxUserMapper {
    long countByExample(FxUserExample example);

    int deleteByExample(FxUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(FxUser record);

    int insertSelective(FxUser record);

    List<FxUser> selectByExample(FxUserExample example);

    FxUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FxUser record, @Param("example") FxUserExample example);

    int updateByExample(@Param("record") FxUser record, @Param("example") FxUserExample example);

    int updateByPrimaryKeySelective(FxUser record);

    int updateByPrimaryKey(FxUser record);
}