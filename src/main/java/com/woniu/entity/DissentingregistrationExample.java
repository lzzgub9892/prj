package com.woniu.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DissentingregistrationExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dissentingregistration
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dissentingregistration
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dissentingregistration
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dissentingregistration
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    public DissentingregistrationExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dissentingregistration
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dissentingregistration
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dissentingregistration
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dissentingregistration
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dissentingregistration
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dissentingregistration
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dissentingregistration
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
     * This method corresponds to the database table dissentingregistration
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
     * This method corresponds to the database table dissentingregistration
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dissentingregistration
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
     * This class corresponds to the database table dissentingregistration
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andServiceidIsNull() {
            addCriterion("serviceid is null");
            return (Criteria) this;
        }

        public Criteria andServiceidIsNotNull() {
            addCriterion("serviceid is not null");
            return (Criteria) this;
        }

        public Criteria andServiceidEqualTo(Integer value) {
            addCriterion("serviceid =", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidNotEqualTo(Integer value) {
            addCriterion("serviceid <>", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidGreaterThan(Integer value) {
            addCriterion("serviceid >", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("serviceid >=", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidLessThan(Integer value) {
            addCriterion("serviceid <", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidLessThanOrEqualTo(Integer value) {
            addCriterion("serviceid <=", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidIn(List<Integer> values) {
            addCriterion("serviceid in", values, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidNotIn(List<Integer> values) {
            addCriterion("serviceid not in", values, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidBetween(Integer value1, Integer value2) {
            addCriterion("serviceid between", value1, value2, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidNotBetween(Integer value1, Integer value2) {
            addCriterion("serviceid not between", value1, value2, "serviceid");
            return (Criteria) this;
        }

        public Criteria andClientidIsNull() {
            addCriterion("clientid is null");
            return (Criteria) this;
        }

        public Criteria andClientidIsNotNull() {
            addCriterion("clientid is not null");
            return (Criteria) this;
        }

        public Criteria andClientidEqualTo(Integer value) {
            addCriterion("clientid =", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotEqualTo(Integer value) {
            addCriterion("clientid <>", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidGreaterThan(Integer value) {
            addCriterion("clientid >", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidGreaterThanOrEqualTo(Integer value) {
            addCriterion("clientid >=", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidLessThan(Integer value) {
            addCriterion("clientid <", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidLessThanOrEqualTo(Integer value) {
            addCriterion("clientid <=", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidIn(List<Integer> values) {
            addCriterion("clientid in", values, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotIn(List<Integer> values) {
            addCriterion("clientid not in", values, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidBetween(Integer value1, Integer value2) {
            addCriterion("clientid between", value1, value2, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotBetween(Integer value1, Integer value2) {
            addCriterion("clientid not between", value1, value2, "clientid");
            return (Criteria) this;
        }

        public Criteria andDissentingitemIsNull() {
            addCriterion("dissentingitem is null");
            return (Criteria) this;
        }

        public Criteria andDissentingitemIsNotNull() {
            addCriterion("dissentingitem is not null");
            return (Criteria) this;
        }

        public Criteria andDissentingitemEqualTo(String value) {
            addCriterion("dissentingitem =", value, "dissentingitem");
            return (Criteria) this;
        }

        public Criteria andDissentingitemNotEqualTo(String value) {
            addCriterion("dissentingitem <>", value, "dissentingitem");
            return (Criteria) this;
        }

        public Criteria andDissentingitemGreaterThan(String value) {
            addCriterion("dissentingitem >", value, "dissentingitem");
            return (Criteria) this;
        }

        public Criteria andDissentingitemGreaterThanOrEqualTo(String value) {
            addCriterion("dissentingitem >=", value, "dissentingitem");
            return (Criteria) this;
        }

        public Criteria andDissentingitemLessThan(String value) {
            addCriterion("dissentingitem <", value, "dissentingitem");
            return (Criteria) this;
        }

        public Criteria andDissentingitemLessThanOrEqualTo(String value) {
            addCriterion("dissentingitem <=", value, "dissentingitem");
            return (Criteria) this;
        }

        public Criteria andDissentingitemLike(String value) {
            addCriterion("dissentingitem like", value, "dissentingitem");
            return (Criteria) this;
        }

        public Criteria andDissentingitemNotLike(String value) {
            addCriterion("dissentingitem not like", value, "dissentingitem");
            return (Criteria) this;
        }

        public Criteria andDissentingitemIn(List<String> values) {
            addCriterion("dissentingitem in", values, "dissentingitem");
            return (Criteria) this;
        }

        public Criteria andDissentingitemNotIn(List<String> values) {
            addCriterion("dissentingitem not in", values, "dissentingitem");
            return (Criteria) this;
        }

        public Criteria andDissentingitemBetween(String value1, String value2) {
            addCriterion("dissentingitem between", value1, value2, "dissentingitem");
            return (Criteria) this;
        }

        public Criteria andDissentingitemNotBetween(String value1, String value2) {
            addCriterion("dissentingitem not between", value1, value2, "dissentingitem");
            return (Criteria) this;
        }

        public Criteria andRegistertimeIsNull() {
            addCriterion("registertime is null");
            return (Criteria) this;
        }

        public Criteria andRegistertimeIsNotNull() {
            addCriterion("registertime is not null");
            return (Criteria) this;
        }

        public Criteria andRegistertimeEqualTo(Date value) {
            addCriterion("registertime =", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeNotEqualTo(Date value) {
            addCriterion("registertime <>", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeGreaterThan(Date value) {
            addCriterion("registertime >", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("registertime >=", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeLessThan(Date value) {
            addCriterion("registertime <", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeLessThanOrEqualTo(Date value) {
            addCriterion("registertime <=", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeIn(List<Date> values) {
            addCriterion("registertime in", values, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeNotIn(List<Date> values) {
            addCriterion("registertime not in", values, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeBetween(Date value1, Date value2) {
            addCriterion("registertime between", value1, value2, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeNotBetween(Date value1, Date value2) {
            addCriterion("registertime not between", value1, value2, "registertime");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andDissentingserviceidIsNull() {
            addCriterion("dissentingserviceid is null");
            return (Criteria) this;
        }

        public Criteria andDissentingserviceidIsNotNull() {
            addCriterion("dissentingserviceid is not null");
            return (Criteria) this;
        }

        public Criteria andDissentingserviceidEqualTo(Integer value) {
            addCriterion("dissentingserviceid =", value, "dissentingserviceid");
            return (Criteria) this;
        }

        public Criteria andDissentingserviceidNotEqualTo(Integer value) {
            addCriterion("dissentingserviceid <>", value, "dissentingserviceid");
            return (Criteria) this;
        }

        public Criteria andDissentingserviceidGreaterThan(Integer value) {
            addCriterion("dissentingserviceid >", value, "dissentingserviceid");
            return (Criteria) this;
        }

        public Criteria andDissentingserviceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dissentingserviceid >=", value, "dissentingserviceid");
            return (Criteria) this;
        }

        public Criteria andDissentingserviceidLessThan(Integer value) {
            addCriterion("dissentingserviceid <", value, "dissentingserviceid");
            return (Criteria) this;
        }

        public Criteria andDissentingserviceidLessThanOrEqualTo(Integer value) {
            addCriterion("dissentingserviceid <=", value, "dissentingserviceid");
            return (Criteria) this;
        }

        public Criteria andDissentingserviceidIn(List<Integer> values) {
            addCriterion("dissentingserviceid in", values, "dissentingserviceid");
            return (Criteria) this;
        }

        public Criteria andDissentingserviceidNotIn(List<Integer> values) {
            addCriterion("dissentingserviceid not in", values, "dissentingserviceid");
            return (Criteria) this;
        }

        public Criteria andDissentingserviceidBetween(Integer value1, Integer value2) {
            addCriterion("dissentingserviceid between", value1, value2, "dissentingserviceid");
            return (Criteria) this;
        }

        public Criteria andDissentingserviceidNotBetween(Integer value1, Integer value2) {
            addCriterion("dissentingserviceid not between", value1, value2, "dissentingserviceid");
            return (Criteria) this;
        }

        public Criteria andDescriptIsNull() {
            addCriterion("descript is null");
            return (Criteria) this;
        }

        public Criteria andDescriptIsNotNull() {
            addCriterion("descript is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptEqualTo(String value) {
            addCriterion("descript =", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptNotEqualTo(String value) {
            addCriterion("descript <>", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptGreaterThan(String value) {
            addCriterion("descript >", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptGreaterThanOrEqualTo(String value) {
            addCriterion("descript >=", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptLessThan(String value) {
            addCriterion("descript <", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptLessThanOrEqualTo(String value) {
            addCriterion("descript <=", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptLike(String value) {
            addCriterion("descript like", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptNotLike(String value) {
            addCriterion("descript not like", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptIn(List<String> values) {
            addCriterion("descript in", values, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptNotIn(List<String> values) {
            addCriterion("descript not in", values, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptBetween(String value1, String value2) {
            addCriterion("descript between", value1, value2, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptNotBetween(String value1, String value2) {
            addCriterion("descript not between", value1, value2, "descript");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dissentingregistration
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
     * This class corresponds to the database table dissentingregistration
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