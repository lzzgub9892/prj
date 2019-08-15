package com.woniu.mapper;

import com.woniu.entity.Landownership;
import com.woniu.entity.LandownershipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LandownershipMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table landownership
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    long countByExample(LandownershipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table landownership
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    int deleteByExample(LandownershipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table landownership
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    int deleteByPrimaryKey(Integer oid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table landownership
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    int insert(Landownership record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table landownership
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    int insertSelective(Landownership record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table landownership
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    List<Landownership> selectByExample(LandownershipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table landownership
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    Landownership selectByPrimaryKey(Integer oid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table landownership
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    int updateByExampleSelective(@Param("record") Landownership record, @Param("example") LandownershipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table landownership
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    int updateByExample(@Param("record") Landownership record, @Param("example") LandownershipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table landownership
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    int updateByPrimaryKeySelective(Landownership record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table landownership
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    int updateByPrimaryKey(Landownership record);
}