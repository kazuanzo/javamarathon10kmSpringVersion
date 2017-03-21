package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.Hotel;
import com.example.service.HotelService;

import net.arnx.jsonic.JSON;




@Controller
public class HotelController {
	
	@Autowired
	private HotelService service;
	
	/**
	 *フロント画面を表示
	 */
	@RequestMapping("serch_hotels")
	String inputForm() {	   
	 return "serch_hotels";
	}
	/**
	 *フロント画面から値を取得し、ホテルリストを返却
	 */
	@RequestMapping(value = "/hotels", method = RequestMethod.GET)
	@ResponseBody//メソッドへのリクエスト結果がJSON形式になる
	List<Hotel> getPrice(String price) {
		//取得したJson値をPOJOにデコードする
		Hotel hotel=JSON.decode(price,Hotel.class);
		 //サービスクラスを利用し、ホテルリストを取得
		List<Hotel> hotels=service.SerchHotel(hotel.getPrice());   
	 return hotels;
	}

	

}
