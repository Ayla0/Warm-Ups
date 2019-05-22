package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import functions.SortAndMerge;
import functions.SortList;

class Tests {

	static SortAndMerge sortAndMerge;
	static SortList sortList;
	
	@BeforeAll
	static void before() {
		sortList = new SortList();
	}

	@AfterAll
	static void after() {
		sortList = null;
	}

	@BeforeEach
	void beforeEach() {
		sortAndMerge = new SortAndMerge();
	}
	
	@AfterEach
	void afterEach() {
		sortAndMerge = null;
	}

	@Test
	void testSortListBasic() {
		List<String> l1 = Arrays.asList("b", "a", "c");
		List<String> l2 = Arrays.asList("a", "b", "c");
		l1 = sortList.sortList(l1);
		assertEquals(l1, l2);
	}
	
	@Test
	void testSortListEmpty() {
		List<String> l1 = Arrays.asList();
		List<String> l2 = Arrays.asList();
		l1 = sortList.sortList(l1);
		assertEquals(l1, l2);
	}
	
	@Test
	void testSortListDuplicate() {
		List<String> l1 = Arrays.asList("a", "b", "a");
		List<String> l2 = Arrays.asList("a", "a", "b");
		l1 = sortList.sortList(l1);
		assertEquals(l1, l2);
	}
	
	@Test
	void testSortAndMergeMerge() {
		List<Object> l1 = Arrays.asList("a", "c", "e");
		sortAndMerge.addList(l1);
		List<Object> l2 = Arrays.asList("b", "d", "f");
		sortAndMerge.addList(l2);
		List<Object> l3 = Arrays.asList("a", "b", "c", "d", "e", "f");
		assertEquals(sortAndMerge.getList(), l3);
	}
	
	@Test
	void testSortAndMergeSort() {
		List<Object> l1 = Arrays.asList("e", "a", "c");
		sortAndMerge.addList(l1);
		List<Object> l2 = Arrays.asList("b", "f", "d");
		sortAndMerge.addList(l2);
		List<Object> l3 = Arrays.asList("a", "b", "c", "d", "e", "f");
		assertEquals(sortAndMerge.getList(), l3);
	}
	
	@Test
	void testSortAndMergeLeftFirst() {
		List<Object> l1 = Arrays.asList("a", "b", "c");
		sortAndMerge.addList(l1);
		List<Object> l2 = Arrays.asList("d", "e", "f");
		sortAndMerge.addList(l2);
		List<Object> l3 = Arrays.asList("a", "b", "c", "d", "e", "f");
		assertEquals(sortAndMerge.getList(), l3);
	}
	
	@Test
	void testSortAndMergeRightFirst() {
		List<Object> l1 = Arrays.asList("d", "e", "f");
		sortAndMerge.addList(l1);
		List<Object> l2 = Arrays.asList("a", "b", "c");
		sortAndMerge.addList(l2);
		List<Object> l3 = Arrays.asList("a", "b", "c", "d", "e", "f");
		assertEquals(sortAndMerge.getList(), l3);
	}

	@Test
	void testSortAndMergeLeftEmpty() {
		List<Object> l1 = Arrays.asList();
		sortAndMerge.addList(l1);
		List<Object> l2 = Arrays.asList("b", "c", "a");
		sortAndMerge.addList(l2);
		List<Object> l3 = Arrays.asList("a", "b", "c");
		assertEquals(sortAndMerge.getList(), l3);
	}
	
	@Test
	void testSortAndMergeRightEmpty() {
		List<Object> l1 = Arrays.asList("a", "c", "b");
		sortAndMerge.addList(l1);
		List<Object> l2 = Arrays.asList();
		sortAndMerge.addList(l2);
		List<Object> l3 = Arrays.asList("a", "b", "c");
		assertEquals(sortAndMerge.getList(), l3);
	}
	
	@Test
	void testSortAndMergeBothEmpty() {
		List<Object> l1 = Arrays.asList();
		sortAndMerge.addList(l1);
		List<Object> l2 = Arrays.asList();
		sortAndMerge.addList(l2);
		List<Object> l3 = Arrays.asList();
		assertEquals(sortAndMerge.getList(), l3);
	}
}
