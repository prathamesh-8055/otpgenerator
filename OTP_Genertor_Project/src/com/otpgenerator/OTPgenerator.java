package com.otpgenerator;
import java.io.*;
import java.util.*;

public class OTPgenerator {
	public static String generateOTP()
	{
		int randomNO = (int)(Math.random()*9000)+1000;
		String otp = String.valueOf(randomNO);
		return otp;
	}

	public static void main(String[] args) {
		String otpNo = generateOTP();
		System.out.println("OTP : "+otpNo);
	}

}
