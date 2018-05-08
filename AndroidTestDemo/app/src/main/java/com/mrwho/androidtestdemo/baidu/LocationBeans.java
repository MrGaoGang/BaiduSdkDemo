package com.mrwho.androidtestdemo.baidu;

/**
 * Created by mr.gao on 2018/5/8.
 * Package:    com.mrwho.androidtestdemo.baidu
 * Create Date:2018/5/8
 * Project Name:AndroidTestDemo
 * Description:
 */

public class LocationBeans {

    /**
     * status : 0
     * result : {"location":{"lng":106.57900975324534,"lat":29.56002325497017},"precise":0,"confidence":25,"level":"旅游景点"}
     */

    private int status;
    /**
     * location : {"lng":106.57900975324534,"lat":29.56002325497017}
     * precise : 0
     * confidence : 25
     * level : 旅游景点
     */

    private ResultBean result;

    public void setStatus(int status) {
        this.status = status;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getStatus() {
        return status;
    }

    public ResultBean getResult() {
        return result;
    }

    public static class ResultBean {
        /**
         * lng : 106.57900975324534
         * lat : 29.56002325497017
         */

        private LocationBean location;
        private int precise;
        private int confidence;
        private String level;

        public void setLocation(LocationBean location) {
            this.location = location;
        }

        public void setPrecise(int precise) {
            this.precise = precise;
        }

        public void setConfidence(int confidence) {
            this.confidence = confidence;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        public LocationBean getLocation() {
            return location;
        }

        public int getPrecise() {
            return precise;
        }

        public int getConfidence() {
            return confidence;
        }

        public String getLevel() {
            return level;
        }

        public static class LocationBean {
            private double lng;
            private double lat;

            public void setLng(double lng) {
                this.lng = lng;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public double getLat() {
                return lat;
            }
        }
    }
}
