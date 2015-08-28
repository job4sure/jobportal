package com.job4sure.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.job4sure.model.Registration;
import com.job4sure.repository.RegistrationRepository;
import com.job4sure.service.RegistrationService;
import com.job4sure.util.AutoGenratedPassword;
import com.job4sure.util.SendMail;

@Service
public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	private RegistrationRepository registrationRepository;
	
	@Transactional
	public boolean saveUserInformation(Registration registration) {
		String autoGeneratedPassword = AutoGenratedPassword.generateRandomPassword();
		registration.setEnabled(0);
		registration.setEncripted(autoGeneratedPassword);
		Registration userregistration = registrationRepository.save(registration);
		if(userregistration!=null){
			SendMail.mailSend(userregistration.getEmail(), userregistration.getPassword(),
					userregistration.getFullName(), userregistration.getRegistrationId());
		}
		
		return true;
	}

}