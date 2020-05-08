package com.cts.onlinedonation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cts.onlinedonation.entity.Donation;

public interface DonationRepository  extends JpaRepository<Donation ,Integer> {
	
  

	

}
