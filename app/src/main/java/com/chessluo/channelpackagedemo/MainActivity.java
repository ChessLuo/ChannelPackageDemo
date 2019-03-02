package com.chessluo.channelpackagedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTv = findViewById(R.id.tv);
        initData();

    }

    private void initData() {
        /**读取BuildConfig配置值*/

        boolean isDebug = BuildConfig.DEBUG;//是否debug
        String applicationId = BuildConfig.APPLICATION_ID;//applicationId
        String buildType = BuildConfig.BUILD_TYPE;//构建类型。要么是debug版，要么是release版；可通过Build Variants选择打包类型；
        String flavor = BuildConfig.FLAVOR;//对应渠道名
        int versionCode = BuildConfig.VERSION_CODE;//版本号
        String versionName = BuildConfig.VERSION_NAME;//版本名

        int channelType = BuildConfig.CHANNEL_TYPE;//通过buildConfigField自定义的渠道值

        mTv.setText("是否debug："+isDebug+"\r\n"
                +"applicationId："+applicationId+"\r\n"
                +"构建类型："+buildType+"版\r\n"
                +"渠道名："+flavor+"\r\n"
                +"版本号："+versionCode +"\r\n"
                +"版本名："+versionName+"\r\n"
                +"通过buildConfigField自定义的渠道值："+channelType);
    }
}
