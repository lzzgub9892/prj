package com.woniu.mapper;

import com.woniu.entity.Building;
import com.woniu.entity.BuildingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BuildingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table building
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    long countByExample(BuildingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table building
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    int deleteByExample(BuildingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table building
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    int deleteByPrimaryKey(Integer buildingid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table building
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    int insert(Building record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table building
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    int insertSelective(Building record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table building
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    List<Building> selectByExample(BuildingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table building
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    Building selectByPrimaryKey(Integer buildingid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table building
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    int updateByExampleSelective(@Param("record") Building record, @Param("example") BuildingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table building
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    int updateByExample(@Param("record") Building record, @Param("example") BuildingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table building
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    int updateByPrimaryKeySelective(Building record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table building
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    int updateByPrimaryKey(Building record);
}