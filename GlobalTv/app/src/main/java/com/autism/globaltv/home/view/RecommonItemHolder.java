package com.autism.globaltv.home.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.autism.baselibs.view.glide.GlideUtils;
import com.autism.globaltv.R;
import com.autism.globaltv.base.BaseRecyclerHolder;
import com.autism.globaltv.home.model.HomeEntity;

/**
 * Author：i5 on 2017/4/5 15:39
 * Used:GlobalTv
 */
public class RecommonItemHolder extends BaseRecyclerHolder<HomeEntity.RoomBean.ListBean> {
    private ImageView mImageBg, mHeaderImg;
    private TextView mNum, mTitle_01, mTitle_02;

    public RecommonItemHolder(ViewGroup paresen, int res) {
        super(paresen, res);
        mImageBg = $(R.id.img_bg);
        View mContainer = $(R.id.item_container);
        mNum = $(R.id.img_text);
        mHeaderImg = $(R.id.player_img);
        mTitle_01 = $(R.id.title_1);
        mTitle_02 = $(R.id.title_2);
        measure(mImageBg, 500, 300);
        measure(mContainer, 500, 300);
        measure(mHeaderImg, 92, 92);
    }

    @Override
    public void setData(HomeEntity.RoomBean.ListBean mData) {
        mTitle_01.setText(mData.getNick());
        mTitle_02.setText(mData.getTitle());
        mNum.setText(mData.getView());
        GlideUtils.loadCirleImg(getContext(), mData.getAvatar(), mHeaderImg, R.mipmap.ic_default_head);
        GlideUtils.loadUriNetImg(getContext(), mData.getThumb(), mImageBg, R.mipmap.ic_default_cover);
    }
}
