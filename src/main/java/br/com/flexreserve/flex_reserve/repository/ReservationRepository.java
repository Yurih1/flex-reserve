package br.com.flexreserve.flex_reserve.repository;

import br.com.flexreserve.flex_reserve.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository <Reservation, Long>{
}
