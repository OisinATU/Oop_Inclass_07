package ie.atu.oop_inclass_07.controller;


import ie.atu.oop_inclass_07.model.Booking;
import ie.atu.oop_inclass_07.service.BookingService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookingController {

    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping("addBooking")
    public ResponseEntity<Booking> addBooking(@Valid @RequestBody Booking booking){
        Booking saved = bookingService.addBooking(booking);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @GetMapping("/allBookings")
    public ResponseEntity<Booking> getAllBookings() {
        return ResponseEntity.ok(bookingService.getAllBookings());
    }


}
