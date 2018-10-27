/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team3506.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.properties file in the
 * project.
 */
public class Robot extends IterativeRobot {
	
	Joystick leftJoystick;
	Joystick rightJoystick;
	Spark leftMotor1, leftMotor2, leftMotor3;
	Spark rightMotor1, rightMotor2, rightMotor3;
	DoubleSolenoid gearShift;
	long timer;

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		leftJoystick = new Joystick(0);
		rightJoystick = new Joystick(1);
		
		leftMotor1 = new Spark(0);
		leftMotor2 = new Spark(1);
		leftMotor2.setInverted(true);
		leftMotor3 = new Spark(2);
		leftMotor3.setInverted(true);
		
		rightMotor1 = new Spark(3);
		rightMotor1.setInverted(true);
		rightMotor2 = new Spark(4);
		rightMotor3 = new Spark(5);
		
		gearShift = new DoubleSolenoid(6, 7);
		
		shiftDown();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard, remove all of the chooser code and uncomment the
	 * getString line to get the auto name from the text box below the Gyro
	 *
	 * <p>You can add additional auto modes by adding additional comparisons to
	 * the switch structure below with additional strings. If using the
	 * SendableChooser make sure to add them to the chooser code above as well.
	 */
	@Override
	public void autonomousInit() {
	    drive(0.5, 0.5);
	    
	    Timer.delay(1);
	    
	    drive(0, 0);
	}

	/**
	 * This function is called periodically during autonomous.
	 */
	@Override
	public void autonomousPeriodic() {
	    
	}

	/**
	 * This function is called periodically during operator control.
	 */
	@Override
	public void teleopPeriodic() {
		double leftSpeed = leftJoystick.getY();
		double rightSpeed = rightJoystick.getY();
		
		leftMotor1.set(leftSpeed);
		leftMotor2.set(leftSpeed); //*
		leftMotor3.set(leftSpeed);
		
		rightMotor1.set(rightSpeed);
		rightMotor2.set(rightSpeed);
		rightMotor3.set(rightSpeed);//*
		
		if(leftJoystick.getRawButton(7) && timer == 0) {
			timer = System.currentTimeMillis() + 3000;
		}
		
		if (timer != 0 && timer > System.currentTimeMillis()) {
			double speed = -0.5;
			leftMotor1.set(speed);
			leftMotor2.set(speed);
			leftMotor3.set(speed);
			
			rightMotor1.set(speed);
			rightMotor2.set(speed);
			rightMotor3.set(speed);
		} else {
			timer = 0;
		}
		
		if (leftJoystick.getRawButton(1)) {
		    shiftDown();
		}
		if (rightJoystick.getRawButton(1)) {
		    shiftUp();
		}
	}

	/**
	 * This function is called periodically during test mode.
	 */
	@Override
	public void testPeriodic() {
	}
	
	public void drive(double leftSpeed, double rightSpeed) {
	    leftMotor1.set(leftSpeed);
	    leftMotor2.set(leftSpeed);
	    leftMotor3.set(leftSpeed);

        rightMotor1.set(rightSpeed);
        rightMotor2.set(rightSpeed);
        rightMotor3.set(rightSpeed);
	}
	
	public void shiftUp() {
	    gearShift.set(Value.kForward);
	}
	
	public void shiftDown() {
	    gearShift.set(Value.kReverse);
	}
}
