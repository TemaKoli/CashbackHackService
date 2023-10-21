package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;
import  org.testng.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void AmountLessBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 800;

        int actual = service.remain(amount);
        int expected = 200;
        Assert.assertEquals(actual,expected);

    }
    @Test
    public void TestAmountMoreBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 3100;

        int actual = service.remain(amount);
        int expected = 900;

        Assert.assertEquals(actual,expected);
    }
    @Test
    public void TestBoundaryEqualsAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual,expected);
    }
}