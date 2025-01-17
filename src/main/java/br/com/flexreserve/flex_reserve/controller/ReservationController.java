/**
 * @author Yuri Santos
 * @since 16-01-2025
 * @version 1.0

 * Creation of the controller that will manage reservations
 */

package br.com.flexreserve.flex_reserve.controller;

import br.com.flexreserve.flex_reserve.entity.Reservation;
import br.com.flexreserve.flex_reserve.service.ReservationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReservationController {
    private ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @PostMapping
    List<Reservation> create(@RequestBody Reservation reservation){
        return reservationService.create(reservation);
    }

    @GetMapping
    List<Reservation> list(){
        return reservationService.list();
    }

    @PutMapping
    List<Reservation> update(@RequestBody Reservation reservation){
        return reservationService.update(reservation);
    }

    @DeleteMapping("{id}")
    List<Reservation> delete(@PathVariable("id") Long id){
        return reservationService.delete(id);
    }
}
