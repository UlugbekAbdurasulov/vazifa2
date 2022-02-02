package com.example.vazifa1;

import android.graphics.drawable.Drawable;

public class Member {


        public Member(String frist_Name, String last_Name, Drawable image1) {
           this.frist_Name = frist_Name;
           this.last_Name = last_Name;
           this.image1 = image1;

        }

        String frist_Name;
        String last_Name;
         Drawable image1;

    public Drawable getImage1() {
        return image1;
    }

    public void setImage1(Drawable image1) {
        this.image1 = image1;
    }


        public String getFrist_Name() {
            return frist_Name;
        }

        public void setFrist_Name(String frist_Name) {
            this.frist_Name = frist_Name;
        }

        public String getLast_Name() {
            return last_Name;
        }

        public void setLast_Name(String last_Name) {
            this.last_Name = last_Name;
        }
    }

