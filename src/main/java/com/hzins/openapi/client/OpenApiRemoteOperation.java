/**
 * Copyright (c) 2006-2015 Hzins Ltd. All Rights Reserved. 
 *  
 * This code is the confidential and proprietary information of   
 * Hzins. You shall not disclose such Confidential Information   
 * and shall use it only in accordance with the terms of the agreements   
 * you entered into with Hzins,http://www.hzins.com.
 *  
 */
package com.hzins.openapi.client;

import com.hzins.channel.api.model.common.CommonResult;
import com.hzins.channel.api.model.info.FinancialInfo;
import com.hzins.channel.api.model.req.ApiPartnerInsureReq;
import com.hzins.channel.api.model.req.AppPrePayReq;
import com.hzins.channel.api.model.req.CarInsureDetailReq;
import com.hzins.channel.api.model.req.CarPreInsureReq;
import com.hzins.channel.api.model.req.CarPrePayReq;
import com.hzins.channel.api.model.req.CpsPayReq;
import com.hzins.channel.api.model.req.CpsPreInsureReq;
import com.hzins.channel.api.model.req.IncomeDetailReq;
import com.hzins.channel.api.model.req.InsureDetailReq;
import com.hzins.channel.api.model.req.InsureDownloadReq;
import com.hzins.channel.api.model.req.OrderApplyReq;
import com.hzins.channel.api.model.req.OrderCancelReq;
import com.hzins.channel.api.model.req.OrderDetailReq;
import com.hzins.channel.api.model.req.OrderSearchReq;
import com.hzins.channel.api.model.req.PrePayReq;
import com.hzins.channel.api.model.req.ProductDetailReq;
import com.hzins.channel.api.model.req.ProductListReq;
import com.hzins.channel.api.model.req.RegisterReq;
import com.hzins.channel.api.model.req.SettlementBillDetailReq;
import com.hzins.channel.api.model.req.SettlementBillTotalReq;
import com.hzins.channel.api.model.req.SettlementDetailReq;
import com.hzins.channel.api.model.req.SettlementReq;
import com.hzins.channel.api.model.resp.ApiPartnerInsureResp;
import com.hzins.channel.api.model.resp.AppPrePayResp;
import com.hzins.channel.api.model.resp.CarInsureDetailResp;
import com.hzins.channel.api.model.resp.CarPreInsureResp;
import com.hzins.channel.api.model.resp.CarPrePayResp;
import com.hzins.channel.api.model.resp.CpsPayResp;
import com.hzins.channel.api.model.resp.CpsPreInsureResp;
import com.hzins.channel.api.model.resp.IncomeDetailResp;
import com.hzins.channel.api.model.resp.InsureDetailResp;
import com.hzins.channel.api.model.resp.InsureDownloadResp;
import com.hzins.channel.api.model.resp.OrderApplyResp;
import com.hzins.channel.api.model.resp.OrderCancelResp;
import com.hzins.channel.api.model.resp.PayResp;
import com.hzins.channel.api.model.resp.PrePayResp;
import com.hzins.channel.api.model.resp.ProductDetailResp;
import com.hzins.channel.api.model.resp.ProductListResp;
import com.hzins.channel.api.model.resp.RegisterResp;
import com.hzins.channel.api.model.resp.SearchInsureResp;
import com.hzins.channel.api.model.resp.SettlementBillDetailResp;
import com.hzins.channel.api.model.resp.SettlementBillTotalResp;
import com.hzins.channel.api.model.resp.SettlementDetailResp;

/**
 * <p>
 * 
 * 远程方法接口声明
 *
 * </p>
 * 
 * @author 李淼淼
 * @date 2016年1月7日 上午8:27:13
 * @version
 */
public interface OpenApiRemoteOperation {

    /**
     * 
     * <p>
     * 
     * 产品列表
     *
     * </p>
     * 
     * @param req
     * @return
     * 
     * @author hz15101769
     * @date 2016年1月7日 上午8:52:49
     * @version
     */
    CommonResult<ProductListResp> productList(ProductListReq req);

    /**
     * 
     * <p>
     * 
     * 产品详情
     *
     * </p>
     * 
     * @param req
     * @return
     * 
     * @author hz15101769
     * @date 2016年1月7日 上午8:56:35
     * @version
     */
    CommonResult<ProductDetailResp> productDetail(ProductDetailReq req);

    /**
     * 
     * <p>
     * 
     * 投保
     *
     * </p>
     * 
     * @param req
     * @return
     * 
     * @author hz15101769
     * @date 2016年1月6日 下午4:55:04
     * @version
     */
    public CommonResult<OrderApplyResp> orderApply(OrderApplyReq req);

    /**
     * 
     * <p>
     * 
     * 退保
     *
     * </p>
     * 
     * @param req
     * @return
     * 
     * @author hz15101769
     * @date 2016年1月7日 上午9:05:18
     * @version
     */
    CommonResult<OrderCancelResp> orderCancel(OrderCancelReq req);

    /**
     * 
     * <p>
     * 
     * 保单下载
     *
     * </p>
     * 
     * @param req
     * @return
     * 
     * @author hz15101769
     * @date 2016年1月7日 上午9:05:26
     * @version
     */
    CommonResult<InsureDownloadResp> download(InsureDownloadReq req);

    /**
     * 
     * <p>
     * 
     * CPS支付
     *
     * </p>
     * 
     * @param req
     * @return
     * 
     * @author hz15101769
     * @date 2016年1月7日 上午9:05:45
     * @version
     */
    CommonResult<CpsPayResp> cpsPay(CpsPayReq req);

