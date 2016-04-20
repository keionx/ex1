package com.midlel.topkek.ex1;
import android.test.ActivityInstrumentationTestCase2;
/**
 * Created by Jerry on 4/19/2016.
 */
public class SumTest extends ActivityInstrumentationTestCase2
{
    MainActivity mainActivity;
    public SumTest()
    {
        super(MainActivity.class);
    }
    public void test_first()
    {
        mainActivity = (MainActivity) getActivity();
        double first = 1;
        double second = 2;
        double ans = 1 + 2;
        assertEquals(mainActivity.sum(first,second), ans);
    }
}