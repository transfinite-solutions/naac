package one.transfinite.naac.publication;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaperPresentedRepository extends JpaRepository<PaperPresented, Long> {
}