package com.example.softwareengineering;

public class Coach extends Person{

    private String coachPosition, coachAge;
    private ContactInfo contactInfo;

    public Coach(String coachPosition, String coachAge)
    {
        this.coachPosition = coachPosition;
        this.coachAge = coachAge;
    }

    public void setContactInfo(ContactInfo contactInfo)
    {
        this.contactInfo = contactInfo;
    }

    public String getCoachPosition()
    {
        return coachPosition;
    }

    public void setCoachPosition(String coachPosition)
    {
        this.coachPosition = coachPosition;
    }

    public String getCoachAge()
    {
        return coachAge;
    }

    public void setCoachAge(String coachAge)
    {
        this.coachAge = coachAge;
    }
}
