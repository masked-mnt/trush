package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class UtilFromSoul {
	/**
	 * すっきりiteratorループ
	 * iteratorを使ったループ関連が汚い上統一感がないので統一したい
	 */
	private void niceRoop(){
		Map<String, Object> m = new HashMap<String, Object>();
		
		for(Iterator iter=m.keySet().iterator();iter.hasNext();){
			// ループ内で宣言。コンパイラがうまい具合に毎回同じ領域を使用してくれるらしい
			String str = (String)iter.next();
		}
	}
	
	/**
	 * 上のやつを使った例
	 */
	public boolean contains(String queClmNo, String answer){
		boolean result = false;
		String queNo = queClmNo.split("_")[0];
		String clmNo = queClmNo.split("_")[1];
		String[] answers = answer.split(",");
		List<String> ansList = new ArrayList<String>();
		ansList = Arrays.asList(answers);
		
		// ここでqueNo_clmNo の回答を取得する
		
		List<String> memberAnswerList = new ArrayList<String>();
		for(Iterator<String> iter= memberAnswerList.iterator();iter.hasNext();){
			if(ansList.contains(iter.next())){
				result = true;
				break;
			}
		}
		return result;
	}
	
	private List<String> getAnswer(String queNo, String clmNo){
		List l = null;
		return l;
	}
}
