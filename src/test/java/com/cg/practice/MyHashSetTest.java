package com.cg.practice;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MyHashSetTest {

    @Test
    public void testCreateMyHashSet() {
        MyHashSet mySet = new MyHashSet();
        Assert.assertNotNull(mySet);
        Assert.assertEquals(0, mySet.size());
    }

    @Test
    public void testAddToMyHashSet() {
        MyHashSet mySet = new MyHashSet();
        mySet.add(1);
        Assert.assertEquals(1, mySet.size());
        mySet.add(1);
        Assert.assertEquals(1, mySet.size());
        mySet.add(2);
        Assert.assertEquals(2, mySet.size());
        mySet.add(3);
        Assert.assertEquals(3, mySet.size());
        mySet.add(4);
        Assert.assertEquals(4, mySet.size());
        mySet.add(5);
        Assert.assertEquals(5, mySet.size());
        mySet.add(6);
        Assert.assertEquals(6, mySet.size());
        mySet.add(7);
        Assert.assertEquals(7, mySet.size());
        mySet.add(8);
        Assert.assertEquals(8, mySet.size());
        mySet.add(9);
        Assert.assertEquals(9, mySet.size());
        mySet.add(10);
        Assert.assertEquals(10, mySet.size());
        mySet.add(11);
        Assert.assertEquals(11, mySet.size());
    }

    @Test
    public void testContainsInMyHashSet() {
        MyHashSet mySet = new MyHashSet();
        mySet.add(5);
        mySet.add(10);

        Assert.assertTrue(mySet.contains(5));
        Assert.assertFalse(mySet.contains(15));
    }

    @Test
    public void testDeleteFromMyHashSet() {
        MyHashSet mySet = new MyHashSet();

        mySet.add(5);
        mySet.add(10);
        mySet.remove(5);

        Assert.assertEquals(1, mySet.size());
        Assert.assertFalse(mySet.contains(5));

        mySet.remove(10);
        Assert.assertEquals(0, mySet.size());

        mySet.remove(1);
        Assert.assertEquals(0, mySet.size());

    }

    @Test
    public void testDifferentDataType() {
        MyHashSet mySet = new MyHashSet();
        mySet.add(10);
        mySet.add("val");
        mySet.add(20L);

        Assert.assertEquals(3, mySet.size());
    }

}
