package com.woniu.entity;

public class Role {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.rid
     *
     * @mbg.generated Thu Aug 15 14:42:51 CST 2019
     */
    private Integer rid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.rname
     *
     * @mbg.generated Thu Aug 15 14:42:51 CST 2019
     */
    private String rname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.rid
     *
     * @return the value of role.rid
     *
     * @mbg.generated Thu Aug 15 14:42:51 CST 2019
     */
    public Integer getRid() {
        return rid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.rid
     *
     * @param rid the value for role.rid
     *
     * @mbg.generated Thu Aug 15 14:42:51 CST 2019
     */
    public void setRid(Integer rid) {
        this.rid = rid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.rname
     *
     * @return the value of role.rname
     *
     * @mbg.generated Thu Aug 15 14:42:51 CST 2019
     */
    public String getRname() {
        return rname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.rname
     *
     * @param rname the value for role.rname
     *
     * @mbg.generated Thu Aug 15 14:42:51 CST 2019
     */
    public void setRname(String rname) {
        this.rname = rname;
    }
}