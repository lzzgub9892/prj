package com.woniu.mapper;

import com.woniu.entity.UserinforoleExample;
import com.woniu.entity.UserinforoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserinforoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinforole
     *
     * @mbg.generated Thu Aug 15 14:42:51 CST 2019
     */
    long countByExample(UserinforoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinforole
     *
     * @mbg.generated Thu Aug 15 14:42:51 CST 2019
     */
    int deleteByExample(UserinforoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinforole
     *
     * @mbg.generated Thu Aug 15 14:42:51 CST 2019
     */
    int deleteByPrimaryKey(UserinforoleKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinforole
     *
     * @mbg.generated Thu Aug 15 14:42:51 CST 2019
     */
    int insert(UserinforoleKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinforole
     *
     * @mbg.generated Thu Aug 15 14:42:51 CST 2019
     */
    int insertSelective(UserinforoleKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinforole
     *
     * @mbg.generated Thu Aug 15 14:42:51 CST 2019
     */
    List<UserinforoleKey> selectByExample(UserinforoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinforole
     *
     * @mbg.generated Thu Aug 15 14:42:51 CST 2019
     */
    int updateByExampleSelective(@Param("record") UserinforoleKey record, @Param("example") UserinforoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinforole
     *
     * @mbg.generated Thu Aug 15 14:42:51 CST 2019
     */
    int updateByExample(@Param("record") UserinforoleKey record, @Param("example") UserinforoleExample example);
}