package ci.jvision.admin201718054.domain.Products;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductsRepository extends JpaRepository<Products, Long> {

    //목록조회 쿼리
    @Query("SELECT p from Products p ORDER BY p.id DESC")
    List<Products> findAllDesc();

}
