package com.woniu.entity;

import java.util.ArrayList;
import java.util.List;

public class HousestatusExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table housestatus
     *
     * @mbg.generated Thu Aug 15 14:42:51 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table housestatus
     *
     * @mbg.generated Thu Aug 15 14:42:51 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table housestatus
     *
     * @mbg.generated Thu Aug 15 14:42:51 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table housestatus
     *
     * @mbg.generated Thu Aug 15 14:42:51 CST 2019
     */
    public HousestatusExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table housestatus
     *
     * @mbg.generated Thu Aug 15 14:42:51 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table housestatus
     *
     * @mbg.generated Thu Aug 15 14:42:51 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table housestatus
     *
     * @mbg.generated Thu Aug 15 14:42:51 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table housestatus
     *
     * @mbg.generated Thu Aug 15 14:42:51 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table housestatus
     *
     * @mbg.generated Thu Aug 15 14:42:51 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table housestatus
     *
     * @mbg.generated Thu Aug 15 14:42:51 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table housestatus
     *
     * @mbg.generated Thu Aug 15 14:42:51 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table housestatus
     *
     * @mbg.generated Thu Aug 15 14:42:51 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table housestatus
     *
     * @mbg.generated Thu Aug 15 14:42:51 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table housestatus
     *
     * @mbg.generated Thu Aug 15 14:42:51 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table housestatus
     *
     * @mbg.generated Thu Aug 15 14:42:51 CST 2019
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andHousestatusidIsNull() {
            addCriterion("housestatusid is null");
            return (Criteria) this;
        }

        public Criteria andHousestatusidIsNotNull() {
            addCriterion("housestatusid is not null");
            return (Criteria) this;
        }

        public Criteria andHousestatusidEqualTo(Integer value) {
            addCriterion("housestatusid =", value, "housestatusid");
            return (Criteria) this;
        }

        public Criteria andHousestatusidNotEqualTo(Integer value) {
            addCriterion("housestatusid <>", value, "housestatusid");
            return (Criteria) this;
        }

        public Criteria andHousestatusidGreaterThan(Integer value) {
            addCriterion("housestatusid >", value, "housestatusid");
            return (Criteria) this;
        }

        public Criteria andHousestatusidGreaterThanOrEqualTo(Integer value) {
            addCriterion("housestatusid >=", value, "housestatusid");
            return (Criteria) this;
        }

        public Criteria andHousestatusidLessThan(Integer value) {
            addCriterion("housestatusid <", value, "housestatusid");
            return (Criteria) this;
        }

        public Criteria andHousestatusidLessThanOrEqualTo(Integer value) {
            addCriterion("housestatusid <=", value, "housestatusid");
            return (Criteria) this;
        }

        public Criteria andHousestatusidIn(List<Integer> values) {
            addCriterion("housestatusid in", values, "housestatusid");
            return (Criteria) this;
        }

        public Criteria andHousestatusidNotIn(List<Integer> values) {
            addCriterion("housestatusid not in", values, "housestatusid");
            return (Criteria) this;
        }

        public Criteria andHousestatusidBetween(Integer value1, Integer value2) {
            addCriterion("housestatusid between", value1, value2, "housestatusid");
            return (Criteria) this;
        }

        public Criteria andHousestatusidNotBetween(Integer value1, Integer value2) {
            addCriterion("housestatusid not between", value1, value2, "housestatusid");
            return (Criteria) this;
        }

        public Criteria andHousestatusIsNull() {
            addCriterion("housestatus is null");
            return (Criteria) this;
        }

        public Criteria andHousestatusIsNotNull() {
            addCriterion("housestatus is not null");
            return (Criteria) this;
        }

        public Criteria andHousestatusEqualTo(String value) {
            addCriterion("housestatus =", value, "housestatus");
            return (Criteria) this;
        }

        public Criteria andHousestatusNotEqualTo(String value) {
            addCriterion("housestatus <>", value, "housestatus");
            return (Criteria) this;
        }

        public Criteria andHousestatusGreaterThan(String value) {
            addCriterion("housestatus >", value, "housestatus");
            return (Criteria) this;
        }

        public Criteria andHousestatusGreaterThanOrEqualTo(String value) {
            addCriterion("housestatus >=", value, "housestatus");
            return (Criteria) this;
        }

        public Criteria andHousestatusLessThan(String value) {
            addCriterion("housestatus <", value, "housestatus");
            return (Criteria) this;
        }

        public Criteria andHousestatusLessThanOrEqualTo(String value) {
            addCriterion("housestatus <=", value, "housestatus");
            return (Criteria) this;
        }

        public Criteria andHousestatusLike(String value) {
            addCriterion("housestatus like", value, "housestatus");
            return (Criteria) this;
        }

        public Criteria andHousestatusNotLike(String value) {
            addCriterion("housestatus not like", value, "housestatus");
            return (Criteria) this;
        }

        public Criteria andHousestatusIn(List<String> values) {
            addCriterion("housestatus in", values, "housestatus");
            return (Criteria) this;
        }

        public Criteria andHousestatusNotIn(List<String> values) {
            addCriterion("housestatus not in", values, "housestatus");
            return (Criteria) this;
        }

        public Criteria andHousestatusBetween(String value1, String value2) {
            addCriterion("housestatus between", value1, value2, "housestatus");
            return (Criteria) this;
        }

        public Criteria andHousestatusNotBetween(String value1, String value2) {
            addCriterion("housestatus not between", value1, value2, "housestatus");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table housestatus
     *
     * @mbg.generated do_not_delete_during_merge Thu Aug 15 14:42:51 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table housestatus
     *
     * @mbg.generated Thu Aug 15 14:42:51 CST 2019
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}