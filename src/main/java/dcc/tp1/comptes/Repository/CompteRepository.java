package dcc.tp1.comptes.Repository;

import dcc.tp1.comptes.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte,Long> {


}
