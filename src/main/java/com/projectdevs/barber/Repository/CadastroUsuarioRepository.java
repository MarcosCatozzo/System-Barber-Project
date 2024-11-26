package com.projectdevs.barber.Repository;

import com.projectdevs.barber.Entity.CadastroUsuario;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface CadastroUsuarioRepository extends JpaRepository<CadastroUsuario, Long>{

}
