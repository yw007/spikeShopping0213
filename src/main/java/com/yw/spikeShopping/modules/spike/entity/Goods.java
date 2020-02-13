package com.yw.spikeShopping.modules.spike.entity;

import java.math.BigDecimal;

/**
 * @Description 货品类
 * @Author yue
 * @Date 2020/2/13 10:36
 */
public class Goods {
    /**
     * 货物id
     */
    private Long id;
    /**
     * 货物码编号
     */
    private String goodNumber;
    /**
     * 货物名称
     */
    private String name;
    /**
     * 货物总量
     */
    private Integer total;
    /**
     * 货物原价
     */
    private BigDecimal originalPrice;
    /**
     * 秒杀价格
     */
    private BigDecimal spikePrice;
    /**
     * 秒杀数量
     */
    private Integer spikeAmount;
}
