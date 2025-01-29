/**
 * @author Yuri Santos
 * @since 29-01-2025
 * @version 1.0
 */

package br.com.flexreserve.flex_reserve.repository;

import br.com.flexreserve.flex_reserve.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long>{
}
