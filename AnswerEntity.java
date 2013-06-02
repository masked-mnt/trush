package entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import java.util.List;

public class AnswerEntity {
	public boolean contains(String queClmNo, String answer){
		boolean result = false;
		String queNo = queClmNo.split("_")[0];
		String clmNo = queClmNo.split("_")[1];
		String[] answers = answer.split(",");
		List<String> ansList = new ArrayList();
		ansList = Arrays.asList(answers);
		
		// queNo_clmNo の回答をリストで？取得
		List memberAnswerList = new ArrayList();
		Iterator i = memberAnswerList.iterator();
		while(i.hasNext()){
			
			if(ansList.contains(i.next())){
				result = true;
			}
		}
		
		return result;
	}
}
