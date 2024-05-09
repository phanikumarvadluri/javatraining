package com.org.interfaceexamples;

public class Passenger implements Comparable {
    private String name;
    private int memeberLevel;// 1,2,3

    public int getMemberDays() {
        return memberDays;
    }

    public void setMemberDays(int memberDays) {
        this.memberDays = memberDays;
    }

    public int getMemeberLevel() {
        return memeberLevel;
    }

    public void setMemeberLevel(int memeberLevel) {
        this.memeberLevel = memeberLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int memberDays;

    public Passenger() {

    }

    public Passenger(String name, int memeberLevel, int memberDays) {
        this.name = name;
        this.memeberLevel = memeberLevel;
        this.memberDays = memberDays;
    }

    @Override
    public int compareTo(Object o) {
        Passenger passenger = (Passenger) o;
        int returnValue = passenger.memeberLevel - memeberLevel;
        if (returnValue == 0) {
            returnValue = passenger.memberDays - memberDays;
        }
        return returnValue;
    }
}
