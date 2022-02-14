package com.tsystems.javaschool.tasks.zones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class RouteCheckerTest {

    private RouteChecker routeChecker = new RouteChecker();

    @Test
    public void checkRoute0() throws Exception {
        // given
        List<Integer> requestedZones = Arrays.asList(5, 2, 4, 1);

        // run
        boolean result = routeChecker.checkRoute(state1, requestedZones);

        //assert
        Assert.assertTrue(result);
    }

    @Test
    public void checkRoute() throws Exception {
        // given
        List<Integer> requestedZones = Arrays.asList(1, 2, 4);

        // run
        boolean result = routeChecker.checkRoute(state1, requestedZones);

        //assert
        Assert.assertTrue(result);
    }

    @Test
    public void checkRoute1() throws Exception {
        // given
        List<Integer> requestedZones = Arrays.asList(1, 2, 5);

        // run
        boolean result = routeChecker.checkRoute(state1, requestedZones);

        //assert
        Assert.assertFalse(result);
    }

    @Test
    public void checkRoute2() throws Exception {
        // given
        List<Integer> requestedZones = Arrays.asList(1, 3, 4);

        // run
        boolean result = routeChecker.checkRoute(state1, requestedZones);

        //assert
        Assert.assertFalse(result);
    }

    @Test
    public void checkRoute3() throws Exception {
        // given
        List<Integer> requestedZones = Arrays.asList(1, 2, 3);

        // run
        boolean result = routeChecker.checkRoute(state2, requestedZones);

        //assert
        Assert.assertTrue(result);
    }

    @Test
    public void checkRoute4() throws Exception {
        // given
        List<Integer> requestedZones = Arrays.asList(1, 2, 3, 5);

        // run
        boolean result = routeChecker.checkRoute(state2, requestedZones);

        //assert
        Assert.assertTrue(result);
    }

    @Test
    public void checkRoute41() throws Exception {
        // given
        List<Integer> requestedZones = Arrays.asList(1, 2, 4);

        // run
        boolean result = routeChecker.checkRoute(state2, requestedZones);

        //assert
        Assert.assertFalse(result);
    }

    @Test
    public void checkRoute5() throws Exception {
        // given
        List<Integer> requestedZones = Arrays.asList(1, 2, 3, 5);

        // run
        boolean result = routeChecker.checkRoute(state3, requestedZones);

        //assert
        Assert.assertFalse(result);
    }

    @Test
    public void checkRoute6() throws Exception {
        // given
        List<Integer> requestedZones = Arrays.asList(2, 3, 4);

        // run
        boolean result = routeChecker.checkRoute(state3, requestedZones);

        //assert
        Assert.assertTrue(result);
    }

    @Test
    public void checkRoute7() throws Exception {
        // given
        List<Integer> requestedZones = Arrays.asList(2, 3, 4);

        // run
        boolean result = routeChecker.checkRoute(state3, requestedZones);

        //assert
        Assert.assertTrue(result);
    }

    @Test
    public void checkRoute8() throws Exception {
        // given
        List<Integer> requestedZones = Arrays.asList(1, 2);

        // run
        boolean result = routeChecker.checkRoute(state4, requestedZones);

        //assert
        Assert.assertTrue(result);
    }

    @Test
    public void checkRoute9() throws Exception {
        // given
        List<Integer> requestedZones = Arrays.asList(1, 2, 3);

        // run
        boolean result = routeChecker.checkRoute(state4, requestedZones);

        //assert
        Assert.assertFalse(result);
    }

    @Test
    public void checkRoute9_1() throws Exception {
        // given
        List<Integer> requestedZones = Arrays.asList(4, 2, 3, 1);

        // run
        boolean result = routeChecker.checkRoute(state4, requestedZones);

        //assert
        Assert.assertFalse(result);
    }

    @Test
    public void checkRoute10() throws Exception {
        // given
        List<Integer> requestedZones = Arrays.asList(5, 4, 6);

        // run
        boolean result = routeChecker.checkRoute(state4, requestedZones);

        //assert
        Assert.assertFalse(result);
    }

    @Test
    public void checkRoute11() throws Exception {
        // given
        List<Integer> requestedZones = Arrays.asList(1, 2);

        // run
        boolean result = routeChecker.checkRoute(state5, requestedZones);

        //assert
        Assert.assertFalse(result);
    }

    @Test
    public void checkRoute12() throws Exception {
        // given
        List<Integer> requestedZones = Arrays.asList(1, 2, 4, 5, 7);

        // run
        boolean result = routeChecker.checkRoute(state6, requestedZones);

        //assert
        Assert.assertTrue(result);
    }

    @Test
    public void checkRoute13() throws Exception {
        // given
        List<Integer> requestedZones = Arrays.asList(4, 5, 7);

        // run
        boolean result = routeChecker.checkRoute(state6, requestedZones);

        //assert
        Assert.assertTrue(result);
    }

    @Test
    public void checkRoute14() throws Exception {
        // given
        List<Integer> requestedZones = Arrays.asList(2, 4, 7);

        // run
        boolean result = routeChecker.checkRoute(state6, requestedZones);

        //assert
        Assert.assertTrue(result);
    }

    @Test
    public void checkRoute15() throws Exception {
        // given
        List<Integer> requestedZones = Arrays.asList(25);

        // run
        boolean result = routeChecker.checkRoute(state6, requestedZones);

        //assert
        Assert.assertFalse(result);
    }

    private static final List<Zone> state1 = new ArrayList<Zone>() {{
        add(new Zone(1, Arrays.asList(2)));
        add(new Zone(2, Collections.emptyList()));
        add(new Zone(3, Arrays.asList(2)));
        add(new Zone(4, Arrays.asList(2, 5)));
        add(new Zone(5, Collections.emptyList()));
    }};
    private static final List<Zone> state2 = new ArrayList<Zone>() {{
        add(new Zone(1, Arrays.asList(2)));
        add(new Zone(2, Arrays.asList(3)));
        add(new Zone(3, Arrays.asList(4)));
        add(new Zone(4, Arrays.asList(5)));
        add(new Zone(5, Arrays.asList(1)));
    }};
    private static final List<Zone> state3 = new ArrayList<Zone>() {{
        add(new Zone(1, Arrays.asList(2)));
        add(new Zone(2, Arrays.asList(3)));
        add(new Zone(3, Arrays.asList(4)));
        add(new Zone(4, Arrays.asList(5)));
        add(new Zone(5, Collections.emptyList()));
    }};
    private static final List<Zone> state4 = new ArrayList<Zone>() {{
        add(new Zone(1, Arrays.asList(2)));
        add(new Zone(2, Arrays.asList(1)));
        add(new Zone(3, Arrays.asList(4)));
        add(new Zone(4, Collections.emptyList()));
        add(new Zone(5, Arrays.asList(4)));
        add(new Zone(6, Collections.emptyList()));
    }};
    private static final List<Zone> state5 = new ArrayList<Zone>() {{
        add(new Zone(1, Collections.emptyList()));
        add(new Zone(2, Collections.emptyList()));
        add(new Zone(3, Collections.emptyList()));
    }};
    private static final List<Zone> state6 = new ArrayList<Zone>() {{
        add(new Zone(1, Arrays.asList(2)));
        add(new Zone(2, Arrays.asList(4)));
        add(new Zone(3, Collections.emptyList()));
        add(new Zone(4, Arrays.asList(5, 7)));
        add(new Zone(5, Arrays.asList(7)));
        add(new Zone(6, Collections.emptyList()));
        add(new Zone(7, Collections.emptyList()));
    }};
}