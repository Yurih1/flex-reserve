/**
 * @author Yuri Santos
 * @since 16-01-2025
 * @version 1.0

 * Responsible for carrying out actions in the bank regarding the reservation
 */

package br.com.flexreserve.flex_reserve.repository;

import br.com.flexreserve.flex_reserve.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository <Reservation, Long>{
}
