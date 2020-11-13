package com.example.shoppingcart.bean;

import com.example.shoppingcart.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "iPhone12", "vertu", "OPPO k7x", "A99A", "iphone12pro", "华为畅享20plus",
            "华为Mate40Pro","iQOO 5 Pro","三星Galaxy Note 20 Ultra"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "Apple iPhone 12 (A2404) 移动联通电信5G 双卡双待手机 黑色 64G（官方标配）",
            "VERTU 纬图 ASTER P 哥特系列商务手机智能双卡双待 全网通4G 高端特色手机 威图 绅士蓝",
            "OPPO k7x 硬核5G手机【白条12期免息+赠299豪礼】 蓝色 6GB+128GB",
            "詹姆士 A99A 全网通4G高端商务智能手机 前后双摄 骁龙八核双卡双待 腾龙版高配 6+256G",
            "Apple iPhone 12 Pro (A2408) 256GB 海蓝色 支持移动联通电信5G 双卡双待手机",
            "华为 HUAWEI 畅享20 Plus 5G 4800万高感光夜拍6.63英寸90HZ高刷真全屏 翡冷翠 8GB+128GB",
            "华为Mate40 Pro（8GB/256GB/全网通/5G版/玻璃版）",
            "iQOO 5 Pro（8GB/256GB/全网通/5G版）",
            "三星Galaxy Note 20 Ultra（12GB/256GB/全网通/5G版）"

    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {6299, 35800, 1498, 22999, 9299, 2499,6999,4998,9199};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.apple_s, R.drawable.vertu_s, R.drawable.oppo_s,
            R.drawable.a99a_s, R.drawable.iphone12pro_s, R.drawable.hauwei_s,
            R.drawable.mate40_s,R.drawable.iqoo_s,R.drawable.sanxing_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.apple, R.drawable.vertu, R.drawable.oppo,
            R.drawable.a99a, R.drawable.iphone12pro, R.drawable.hauwei,
            R.drawable.mate40,R.drawable.iqoo,R.drawable.sanxing
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
