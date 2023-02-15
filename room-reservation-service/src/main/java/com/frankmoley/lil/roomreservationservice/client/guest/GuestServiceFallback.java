package com.frankmoley.lil.roomreservationservice.client.guest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class GuestServiceFallback implements GuestServiceClient {

    @Override
    public List<Guest> getAll() {
        return new ArrayList<>();
    }

    @Override
    public Guest addGuest(Guest guest) {
        return new Guest();
    }

    @Override
    public Guest getGuest(long id) {
        return new Guest();
    }

    @Override
    public void updateGuest(long id, Guest guest) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteGuest(long id) {
        // TODO Auto-generated method stub
        
    }
    
}
