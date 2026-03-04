package ie.atu.oop_inclass_07.model;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Getter
@Setter
public class Booking {


    //@Schema
    public long bookingId;

    @NotBlank(message = "Tag cannot be blank")
    public String bookingTag;


    @Email(message = "Invalid email address")
    public String studentEmail;

    public Date bookingDate;

    public Time startHour;

    public Duration durationHours;





}
