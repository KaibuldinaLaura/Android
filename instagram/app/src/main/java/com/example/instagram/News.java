package com.example.instagram;

import android.os.Parcel;
import android.os.Parcelable;

public class News implements Parcelable {
    private int imageUrl;
    private String date;
    private String author;
    private int imageUrl2;
    private String theme;
    private String ratingCount;
    private String commentsCount;

    public News(
            int imageUrl,
            String date,
            String author,
            int imageUrl2,
            String theme,
            String ratingCount,
            String commentsCount
    ) {
        this.imageUrl = imageUrl;
        this.date = date;
        this.author = author;
        this.imageUrl2 = imageUrl2;
        this.theme = theme;
        this.ratingCount = ratingCount;
        this.commentsCount = commentsCount;
    }

    public String getDate() {
        return date;
    }

    public String getAuthor() {
        return author;
    }

    public int getImageUrl2() {
        return imageUrl2;
    }

    public String getTheme() {
        return theme;
    }

    public String getRatingCount() {
        return ratingCount;
    }

    public String getCommentsCount() {
        return commentsCount;
    }

    public int getImageUrl() {
        return imageUrl;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("News{");
        sb.append("date='").append(date).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", theme='").append(theme).append('\'');
        sb.append(", ratingCount=").append(ratingCount);
        sb.append(", commentsCount=").append(commentsCount);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.imageUrl);
        dest.writeString(this.date);
        dest.writeString(this.author);
        dest.writeInt(this.imageUrl2);
        dest.writeString(this.theme);
        dest.writeString(this.ratingCount);
        dest.writeString(this.commentsCount);
    }

    protected News(Parcel in) {
        this.imageUrl = in.readInt();
        this.date = in.readString();
        this.author = in.readString();
        this.imageUrl2 = in.readInt();
        this.theme = in.readString();
        this.ratingCount = in.readString();
        this.commentsCount = in.readString();
    }

    public static final Creator<News> CREATOR = new Creator<News>() {
        @Override
        public News createFromParcel(Parcel source) {
            return new News(source);
        }

        @Override
        public News[] newArray(int size) {
            return new News[size];
        }
    };
}
