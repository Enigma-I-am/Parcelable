package okechukwu.nwagba.ng.com.parcelable;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class House implements Parcelable {

    private int price;
    private String location;
    private boolean nearSchool;
    private ArrayList<String> previousOwners;


    public House(int price, String location, boolean nearSchool, ArrayList<String> previousOwners) {
        this.price = price;
        this.location = location;
        this.nearSchool = nearSchool;
        this.previousOwners = previousOwners;
    }

    protected House(Parcel in) {
        price = in.readInt() ;
        location = in.readString();
        nearSchool = in.readInt()==1;
        previousOwners = in.createStringArrayList();
    }

    public static final Creator<House> CREATOR = new Creator<House>() {
        @Override
        public House createFromParcel(Parcel in) {
            return new House(in);
        }

        @Override
        public House[] newArray(int size) {
            return new House[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(price);
        parcel.writeString(location);
        parcel.writeInt(nearSchool?1:0);
        parcel.writeStringList(previousOwners);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isNearSchool() {
        return nearSchool;
    }

    public void setNearSchool(boolean nearSchool) {
        this.nearSchool = nearSchool;
    }

    public ArrayList<String> getPreviousOwners() {
        return previousOwners;
    }

    public void setPreviousOwners(ArrayList<String> previousOwners) {
        this.previousOwners = previousOwners;
    }

    public static Creator<House> getCREATOR() {
        return CREATOR;
    }
}
