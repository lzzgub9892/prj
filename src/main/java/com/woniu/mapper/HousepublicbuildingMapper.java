package com.woniu.mapper;

import com.woniu.entity.HousepublicbuildingExample;
import com.woniu.entity.HousepublicbuildingKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HousepublicbuildingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table housepublicbuilding
     *
     * @mbg.generated Thu Aug 15 14:42:51 CST 2019
     */
    long countByExample(HousepublicbuildingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table housepublicbuilding
     *
     * @mbg.generated Thu Aug 15 14:42:51 CST 2019
     */
    int deleteByExample(HousepublicbuildingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table housepublicbuilding
     *
     * @mbg.generated Thu Aug 15 14:42:51 CST 2019
     */
    int deleteByPrimaryKey(HousepublicbuildingKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table housepublicbuilding
     *
     * @mbg.generated Thu Aug 15 14:42:51 CST 2019
     */
    int insert(HousepublicbuildingKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table housepublicbuilding
     *
     * @mbg.generated Thu Aug 15 14:42:51 CST 2019
     */
    int insertSelective(HousepublicbuildingKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table housepublicbuilding
     *
     * @mbg.generated Thu Aug 15 14:42:51 CST 2019
     */
    List<HousepublicbuildingKey> selectByExample(HousepublicbuildingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table housepublicbuilding
     *
     * @mbg.generated Thu Aug 15 14:42:51 CST 2019
     */
    int updateByExampleSelective(@Param("record") HousepublicbuildingKey record, @Param("example") HousepublicbuildingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table housepublicbuilding
     *
     * @mbg.generated Thu Aug 15 14:42:51 CST 2019
     */
    int updateByExample(@Param("record") HousepublicbuildingKey record, @Param("example") HousepublicbuildingExample example);
}