package com.gal.algo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserVerifier {
	@Autowired
	OtpGenerator otpGenerator;	
	@Autowired
	public UserVerifier(OtpGenerator otpGenerator) {
		super();
		this.otpGenerator = otpGenerator;
		System.out.println("constructor setting the otp generator" + otpGenerator);
	}
	@Autowired
	public void setOtpGenerator(OtpGenerator otpGenerator) {
		System.out.println("Setting setter otpGenerator" + otpGenerator);
		this.otpGenerator = otpGenerator;
	}
	public void verifyUser() {
		String otp = otpGenerator.getOtp();
		if(otp !=null)
			System.out.println("User verified");
		else
			System.out.println("User verification failed");
	}
}


