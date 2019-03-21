package com.liqian.service1.controller;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.liqian.service1.config.AlipayConfig;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @Auther: liqian
 * @Date: 2018/11/7 0007 10:11
 * @Description:
 */
@Controller
public class AlipayController {

    //用户调用支付的接口
    @RequestMapping("alipaySum")
    @ResponseBody
    public void alipayIumpSum(Model model, String payables, String subject, String body, HttpServletResponse response)
            throws Exception {
        // 获得初始化的AlipayClient
        AlipayClient alipayClient=new DefaultAlipayClient(
                AlipayConfig.gatewayUrl,//支付宝网关
                AlipayConfig.app_id,
                AlipayConfig.merchant_private_key,//商户私钥
                "json",
                AlipayConfig.charset,//字符编码
                AlipayConfig.alipay_public_key,//支付宝公钥
                AlipayConfig.sign_type);//签名方式

        // 设置请求参数
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        //返回用户的页面
        alipayRequest.setReturnUrl(AlipayConfig.return_url);
        //异步通知商家的地址
        alipayRequest.setNotifyUrl(AlipayConfig.notify_url);

        //伪造的商户订单号，必需项
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String out_trade_no = sdf.format(new Date());


        // 付款金额，必需项
        String total_amount = payables.replace(",", "");
        alipayRequest.setBizContent("{\"out_trade_no\":\"" + out_trade_no + "\"," + "\"total_amount\":\"" + total_amount
                + "\"," + "\"subject\":\"" + subject + "\"," + "\"body\":\"" + body + "\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
        // 发送请求
        String result = alipayClient.pageExecute(alipayRequest).getBody();
        System.out.println(result);

//        AlipayConfig.logResult(result);// 记录支付日志
        response.setContentType("text/html; charset=gbk");
        PrintWriter out = response.getWriter();
        out.print(result);
    }


    @RequestMapping("notify_url")
    public void Notify(HttpServletResponse response, HttpServletRequest request) throws Exception {
        System.out.println("----------------------------notify_url------------------------");
        // 商户订单号
        String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"), "GBK");
        // 付款金额
        String total_amount = new String(request.getParameter("total_amount").getBytes("ISO-8859-1"), "GBK");
        // 支付宝交易号
        String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"), "GBK");
        // 交易说明
        String cus = new String(request.getParameter("body").getBytes("ISO-8859-1"), "GBK");
        // 交易状态
        String trade_status = new String(request.getParameter("trade_status").getBytes("ISO-8859-1"), "GBK");
        if (trade_status.equals("TRADE_SUCCESS")) {//支付成功商家操作
            //简单的插入操作
            /*Map<Object, Object> map = new HashMap<Object, Object>();
            map.put("cuId", Integer.valueOf(cus));
            RepaymentPlan repaymentPlan = new RepaymentPlan();
            Integer id = Integer.valueOf(out_trade_no);
            double payablesCheck = Double.valueOf(total_amount);
            RepaymentPlan repayCheck = serviceMain.selectByPrimaryKey(id);
            double total = repayCheck.getPayables();
            if (Double.valueOf(total_amount) < repayCheck.getPayables()) {
                map.put("ubalance", total - Double.valueOf(total_amount));
                serviceMain.updateCusMoney(map);
            }
            repaymentPlan.setId(id);
            repaymentPlan.setActualPayment(total);
            repaymentPlan.setRepaymentStatus(1);
            int i = serviceMain.updateByPrimaryKeySelective(repaymentPlan);
            System.out.println("---------------------还款影响行数----------------------------" + i);*/
        }
    }


    @RequestMapping("return_url")
    @ResponseBody
    public String Return_url() throws InterruptedException {
        return "支付成功后用户的页面跳转";
    }

}
