package io.cachola;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListTest {

    @Test
    void mergeTwoLists() {
        assertEquals(new MergeTwoSortedList.ListNode(1, new MergeTwoSortedList.ListNode(1,
                        new MergeTwoSortedList.ListNode(2, new MergeTwoSortedList.ListNode(2,
                                new MergeTwoSortedList.ListNode(3, new MergeTwoSortedList.ListNode(4)))))),
                MergeTwoSortedList.mergeTwoLists(new MergeTwoSortedList.ListNode(1,
                                new MergeTwoSortedList.ListNode(1, new MergeTwoSortedList.ListNode(2))),
                        new MergeTwoSortedList.ListNode(2,
                                new MergeTwoSortedList.ListNode(3, new MergeTwoSortedList.ListNode(4)))));
    }

    @Test
    void mergeListWithEmptyList() {
        assertEquals(new MergeTwoSortedList.ListNode(1),
                MergeTwoSortedList.mergeTwoLists(null, new MergeTwoSortedList.ListNode(1)));
    }

    @Test
    void mergeTwoEmptyLists() {
        assertNull(MergeTwoSortedList.mergeTwoLists(null, null));
    }
}