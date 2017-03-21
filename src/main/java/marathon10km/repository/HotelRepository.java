package marathon10km.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import marathon10km.domain.Hotel;

@Repository
public interface HotelRepository  extends JpaRepository<Hotel, Integer>{
	@Query(name = "findByhotel")
	public List<Hotel> findByNamedQuery(@Param("price") int price);
}
