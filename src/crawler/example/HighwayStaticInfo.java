package crawler.example;

import com.github.abola.crawler.CrawlerPack;

/**
 * 練習 高公局即時路況資12料
 * 
 * @author Abola Lee
 *
 */
//BDSE0716 pushed on 2018/4/28
public class HighwayStaticInfo {

	public static void main(String[] args) {
		
		// 遠端資料路徑
		String uri = "zip:http://plvr.land.moi.gov.tw//Download?type=zip&fileName=lvr_landxml.zip!/A_LVR_LAND_A.XML";

		System.out.println(
				CrawlerPack.start()
			    	.getFromXml(uri)
			    
		);
	}
}
