package nl.first8.hu.ticketsale.sales;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nl.first8.hu.ticketsale.registration.Account;
import nl.first8.hu.ticketsale.venue.Artist;
import nl.first8.hu.ticketsale.venue.Genre;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketDto {

    private Artist artist;

    private String location;

}
