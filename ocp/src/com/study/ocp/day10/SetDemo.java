package com.study.ocp.day10;
import java.util.HashSet; 
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
public class SetDemo {

	public static void main(String[] args) {
		// HashSet 集合內容 element 不重複 且 不依序排序 
		Set hashSet = new HashSet();
		hashSet.add("國文");
		hashSet.add(100);
		hashSet.add("數學");
		hashSet.add(90);
		hashSet.add("英文");		
		hashSet.add(80);
		hashSet.add("英文");       // 不重複
		hashSet.add(80);	      // 不重複
		System.out.println(hashSet); //[80, 100, 國文, 英文, 90, 數學]
		
		// LinkedHashSet 集合內容 element 不重複 且 依序排序
		Set linkedHashSet = new LinkedHashSet();
		linkedHashSet.add("國文");
		linkedHashSet.add(100);
		linkedHashSet.add("數學");
		linkedHashSet.add(90);
		linkedHashSet.add("英文");
		linkedHashSet.add(80);
		linkedHashSet.add("英文"); // 不重複
		linkedHashSet.add(80);	  // 不重複
		System.out.println(linkedHashSet); //[國文, 100, 數學, 90, 英文, 80]
		
		Set hashSet2 = new HashSet();
		hashSet2.add("國文");
		hashSet2.add(100);
		hashSet2.add("數學");
		hashSet2.add(90);
		hashSet2.add("英文");		
		hashSet2.add(80);
		hashSet2.add(null);
		int sum =0 ;
		int sum2 = 0;
		Iterator iter = hashSet2.iterator();
		// 尋訪每一個 element		
		while(iter.hasNext()) {
			Object object = iter.next();
			System.out.printf("%s %s\n", object, object==null?null:object.getClass());
			// 將 null 移除
			if(object == null) {
				iter.remove();
			}
			// 將 Integer 的元素過濾出並相加
			if(object instanceof Integer) {
				sum+= (Integer)object;
			}		
			// 利用 instanceof 來判斷型別
			if(object instanceof Integer) {
				sum2 += (Integer)object;
			}
		}			
		System.out.println(hashSet2);
		System.out.println(sum);
		System.out.println(sum2);
	}
}
