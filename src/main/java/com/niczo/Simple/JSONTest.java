package com.niczo.Simple;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.Arrays;

public class JSONTest {

	public static void main(String[] args) {
		String data = getData();
		String[] datas = data.split("\n");
		System.out.println("总共"+datas.length+"条数据");
		Arrays.stream(datas).forEach(s -> {
			try {
				System.out.println(s);
				JSON.parseObject(s);
			} catch (Exception e) {
				System.out.println("问题数据:" + s);
				e.printStackTrace();
			}
		});
	}


	public static String getData(){
		String data = "{\"deliveryTime\":\"-\",\"productCode\":\"C06MG02000100\",\"productSpecifications\":\"KLS-III(40/70)\",\"receiptTime\":\"-\",\"unitName\":\"个\"}\n" +
				"{\"deliveryTime\":\"-\",\"productCode\":\"C06LD01000005\",\"productSpecifications\":\"5*60mm\",\"receiptTime\":\"-\",\"unitName\":\"个\"}\n" +
				"{\"deliveryTime\":\"-\",\"productCode\":\"C06SP01000010\",\"productSpecifications\":\"M8*60mm\",\"receiptTime\":\"-\",\"unitName\":\"个\"}\n" +
				"{\"color\":\"HMD0494-1(哑光)\",\"deliveryTime\":\"-\",\"productCode\":\"C03FM0807P050\",\"productSpecifications\":\"AA-FM-II/8.0P-35mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"2400*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HMD0494-1(哑光)\",\"deliveryTime\":\"-\",\"productCode\":\"C02FM0409L080\",\"productSpecifications\":\"E1-FM-I/0.8L-45MM\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"2400*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HMD0494-1(哑光)\",\"deliveryTime\":\"-\",\"productCode\":\"C03FM0807P050\",\"productSpecifications\":\"AA-FM-II/8.0P-35mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"1200*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HMD0494-1(哑光)\",\"deliveryTime\":\"-\",\"productCode\":\"C03FM0807P050\",\"productSpecifications\":\"AA-FM-II/8.0P-35mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"1600*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HMD0494-1(哑光)\",\"deliveryTime\":\"-\",\"productCode\":\"C03FM0807P050\",\"productSpecifications\":\"AA-FM-II/8.0P-35mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"1800*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HMD0494-1(哑光)\",\"deliveryTime\":\"-\",\"productCode\":\"C03FM0807P050\",\"productSpecifications\":\"AA-FM-II/8.0P-35mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"1900*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HMD0494-1(哑光)\",\"deliveryTime\":\"-\",\"productCode\":\"C03FM0807P050\",\"productSpecifications\":\"AA-FM-II/8.0P-35mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"2100*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HMD0494-1(哑光)\",\"deliveryTime\":\"-\",\"productCode\":\"C03FM0807P050\",\"productSpecifications\":\"AA-FM-II/8.0P-35mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"2200*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HMD0494-1(哑光)\",\"deliveryTime\":\"-\",\"productCode\":\"C03FM0807P050\",\"productSpecifications\":\"AA-FM-II/8.0P-35mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"2300*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HST0968-1\",\"deliveryTime\":\"-\",\"productCode\":\"C02FS0605P050\",\"productSpecifications\":\"G1-FS-I/8.0P-30mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"1200*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HST0968-1\",\"deliveryTime\":\"-\",\"productCode\":\"C02FS0605P050\",\"productSpecifications\":\"G1-FS-I/8.0P-30mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"1800*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HST0968-1\",\"deliveryTime\":\"-\",\"productCode\":\"C02FS0605P050\",\"productSpecifications\":\"G1-FS-I/8.0P-30mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"2300*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HST0968-1\",\"deliveryTime\":\"-\",\"productCode\":\"C02FS0605P050\",\"productSpecifications\":\"G1-FS-I/8.0P-30mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"2440*1220\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HST0968-1\",\"deliveryTime\":\"-\",\"productCode\":\"C02FS0622P050\",\"productSpecifications\":\"G1-FS-I/8.0P-110mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"2440*1220\",\"unitName\":\"平方米\"}\n" +
				"{\"deliveryTime\":\"-\",\"productCode\":\"C06MG02000130\",\"productSpecifications\":\"KZS-I(20)\",\"receiptTime\":\"-\",\"unitName\":\"个\"}\n" +
				"{\"deliveryTime\":\"-\",\"productCode\":\"C06LD01000010\",\"productSpecifications\":\"5*80mm\",\"receiptTime\":\"-\",\"unitName\":\"个\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C02FS0626P050\",\"productSpecifications\":\"G1-FS-I/8.0P-130mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"2440*1220\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C02FS0646P050\",\"productSpecifications\":\"G1-FS-I/8.0P-230mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"2440*1220\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C02FS0652P050\",\"productSpecifications\":\"G1-FS-I/8.0P-260mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"2440*1220\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C02FS0632P050\",\"productSpecifications\":\"G1-FS-I/8.0P-160mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"2440*1220\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条八-1m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"咖啡色\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条三十六铝-1.6m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"咖啡色\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条三十六铝-1.7m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"咖啡色\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条三十六铝-1.8m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"咖啡色\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条三十六铝-1.9m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"咖啡色\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条三十六铝-2.2m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"咖啡色\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条三十六铝-2.25m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"咖啡色\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条三十六铝-2.45m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条二-1.1m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条二-1m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条三十-1.3m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条三十-1.4m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条四十七\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条二-1.2m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C02FS0609P060\",\"productSpecifications\":\"G1-FS-I/8.0P-60mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"2440*1220\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C02FS0620P050\",\"productSpecifications\":\"G1-FS-I/8.0P-100mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"2440*1220\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C02FS0609P060\",\"productSpecifications\":\"G1-FS-I/8.0P-60mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"1900*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条六-1.4m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条七-1.4m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条九-1m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条八-1.2m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条九-1.4m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条八-1.1m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条七-1m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条七-1.2m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条九-0.8m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条八-1.4m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条三十四\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条三十五\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条八-1.3m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条九-1.1m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"咖啡色\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条三十九铝-1m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条七-1.1m\",\"unitName\":\"根\"}\n" +
				"{\"deliveryTime\":\"-\",\"productCode\":\"T00J00107C010\",\"productSpecifications\":\"25kg/袋\",\"receiptTime\":\"-\",\"unitName\":\"袋\"}\n" +
				"{\"color\":\"咖啡色\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条四十铝-1m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"咖啡色\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条四十八铝-2.25m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"咖啡色\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条四十八铝-2.45m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"咖啡色\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条四十八铝-2.65m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"咖啡色\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条四十八铝-2.05m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"咖啡色\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条四十八铝-1.5m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条花板\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"咖啡色\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条三十六铝-2.65m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"咖啡色\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条四十八铝-2.2m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"咖啡色\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条四十八铝-2.15m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"咖啡色\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条四十八铝-2.5m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"咖啡色\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条四十八铝-2.7m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"咖啡色\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条四十八铝-1.8m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"咖啡色\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条四十八铝-1.4m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"咖啡色\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条四十八铝-1.7m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条四十二\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"咖啡色\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条四十八铝-1.85m\",\"unitName\":\"根\"}\n" +
				"{\"deliveryTime\":\"-\",\"productCode\":\"C06MG02000095\",\"productSpecifications\":\"KLS-III(120/150)\",\"receiptTime\":\"-\",\"unitName\":\"个\"}\n" +
				"{\"deliveryTime\":\"-\",\"productCode\":\"C06MG02000140\",\"productSpecifications\":\"KZS-I(60)\",\"receiptTime\":\"-\",\"unitName\":\"个\"}\n" +
				"{\"color\":\"咖啡色\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条四十八铝-1.6m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"咖啡色\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条四十八铝-1.9m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C02FS0609P060\",\"productSpecifications\":\"G1-FS-I/8.0P-60mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"1300*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"咖啡色\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条三十八铝-2.05m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"咖啡色\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条三十八铝-2.5m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"咖啡色\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条三十七铝-2.5m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"咖啡色\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条三十七铝-1.5m\",\"unitName\":\"根\"}\n" +
				"{\"deliveryTime\":\"-\",\"productCode\":\"C06MG02000160\",\"productSpecifications\":\"GLS85*60，厚度：1.5mm\",\"receiptTime\":\"-\",\"unitName\":\"个\"}\n" +
				"{\"color\":\"咖啡色\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条三十八铝-2.15m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"咖啡色\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条三十七铝-2.05m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"咖啡色\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条三十七铝-2.15m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"咖啡色\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条三十七铝-1.4m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"咖啡色\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条三十八铝-1.5m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"咖啡色\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条三十八铝-2.7m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"咖啡色\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条三十七铝-1.85m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"咖啡色\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条三十七铝-2.7m\",\"unitName\":\"根\"}\n" +
				"{\"deliveryTime\":\"-\",\"productCode\":\"C06MG02000161\",\"productSpecifications\":\"GLS-150/100\",\"receiptTime\":\"-\",\"unitName\":\"个\"}\n" +
				"{\"color\":\"咖啡色\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条三十八铝-1.85m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000030\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条三十\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000030\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条四十三\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000030\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条四十六\",\"unitName\":\"根\"}\n" +
				"{\"deliveryTime\":\"-\",\"productCode\":\"T00J00104C020\",\"productSpecifications\":\"25kg/袋\",\"receiptTime\":\"-\",\"unitName\":\"袋\"}\n" +
				"{\"deliveryTime\":\"-\",\"productCode\":\"T00J00104C050\",\"productSpecifications\":\"25kg/袋\",\"receiptTime\":\"-\",\"unitName\":\"袋\"}\n" +
				"{\"color\":\"HST0968-1\",\"deliveryTime\":\"-\",\"productCode\":\"C02FS0622P050\",\"productSpecifications\":\"G1-FS-I/8.0P-110mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"2300*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HST0968-1\",\"deliveryTime\":\"-\",\"productCode\":\"C01FS0100P050\",\"productSpecifications\":\"FS-8.0P\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"2440*1220\",\"unitName\":\"平方米\"}\n" +
				"{\"deliveryTime\":\"-\",\"productCode\":\"C06TF01000000\",\"productSpecifications\":\"0.8cm\",\"receiptTime\":\"-\",\"unitName\":\"米\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条二\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条六-1m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条六-1.1m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条六-1.2m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条四十五\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条八\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条九\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条四十一\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条三十二-1.4m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000030\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条二\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条三十二-1m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000030\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条四十五\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条四十九-1m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条三十三-1m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条三十三-1.1m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条八-0.8m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条三十二-1.2m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条五十\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条三十三-1.2m\",\"unitName\":\"根\"}\n" +
				"{\"deliveryTime\":\"-\",\"productCode\":\"C06GJ02000000\",\"productSpecifications\":\"彩色 500ml/支\",\"receiptTime\":\"-\",\"unitName\":\"支\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C02FS0616P050\",\"productSpecifications\":\"G1-FS-I/8.0P-80mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"2440*1220\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C02FS0605P050\",\"productSpecifications\":\"G1-FS-I/8.0P-30mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"2440*1220\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C02FS0616P050\",\"productSpecifications\":\"G1-FS-I/8.0P-80mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"1800*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条九-1.2m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条三十三-1.4m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条四十四-1m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条三十-1.2m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HST1813-1\",\"deliveryTime\":\"-\",\"productCode\":\"C02FS0605P050\",\"productSpecifications\":\"G1-FS-I/8.0P-30mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"2440*1220\",\"unitName\":\"平方米\"}\n" +
				"{\"deliveryTime\":\"-\",\"productCode\":\"C06GJ01000000\",\"productSpecifications\":\"黑色 500ml/支\",\"receiptTime\":\"-\",\"unitName\":\"支\"}\n" +
				"{\"deliveryTime\":\"-\",\"productCode\":\"C06MG02000090\",\"productSpecifications\":\"KLS-III(30/50)\",\"receiptTime\":\"-\",\"unitName\":\"个\"}\n" +
				"{\"color\":\"咖啡色\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条三十八铝-1.4m\",\"unitName\":\"根\"}\n" +
				"{\"deliveryTime\":\"-\",\"productCode\":\"C06MG02000096\",\"productSpecifications\":\"KLS-III-(160/220)\",\"receiptTime\":\"-\",\"unitName\":\"个\"}\n" +
				"{\"color\":\"HST1813-1\",\"deliveryTime\":\"-\",\"productCode\":\"C01FS0100P050\",\"productSpecifications\":\"FS-8.0P\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"2440*1220\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HST1813-1\",\"deliveryTime\":\"-\",\"productCode\":\"C02FS0605P050\",\"productSpecifications\":\"G1-FS-I/8.0P-30mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"2300*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HST1813-1\",\"deliveryTime\":\"-\",\"productCode\":\"C02FS0605P050\",\"productSpecifications\":\"G1-FS-I/8.0P-30mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"2100*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HST1813-1\",\"deliveryTime\":\"-\",\"productCode\":\"C02FS0605P050\",\"productSpecifications\":\"G1-FS-I/8.0P-30mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"1700*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HST1813-1\",\"deliveryTime\":\"-\",\"productCode\":\"C02FS0605P050\",\"productSpecifications\":\"G1-FS-I/8.0P-30mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"1600*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HST1813-1\",\"deliveryTime\":\"-\",\"productCode\":\"C02FS0605P050\",\"productSpecifications\":\"G1-FS-I/8.0P-30mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"1400*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HUD0536-1\",\"deliveryTime\":\"-\",\"productCode\":\"C03FC0805K050\",\"productSpecifications\":\"AA-FC-II/8.0K-30mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"2400*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HUD0537-1\",\"deliveryTime\":\"-\",\"productCode\":\"C03FC0805K050\",\"productSpecifications\":\"AA-FC-II/8.0K-30mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"2400*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HUD0537-1\",\"deliveryTime\":\"-\",\"productCode\":\"C03FC0805K050\",\"productSpecifications\":\"AA-FC-II/8.0K-30mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"1600*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HUD0536-1\",\"deliveryTime\":\"-\",\"productCode\":\"C01FC0100K050\",\"productSpecifications\":\"FC-8.0K\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"2440*1220\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HUA0538-1\",\"deliveryTime\":\"-\",\"productCode\":\"C03FC0805K050\",\"productSpecifications\":\"AA-FC-II/8.0K-30mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"2400*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HUD0539-1\",\"deliveryTime\":\"-\",\"productCode\":\"C03FC0805K050\",\"productSpecifications\":\"AA-FC-II/8.0K-30mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"2400*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HZA0277-1\",\"deliveryTime\":\"-\",\"productCode\":\"C02FC0605P050\",\"productSpecifications\":\"G1-FC-I/8.0P-30mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"2440*1220\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C02FS0609P060\",\"productSpecifications\":\"G1-FS-I/8.0P-60mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"2300*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条三十五-1.05m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条三十四-1.05m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"咖啡色\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条四十八（铝）\",\"unitName\":\"根\"}\n" +
				"{\"deliveryTime\":\"-\",\"productCode\":\"C06MG02000050\",\"productSpecifications\":\"KLS-I(30/50)\",\"receiptTime\":\"-\",\"unitName\":\"个\"}\n" +
				"{\"color\":\"HSP2288-1\",\"deliveryTime\":\"-\",\"productCode\":\"C03FS0803K050\",\"productSpecifications\":\"AA-FS-II/8.0K-20mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"2400*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HSP2288-1\",\"deliveryTime\":\"-\",\"productCode\":\"C03FS0803K050\",\"productSpecifications\":\"AA-FS-II/8.0K-20mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"1600*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HSP2288-1\",\"deliveryTime\":\"-\",\"productCode\":\"C03FS0803K050\",\"productSpecifications\":\"AA-FS-II/8.0K-20mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"2200*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HST1813-1\",\"deliveryTime\":\"-\",\"productCode\":\"C02FS0605P050\",\"productSpecifications\":\"G1-FS-I/8.0P-30mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"2000*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HST1813-1\",\"deliveryTime\":\"-\",\"productCode\":\"C02FS0605P050\",\"productSpecifications\":\"G1-FS-I/8.0P-30mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"1900*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HST0968-1\",\"deliveryTime\":\"-\",\"productCode\":\"C02FS0605P050\",\"productSpecifications\":\"G1-FS-I/8.0P-30mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"1700*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"30\",\"deliveryTime\":\"-\",\"productCode\":\"Z00R122000001\",\"productSpecifications\":\"35KG\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"1220*610\",\"unitName\":\"立方米\"}\n" +
				"{\"color\":\"30\",\"deliveryTime\":\"-\",\"productCode\":\"Z00R120000001\",\"productSpecifications\":\"33KG\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"1220*610\",\"unitName\":\"立方米\"}\n" +
				"{\"color\":\"HST1813-1\",\"deliveryTime\":\"-\",\"productCode\":\"C02FS0605P050\",\"productSpecifications\":\"G1-FS-I/8.0P-30mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"2200*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HST1813-1\",\"deliveryTime\":\"-\",\"productCode\":\"C02FS0605P050\",\"productSpecifications\":\"G1-FS-I/8.0P-30mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"1200*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HSP2288-1\",\"deliveryTime\":\"-\",\"productCode\":\"C03FS0803K050\",\"productSpecifications\":\"AA-FS-II/8.0K-20mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"1900*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HSP2288-1\",\"deliveryTime\":\"-\",\"productCode\":\"C03FS0803K050\",\"productSpecifications\":\"AA-FS-II/8.0K-20mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"2000*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HSP2288-1\",\"deliveryTime\":\"-\",\"productCode\":\"C03FS0803K050\",\"productSpecifications\":\"AA-FS-II/8.0K-20mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"2300*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000030\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条五十\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HST1813-1\",\"deliveryTime\":\"-\",\"productCode\":\"C02FS0605P050\",\"productSpecifications\":\"G1-FS-I/8.0P-30mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"1800*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C02FS0626P050\",\"productSpecifications\":\"G1-FS-I/8.0P-130mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条五十\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HST0968-1\",\"deliveryTime\":\"-\",\"productCode\":\"C02FS0605P050\",\"productSpecifications\":\"G1-FS-I/8.0P-30mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"2000*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HST0968-1\",\"deliveryTime\":\"-\",\"productCode\":\"C02FS0605P050\",\"productSpecifications\":\"G1-FS-I/8.0P-30mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"1600*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HST0968-1\",\"deliveryTime\":\"-\",\"productCode\":\"C02FS0605P050\",\"productSpecifications\":\"G1-FS-I/8.0P-30mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"1500*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HST1813-1\",\"deliveryTime\":\"-\",\"productCode\":\"C02FS0618P050\",\"productSpecifications\":\"G1-FS-I/8.0P-90mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"2440*1220\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HST1813-1\",\"deliveryTime\":\"-\",\"productCode\":\"C02FS0618P050\",\"productSpecifications\":\"G1-FS-I/8.0P-90mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"1900*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条四十三\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C05XT02000000\",\"productSpecifications\":\"详见颜色尺寸\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条三十二-1.1m\",\"unitName\":\"根\"}\n" +
				"{\"color\":\"FS-110\",\"deliveryTime\":\"-\",\"productCode\":\"C02FS0605P050\",\"productSpecifications\":\"G1-FS-I/8.0P-30mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"2440*1220\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HST1813-1\",\"deliveryTime\":\"-\",\"productCode\":\"C02FS0605P050\",\"productSpecifications\":\"G1-FS-I/8.0P-30mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"1500*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HSP1509-1\",\"deliveryTime\":\"-\",\"productCode\":\"C02FS0605P050\",\"productSpecifications\":\"G1-FS-I/8.0P-30mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"烟台融创宝山线条四十二\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HSP2288-1\",\"deliveryTime\":\"-\",\"productCode\":\"C03FS0803K050\",\"productSpecifications\":\"AA-FS-II/8.0K-20mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"1400*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HST1813-1\",\"deliveryTime\":\"-\",\"productCode\":\"C02FS0605P050\",\"productSpecifications\":\"G1-FS-I/8.0P-30mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"1300*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HST1813-1\",\"deliveryTime\":\"-\",\"productCode\":\"C02FS0618P050\",\"productSpecifications\":\"G1-FS-I/8.0P-90mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"2200*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HST1813-1\",\"deliveryTime\":\"-\",\"productCode\":\"C02FS0618P050\",\"productSpecifications\":\"G1-FS-I/8.0P-90mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"1600*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HST0968-1\",\"deliveryTime\":\"-\",\"productCode\":\"C02FS0622P050\",\"productSpecifications\":\"G1-FS-I/8.0P-110mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"1700*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"20\",\"deliveryTime\":\"-\",\"productCode\":\"Z00R122000001\",\"productSpecifications\":\"35KG\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"1220*610\",\"unitName\":\"立方米\"}\n" +
				"{\"color\":\"FS-110\",\"deliveryTime\":\"-\",\"productCode\":\"C02FS0605P050\",\"productSpecifications\":\"G1-FS-I/8.0P-30mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"2100*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"FS-110\",\"deliveryTime\":\"-\",\"productCode\":\"C02FS0605P050\",\"productSpecifications\":\"G1-FS-I/8.0P-30mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"1800*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"FS-110\",\"deliveryTime\":\"-\",\"productCode\":\"C02FS0605P050\",\"productSpecifications\":\"G1-FS-I/8.0P-30mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"1700*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"FS-110\",\"deliveryTime\":\"-\",\"productCode\":\"C02FS0605P050\",\"productSpecifications\":\"G1-FS-I/8.0P-30mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"1300*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HUA0538-1\",\"deliveryTime\":\"-\",\"productCode\":\"C03FC0805K050\",\"productSpecifications\":\"AA-FC-II/8.0K-30mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"1900*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HUD0536-1\",\"deliveryTime\":\"-\",\"productCode\":\"C03FC0805K050\",\"productSpecifications\":\"AA-FC-II/8.0K-30mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"2000*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HUD0536-1\",\"deliveryTime\":\"-\",\"productCode\":\"C03FC0805K050\",\"productSpecifications\":\"AA-FC-II/8.0K-30mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"1700*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"deliveryTime\":\"-\",\"productCode\":\"T00J00102C170\",\"productSpecifications\":\"25kg/袋\",\"receiptTime\":\"-\",\"unitName\":\"袋\"}\n" +
				"{\"color\":\"HUD0537-1\",\"deliveryTime\":\"-\",\"productCode\":\"C03FC0805K050\",\"productSpecifications\":\"AA-FC-II/8.0K-30mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"1900*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HUD0537-1\",\"deliveryTime\":\"-\",\"productCode\":\"C03FC0805K050\",\"productSpecifications\":\"AA-FC-II/8.0K-30mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"1200*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HUD0536-1\",\"deliveryTime\":\"-\",\"productCode\":\"C03FC0805K050\",\"productSpecifications\":\"AA-FC-II/8.0K-30mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"1900*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"FS-110\",\"deliveryTime\":\"-\",\"productCode\":\"C02FS0605P050\",\"productSpecifications\":\"G1-FS-I/8.0P-30mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"2300*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"FS-110\",\"deliveryTime\":\"-\",\"productCode\":\"C02FS0605P050\",\"productSpecifications\":\"G1-FS-I/8.0P-30mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"1600*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HUD0537-1\",\"deliveryTime\":\"-\",\"productCode\":\"C03FC0805K050\",\"productSpecifications\":\"AA-FC-II/8.0K-30mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"1700*1200\",\"unitName\":\"平方米\"}\n" +
				"{\"color\":\"HUD0537-1\",\"deliveryTime\":\"-\",\"productCode\":\"C03FC0805K050\",\"productSpecifications\":\"AA-FC-II/8.0K-30mm\",\"receiptTime\":\"-\",\"replenishment\":\"-\",\"size\":\"1500*1200\",\"unitName\":\"平方米\"}";
		return data;
	}

}

class User {
	private String name;

	public String getName(){
		return "李鸿程";
	}

	public String getSex() {
		return "Male";
	}

	public Integer getAge() {
		return 18;
	}
}
