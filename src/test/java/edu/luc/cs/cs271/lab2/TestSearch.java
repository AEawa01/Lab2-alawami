package edu.luc.cs.cs271.lab2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

public class TestSearch {

    Team[] makeArrayFixture(final int size) {
        final Team[] array = new Team[size];
        for (int i = 0; i < size; i++) {
            final String s = Integer.toString(i);
            array[i] = new Team("Team " + s, "Coach " + s, i * 100 + 50);
        }
        return array;
    }


    List<Team> makeListFixture(final int size) {
        final List<Team> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            final String s = Integer.toString(i);
            list.add(new Team("Team " + s, "Coach " + s, i * 100 + 50));
        }
        return list;
    }

    @Test
    public void testFindPositionArray0() {
        final Team[] arr = makeArrayFixture(0);
        assertFalse(Search.findTeamPosition(arr, "Team 5").isPresent());
    }

    @Test
    public void testFindPositionArray10s() {
        final Team[] arr = makeArrayFixture(10);
        assertTrue(Search.findTeamPosition(arr, "Team 5").isPresent());
    }

    @Test
    public void testFindPositionArray10f() {
        final Team[] arr = makeArrayFixture(10);
        assertFalse(Search.findTeamPosition(arr, "Team 11").isPresent());
    }


    @Test
    public void testFindPositionList0() {
        final List<Team> list = makeListFixture(0);
        assertFalse(Search.findTeamPosition(list, "Team 5").isPresent());
    }

    @Test
    public void testFindPositionList10s() {
        final List<Team> list = makeListFixture(10);
        assertTrue(Search.findTeamPosition(list, "Team 5").isPresent());
    }

    @Test
    public void testFindPositionList10f() {
        final List<Team> list = makeListFixture(10);
        assertFalse(Search.findTeamPosition(list, "Team 11").isPresent());
    }

    @Test
    public void testFindMinFundingArray0() {
        final Team[] arr = makeArrayFixture(0);
        assertEquals(Search.findTeamMinFunding(arr, 50), Optional.empty());
    }

    @Test
    public void testFindMinFundingArray10s() {
        final Team[] arr = makeArrayFixture(10);
        assertEquals(Search.findTeamMinFunding(arr, 300), Optional.of(3));
    }

    @Test
    public void testFindMinFundingArrayFast0() {
        final Team[] arr = makeArrayFixture(0);
        assertEquals(Search.findTeamMinFundingFast(arr, 50), Optional.empty());
    }

    @Test
    public void testFindMinFundingArrayFast10s() {
        final Team[] arr = makeArrayFixture(10);
        assertEquals(Search.findTeamMinFundingFast(arr, 300), Optional.of(3));
    }

}
