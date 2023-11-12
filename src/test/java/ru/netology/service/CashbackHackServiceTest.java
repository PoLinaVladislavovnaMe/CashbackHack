package ru.netology.service;


import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

class CashbackHackServiceTest {
    @Test
    public void RemainValue(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);

    }

}