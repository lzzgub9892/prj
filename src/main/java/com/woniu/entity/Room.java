package com.woniu.entity;

public class Room {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.roomid
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    private Integer roomid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.roomnumber
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    private String roomnumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.roomstatusid
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    private Integer roomstatusid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.buildingid
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    private Integer buildingid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.roomid
     *
     * @return the value of room.roomid
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    public Integer getRoomid() {
        return roomid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.roomid
     *
     * @param roomid the value for room.roomid
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.roomnumber
     *
     * @return the value of room.roomnumber
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    public String getRoomnumber() {
        return roomnumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.roomnumber
     *
     * @param roomnumber the value for room.roomnumber
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    public void setRoomnumber(String roomnumber) {
        this.roomnumber = roomnumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.roomstatusid
     *
     * @return the value of room.roomstatusid
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    public Integer getRoomstatusid() {
        return roomstatusid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.roomstatusid
     *
     * @param roomstatusid the value for room.roomstatusid
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    public void setRoomstatusid(Integer roomstatusid) {
        this.roomstatusid = roomstatusid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.buildingid
     *
     * @return the value of room.buildingid
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    public Integer getBuildingid() {
        return buildingid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.buildingid
     *
     * @param buildingid the value for room.buildingid
     *
     * @mbg.generated Thu Aug 15 14:42:50 CST 2019
     */
    public void setBuildingid(Integer buildingid) {
        this.buildingid = buildingid;
    }
}