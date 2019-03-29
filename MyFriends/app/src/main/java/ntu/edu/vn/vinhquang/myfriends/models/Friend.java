package ntu.edu.vn.vinhquang.myfriends.models;

import androidx.annotation.NonNull;

public class Friend
{
    String id;
    String name, birthday, phone, address;

    public Friend(String id, String name, String birthday, String phone, String address)
    {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.phone = phone;
        this.address = address;
    }

    public String getName()
    {
        return name;
    }

    public String getBirthday()
    {
        return birthday;
    }

    public String getPhone()
    {
        return phone;
    }

    public String getAddress()
    {
        return address;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setBirthday(String birthday)
    {
        this.birthday = birthday;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }


    @Override
    public String toString()
    {
        return name;
    }

}
