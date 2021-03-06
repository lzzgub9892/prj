package com.woniu.entity;

import java.util.ArrayList;
import java.util.List;

public class IndeptExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table indept
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table indept
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table indept
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table indept
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    public IndeptExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table indept
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table indept
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table indept
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table indept
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table indept
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table indept
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table indept
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table indept
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
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
     * This method corresponds to the database table indept
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table indept
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table indept
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
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

        public Criteria andIndeptidIsNull() {
            addCriterion("indeptid is null");
            return (Criteria) this;
        }

        public Criteria andIndeptidIsNotNull() {
            addCriterion("indeptid is not null");
            return (Criteria) this;
        }

        public Criteria andIndeptidEqualTo(Integer value) {
            addCriterion("indeptid =", value, "indeptid");
            return (Criteria) this;
        }

        public Criteria andIndeptidNotEqualTo(Integer value) {
            addCriterion("indeptid <>", value, "indeptid");
            return (Criteria) this;
        }

        public Criteria andIndeptidGreaterThan(Integer value) {
            addCriterion("indeptid >", value, "indeptid");
            return (Criteria) this;
        }

        public Criteria andIndeptidGreaterThanOrEqualTo(Integer value) {
            addCriterion("indeptid >=", value, "indeptid");
            return (Criteria) this;
        }

        public Criteria andIndeptidLessThan(Integer value) {
            addCriterion("indeptid <", value, "indeptid");
            return (Criteria) this;
        }

        public Criteria andIndeptidLessThanOrEqualTo(Integer value) {
            addCriterion("indeptid <=", value, "indeptid");
            return (Criteria) this;
        }

        public Criteria andIndeptidIn(List<Integer> values) {
            addCriterion("indeptid in", values, "indeptid");
            return (Criteria) this;
        }

        public Criteria andIndeptidNotIn(List<Integer> values) {
            addCriterion("indeptid not in", values, "indeptid");
            return (Criteria) this;
        }

        public Criteria andIndeptidBetween(Integer value1, Integer value2) {
            addCriterion("indeptid between", value1, value2, "indeptid");
            return (Criteria) this;
        }

        public Criteria andIndeptidNotBetween(Integer value1, Integer value2) {
            addCriterion("indeptid not between", value1, value2, "indeptid");
            return (Criteria) this;
        }

        public Criteria andIndeptnameIsNull() {
            addCriterion("indeptname is null");
            return (Criteria) this;
        }

        public Criteria andIndeptnameIsNotNull() {
            addCriterion("indeptname is not null");
            return (Criteria) this;
        }

        public Criteria andIndeptnameEqualTo(String value) {
            addCriterion("indeptname =", value, "indeptname");
            return (Criteria) this;
        }

        public Criteria andIndeptnameNotEqualTo(String value) {
            addCriterion("indeptname <>", value, "indeptname");
            return (Criteria) this;
        }

        public Criteria andIndeptnameGreaterThan(String value) {
            addCriterion("indeptname >", value, "indeptname");
            return (Criteria) this;
        }

        public Criteria andIndeptnameGreaterThanOrEqualTo(String value) {
            addCriterion("indeptname >=", value, "indeptname");
            return (Criteria) this;
        }

        public Criteria andIndeptnameLessThan(String value) {
            addCriterion("indeptname <", value, "indeptname");
            return (Criteria) this;
        }

        public Criteria andIndeptnameLessThanOrEqualTo(String value) {
            addCriterion("indeptname <=", value, "indeptname");
            return (Criteria) this;
        }

        public Criteria andIndeptnameLike(String value) {
            addCriterion("indeptname like", value, "indeptname");
            return (Criteria) this;
        }

        public Criteria andIndeptnameNotLike(String value) {
            addCriterion("indeptname not like", value, "indeptname");
            return (Criteria) this;
        }

        public Criteria andIndeptnameIn(List<String> values) {
            addCriterion("indeptname in", values, "indeptname");
            return (Criteria) this;
        }

        public Criteria andIndeptnameNotIn(List<String> values) {
            addCriterion("indeptname not in", values, "indeptname");
            return (Criteria) this;
        }

        public Criteria andIndeptnameBetween(String value1, String value2) {
            addCriterion("indeptname between", value1, value2, "indeptname");
            return (Criteria) this;
        }

        public Criteria andIndeptnameNotBetween(String value1, String value2) {
            addCriterion("indeptname not between", value1, value2, "indeptname");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table indept
     *
     * @mbg.generated do_not_delete_during_merge Thu Aug 15 14:42:50 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table indept
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
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