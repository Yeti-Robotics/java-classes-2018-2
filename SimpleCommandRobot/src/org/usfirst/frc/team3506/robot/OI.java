/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team3506.robot;

import org.usfirst.frc.team3506.robot.commands.DriveForwardCommand;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	private Joystick leftJoystick, rightJoystick;
	
	public OI() {
	    leftJoystick = new Joystick(RobotMap.LEFT_JOYSTICK_PORT);
	    rightJoystick = new Joystick(RobotMap.RIGHT_JOYSTICK_PORT);
	    
	    JoystickButton left2 = new JoystickButton(leftJoystick, 2);
	    left2.whenPressed(new DriveForwardCommand(0.5, 0.5, 1.5));
	}
	
	public double getLeftY() {
	    return -leftJoystick.getY();
	}
	
	public double getRightY() {
	    return -rightJoystick.getY();
	}
}
