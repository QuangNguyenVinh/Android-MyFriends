package ntu.edu.vn.vinhquang.myfriends.models;

import java.util.ArrayList;

public class FriendsManager
{
    ArrayList<Friend> friends;
    private static FriendsManager manager;

    public FriendsManager()
    {
        friends = new ArrayList<>();
        friends.add(new Friend("01", "An Khang", "1/1/1990", "0848888888", "Nha Trang"));
        friends.add(new Friend("02","Thịnh Vượng", "1/1/1991","0905888888","Cam Ranh"));
        friends.add(new Friend("03", "Như Ý", "1/1/1992","0905999999","Hà Nội"));
        friends.add(new Friend("04", "An Lành", "1/1/1993", "0858888888", "Nha Trang"));
        friends.add(new Friend("05","Cát Tường", "1/1/1994","0906888888","Hải Phòng"));
        friends.add(new Friend("06", "Như Ý", "1/1/1995","0906999999","TP.HCM"));


    }
    public static FriendsManager getInstance()
    {
        if (manager == null)
            manager = new FriendsManager();
        return manager;
    }

    public ArrayList<Friend> getFriends()
    {
        return friends;
    }
}
