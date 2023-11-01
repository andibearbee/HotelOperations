package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//arrange
//act
//assert
class RoomTest {
    @Test
    public void room_should_be_occupied_and_dirty() {
        //arrange
        Room room = new Room (2, 250.00);
        //act
        room.checkIn();
        //assert
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
    }
    @Test
    public void room_should_be_unoccupied_and_dirty () {
        //arrange
        Room room = new Room (2, 250.00);
        //act
        room.checkIn();
        room.checkOut();
        //assert
        assertFalse(room.isOccupied());
        assertTrue(room.isDirty());

    }
    @Test
    public void room_should_be_clean_and_empty () {
        //arrange
        Room room = new Room(2, 250.00);
        //act
        room.checkOut();
        //assert
        assertFalse(room.isDirty());
        assertTrue(room.isAvailable());

    }

}