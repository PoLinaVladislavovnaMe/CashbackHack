package ru.netology.service;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

class CashbackHackServiceTest {
    @Test
    public void RemainValue(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1150;
        int actual = service.remain(amount);
        int expected = 850;
        assertEquals(expected,actual);

    }

}