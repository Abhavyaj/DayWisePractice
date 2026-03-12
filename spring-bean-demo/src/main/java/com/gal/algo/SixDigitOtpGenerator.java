package com.gal.algo;

import java.util.Random;

import org.springframework.stereotype.Component;
@Component
public class SixDigitOtpGenerator implements OtpGenerator {
	@Override
	public String getOtp() {
		return ""+new Random().nextInt(100000);
	}
}