    /**
     * 
     * <p>
     * 
     * 8.API支付
     *
     * </p>
     * 
     * @param req
     * @return
     * 
     * @author hz15101769
     * @date 2016年1月7日 上午9:05:55
     * @version
     */
    CommonResult<PrePayResp> prePay(PrePayReq req);

    /**
     * 
     * <p>
     * 
     * APP支付
     *
     * </p>
     * 
     * @param req
     * @return
     * 
     * @author hz15101769
     * @date 2016年1月7日 上午9:06:14
     * @version
     */
    CommonResult<AppPrePayResp> appPrePay(AppPrePayReq req);

    /**
     * 
     * <p>
     * 
     * 渠道注册
     *
     * </p>
     * 
     * @param req
     * @return
     * 
     * @author hz15101769
     * @date 2016年1月7日 上午9:06:26
     * @version
     */
    CommonResult<RegisterResp> register(RegisterReq req);

    /**
     * 
     * <p>
     * 
     * 投保单查询
     *
     * </p>
     * 
     * @param req
     * @return
     * 
     * @author hz15101769
     * @date 2016年1月7日 上午9:06:40
     * @version
     */
    CommonResult<SearchInsureResp> orderDetail(OrderDetailReq req);

    /**
     * 
     * <p>
     * 
     * 批量查询保单（分页）
     *
     * </p>
     * 
     * @param req
     * @return
     * 
     * @author hz15101769
     * @date 2016年1月7日 上午9:07:22
     * @version
     */
    CommonResult<SearchInsureResp> orderSearch(OrderSearchReq req);

    /**
     * 
     * <p>
     * 
     * 投保单详情
     *
     * </p>
     * 
     * @param req
     * @return
     * 
     * @author hz15101769
     * @date 2016年1月7日 上午9:07:29
     * @version
     */
    CommonResult<InsureDetailResp> insureDetail(InsureDetailReq req);

    /**
     * 
     * <p>
     * 
     * 服务费结算
     *
     * </p>
     * 
     * @param req
     * @return
     * 
     * @author hz15101769
     * @date 2016年1月7日 上午9:07:45
     * @version
     */
    CommonResult<FinancialInfo> submitSettlement(SettlementReq req);

    /**
     * 
     * <p>
     * 
     * 服务费明细
     *
     * </p>
     * 
     * @param req
     * @return
     * 
     * @author hz15101769
     * @date 2016年1月7日 上午9:08:12
     * @version
     */
    CommonResult<SettlementDetailResp> settlementDetail(SettlementDetailReq req);

    /**
     * 
     * <p>
     * 
     * 结算申请明细
     *
     * </p>
     * 
     * @param req
     * @return
     * 
     * @author hz15101769
     * @date 2016年1月7日 上午9:08:30
     * @version
     */
    CommonResult<SettlementBillDetailResp> settlementBillDetail(SettlementBillDetailReq req);

    /**
     * 
     * <p>
     * 
     * 结算申请汇总
     *
     * </p>
     * 
     * @param req
     * @return
     * 
     * @author hz15101769
     * @date 2016年1月7日 上午9:08:44
     * @version
     */
    CommonResult<SettlementBillTotalResp> settlementBillTotal(SettlementBillTotalReq req);

    /**
     * 
     * <p>
     * 
     * 服务费按月汇总
     *
     * </p>
     * 
     * @param req
     * @return
     * 
     * @author hz15101769
     * @date 2016年1月7日 上午9:09:09
     * @version
     */
    CommonResult<IncomeDetailResp> incomeDetail(IncomeDetailReq req);
    
    /**
     * 
     * <p>
     * 
     *支付，返回html
     *
     * </p>
     * @param req
     * @return
     *  
     * @author	hz15101769 
     * @date	2016年3月18日 上午8:52:10
     * @version
     */
    CommonResult<PayResp> pay(PrePayReq req);
    
    /**
     * 
     * <p>
     * 
     *车险预投保
     *
     * </p>
     * @param req
     * @return
     *  
     * @author	hz15101769 
     * @date	2016年3月18日 上午8:55:48
     * @version
     */
    CommonResult<CarPreInsureResp> carPreInsure(CarPreInsureReq req);
    
    /**
     * 
     * <p>
     * 
     *车险预支付
     *
     * </p>
     * @param req
     * @return
     *  
     * @author	hz15101769 
     * @date	2016年3月18日 上午8:54:58
     * @version
     */
    CommonResult<CarPrePayResp> carPrePay(CarPrePayReq req);
    
    /**
     * 
     * <p>
     * 
     *车险订单查询
     *
     * </p>
     * @param req
     * @return
     *  
     * @author	hz15101769 
     * @date	2016年3月18日 上午8:56:51
     * @version
     */
    CommonResult<CarInsureDetailResp> carInsureDetail(CarInsureDetailReq req);
    
    /**
     * 
     * <p>
     * 
     *cps 预投保
     *
     * </p>
     * @param req
     * @return
     *  
     * @author	hz15101769 
     * @date	2016年3月18日 上午8:57:48
     * @version
     */
    CommonResult<CpsPreInsureResp> cpsPreInsure(CpsPreInsureReq req);
    
    
    /**
     * 
     * <p>
     * 
     *cps投保单详情
     *
     * </p>
     * @param req
     * @return
     *  
     * @author	hz15101769 
     * @date	2016年3月18日 上午8:58:39
     * @version
     */
    CommonResult<ApiPartnerInsureResp> partnerInsureDetail(ApiPartnerInsureReq req);
}
