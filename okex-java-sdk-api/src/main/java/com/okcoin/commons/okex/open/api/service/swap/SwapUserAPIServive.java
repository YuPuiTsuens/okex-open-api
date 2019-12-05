package com.okcoin.commons.okex.open.api.service.swap;

import com.okcoin.commons.okex.open.api.bean.swap.param.LevelRateParam;

public interface SwapUserAPIServive {
    /**
     * 获取所有合约持仓信息
     * @return
     */
    String getAllPosition();

    /**
     * 获取单个合约持仓信息
     *
     * @param instrument_id
     * @return
     */
    String getPosition(String instrument_id);

    /**
     * 获取所有币种合约的账户信息
     *
     * @return
     */
    String getAccounts();

    /**
     * 获取某个币种合约的账户信息
     *
     * @param instrumentId
     * @return
     */
    String selectAccount(String instrumentId);

    /**
     * 获取某个合约的用户配置
     *
     * @param instrumentId
     * @return
     */
    String selectContractSettings(String instrumentId);

    /**
     * 设定某个合约的杠杆
     *
     * @param instrumentId
     * @param levelRateParam
     * @return
     */
    String updateLevelRate(String instrumentId, LevelRateParam levelRateParam);

    /**
     * 获取所有订单列表
     *
     * @param instrumentId
     * @param state
     * @param before
     * @param after
     * @param limit
     * @return
     */
    String selectOrders(String instrumentId, String state, String before, String after, String limit);

    /**
     * 通过订单orderId获取单个订单信息
     *
     * @param instrumentId
     * @param orderId
     * @return
     */
    String selectOrder(String instrumentId, String orderId);

    /**
     * 通过订单clientOid获取单个订单信息
     * @param instrumentId
     * @param clientOid
     * @return
     */
    String selectOrderByClientOid(String instrumentId,String clientOid);

    /**
     * 获取最近的成交明细列表
     * @param instrumentId
     * @param orderId
     * @param before
     * @param after
     * @param limit
     * @return
     */
    String selectDealDetail(String instrumentId, String orderId, String before, String after, String limit);

    /**
     * 列出账户资产流水，账户资产流水是指导致账户余额增加或减少的行为。
     * 流水会分页，每页100条数据，并且按照时间倒序排序和存储，最新的排在最前面。
     *
     * @param instrumentId
     * @param before
     * @param after
     * @param limit
     * @return
     */
    String getLedger(String instrumentId, String before, String after, String limit,String type);

    /**
     * 获取合约挂单冻结数量
     *
     * @param instrumentId
     * @return
     */
    String getHolds(String instrumentId);

    /**
     * 获取账户手续费费率
     * @return
     */
    String getTradeFee();
}
