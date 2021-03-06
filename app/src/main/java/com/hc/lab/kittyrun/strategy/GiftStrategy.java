package com.hc.lab.kittyrun.strategy;

import android.graphics.Bitmap;

import com.hc.lab.kittyrun.model.GiftModel;
import com.hc.lab.kittyrun.model.GiftResMoel;

import org.cocos2d.types.CGPoint;

/**
 * Created by congwiny on 2017/4/17.
 */

public class GiftStrategy extends Strategy{

    public GiftModel giftModel;
    public GiftResMoel giftResMoel;
    //初始化的时候的高度
    public float initHeight;


    public GiftModel getGiftModel() {
        return giftModel;
    }

    public void setGiftModel(GiftModel giftModel) {
        this.giftModel = giftModel;
    }

    public GiftResMoel getGiftResMoel() {
        return giftResMoel;
    }

    public void setGiftResMoel(GiftResMoel giftResMoel) {
        this.giftResMoel = giftResMoel;
    }

    public float getInitHeight() {
        return initHeight;
    }

    public void setInitHeight(float initHeight) {
        this.initHeight = initHeight;
    }
}
