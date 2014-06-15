package id.go.djp.cm.bridge.sidjp.mapper;

import id.go.djp.cm.bridge.sidjp.model.MasterJenisPemeriksaan;
import id.go.djp.cm.bridge.sidjp.model.MasterJenisPemeriksaanExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MasterJenisPemeriksaanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MASTER_JENIS_PEMERIKSAAN
     *
     * @mbggenerated Tue Nov 19 14:30:37 ICT 2013
     */
    int countByExample(MasterJenisPemeriksaanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MASTER_JENIS_PEMERIKSAAN
     *
     * @mbggenerated Tue Nov 19 14:30:37 ICT 2013
     */
    int deleteByExample(MasterJenisPemeriksaanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MASTER_JENIS_PEMERIKSAAN
     *
     * @mbggenerated Tue Nov 19 14:30:37 ICT 2013
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MASTER_JENIS_PEMERIKSAAN
     *
     * @mbggenerated Tue Nov 19 14:30:37 ICT 2013
     */
    int insert(MasterJenisPemeriksaan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MASTER_JENIS_PEMERIKSAAN
     *
     * @mbggenerated Tue Nov 19 14:30:37 ICT 2013
     */
    int insertSelective(MasterJenisPemeriksaan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MASTER_JENIS_PEMERIKSAAN
     *
     * @mbggenerated Tue Nov 19 14:30:37 ICT 2013
     */
    List<MasterJenisPemeriksaan> selectByExampleWithRowbounds(MasterJenisPemeriksaanExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MASTER_JENIS_PEMERIKSAAN
     *
     * @mbggenerated Tue Nov 19 14:30:37 ICT 2013
     */
    List<MasterJenisPemeriksaan> selectByExample(MasterJenisPemeriksaanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MASTER_JENIS_PEMERIKSAAN
     *
     * @mbggenerated Tue Nov 19 14:30:37 ICT 2013
     */
    MasterJenisPemeriksaan selectByPrimaryKey(BigDecimal id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MASTER_JENIS_PEMERIKSAAN
     *
     * @mbggenerated Tue Nov 19 14:30:37 ICT 2013
     */
    int updateByExampleSelective(@Param("record") MasterJenisPemeriksaan record, @Param("example") MasterJenisPemeriksaanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MASTER_JENIS_PEMERIKSAAN
     *
     * @mbggenerated Tue Nov 19 14:30:37 ICT 2013
     */
    int updateByExample(@Param("record") MasterJenisPemeriksaan record, @Param("example") MasterJenisPemeriksaanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MASTER_JENIS_PEMERIKSAAN
     *
     * @mbggenerated Tue Nov 19 14:30:37 ICT 2013
     */
    int updateByPrimaryKeySelective(MasterJenisPemeriksaan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MASTER_JENIS_PEMERIKSAAN
     *
     * @mbggenerated Tue Nov 19 14:30:37 ICT 2013
     */
    int updateByPrimaryKey(MasterJenisPemeriksaan record);
}