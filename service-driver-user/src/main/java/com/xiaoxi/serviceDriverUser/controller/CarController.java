package com.xiaoxi.serviceDriverUser.controller;

import com.xiaoxi.interfaceCommon.dto.Car;
import com.xiaoxi.interfaceCommon.dto.ResponseResult;
import com.xiaoxi.serviceDriverUser.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class CarController {

    @Autowired
    private CarService carService;

    /**
     * 插入车辆信息
     * @param car
     * @return
     */
    @PostMapping("/car")
    public ResponseResult addCar(@RequestBody Car car) {
        return carService.addCar(car);
    }

}
