package functions;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class SortAndMerge {

	TreeSet<Object> set;
	
	public SortAndMerge() {
		set = new TreeSet<Object>();
	}
	
	public List<Object> getList() {
		List<Object> ret = new ArrayList<Object>(set);
		return ret;
	}
	
	public void addList(List<Object> list) {
		set.addAll(list);
	}
	
}
