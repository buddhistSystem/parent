package com.liqian.service1.config;

import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Auther: liqian
 * @Date: 2018/11/7 0007 09:27
 * @Description:
 */
@Component
public class AlipayConfig {

    // APPID，收款账号是APPID对应支付宝账号
    public static String app_id = "2016092000555546";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static  String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCI0rHJVnCYCu" +
            "vQkaE9bX1vJ/DBgwUmAFdOVYYDkGsSiJx7eD50vJwAkoqQ4SA9kVo6/Z/aWgI0CEO18IG2FwLfkxl6+/f3t6wTqwibuZcfdE+f" +
            "mbTMn0jJLhRanRxZtV9sIhwg+BiRko65L7me1Srl71tGfxiuhzjZUrknsZ/4LngskQ6G4o8THgsS3q8Ru3jNdGVfIxh74pkFztg" +
            "aZBbhwVpKG6TV92I4guYfFaI0gNFwmSqsiRR/dLwLpwbTAVk6m4xAZvqLDDClGA68aa0s/EUJ7Vc24iQXCsKRXpLaSRf3dTiWvR" +
            "zmn2fHlNJMs0HPqhTxRi6Z1IuOfPh1LjYfAgMBAAECggEABu93J5eEGZDkJyxamfyE0S+bGpQDnMuDoWrgYind45CdLf0IXW56Ee" +
            "VbtMBUnApUIo1cnvrVBcItfHl2eb5s3Nxd/EftZ9cdl9mhlBMyP9vrdVGbQowIano1eepg14NEFP0do+YviKF/Lo/mvtBbXlBltgs" +
            "XOzGLhiiVThfI3hGZ+FVooUSKCTKm2FcVuH8eOc+60onlW1XHNeDNGDUKaKKaqUQwjDyy+WHE3h7jxuUdPeXtA/7TcPJtLVMpKtLyc" +
            "BAdo1RJCEU1VqtH3qy/jghSZoDC9PwzwQybFkGTYoD9WAs1BgztHIHgYmqCtl2i53QG9AyBhSB9J18iyWLRwQKBgQC9KCv1Ht78TsS" +
            "9K2nk1l3XmbuH9m7eaFgoNmnNvFJ7ukIZAp6prtNmbmuH5uzQLEHwHYVTmbojZBGl1GhdkBh6FaW6FYsj+TqxR8pOMlEpQBBTlgmVB" +
            "ndu8sVuLXh7+VSxU5CK19JqjSxr2ReqXlX3EbljNNGkEqOrT/3sh2pIUQKBgQC5LDTwM/vrt4DpL0iNOyWgg4/RrMV/LuMsj0c4N/1" +
            "eTN8FLkzooAgl2+mS8DPFaR73SUcXz8bRERIpgB6Qwb6y1TxHWC1Xh1HCQ4RsswuNHN0dKQzMEpThbtbP7me8P2djodjiDQ/AQ6Q8L" +
            "cPP29e5AsMK0GEAJyvEqqtEmy9rbwKBgEfKPEyup8CogICvPmRse3c9UHA8tj1Q6sxwQl2j8MYmnblyRhduU6tXkxYkLZKgiXIBMj3VZ" +
            "VDTRONkJywDaVbEan6ieIlxqLXp4j0lWapHNysSEZbuultwZj/3n/elXGBkr8ISQTjRVZ+k6Bdv8D5yCqM9Q6d6r4VwOZYQmuTRAoGAc" +
            "g2GdcSvEBqwre/Psh2SKXGfLbhK1PFeP13osfnadzDF1P0Vpdqb6iWvki+c06TRy+I4hbQWc0Meeq1NJkAPYzrvq8nl85mHhC3t7L3DC" +
            "aGTl5hnJ3LyfH+2k8/12P78gWN4oJMG9pczG1Xc27Q/BNdspsZ+WIfH75RndRRYesUCgYBmdVcTvE72lZqPBeUxJn/XJlQ6026n4DCcQ" +
            "+m3y4SL2RbOSfEdI6GG4VGRYGMJEvc6GEaLjNbxubxBAxTtwSPNJico2Y+iV1BLsuWP6gCEMYPfnKAnfX0hgUpxxPxHDtCB7v2qcVgez+" +
            "B42kr/2wXTkbQUMtMnLveKSVmdHU6ZpA==";


    // 支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA1OLiyJkeVXD0hBR9uAYrZFiCIYPHu" +
            "TPkZ5lvU/sIURf+bkeu+sekYEyaOHoMjlNW4E88bMnpLuTqmkhAIJlTxFfEi1iMsGwhJzcMBgskIEQgQM4HQ/303IEXOp8Inubqb8jpMGFW" +
            "V54ZDpBx8nS1A1BAQN/rRkWYoQ3jMETudzri6B28hhTRbBIVjL6T6KoG7id96H0K21cmA38D9wPavLyZ4Bzy12nFKBdkmgO5MkKmJ7ajsmV" +
            "+QYn7VrJw98Ykv/5AkcThjpGMbaRtA6Ct/S77YF9lhZG4ZxHG2YG2jGkE5nGoEge3Mxk255ltJI36CnkopEMjJ87mSN6+BMfz4wIDAQAB";

    /**
     * 服务器异步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
     * 返回的时候此页面不会返回到用户页面，只会执行你写到控制器里的地址
     */
//    public static String notify_url = "https://natapp.cn/";
    public static String notify_url = "183.129.19.130:8888/notify_url";

    /**
     * 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
     * 此页面是同步返回用户页面，也就是用户支付后看到的页面，上面的notify_url是异步返回商家操作
     */
    public static  String return_url = "183.129.19.130:8888/return_url";

    // 签名方式
    public static  String sign_type = "RSA2";

    // 字符编码格式
    public static  String charset = "utf-8";

    // 支付宝网关
    public static  String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 日志地址
    public static  String log_path = "D:/logs/";


    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     *
     * @param sWord
     *            要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_"
                    + System.currentTimeMillis() + ".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }






}
