package com.woniu.entity;

public class Company {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.cid
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    private Integer cid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.cname
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    private String cname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.cid
     *
     * @return the value of company.cid
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.cid
     *
     * @param cid the value for company.cid
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.cname
     *
     * @return the value of company.cname
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    public String getCname() {
        return cname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.cname
     *
     * @param cname the value for company.cname
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    public void setCname(String cname) {
        this.cname = cname;
    }
}