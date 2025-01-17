/**
 * @author Yuri Santos
 * @since 16-01-2025
 * @version 1.0

 * Control the reservation business rule
 */

package br.com.flexreserve.flex_reserve.service;

import br.com.flexreserve.flex_reserve.entity.Reservation;
import br.com.flexreserve.flex_reserve.repository.ReservationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {
    private ReservationRepository reservationRepository;

    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public List<Reservation> create(Reservation reservation) {
        reservationRepository.save(reservation);
        return list();
    }

    public List<Reservation> list() {
        return reservationRepository.findAll();
    }

    public List<Reservation> update(Reservation reservation) {
        reservationRepository.save(reservation);
        return list();
    }
    public List<Reservation> delete(Long id) {
        reservationRepository.deleteById(id);
        return list();
    }
}
