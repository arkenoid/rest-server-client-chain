package id.go.djp.cm.bridge.sidjp.mapper;

import org.apache.ibatis.session.RowBounds;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Josescalia
 * Date: 10/31/13
 * Time: 3:01 PM
 * To change this template use File | Settings | File Templates.
 */
public interface CommonMapper<T,PK> {
    public Integer countByExample(T t);
    public List<T> selectByExample(T t);
    public T selectByPrimaryKey(PK pk);
    List<T> selectByExampleWithRowbounds(T example, RowBounds rowBounds);
}
