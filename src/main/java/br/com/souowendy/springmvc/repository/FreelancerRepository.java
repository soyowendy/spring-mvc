package br.com.souowendy.springmvc.repository;

import br.com.souowendy.springmvc.model.Freelancer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FreelancerRepository extends JpaRepository<Freelancer, Long> {
}
