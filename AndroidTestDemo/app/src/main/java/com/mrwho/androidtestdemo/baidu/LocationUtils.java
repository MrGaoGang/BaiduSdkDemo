package com.mrwho.androidtestdemo.baidu;

import android.content.Context;

import com.baidu.location.BDAbstractLocationListener;
import com.baidu.location.BDLocation;

/**
 * Created by mr.gao on 2018/3/18.
 * Package:    gao.employhelp.mrgao.utils.location
 * Create Date:2018/3/18
 * Project Name:EmployHelp
 * Description:
 */

public class LocationUtils {

    private Context mContext;
    private static LocationUtils sLocationUtils;
    private LocationService mLocationService;


    public LocationUtils(Context context, LocationService service) {
        mContext = context;
        mLocationService = service;
    }

    /**
     * 此处并没有弄成单例设计模式
     *
     * @param context
     * @return
     */
    public static LocationUtils getInstance(Context context,LocationService service) {
        if (sLocationUtils == null) {
            sLocationUtils = new LocationUtils(context,service);
        }
        return sLocationUtils;
    }


    /**
     * 包括开始和注册监听
     */
    public void start() {
        mLocationService.registerListener(mListener);
        mLocationService.setLocationOption(mLocationService.getDefaultLocationClientOption());
        mLocationService.start();
    }


    /**
     * 停止获取信息
     */
    public void stop() {
        mLocationService.unregisterListener(mListener);
        mLocationService.stop();
    }

    /**
     * 保存地理位置信息
     */
    private void saveLocationData(BDLocation location) {
       // LocationSP.saveData(location);
    }

    /*****
     *
     * 定位结果回调，重写onReceiveLocation方法，可以直接拷贝如下代码到自己工程中修改
     *
     */
    private BDAbstractLocationListener mListener = new BDAbstractLocationListener() {

        @Override
        public void onReceiveLocation(BDLocation location) {
            // TODO Auto-generated method stub
            if (null != location && location.getLocType() != BDLocation.TypeServerError) {
                saveLocationData(location);
            }
        }

    };


}
