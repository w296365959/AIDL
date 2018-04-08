package github.wzm.com.myaidl.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Okline(Hangzhou)co,Ltd<br/>
 * Author: wangzhongming<br/>
 * Email:  wangzhongming@okline.cn</br>
 * Date :  2018/4/4 15:09 </br>
 * Summary:
 */

public class Book  implements Parcelable{
    // 书籍名称
    String name;
    //书籍数量
    int number;

    protected Book(Parcel in) {
        name = in.readString();
        number = in.readInt();
    }
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(number);
    }
    public static final Creator<Book> CREATOR = new Creator<Book>() {
        @Override
        public Book createFromParcel(Parcel in) {
            return new Book(in);
        }
        @Override
        public Book[] newArray(int size) {
            return new Book[size];
        }
    };


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book book = (Book) o;

        if (getNumber() != book.getNumber()) return false;
        return getName() != null ? getName().equals(book.getName()) : book.getName() == null;

    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + getNumber();
        return result;
    }


}
