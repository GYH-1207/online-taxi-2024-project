package com.xiaoxi.servicePrice.controller;


import com.xiaoxi.interfaceCommon.dto.PriceRule;
import com.xiaoxi.interfaceCommon.dto.ResponseResult;
import com.xiaoxi.servicePrice.service.PriceRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 小汐
 * @since 2024-01-05
 */
@RestController
@RequestMapping("/price-rule")
public class PriceRuleController {

    @Autowired
    private PriceRuleService priceRuleService;

    @PostMapping("/add")
    public ResponseResult add(@RequestBody PriceRule priceRule) {
        return priceRuleService.addPriceRule(priceRule);
    }


    @PostMapping("/edit")
    public ResponseResult edit(@RequestBody PriceRule priceRule) {
        return priceRuleService.editPriceRule(priceRule);
    }

    /**
     * 查询最新版本计价规则
     * @param fareType
     * @return
     */
    @GetMapping("/get-newest")
    public ResponseResult<PriceRule> getNewestPriceRule(@RequestParam String fareType) {
        return priceRuleService.getNewestPriceRule(fareType);
    }

    /**
     * 查询当前版本计价规则是否最新
     * @param fareType
     * @param fareVersion
     * @return
     */
    @GetMapping("/is-new")
    public ResponseResult<Boolean> isNew(@RequestParam String fareType,@RequestParam Integer fareVersion) {
        return priceRuleService.isNew(fareType,fareVersion);
    }

    @GetMapping("/if-exists")
    public ResponseResult<Boolean> isExists(@RequestBody PriceRule priceRule) {
        return priceRuleService.isExists(priceRule);
    }
}